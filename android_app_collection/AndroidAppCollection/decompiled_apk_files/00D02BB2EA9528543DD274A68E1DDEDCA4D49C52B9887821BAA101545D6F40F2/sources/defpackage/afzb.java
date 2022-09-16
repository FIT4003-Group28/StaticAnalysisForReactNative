package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afzb  reason: default package */
/* loaded from: classes2.dex */
public final class afzb implements cjqv {
    final /* synthetic */ afzm a;

    public afzb(afzm afzmVar) {
        this.a = afzmVar;
    }

    @Override // defpackage.cjqv
    public final void a(cjtd cjtdVar) {
        String str;
        if (cjtdVar.h == dvnp.LOCAL_STREAM && (str = cjtdVar.e) != null) {
            this.a.ak.p(cjtdVar.h, str, null);
        }
        if (this.a.P == null || !dbsd.a(cjtdVar.g, dtxu.bs) || cjtdVar.g() != 2 || !this.a.bd().a()) {
            return;
        }
        this.a.ak.n(this.a.bd().b().d(cjtd.a(dtxu.bV)), new cjte(deaf.SWIPE, dead.UP), cjtd.a(dtxu.bV));
    }
}
