package defpackage;
/* compiled from: PG */
/* renamed from: alyj  reason: default package */
/* loaded from: classes.dex */
public final class alyj {
    public final alyh a;
    public final alxs b;
    public final int c;
    public final akqn d;
    public dmpp e;
    public final int f;
    public final int g;

    public alyj(alyh alyhVar, alxs alxsVar, int i, int i2, int i3) {
        this.e = dmpp.b;
        this.a = alyhVar;
        this.b = alxsVar;
        this.c = i;
        this.f = i2;
        this.g = i3;
        this.d = new akrv(new aksb(alyhVar.e, alyhVar.f, alyhVar.g, i2, i3));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("TileGlobalData{ coords ");
        sb.append(valueOf);
        sb.append(" @ ");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public alyj(alyj alyjVar) {
        this(alyjVar.a, alyjVar.b, alyjVar.c, alyjVar.f, alyjVar.g);
    }
}
