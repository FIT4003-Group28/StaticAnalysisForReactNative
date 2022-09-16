package defpackage;
/* compiled from: PG */
/* renamed from: hke  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hke implements ylv {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ hke(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.b == 0) {
            b((Throwable) obj);
        } else {
            b((Throwable) obj);
        }
    }

    @Override // defpackage.ylv
    public final void b(Throwable th) {
        if (this.b == 0) {
            String str = this.a;
            afus.c(2, 6, str.length() != 0 ? "[ShortsCreation][Android][Upload]".concat(str) : new String("[ShortsCreation][Android][Upload]"), th);
            return;
        }
        String valueOf = String.valueOf(this.a);
        zep.d(valueOf.length() != 0 ? "SVideoEffectsController: Failed to delete the asset ".concat(valueOf) : new String("SVideoEffectsController: Failed to delete the asset "), th);
    }
}
