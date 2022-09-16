package defpackage;
/* compiled from: PG */
/* renamed from: sjh  reason: default package */
/* loaded from: classes4.dex */
final class sjh implements ankb {
    final /* synthetic */ aoib a;

    public sjh(aoib aoibVar) {
        this.a = aoibVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        ((amzw) ((amzw) ((amzw) sjk.a.f()).h(th)).i("com/google/android/libraries/ar/faceviewer/components/rendering/GLViewManager$2", "onFailure", 's', "GLViewManager.java")).q("Failed to set alignment.");
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        awfh awfhVar = ((awgg) obj).c;
        if (awfhVar == null) {
            awfhVar = awfh.a;
        }
        float f = awfhVar.c;
        aoib aoibVar = this.a;
        aoibVar.e = 0.5f;
        aoibVar.f = 1.0f - f;
    }
}
