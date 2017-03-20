
/**
 * Enumeration class TipeLayanan - write a description of the enum class here
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Class TipeLayanan ditambahkan pada versi 0.3 (Modul 3)
 * Class ini merupakan enum
 */
public enum TipeLayanan
{
    AntarBarang ("Antar Barang"), AntarOrang("Antar Orang"), BeliBarang("Beli Barang");
    
    private String deskripsi;
    
    TipeLayanan(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }
    
     public String toString()
    {
        return deskripsi;
    }
}