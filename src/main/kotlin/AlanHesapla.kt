import java.util.*

fun main() {

    val girdi = Scanner(System.`in`) // Konsoldan girdi almak için Scanner sınıfından nesne oluşturma

    println("Dikdörtgen Alanı (1)")
    println("Çember Alanı (2)")

    val secim = girdi.nextInt()

    println("Seçiminiz : $secim")

    if (secim == 1) {

        println("Kısa kenar giriniz")
        val kisaKenar = girdi.nextInt()

        println("Uzun kenar giriniz")
        val uzunKenar = girdi.nextInt()

        println("Dikdörtgen Alanı")
        println("Sonuç : ${kisaKenar * uzunKenar}")
    }

    else if (secim == 2) {

        println("Yarıçap giriniz")
        val yaricap = girdi.nextInt()

        println("Çember Alanı")
        println("Sonuç : ${3.14 * yaricap * yaricap}")
    }

    else {

        println("Böyle bir işlem bulunmamaktadır.")
    }
}