package defpackage;
/* compiled from: PG */
/* renamed from: acol  reason: default package */
/* loaded from: classes.dex */
final class acol implements acbs {
    final /* synthetic */ acor a;

    public acol(acor acorVar) {
        this.a = acorVar;
    }

    @Override // defpackage.acbs
    public final void a(acbt acbtVar, int i) {
        String valueOf = String.valueOf(acbtVar.g());
        zep.c("LocalRecordingManagerImpl", valueOf.length() != 0 ? "Encoder error for ".concat(valueOf) : new String("Encoder error for "));
        this.a.g();
    }
}
