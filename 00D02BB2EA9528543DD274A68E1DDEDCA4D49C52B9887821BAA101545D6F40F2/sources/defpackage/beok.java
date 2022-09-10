package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: beok  reason: default package */
/* loaded from: classes3.dex */
public final class beok implements crzp<apsi<dbsg<dgac>>> {
    final /* synthetic */ beol a;

    public beok(beol beolVar) {
        this.a = beolVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<apsi<dbsg<dgac>>> crzmVar) {
        apsi<dbsg<dgac>> l = crzmVar.l();
        if (l == null) {
            return;
        }
        int b = l.b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        }
        if (i == 0) {
            this.a.d.a();
        } else if (i == 1) {
            this.a.d.b();
            ckos.a(this.a.e.findViewById(16908290), this.a.e.getString(R.string.MERCHANT_PANEL_ERROR_MESSAGE_SNACKBAR), 0).c();
        } else if (i != 2) {
        } else {
            this.a.d.b();
            if (!l.a().a()) {
                return;
            }
            beol beolVar = this.a;
            dgab b2 = dgab.b(l.a().b().b);
            if (b2 == null) {
                b2 = dgab.UNKNOWN_CALL_TRACKING_STATUS;
            }
            beolVar.r(b2);
        }
    }
}
