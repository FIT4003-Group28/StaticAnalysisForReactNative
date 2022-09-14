package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: beod  reason: default package */
/* loaded from: classes3.dex */
public final class beod implements crzp<apsi<dbsg<List<dfzs>>>> {
    final /* synthetic */ beog a;

    public beod(beog beogVar) {
        this.a = beogVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<apsi<dbsg<List<dfzs>>>> crzmVar) {
        apsi<dbsg<List<dfzs>>> l = crzmVar.l();
        if (l == null) {
            return;
        }
        int b = l.b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        }
        if (i == 1) {
            ckos.a(this.a.j.findViewById(16908290), this.a.j.getString(R.string.MERCHANT_PANEL_ERROR_MESSAGE_SNACKBAR), 0).c();
            this.a.t();
        } else if (i == 2) {
            this.a.q(l);
            this.a.t();
        }
        cqkx.p(this.a.l);
    }
}
