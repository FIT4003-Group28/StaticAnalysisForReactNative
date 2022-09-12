package defpackage;
/* compiled from: PG */
/* renamed from: cvbx  reason: default package */
/* loaded from: classes5.dex */
public final class cvbx implements cvbr {
    private static final cvbq c = new cvbw();
    public cvbq a = c;
    private final cvbs b;

    public cvbx(cvbs cvbsVar, boolean z, dbsg<CharSequence> dbsgVar) {
        this.b = cvbsVar;
        cvbsVar.setPresenter(this);
        cvbsVar.setIsSendingDeleteConversationEventEnabled(z);
        cvbsVar.setCustomLocalDeleteDescription(dbsgVar);
    }

    @Override // defpackage.cuvu
    public final void A() {
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    @Override // defpackage.cvbr
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.cvbr
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.cuvu
    public final void z() {
    }
}
