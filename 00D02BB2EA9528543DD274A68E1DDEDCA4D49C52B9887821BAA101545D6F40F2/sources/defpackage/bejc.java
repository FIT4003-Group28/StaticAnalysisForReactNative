package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bejc  reason: default package */
/* loaded from: classes3.dex */
public final class bejc implements crzp<apsi<dbsg<dgac>>> {
    final /* synthetic */ bejd a;

    public bejc(bejd bejdVar) {
        this.a = bejdVar;
    }

    private final void b(dbsg<dgac> dbsgVar, SwitchPreferenceCompat switchPreferenceCompat) {
        bvrt<benb> c;
        if (!dbsgVar.a()) {
            return;
        }
        dgab b = dgab.b(dbsgVar.b().b);
        if (b == null) {
            b = dgab.UNKNOWN_CALL_TRACKING_STATUS;
        }
        if (b.equals(dgab.TRACKING)) {
            switchPreferenceCompat.m(true);
        } else if (b.equals(dgab.PAUSED)) {
            switchPreferenceCompat.m(false);
            bwrs<bvrt<benb>> bwrsVar = this.a.am;
            if (bwrsVar == null || (c = bwrsVar.c()) == null) {
                return;
            }
            for (dqob dqobVar : c.e((dssr) benb.b.cu(7), benb.b).a) {
                dqof dqofVar = dqobVar.a;
                if (dqofVar == null) {
                    dqofVar = dqof.c;
                }
                int a = dqoe.a(dqofVar.b);
                if (a != 0 && a == 2) {
                    this.a.ai.a().e(dvum.MERCHANT_CALLS_OPT_OUT, null, bejb.a, beno.c(dqobVar, dgab.PAUSED));
                }
            }
        }
    }

    @Override // defpackage.crzp
    public final void On(crzm<apsi<dbsg<dgac>>> crzmVar) {
        apsi<dbsg<dgac>> l = crzmVar.l();
        if (l == null || this.a.an == null) {
            return;
        }
        int b = l.b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        }
        if (i == 0) {
            this.a.af.a();
        } else if (i == 1) {
            this.a.af.b();
            SwitchPreferenceCompat switchPreferenceCompat = this.a.an;
            dbsk.s(switchPreferenceCompat);
            b(l.a(), switchPreferenceCompat);
            ckos.a(this.a.ad.findViewById(16908290), this.a.ad.getString(R.string.MERCHANT_PANEL_ERROR_MESSAGE_SNACKBAR), 0).c();
        } else if (i != 2) {
        } else {
            this.a.af.b();
            SwitchPreferenceCompat switchPreferenceCompat2 = this.a.an;
            dbsk.s(switchPreferenceCompat2);
            b(l.a(), switchPreferenceCompat2);
        }
    }
}
