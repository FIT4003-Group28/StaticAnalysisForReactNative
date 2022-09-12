package defpackage;
/* compiled from: PG */
/* renamed from: aetu  reason: default package */
/* loaded from: classes2.dex */
public abstract class aetu {
    private static final dmlo a = dmlo.TOP;

    public static aett s(String str) {
        aetr aetrVar = new aetr();
        if (str != null) {
            aetrVar.a = str;
            aetrVar.g();
            aetrVar.b();
            aetrVar.i();
            aetrVar.d(12);
            aetrVar.j();
            aetrVar.h();
            aetrVar.c(38);
            aetrVar.c = 1;
            aetrVar.d = 1493172224;
            aetrVar.e = 16;
            aetrVar.e(4);
            aetrVar.f = false;
            aetrVar.i = 1;
            dmlo dmloVar = a;
            if (dmloVar != null) {
                aetrVar.g = dmloVar;
                return aetrVar;
            }
            throw new NullPointerException("Null anchorPoint");
        }
        throw new NullPointerException("Null text");
    }

    public abstract String a();

    public abstract dbsg<String> b();

    public abstract dbsg<String> c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract boolean o();

    public abstract dmlo p();

    @dzsi
    public abstract akvo<? super aktd> q();

    public abstract int r();
}
