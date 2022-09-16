package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: sjt  reason: default package */
/* loaded from: classes4.dex */
public final class sjt implements ankb {
    final /* synthetic */ List a;
    final /* synthetic */ sju b;

    public sjt(sju sjuVar, List list) {
        this.b = sjuVar;
        this.a = list;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        ((amzw) ((amzw) ((amzw) sju.a.f()).h(th)).i("com/google/android/libraries/ar/faceviewer/components/rendering/RenderingManager$1", "onFailure", (char) 266, "RenderingManager.java")).q("Failed to activate effect.");
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Void r3 = (Void) obj;
        this.b.k.e.a.e(skt.RENDER_INIT);
        this.b.k.e.a.d();
        sie sieVar = this.b.k.e.a;
        sieVar.d = (String) this.a.get(0);
        sieVar.e++;
        sieVar.e(skt.ASSET_SWITCH);
        sieVar.f(skt.ASSET);
    }
}
