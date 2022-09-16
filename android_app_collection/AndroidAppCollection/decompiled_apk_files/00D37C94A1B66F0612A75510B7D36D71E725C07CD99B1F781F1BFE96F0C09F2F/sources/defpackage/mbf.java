package defpackage;
/* compiled from: PG */
/* renamed from: mbf  reason: default package */
/* loaded from: classes3.dex */
public final class mbf {
    public final auhq a;
    public aozy b = null;
    public auik c = null;
    public auhp d = null;
    public auig[] e = null;
    private byte[] f = null;

    public mbf(auhq auhqVar) {
        this.a = auhqVar;
    }

    public final auhp a() {
        if (this.d == null) {
            auhp auhpVar = this.a.d;
            if (auhpVar == null) {
                auhpVar = auhp.a;
            }
            this.d = auhpVar;
        }
        return this.d;
    }

    public final byte[] b() {
        if (this.f == null) {
            this.f = this.a.g.I();
        }
        return this.f;
    }
}
