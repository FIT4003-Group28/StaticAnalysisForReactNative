package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcxp  reason: default package */
/* loaded from: classes5.dex */
public final class dcxp {
    public final int a;
    public final int b;
    public final int c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final dcwa h;
    public final dcwa i;

    public dcxp(int i, int i2, dcwa dcwaVar, dcwa dcwaVar2, dcuw dcuwVar, dcuw dcuwVar2) {
        this.a = i;
        this.b = i2;
        this.d = dcuwVar.a;
        this.e = dcuwVar.b;
        this.f = dcuwVar2.a;
        this.g = dcuwVar2.b;
        this.h = dcwaVar;
        this.i = dcwaVar2;
        this.c = dcyn.d(dcwaVar, dcwaVar2);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(34);
        sb.append("shape ");
        sb.append(i);
        sb.append(" edge ");
        sb.append(i2);
        return sb.toString();
    }
}
