import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        int codonSize = 3;
        Set<String> result = new LinkedHashSet<>();
        for (int i = 0 ; i < rnaSequence.length(); i += codonSize){
            String codon = rnaSequence.substring(i, Math.min(rnaSequence.length(), i + codonSize));
            switch(codon){
                case "UCU":
                case "UCC":
                case "UCA":
                case "UCG":
                    result.add("Serine");
                    break;
                case "AUG":
                    result.add("Methionine");
                    break;
                case "UUU":
                case "UUC":
                    result.add("Phenylalanine");
                    break;
                case "UUA":
                case "UUG":
                    result.add("Leucine");
                    break;
                case "UAU":
                case "UAC":
                    result.add("Tyrosine");
                    break;
                case "UGU":
                case "UGC":
                    result.add("Cysteine");
                    break;
                case "UGG":
                    result.add("Tryptophan");
                    break;
            }
            if(Arrays.asList("UAA", "UAG", "UGA").contains(codon)) break;
        }
        return Arrays.asList(result.toArray(new String[result.size()]));
    }
}
