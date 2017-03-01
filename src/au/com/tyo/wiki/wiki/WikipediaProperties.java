package au.com.tyo.wiki.wiki;

import java.util.HashMap;

public class WikipediaProperties {
	public static HashMap<String, String> LANG_MAP;
	
	static {
		initializeWikipediaLanguageMap();
	}
	
	private static void initializeWikipediaLanguageMap() {
		LANG_MAP = new HashMap<String, String>();

		LANG_MAP.put("aa", "Qafár af"); //  Afar
		LANG_MAP.put("ab", "Аҧсшәа"); //  Abkhaz
		LANG_MAP.put("ace", "Acèh"); //  Aceh
		LANG_MAP.put("af", "Afrikaans"); //  Afrikaans
		LANG_MAP.put("ak", "Akan"); //  Akan
		LANG_MAP.put("aln", "Gegë"); //  Gheg Albanian
		LANG_MAP.put("als", "Alemannisch"); //  Alemannic -- not a valid code, for compatibility. See gsw.
		LANG_MAP.put("am", "አማርኛ"); //  Amharic
		LANG_MAP.put("an", "Aragonés"); //  Aragonese
		LANG_MAP.put("ang", "Ænglisc"); //  Old English (Bug 23283)
		LANG_MAP.put("anp", "अङ्गिका"); //  Angika
		LANG_MAP.put("ar", "العربية"); //  Arabic
		LANG_MAP.put("arc", "ܐܪܡܝܐ"); //  Aramaic
		LANG_MAP.put("arn", "Mapudungun"); //  Mapuche, Mapudungu, Araucanian (Araucano)
		LANG_MAP.put("ary", "Maġribi"); //  Moroccan Spoken Arabic
		LANG_MAP.put("arz", "مصرى"); //  Egyptian Spoken Arabic
		LANG_MAP.put("as", "অসমীয়া"); //  Assamese
		LANG_MAP.put("ast", "Asturianu"); //  Asturian
		LANG_MAP.put("av", "Авар"); //  Avar
		LANG_MAP.put("avk", "Kotava"); //  Kotava
		LANG_MAP.put("ay", "Aymar aru"); //  Aymara
		LANG_MAP.put("az", "Azərbaycanca"); //  Azerbaijani
		LANG_MAP.put("ba", "Башҡортса"); //  Bashkir
		LANG_MAP.put("bar", "Boarisch"); //  Bavarian (Austro-Bavarian and South Tyrolean)
		LANG_MAP.put("bat-smg", "Žemaitėška"); //  Samogitian (deprecated code, 'sgs' in ISO 693-3 since 2010-06-30 )
		LANG_MAP.put("bcc", "بلوچی مکرانی"); //  Southern Balochi
		LANG_MAP.put("bcl", "Bikol Central"); //  Bikol: Central Bicolano language
		LANG_MAP.put("be", "Беларуская"); //   Belarusian normative
		//LANG_MAP.put("be-tarask", "\xE2\x80\xAAБеларуская (тарашкевіца)\xE2\x80\xAC"); //  Belarusian in Taraskievica orthography
		//LANG_MAP.put("be-x-old", "\xE2\x80\xAAБеларуская (тарашкевіца)\xE2\x80\xAC"); //  Belarusian in Taraskievica orthography; compat link
		LANG_MAP.put("bg", "Български"); //  Bulgarian
		LANG_MAP.put("bh", "भोजपुरी"); //  Bihari macro language. Falls back to Bhojpuri (bho). The name actually says "Bhojpuri".
		LANG_MAP.put("bho", "भोजपुरी"); //  Bhojpuri
		LANG_MAP.put("bi", "Bislama"); //  Bislama
		LANG_MAP.put("bjn", "Bahasa Banjar"); //  Banjarese
		LANG_MAP.put("bm", "Bamanankan"); //  Bambara
		LANG_MAP.put("bn", "বাংলা"); //  Bengali
		LANG_MAP.put("bo", "བོད་ཡིག"); //  Tibetan
		LANG_MAP.put("bpy", "ইমার ঠার/বিষ্ণুপ্রিয়া মণিপুরী"); //  Bishnupriya Manipuri
		LANG_MAP.put("bqi", "بختياري"); //  Bakthiari
		LANG_MAP.put("br", "Brezhoneg"); //  Breton
		LANG_MAP.put("brh", "Bráhuí"); //  Brahui
		LANG_MAP.put("bs", "Bosanski"); //  Bosnian
		LANG_MAP.put("bug", "ᨅᨔ ᨕᨘᨁᨗ"); //  Buginese
		LANG_MAP.put("bxr", "Буряад"); //  Buryat (Russia)
		LANG_MAP.put("ca", "Català"); //  Catalan
		LANG_MAP.put("cbk-zam", "Chavacano de Zamboanga"); //  Zamboanga Chavacano
		LANG_MAP.put("cdo", "Mìng-dĕ̤ng-ngṳ̄"); //  Min Dong
		LANG_MAP.put("ce", "Нохчийн"); //  Chechen
		LANG_MAP.put("ceb", "Cebuano"); //  Cebuano
		LANG_MAP.put("ch", "Chamoru"); //  Chamorro
		LANG_MAP.put("cho", "Choctaw"); //  Choctaw
		LANG_MAP.put("chr", "ᏣᎳᎩ"); //  Cherokee
		LANG_MAP.put("chy", "Tsetsêhestâhese"); //  Cheyenne
		LANG_MAP.put("ckb", "کوردی"); //  Sorani. The name actually says "Kurdi" (Kurdish).
		LANG_MAP.put("co", "Corsu"); //  Corsican
		LANG_MAP.put("cps", "Capiceño"); //  Capiznon
		LANG_MAP.put("cr", "Nēhiyawēwin / ᓀᐦᐃᔭᐍᐏᐣ"); //  Cree
		LANG_MAP.put("crh", "Qırımtatarca"); //  Crimean Tatar (multiple scripts - defaults to Latin)
		//LANG_MAP.put("crh-latn", "\xE2\x80\xAAQırımtatarca (Latin)\xE2\x80\xAC"); //  Crimean Tatar (Latin)
		//LANG_MAP.put("crh-cyrl", "\xE2\x80\xAAКъырымтатарджа (Кирилл)\xE2\x80\xAC"); //  Crimean Tatar (Cyrillic)
		LANG_MAP.put("cs", "Česky"); //  Czech
		LANG_MAP.put("csb", "Kaszëbsczi"); //  Cassubian
		LANG_MAP.put("cu", "Словѣ́ньскъ / ⰔⰎⰑⰂⰡⰐⰠⰔⰍⰟ"); //  Old Church Slavonic (ancient language)
		LANG_MAP.put("cv", "Чӑвашла"); //  Chuvash
		LANG_MAP.put("cy", "Cymraeg"); //  Welsh
		LANG_MAP.put("da", "Dansk"); //  Danish
		LANG_MAP.put("de", "Deutsch"); //  German ("Du")
		LANG_MAP.put("de-at", "Österreichisches Deutsch"); //  Austrian German
		LANG_MAP.put("de-ch", "Schweizer Hochdeutsch"); //  Swiss Standard German
		//LANG_MAP.put("de-formal", "\xE2\x80\xAADeutsch (Sie-Form)\xE2\x80\xAC"); //  German - formal address ("Sie")
		LANG_MAP.put("diq", "Zazaki"); //  Zazaki
		LANG_MAP.put("dsb", "Dolnoserbski"); //  Lower Sorbian
		LANG_MAP.put("dtp", "Dusun Bundu-liwan"); //  Central Dusun
		LANG_MAP.put("dv", "ދިވެހިބަސް"); //  Dhivehi
		LANG_MAP.put("dz", "ཇོང་ཁ"); //  Dzongkha (Bhutan)
		LANG_MAP.put("ee", "Eʋegbe"); //  Éwé
		LANG_MAP.put("el", "Ελληνικά"); //  Greek
		LANG_MAP.put("eml", "Emiliàn e rumagnòl"); //  Emiliano-Romagnolo / Sammarinese
		LANG_MAP.put("en", "English"); //  English
		LANG_MAP.put("en-ca", "Canadian English"); //  Canadian English
		LANG_MAP.put("en-gb", "British English"); //  British English
		LANG_MAP.put("eo", "Esperanto"); //  Esperanto
		LANG_MAP.put("es", "Español"); //  Spanish
		LANG_MAP.put("et", "Eesti"); //  Estonian
		LANG_MAP.put("eu", "Euskara"); //  Basque
		LANG_MAP.put("ext", "Estremeñu"); //  Extremaduran
		LANG_MAP.put("fa", "فارسی"); //  Persian
		LANG_MAP.put("ff", "Fulfulde"); //  Fulfulde, Maasina
		LANG_MAP.put("fi", "Suomi"); //  Finnish
		LANG_MAP.put("fiu-vro", "Võro"); //  Võro (deprecated code, 'vro' in ISO 639-3 since 2009-01-16)
		LANG_MAP.put("fj", "Na Vosa Vakaviti"); //  Fijian
		LANG_MAP.put("fo", "Føroyskt"); //  Faroese
		LANG_MAP.put("fr", "Français"); //  French
		LANG_MAP.put("frc", "Français cadien"); //  Cajun French
		LANG_MAP.put("frp", "Arpetan"); //  Franco-Provençal/Arpitan
		LANG_MAP.put("frr", "Nordfriisk"); //  North Frisian
		LANG_MAP.put("fur", "Furlan"); //  Friulian
		LANG_MAP.put("fy", "Frysk"); //  Frisian
		LANG_MAP.put("ga", "Gaeilge"); //  Irish
		LANG_MAP.put("gag", "Gagauz"); //  Gagauz
		LANG_MAP.put("gan", "贛語"); //  Gan (multiple scripts - defaults to Traditional)
		//LANG_MAP.put("gan-hans", "\xE2\x80\xAA赣语(简体)\xE2\x80\xAC"); //  Gan (Simplified Han)
		//LANG_MAP.put("gan-hant", "\xE2\x80\xAA贛語(繁體)\xE2\x80\xAC"); //  Gan (Traditional Han)
		LANG_MAP.put("gd", "Gàidhlig"); //  Scots Gaelic
		LANG_MAP.put("gl", "Galego"); //  Galician
		LANG_MAP.put("glk", "گیلکی"); //  Gilaki
		LANG_MAP.put("gn", "Avañe\'ẽ"); //  Guaraní, Paraguayan
		LANG_MAP.put("got", "𐌲𐌿𐍄𐌹𐍃𐌺"); //  Gothic
		LANG_MAP.put("grc", "Ἀρχαία ἑλληνικὴ"); //  Ancient Greek
		LANG_MAP.put("gsw", "Alemannisch"); //  Alemannic
		LANG_MAP.put("gu", "ગુજરાતી"); //  Gujarati
		LANG_MAP.put("gv", "Gaelg"); //  Manx
		LANG_MAP.put("ha", "هَوُسَ"); //  Hausa
		LANG_MAP.put("hak", "Hak-kâ-fa"); //  Hakka
		LANG_MAP.put("haw", "Hawai`i"); //  Hawaiian
		LANG_MAP.put("he", "עברית"); //  Hebrew
		LANG_MAP.put("hi", "हिन्दी"); //  Hindi
		LANG_MAP.put("hif", "Fiji Hindi"); //  Fijian Hindi (multiple scripts - defaults to Latin)
		LANG_MAP.put("hif-latn", "Fiji Hindi"); //  Fiji Hindi (latin)
		LANG_MAP.put("hil", "Ilonggo"); //  Hiligaynon
		LANG_MAP.put("ho", "Hiri Motu"); //  Hiri Motu
		LANG_MAP.put("hr", "Hrvatski"); //  Croatian
		LANG_MAP.put("hsb", "Hornjoserbsce"); //  Upper Sorbian
		LANG_MAP.put("ht", "Kreyòl ayisyen"); //  Haitian Creole French
		LANG_MAP.put("hu", "Magyar"); //  Hungarian
		LANG_MAP.put("hy", "Հայերեն"); //  Armenian
		LANG_MAP.put("hz", "Otsiherero"); //  Herero
		LANG_MAP.put("ia", "Interlingua"); //  Interlingua (IALA)
		LANG_MAP.put("id", "Bahasa Indonesia"); //  Indonesian
		LANG_MAP.put("ie", "Interlingue"); //  Interlingue (Occidental)
		LANG_MAP.put("ig", "Igbo"); //  Igbo
		LANG_MAP.put("ii", "ꆇꉙ"); //  Sichuan Yi
		LANG_MAP.put("ik", "Iñupiak"); //  Inupiak (Inupiatun, Northwest Alaska / Inupiatun, North Alaskan)
		LANG_MAP.put("ike-cans", "ᐃᓄᒃᑎᑐᑦ"); //  Inuktitut, Eastern Canadian/Eastern Canadian "Eskimo"/"Eastern Arctic Eskimo"/Inuit (Unified Canadian Aboriginal Syllabics)
		LANG_MAP.put("ike-latn", "Inuktitut"); //  Inuktitut, Eastern Canadian (Latin script)
		LANG_MAP.put("ilo", "Ilokano"); //  Ilokano
		LANG_MAP.put("inh", "ГӀалгӀай"); //  Ingush
		LANG_MAP.put("io", "Ido"); //  Ido
		LANG_MAP.put("is", "Íslenska"); //  Icelandic
		LANG_MAP.put("it", "Italiano"); //  Italian
		LANG_MAP.put("iu", "ᐃᓄᒃᑎᑐᑦ/inuktitut"); //  Inuktitut (macro language - do no localise, see ike/ikt - falls back to ike-cans)
		LANG_MAP.put("ja", "日本語"); //  Japanese
		LANG_MAP.put("jam", "Patois"); //  Jamaican Creole English
		LANG_MAP.put("jbo", "Lojban"); //  Lojban
		LANG_MAP.put("jut", "Jysk"); //  Jutish / Jutlandic
		LANG_MAP.put("jv", "Basa Jawa"); //  Javanese
		LANG_MAP.put("ka", "ქართული"); //  Georgian
		LANG_MAP.put("kaa", "Qaraqalpaqsha"); //  Karakalpak
		LANG_MAP.put("kab", "Taqbaylit"); //  Kabyle
		LANG_MAP.put("kbd", "Адыгэбзэ"); //  Kabardian
		LANG_MAP.put("kbd-cyrl", "Адыгэбзэ"); //  Kabardian (Cyrillic)
		LANG_MAP.put("kg", "Kongo"); //  Kongo, (FIXME!) should probaly be KiKongo or KiKoongo
		LANG_MAP.put("khw", "کھوار"); //  Khowar
		LANG_MAP.put("ki", "Gĩkũyũ"); //  Gikuyu
		LANG_MAP.put("kiu", "Kırmancki"); //  Kirmanjki
		LANG_MAP.put("kj", "Kwanyama"); //  Kwanyama
		LANG_MAP.put("kk", "Қазақша"); //  Kazakh (multiple scripts - defaults to Cyrillic)
		LANG_MAP.put("kk-arab", "xE2x80xABقازاقشا (تٴوتە)xE2x80xAC"); //  Kazakh Arabic
//		LANG_MAP.put("kk-cyrl", "\xE2\x80\xAAҚазақша (кирил)\xE2\x80\xAC"); //  Kazakh Cyrillic
//		LANG_MAP.put("kk-latn", "\xE2\x80\xAAQazaqşa (latın)\xE2\x80\xAC"); //  Kazakh Latin
//		LANG_MAP.put("kk-cn", "\xE2\x80\xABقازاقشا (جۇنگو)\xE2\x80\xAC"); //  Kazakh (China)
//		LANG_MAP.put("kk-kz", "\xE2\x80\xAAҚазақша (Қазақстан)\xE2\x80\xAC"); //  Kazakh (Kazakhstan)
//		LANG_MAP.put("kk-tr", "\xE2\x80\xAAQazaqşa (Türkïya)\xE2\x80\xAC"); //  Kazakh (Turkey)
		LANG_MAP.put("kl", "Kalaallisut"); //  Inuktitut, Greenlandic/Greenlandic/Kalaallisut (kal)
		LANG_MAP.put("km", "ភាសាខ្មែរ"); //  Khmer, Central
		LANG_MAP.put("kn", "ಕನ್ನಡ"); //  Kannada
		LANG_MAP.put("ko", "한국어"); //  Korean
		LANG_MAP.put("ko-kp", "한국어 (조선)"); //  Korean (DPRK)
		LANG_MAP.put("koi", "Перем Коми"); //  Komi-Permyak
		LANG_MAP.put("kr", "Kanuri"); //  Kanuri, Central
		LANG_MAP.put("krc", "Къарачай-Малкъар"); //  Karachay-Balkar
		LANG_MAP.put("kri", "Krio"); //  Krio
		LANG_MAP.put("krj", "Kinaray-a"); //  Kinaray-a
		LANG_MAP.put("ks", "कॉशुर / کٲشُر"); //  Kashmiri (multiple scripts - defaults to Perso-Arabic)
		LANG_MAP.put("ks-arab", "کٲشُر"); //  Kashmiri (Perso-Arabic script)
		LANG_MAP.put("ks-deva", "कॉशुर"); //  Kashmiri (Devanagari script)
		LANG_MAP.put("ksh", "Ripoarisch"); //  Ripuarian
		LANG_MAP.put("ku", "Kurdî"); //  Kurdish (multiple scripts - defaults to Latin)
//		LANG_MAP.put("ku-latn", "\xE2\x80\xAAKurdî (latînî)\xE2\x80\xAC"); //  Northern Kurdish (Latin script)
//		LANG_MAP.put("ku-arab", "\xE2\x80\xABكوردي (عەرەبی)\xE2\x80\xAC"); //  Northern Kurdish (Arabic script) (falls back to ckb)
		LANG_MAP.put("kv", "Коми"); //  Komi-Zyrian (Cyrillic is common script but also written in Latin script)
		LANG_MAP.put("kw", "Kernowek"); //  Cornish
		LANG_MAP.put("ky", "Кыргызча"); //  Kirghiz
		LANG_MAP.put("la", "Latina"); //  Latin
		LANG_MAP.put("lad", "Ladino"); //  Ladino
		LANG_MAP.put("lb", "Lëtzebuergesch"); //  Luxemburguish
		LANG_MAP.put("lbe", "Лакку"); //  Lak
		LANG_MAP.put("lez", "Лезги"); //  Lezgi
		LANG_MAP.put("lfn", "Lingua Franca Nova"); //  Lingua Franca Nova
		LANG_MAP.put("lg", "Luganda"); //  Ganda
		LANG_MAP.put("li", "Limburgs"); //  Limburgian
		LANG_MAP.put("lij", "Ligure"); //  Ligurian
		LANG_MAP.put("liv", "Līvõ kēļ"); //  Livonian
		LANG_MAP.put("lmo", "Lumbaart"); //  Lombard
		LANG_MAP.put("ln", "Lingála"); //  Lingala
		LANG_MAP.put("lo", "ລາວ"); // Laotian
		LANG_MAP.put("loz", "Silozi"); //  Lozi
		LANG_MAP.put("lt", "Lietuvių"); //  Lithuanian
		LANG_MAP.put("ltg", "Latgaļu"); //  Latgalian
		LANG_MAP.put("lus", "Mizo ţawng"); //  Mizo/Lushai
		LANG_MAP.put("lv", "Latviešu"); //  Latvian
		LANG_MAP.put("lzh", "文言"); //  Literary Chinese -- (bug 8217) lzh instead of zh-classical, http://www.sil.org/iso639-3/codes.asp?order=639_3&letter=l
		LANG_MAP.put("lzz", "Lazuri"); //  Laz
		LANG_MAP.put("mai", "मैथिली"); //  Maithili
		LANG_MAP.put("map-bms", "Basa Banyumasan"); //  Banyumasan
		LANG_MAP.put("mdf", "Мокшень"); //  Moksha
		LANG_MAP.put("mg", "Malagasy"); //  Malagasy
		LANG_MAP.put("mh", "Ebon"); //  Marshallese
		LANG_MAP.put("mhr", "Олык Марий"); //  Eastern Mari
		LANG_MAP.put("mi", "Māori"); //  Maori
		LANG_MAP.put("min", "Baso Minangkabau"); //  Minangkabau
		LANG_MAP.put("mk", "Македонски"); //  Macedonian
		LANG_MAP.put("ml", "മലയാളം"); //  Malayalam
		LANG_MAP.put("mn", "Монгол"); //  Halh Mongolian (Cyrillic) (ISO 639-3: khk)
		LANG_MAP.put("mo", "Молдовеняскэ"); //  Moldovan, deprecated
		LANG_MAP.put("mr", "मराठी"); //  Marathi
		LANG_MAP.put("mrj", "Кырык мары"); //  Hill Mari
		LANG_MAP.put("ms", "Bahasa Melayu"); //  Malay
		LANG_MAP.put("mt", "Malti"); //  Maltese
		LANG_MAP.put("mus", "Mvskoke"); //  Muskogee/Creek
		LANG_MAP.put("mwl", "Mirandés"); //  Mirandese
		LANG_MAP.put("my", "မြန်မာဘာသာ"); //  Burmese
		LANG_MAP.put("myv", "Эрзянь"); //  Erzya
		LANG_MAP.put("mzn", "مازِرونی"); //  Mazanderani
		LANG_MAP.put("na", "Dorerin Naoero"); //  Nauruan
		LANG_MAP.put("nah", "Nāhuatl"); //  Nahuatl, en:Wikipedia writes Nahuatlahtolli, while another form is Náhuatl
		LANG_MAP.put("nan", "Bân-lâm-gú"); //  Min-nan -- (bug 8217) nan instead of zh-min-nan, http://www.sil.org/iso639-3/codes.asp?order=639_3&letter=n
		LANG_MAP.put("nap", "Nnapulitano"); //  Neapolitan
		//LANG_MAP.put("nb", "\xE2\x80\xAANorsk (bokmål)\xE2\x80\xAC"); //  Norwegian (Bokmal)
		LANG_MAP.put("nds", "Plattdüütsch"); //  Low German ''or'' Low Saxon
		LANG_MAP.put("nds-nl", "Nedersaksisch"); //  Dutch Low Saxon
		LANG_MAP.put("ne", "नेपाली"); //  Nepali
		LANG_MAP.put("new", "नेपाल भाषा"); //  Newar / Nepal Bhasha
		LANG_MAP.put("ng", "Oshiwambo"); //  Ndonga
		LANG_MAP.put("niu", "Niuē"); //  Niuean
		LANG_MAP.put("nl", "Nederlands"); //  Dutch
//		LANG_MAP.put("nl-informal", "\xE2\x80\xAANederlands (informeel)\xE2\x80\xAC"); //  Dutch (informal address ("je"))
//		LANG_MAP.put("nn", "\xE2\x80\xAANorsk (nynorsk)\xE2\x80\xAC"); //  Norwegian (Nynorsk)
//		LANG_MAP.put("no", "\xE2\x80\xAANorsk (bokmål)\xE2\x80\xAC"); //  Norwegian (falls back to nb).
		LANG_MAP.put("nov", "Novial"); //  Novial
		LANG_MAP.put("nrm", "Nouormand"); //  Norman
		LANG_MAP.put("nso", "Sesotho sa Leboa"); //  Northern Sotho
		LANG_MAP.put("nv", "Diné bizaad"); //  Navajo
		LANG_MAP.put("ny", "Chi-Chewa"); //  Chichewa
		LANG_MAP.put("oc", "Occitan"); //  Occitan
		LANG_MAP.put("om", "Oromoo"); //  Oromo
		LANG_MAP.put("or", "ଓଡ଼ିଆ"); //  Oriya
		LANG_MAP.put("os", "Ирон"); //  Ossetic -- fixed per bug 29091
		LANG_MAP.put("pa", "ਪੰਜਾਬੀ"); //  Eastern Punjabi (Gurmukhi script) (pan)
		LANG_MAP.put("pag", "Pangasinan"); //  Pangasinan
		LANG_MAP.put("pam", "Kapampangan"); //  Pampanga
		LANG_MAP.put("pap", "Papiamentu"); //  Papiamentu
		LANG_MAP.put("pcd", "Picard"); //  Picard
		LANG_MAP.put("pdc", "Deitsch"); //  Pennsylvania German
		LANG_MAP.put("pdt", "Plautdietsch"); //  Plautdietsch/Mennonite Low German
		LANG_MAP.put("pfl", "Pälzisch"); //  Palatinate German
		LANG_MAP.put("pi", "पाळि"); //  Pali
		LANG_MAP.put("pih", "Norfuk / Pitkern"); //  Norfuk/Pitcairn/Norfolk
		LANG_MAP.put("pl", "Polski"); //  Polish
		LANG_MAP.put("pms", "Piemontèis"); //  Piedmontese
		LANG_MAP.put("pnb", "پنجابی"); //  Western Punjabi
		LANG_MAP.put("pnt", "Ποντιακά"); //  Pontic/Pontic Greek
		LANG_MAP.put("prg", "Prūsiskan"); //  Prussian
		LANG_MAP.put("ps", "پښتو"); //  Pashto, Northern/Paktu/Pakhtu/Pakhtoo/Afghan/Pakhto/Pashtu/Pushto/Yusufzai Pashto
		LANG_MAP.put("pt", "Português"); //  Portuguese
		LANG_MAP.put("pt-br", "Português do Brasil"); //  Brazilian Portuguese
		LANG_MAP.put("qu", "Runa Simi"); //  Southern Quechua
		LANG_MAP.put("qug", "Runa shimi"); //  Kichwa/Northern Quechua (one of the codes it covers; temporarily used until Kichwa has its own)
		LANG_MAP.put("rgn", "Rumagnôl"); //  Romagnol
		LANG_MAP.put("rif", "Tarifit"); //  Tarifit
		LANG_MAP.put("rm", "Rumantsch"); //  Raeto-Romance
		LANG_MAP.put("rmy", "Romani"); //  Vlax Romany
		LANG_MAP.put("rn", "Kirundi"); //  Rundi/Kirundi/Urundi
		LANG_MAP.put("ro", "Română"); //  Romanian
		LANG_MAP.put("roa-rup", "Armãneashce"); //  Aromanian (deprecated code, 'rup' exists in ISO 693-3)
		LANG_MAP.put("roa-tara", "Tarandíne"); //  Tarantino
		LANG_MAP.put("ru", "Русский"); //  Russian
		LANG_MAP.put("rue", "Русиньскый"); //  Rusyn
		LANG_MAP.put("rup", "Armãneashce"); //  Aromanian
		LANG_MAP.put("ruq", "Vlăheşte"); //  Megleno-Romanian (multiple scripts - defaults to Latin)
		LANG_MAP.put("ruq-cyrl", "Влахесте"); //  Megleno-Romanian (Cyrillic script)
		LANG_MAP.put("ruq-grek", "Βλαεστε"); //  Megleno-Romanian (Greek script)
		LANG_MAP.put("ruq-latn", "Vlăheşte"); //  Megleno-Romanian (Latin script)
		LANG_MAP.put("rw", "Kinyarwanda"); //  Kinyarwanda, should possibly be Kinyarwandi
		LANG_MAP.put("sa", "संस्कृतम्"); //  Sanskrit
		LANG_MAP.put("sah", "Саха тыла"); //  Sakha
		LANG_MAP.put("sc", "Sardu"); //  Sardinian
		LANG_MAP.put("scn", "Sicilianu"); //  Sicilian
		LANG_MAP.put("sco", "Scots"); //  Scots
		LANG_MAP.put("sd", "سنڌي"); //  Sindhi
		LANG_MAP.put("sdc", "Sassaresu"); //  Sassarese
		LANG_MAP.put("se", "Sámegiella"); //  Northern Sami
		LANG_MAP.put("sei", "Cmique Itom"); //  Seri
		LANG_MAP.put("sg", "Sängö"); //  Sango/Sangho
		LANG_MAP.put("sgs", "Žemaitėška"); //  Samogitian
		LANG_MAP.put("sh", "Srpskohrvatski / Српскохрватски"); //  Serbocroatian
		LANG_MAP.put("shi", "Tašlḥiyt/ⵜⴰⵛⵍⵃⵉⵜ"); //  Tachelhit (multiple scripts - defaults to Latin)
		LANG_MAP.put("shi-tfng", "ⵜⴰⵛⵍⵃⵉⵜ"); //  Tachelhit (Tifinagh script)
		LANG_MAP.put("shi-latn", "Tašlḥiyt"); //  Tachelhit (Latin script)
		LANG_MAP.put("si", "සිංහල"); //  Sinhalese
		LANG_MAP.put("simple", "Simple English"); //  Simple English
		LANG_MAP.put("sk", "Slovenčina"); //  Slovak
		LANG_MAP.put("sl", "Slovenščina"); //  Slovenian
		LANG_MAP.put("sli", "Schläsch"); //  Lower Selisian
		LANG_MAP.put("sm", "Gagana Samoa"); //  Samoan
		LANG_MAP.put("sma", "Åarjelsaemien"); //  Southern Sami
		LANG_MAP.put("sn", "chiShona"); //  Shona
		LANG_MAP.put("so", "Soomaaliga"); //  Somali
		LANG_MAP.put("sq", "Shqip"); //  Albanian
		LANG_MAP.put("sr", "Српски / Srpski"); //  Serbian (multiple scripts - defaults to Cyrillic)
//		LANG_MAP.put("sr-ec", "\xE2\x80\xAAСрпски (ћирилица)\xE2\x80\xAC"); //  Serbian Cyrillic ekavian
//		LANG_MAP.put("sr-el", "\xE2\x80\xAASrpski (latinica)\xE2\x80\xAC"); //  Serbian Latin ekavian
		LANG_MAP.put("srn", "Sranantongo"); //  Sranan Tongo
		LANG_MAP.put("ss", "SiSwati"); //  Swati
		LANG_MAP.put("st", "Sesotho"); //  Southern Sotho
		LANG_MAP.put("stq", "Seeltersk"); //  Saterland Frisian
		LANG_MAP.put("su", "Basa Sunda"); //  Sundanese
		LANG_MAP.put("sv", "Svenska"); //  Swedish
		LANG_MAP.put("sw", "Kiswahili"); //  Swahili
		LANG_MAP.put("szl", "Ślůnski"); //  Silesian
		LANG_MAP.put("ta", "தமிழ்"); //  Tamil
		LANG_MAP.put("tcy", "ತುಳು"); //  Tulu
		LANG_MAP.put("te", "తెలుగు"); //  Telugu
		LANG_MAP.put("tet", "Tetun"); //  Tetun
		LANG_MAP.put("tg", "Тоҷикӣ"); //  Tajiki (falls back to tg-cyrl)
		LANG_MAP.put("tg-cyrl", "Тоҷикӣ"); //  Tajiki (Cyrllic script) (default)
		LANG_MAP.put("tg-latn", "Tojikī"); //  Tajiki (Latin script)
		LANG_MAP.put("th", "ไทย"); //  Thai
		LANG_MAP.put("ti", "ትግርኛ"); //  Tigrinya
		LANG_MAP.put("tk", "Türkmençe"); //  Turkmen
		LANG_MAP.put("tl", "Tagalog"); //  Tagalog
		LANG_MAP.put("tly", "Толышә зывон"); //  Talysh
		LANG_MAP.put("tn", "Setswana"); //  Setswana
		LANG_MAP.put("to", "lea faka-Tonga"); //  Tonga (Tonga Islands)
		LANG_MAP.put("tokipona", "Toki Pona"); //  Toki Pona
		LANG_MAP.put("tpi", "Tok Pisin"); //  Tok Pisin
		LANG_MAP.put("tr", "Türkçe"); //  Turkish
		LANG_MAP.put("ts", "Xitsonga"); //  Tsonga
		LANG_MAP.put("tt", "Татарча/Tatarça"); //  Tatar (multiple scripts - defaults to Cyrillic)
		LANG_MAP.put("tt-cyrl", "Татарча"); //  Tatar (Cyrillic script) (default)
		LANG_MAP.put("tt-latn", "Tatarça"); //  Tatar (Latin script)
		LANG_MAP.put("tum", "chiTumbuka"); //  Tumbuka
		LANG_MAP.put("tw", "Twi"); //  Twi, (FIXME!)
		LANG_MAP.put("ty", "Reo Mā`ohi"); //  Tahitian
		LANG_MAP.put("tyv", "Тыва дыл"); //  Tyvan
		LANG_MAP.put("udm", "Удмурт"); //  Udmurt
		LANG_MAP.put("ug", "ئۇيغۇرچە / Uyghurche"); //  Uyghur (multiple scripts - defaults to Arabic)
		LANG_MAP.put("ug-arab", "ئۇيغۇرچە"); //  Uyghur (Arabic script) (default)
		LANG_MAP.put("ug-latn", "Uyghurche"); //  Uyghur (Latin script)
		LANG_MAP.put("uk", "Українська"); //  Ukrainian
		LANG_MAP.put("ur", "اردو"); //  Urdu
		LANG_MAP.put("uz", "Oʻzbek"); //  Uzbek
		LANG_MAP.put("ve", "Tshivenda"); //  Venda
		LANG_MAP.put("vec", "Vèneto"); //  Venetian
		LANG_MAP.put("vep", "Vepsän kel’"); //  Veps
		LANG_MAP.put("vi", "Tiếng Việt"); //  Vietnamese
		LANG_MAP.put("vls", "West-Vlams"); //  West Flemish
		LANG_MAP.put("vmf", "Mainfränkisch"); //  Upper Franconian, Main-Franconian
		LANG_MAP.put("vo", "Volapük"); //  Volapük
		LANG_MAP.put("vot", "Vaďďa"); //  Vod/Votian
		LANG_MAP.put("vro", "Võro"); //  Võro
		LANG_MAP.put("wa", "Walon"); //  Walloon
		LANG_MAP.put("war", "Winaray"); //  Waray-Waray
		LANG_MAP.put("wo", "Wolof"); //  Wolof
		LANG_MAP.put("wuu", "吴语"); //  Wu Chinese
		LANG_MAP.put("xal", "Хальмг"); //  Kalmyk-Oirat (Kalmuk, Kalmuck, Kalmack, Qalmaq, Kalmytskii Jazyk, Khal:mag, Oirat, Volga Oirat, European Oirat, Western Mongolian)
		LANG_MAP.put("xh", "isiXhosa"); //  Xhosan
		LANG_MAP.put("xmf", "მარგალური"); //  Mingrelian
		LANG_MAP.put("yi", "ייִדיש"); //  Yiddish
		LANG_MAP.put("yo", "Yorùbá"); //  Yoruba
		LANG_MAP.put("yue", "粵語"); //  Cantonese -- (bug 8217) yue instead of zh-yue, http://www.sil.org/iso639-3/codes.asp?order=639_3&letter=y
		LANG_MAP.put("za", "Vahcuengh"); //  Zhuang
		LANG_MAP.put("zea", "Zeêuws"); //  Zeeuws/Zeaws
		LANG_MAP.put("zh", "中文"); //  (Zhōng Wén) - Chinese
		LANG_MAP.put("zh-classical", "文言"); //  Classical Chinese/Literary Chinese -- (see bug 8217)
		LANG_MAP.put("zh-cn", "中文(中国大陆)"); //  Chinese (PRC)
		LANG_MAP.put("zh-hans", "中文(简体)"); //  Mandarin Chinese (Simplified Chinese script) (cmn-hans)
		LANG_MAP.put("zh-hant", "中文(繁體)"); //  Mandarin Chinese (Traditional Chinese script) (cmn-hant)
		LANG_MAP.put("zh-hk", "中文(香港)"); //  Chinese (Hong Kong)
		LANG_MAP.put("zh-min-nan", "Bân-lâm-gú"); //  Min-nan -- (see bug 8217)
		LANG_MAP.put("zh-mo", "中文(澳門)"); //  Chinese (Macau)
		LANG_MAP.put("zh-my", "中文(马来西亚)"); //  Chinese (Malaysia)
		LANG_MAP.put("zh-sg", "中文(新加坡)"); //  Chinese (Singapore)
		LANG_MAP.put("zh-tw", "中文(台灣)"); //  Chinese (Taiwan)
		LANG_MAP.put("zh-yue", "粵語"); //  Cantonese -- (see bug 8217)
		LANG_MAP.put("zu", "isiZulu"); //  Zulu
	}
}

