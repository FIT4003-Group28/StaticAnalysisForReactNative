package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rlm  reason: default package */
/* loaded from: classes4.dex */
public final class rlm extends agc {
    final /* synthetic */ rlp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlm(rlp rlpVar) {
        super(20);
        this.a = rlpVar;
    }

    @Override // defpackage.agc
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        String str = (String) obj;
        qnm.l(str);
        rlp rlpVar = this.a;
        rlpVar.V();
        qnm.l(str);
        axua.b();
        if (rlpVar.J().o(rkg.au) && rlpVar.g(str)) {
            if (!rlpVar.b.containsKey(str) || rlpVar.b.get(str) == null) {
                rlpVar.d(str);
            } else {
                rlpVar.e(str, (rqb) rlpVar.b.get(str));
            }
            return (dpr) rlpVar.d.e().get(str);
        }
        return null;
    }
}
