package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: shw  reason: default package */
/* loaded from: classes4.dex */
public final class shw implements ankb {
    final /* synthetic */ shx a;
    private final /* synthetic */ int b;

    public shw(shx shxVar) {
        this.a = shxVar;
    }

    public shw(shx shxVar, int i) {
        this.b = i;
        this.a = shxVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        if (this.b != 0) {
            this.a.c.e(th);
        } else {
            ((amzw) ((amzw) ((amzw) shx.a.f()).h(th)).i("com/google/android/libraries/ar/faceviewer/components/lifecycle/LifecycleController$2", "onFailure", (char) 127, "LifecycleController.java")).q("Failed to Load all Assets.");
        }
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (this.b == 0) {
            Void r5 = (Void) obj;
            this.a.e.e.a.e(skt.ASSET_DOWNLOAD);
            ((amzw) ((amzw) shx.a.e()).i("com/google/android/libraries/ar/faceviewer/components/lifecycle/LifecycleController$2", "onSuccess", 122, "LifecycleController.java")).q("Loaded all Assets");
            return;
        }
        this.a.c.o((Boolean) obj);
    }
}
