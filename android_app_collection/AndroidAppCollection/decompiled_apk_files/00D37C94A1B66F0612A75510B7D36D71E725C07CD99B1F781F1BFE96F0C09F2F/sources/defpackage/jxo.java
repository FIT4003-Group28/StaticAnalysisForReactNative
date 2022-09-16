package defpackage;
/* compiled from: PG */
/* renamed from: jxo  reason: default package */
/* loaded from: classes3.dex */
public final class jxo implements abea {
    private final jxn a;

    public jxo(jxn jxnVar) {
        this.a = jxnVar;
    }

    @Override // defpackage.abea
    public final void nq(abed abedVar) {
        awvc awvcVar = (awvc) this.a.a.c();
        int i = 4;
        if ((awvcVar.b & 4) == 0) {
            i = 2;
        } else if (true == awvcVar.e) {
            i = 3;
        }
        abedVar.F = i;
    }
}
