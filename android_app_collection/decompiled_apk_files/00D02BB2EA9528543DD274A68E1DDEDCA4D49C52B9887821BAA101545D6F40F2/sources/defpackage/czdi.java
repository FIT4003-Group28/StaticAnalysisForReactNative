package defpackage;
/* compiled from: PG */
/* renamed from: czdi  reason: default package */
/* loaded from: classes5.dex */
public abstract class czdi {
    private double a = dcyn.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(double d) {
        if (d <= this.a) {
            return false;
        }
        this.a = d;
        return true;
    }

    public abstract cyvt b();

    public abstract cyvs c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(czdj czdjVar) {
        cyvt b = b();
        double a = czdjVar.a(b());
        double d = this.a;
        b.c = a + d;
        if (d > dcyn.a) {
            b().g(cygl.PAPI_TOPN);
            b().g(cygl.DEVICE);
        }
    }
}
