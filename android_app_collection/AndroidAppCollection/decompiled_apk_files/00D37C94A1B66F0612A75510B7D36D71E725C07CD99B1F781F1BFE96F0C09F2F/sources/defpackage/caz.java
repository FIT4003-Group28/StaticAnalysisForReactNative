package defpackage;
/* compiled from: PG */
/* renamed from: caz  reason: default package */
/* loaded from: classes2.dex */
public final class caz implements can {
    public final caf a;
    public final boolean b;
    private final String c;
    private final int d;

    public caz(String str, int i, caf cafVar, boolean z) {
        this.c = str;
        this.d = i;
        this.a = cafVar;
        this.b = z;
    }

    @Override // defpackage.can
    public final byc a(bxn bxnVar, cbd cbdVar) {
        return new byq(bxnVar, cbdVar, this);
    }

    public final String toString() {
        String str = this.c;
        int i = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
        sb.append("ShapePath{name=");
        sb.append(str);
        sb.append(", index=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
