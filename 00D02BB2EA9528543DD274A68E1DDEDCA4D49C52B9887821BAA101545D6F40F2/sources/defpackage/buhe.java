package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: buhe  reason: default package */
/* loaded from: classes4.dex */
final class buhe implements crzp<btvo> {
    final /* synthetic */ buhf a;

    public buhe(buhf buhfVar) {
        this.a = buhfVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btvo> crzmVar) {
        btvo l = crzmVar.l();
        if (l == null) {
            return;
        }
        String num = Integer.toString(l.getPlaceSheetParameters().L());
        buhf buhfVar = this.a;
        String str = null;
        if (buhfVar.f != null) {
            try {
                str = buhfVar.d("client_parameter_cache_invalidation_key").get(25L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        }
        if (str == null) {
            str = this.a.g.a("client_parameter_cache_invalidation_key");
        }
        if (!dbsd.a(str, num)) {
            this.a.c();
        }
        this.a.g.Pz("client_parameter_cache_invalidation_key", num);
        this.a.e("client_parameter_cache_invalidation_key", num);
    }
}
