package defpackage;
/* compiled from: PG */
/* renamed from: bmez  reason: default package */
/* loaded from: classes3.dex */
public final class bmez {
    public static final dcdn<String, ckjz> a;
    public final ckcw b;
    private final cqat c;
    private long d = 0;
    private long e = 0;

    static {
        dcdg p = dcdn.p();
        p.f("bs", ckjz.BOSNIAN);
        p.f("ca", ckjz.CATALAN);
        p.f("cs", ckjz.CZECH);
        p.f("cy", ckjz.WELSH);
        p.f("da", ckjz.DANISH);
        p.f("de", ckjz.GERMAN);
        p.f("el", ckjz.GREEK);
        p.f("en", ckjz.ENGLISH);
        p.f("et", ckjz.ESTONIAN);
        p.f("fi", ckjz.FINNISH);
        p.f("fil", ckjz.FILIPINO);
        p.f("fr", ckjz.FRENCH);
        p.f("hi", ckjz.HINDI);
        p.f("hr", ckjz.CROATIAN);
        p.f("hu", ckjz.HUNGARIAN);
        p.f("in", ckjz.INDONESIAN);
        p.f("it", ckjz.ITALIAN);
        p.f("ja", ckjz.JAPANESE);
        p.f("jv", ckjz.JAVANESE);
        p.f("km", ckjz.KHMER);
        p.f("ku", ckjz.KURDISH);
        p.f("ko", ckjz.KOREAN);
        p.f("la", ckjz.LATIN);
        p.f("ne", ckjz.NEPALI);
        p.f("nb", ckjz.NORWEGIAN_BOKMAL);
        p.f("nl", ckjz.DUTCH);
        p.f("pl", ckjz.POLISH);
        p.f("ro", ckjz.ROMANIAN);
        p.f("ru", ckjz.RUSSIAN);
        p.f("sk", ckjz.SLOVAK);
        p.f("si", ckjz.SINHALA);
        p.f("sq", ckjz.ALBANIAN);
        p.f("sr", ckjz.SERBIAN);
        p.f("su", ckjz.SUDANESE);
        p.f("sv", ckjz.SWEDISH);
        p.f("sw", ckjz.SWAHILI);
        p.f("ta", ckjz.TAMIL);
        p.f("th", ckjz.THAI);
        p.f("tr", ckjz.TURKISH);
        p.f("uk", ckjz.UKRAINIAN);
        p.f("vi", ckjz.VIETNAMESE);
        a = p.b();
    }

    public bmez(ckcw ckcwVar, cqat cqatVar) {
        this.b = ckcwVar;
        this.c = cqatVar;
    }

    public final synchronized void a() {
        this.d = this.c.e();
    }

    public final synchronized void b() {
        if (this.d != 0) {
            ((ckcp) this.b.a(ckka.b)).a(this.c.e() - this.d);
            this.d = 0L;
        }
    }

    public final synchronized void c() {
        this.e = this.c.e();
    }

    public final synchronized void d() {
        if (this.e != 0) {
            ((ckcp) this.b.a(ckka.c)).a(this.c.e() - this.e);
            this.e = 0L;
        }
    }
}
