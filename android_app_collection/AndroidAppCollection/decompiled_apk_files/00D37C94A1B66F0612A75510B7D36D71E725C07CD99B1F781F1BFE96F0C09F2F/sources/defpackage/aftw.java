package defpackage;
/* compiled from: PG */
/* renamed from: aftw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aftw implements ylw {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ aftw(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            String str = this.a;
            if (!((Boolean) obj).booleanValue()) {
                return;
            }
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                return;
            }
            "In DefaultDelayedEventService: ".concat(valueOf);
            return;
        }
        String str2 = this.a;
        if (((Boolean) obj).booleanValue()) {
            String valueOf2 = String.valueOf(str2);
            if (valueOf2.length() == 0) {
                return;
            }
            "SVideoEffectsController: Successfully deleted asset ".concat(valueOf2);
            return;
        }
        String valueOf3 = String.valueOf(str2);
        zep.b(valueOf3.length() != 0 ? "SVideoEffectsController: Failed to delete asset ".concat(valueOf3) : new String("SVideoEffectsController: Failed to delete asset "));
    }
}
