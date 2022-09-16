package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bene  reason: default package */
/* loaded from: classes3.dex */
public final class bene extends gen {
    public ff a;
    public bwqv b;
    public Executor c;
    @dzsi
    public bwrs<ilo> d;
    public beis e;
    private final crzp<apsi<dbsg<Void>>> g = new crzp(this) { // from class: benc
        private final bene a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            bene beneVar = this.a;
            apsi apsiVar = (apsi) crzmVar.l();
            if (apsiVar == null || beneVar.a == null) {
                return;
            }
            int b = apsiVar.b();
            int i = b - 1;
            if (b == 0) {
                throw null;
            }
            if (i != 1) {
                return;
            }
            ckos.a(beneVar.a.findViewById(16908290), beneVar.a.getString(R.string.MERCHANT_PANEL_ERROR_MESSAGE_SNACKBAR), 0).c();
        }
    };

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.e.b().c(this.g);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View ag = super.ag(layoutInflater, viewGroup, bundle);
        this.e.b().a(this.g, this.c);
        return ag;
    }

    final cjkr g() {
        ff J = J();
        cjkp B = cjkr.B();
        B.t(J.getString(bdys.MERCHANT_PANEL_ORGANIC_CALLS_DELETE_DIALOG_TITLE));
        ((cjke) B).e = J.getString(bdys.MERCHANT_PANEL_ORGANIC_CALLS_DELETE_DIALOG_CONTENT);
        B.w(J.getString(bdys.MERCHANT_PANEL_ORGANIC_CALLS_DELETE_DIALOG_PROMOTED_ACTION), new View.OnClickListener(this) { // from class: bend
            private final bene a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bwrs<ilo> bwrsVar = this.a.d;
                if (bwrsVar != null) {
                    bwrsVar.c();
                }
            }
        }, null, false);
        B.y(J.getString(bdys.MERCHANT_PANEL_ORGANIC_CALLS_DELETE_DIALOG_DEFAULT_ACTION), null, null);
        return B.u(J);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        return g().q();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            Bundle bundle2 = this.o;
            bundle2.getString("MerchantCallsTranscriptDeleteDialogFragment.voiceCallId");
            this.d = this.b.e(ilo.class, bundle2, "MerchantCallsTranscriptDeleteDialogFragment.placemark");
        } catch (IOException e) {
            bvoo.j(e);
        }
    }
}
