package defpackage;
/* compiled from: PG */
/* renamed from: hef  reason: default package */
/* loaded from: classes3.dex */
public final class hef {
    public final ztl a;
    public final zsn b;
    public avef c;
    public avyp d;
    public final hkl e;
    public final hed f;
    public final boolean g;
    private final String h = "android_shorts_timeline_builtin_effects_settings.binarypb";

    public hef(ztl ztlVar, zsn zsnVar, hkl hklVar, hed hedVar) {
        this.a = ztlVar;
        this.b = zsnVar;
        this.e = hklVar;
        this.f = hedVar;
        this.g = hklVar.j();
    }

    public final void a(String str) {
        if (this.g) {
            zep.c("PresetFilterDebug", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(avyp avypVar) {
        this.d = avypVar;
        this.b.g(avypVar, true, this.h);
    }
}
