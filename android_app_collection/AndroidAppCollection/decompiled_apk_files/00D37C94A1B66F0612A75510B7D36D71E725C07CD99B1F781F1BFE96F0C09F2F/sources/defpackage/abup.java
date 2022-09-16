package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abup  reason: default package */
/* loaded from: classes.dex */
public final class abup implements acbs {
    final /* synthetic */ abus a;

    public abup(abus abusVar) {
        this.a = abusVar;
    }

    @Override // defpackage.acbs
    public final void a(acbt acbtVar, int i) {
        String valueOf = String.valueOf(acbtVar.g());
        zep.c("MediaMuxCapturePipelineMgr", valueOf.length() != 0 ? "Encoder error for ".concat(valueOf) : new String("Encoder error for "));
        this.a.v(i);
    }
}
