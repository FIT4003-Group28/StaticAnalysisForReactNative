package defpackage;
/* compiled from: PG */
/* renamed from: gpq  reason: default package */
/* loaded from: classes3.dex */
public final class gpq implements ankb {
    final /* synthetic */ acvg a;
    final /* synthetic */ gps b;

    public gpq(gps gpsVar, acvg acvgVar) {
        this.b = gpsVar;
        this.a = acvgVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        int i = gps.b;
        acvg acvgVar = this.a;
        if (acvgVar != null) {
            acvgVar.c("as_fail");
        }
        this.b.a(false, amon.a);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        slh slhVar = (slh) obj;
        boolean contains = slhVar.b.contains(0);
        ((amzw) ((amzw) slh.a.d()).i("com/google/android/libraries/assistant/appintegration/AssistantConfig", "isAvailable", 60, "AssistantConfig.java")).B(contains);
        acvg acvgVar = this.a;
        if (acvgVar != null) {
            acvgVar.c("as_ok");
        }
        this.b.a(contains, slhVar.c);
    }
}
