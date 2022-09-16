package defpackage;
/* compiled from: PG */
/* renamed from: baln  reason: default package */
/* loaded from: classes2.dex */
public final class baln implements balr, balq {
    public volatile balr a;
    public volatile balq b;
    private final String c = "T";
    private final balr d;

    public baln(balr balrVar) {
        this.d = balrVar;
    }

    @Override // defpackage.balr
    public final int a(baih baihVar) {
        balr balrVar = this.d;
        balr balrVar2 = this.a;
        int a = balrVar.a(baihVar) + balrVar2.a(baihVar);
        return balrVar2.b(baihVar, 1) > 0 ? a + this.c.length() : a;
    }

    @Override // defpackage.balr
    public final int b(baih baihVar, int i) {
        int b = this.d.b(baihVar, i);
        return b < i ? b + this.a.b(baihVar, i) : b;
    }

    @Override // defpackage.balr
    public final void c(StringBuffer stringBuffer, baih baihVar) {
        balr balrVar = this.d;
        balr balrVar2 = this.a;
        balrVar.c(stringBuffer, baihVar);
        if (balrVar2.b(baihVar, 1) > 0) {
            stringBuffer.append(this.c);
        }
        balrVar2.c(stringBuffer, baihVar);
    }
}
