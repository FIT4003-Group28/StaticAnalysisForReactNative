package defpackage;
/* compiled from: PG */
/* renamed from: cbb  reason: default package */
/* loaded from: classes2.dex */
public final class cbb implements can {
    public final bzz a;
    public final bzz b;
    public final bzz c;
    public final boolean d;
    public final int e;

    public cbb(int i, bzz bzzVar, bzz bzzVar2, bzz bzzVar3, boolean z) {
        this.e = i;
        this.a = bzzVar;
        this.b = bzzVar2;
        this.c = bzzVar3;
        this.d = z;
    }

    @Override // defpackage.can
    public final byc a(bxn bxnVar, cbd cbdVar) {
        return new bys(cbdVar, this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 37 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Trim Path: {start: ");
        sb.append(valueOf);
        sb.append(", end: ");
        sb.append(valueOf2);
        sb.append(", offset: ");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
