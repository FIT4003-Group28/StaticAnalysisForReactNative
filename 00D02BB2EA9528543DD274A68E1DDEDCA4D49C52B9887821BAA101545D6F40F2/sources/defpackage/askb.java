package defpackage;
/* compiled from: PG */
/* renamed from: askb  reason: default package */
/* loaded from: classes2.dex */
final class askb implements cjqv {
    final /* synthetic */ aske a;

    public askb(aske askeVar) {
        this.a = askeVar;
    }

    @Override // defpackage.cjqv
    public final void a(cjtd cjtdVar) {
        String str;
        if (cjtdVar.h != dvnp.DIRECTIONS || (str = cjtdVar.e) == null) {
            return;
        }
        this.a.b.p(cjtdVar.h, str, null);
    }
}
