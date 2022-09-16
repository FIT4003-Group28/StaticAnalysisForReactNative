package defpackage;
/* compiled from: PG */
/* renamed from: balh  reason: default package */
/* loaded from: classes2.dex */
public final class balh {
    public final balr a;
    public final balq b;
    public final baie c;

    public balh(balr balrVar, balq balqVar) {
        this.a = balrVar;
        this.b = balqVar;
        this.c = null;
    }

    public balh(balr balrVar, balq balqVar, baie baieVar) {
        this.a = balrVar;
        this.b = balqVar;
        this.c = baieVar;
    }

    public final String a(baih baihVar) {
        balr balrVar = this.a;
        if (balrVar != null) {
            StringBuffer stringBuffer = new StringBuffer(balrVar.a(baihVar));
            balrVar.c(stringBuffer, baihVar);
            return stringBuffer.toString();
        }
        throw new UnsupportedOperationException("Printing not supported");
    }
}
