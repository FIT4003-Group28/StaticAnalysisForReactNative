package defpackage;
/* compiled from: PG */
/* renamed from: cau  reason: default package */
/* loaded from: classes2.dex */
public final class cau implements can {
    public final String a;
    public final cak b;
    public final cak c;
    public final bzz d;
    public final boolean e;

    public cau(String str, cak cakVar, cak cakVar2, bzz bzzVar, boolean z) {
        this.a = str;
        this.b = cakVar;
        this.c = cakVar2;
        this.d = bzzVar;
        this.e = z;
    }

    @Override // defpackage.can
    public final byc a(bxn bxnVar, cbd cbdVar) {
        return new byo(bxnVar, cbdVar, this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("RectangleShape{position=");
        sb.append(valueOf);
        sb.append(", size=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
