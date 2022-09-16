package defpackage;
/* renamed from: chgq  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class chgq implements acb {
    static final acb a = new chgq();

    private chgq() {
    }

    @Override // defpackage.acb
    public final void a(acl aclVar) {
        aclVar.a.animate().cancel();
        aclVar.a.setAlpha(1.0f);
        aclVar.a.setTranslationY(0.0f);
    }
}
