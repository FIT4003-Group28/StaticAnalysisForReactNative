package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: spe  reason: default package */
/* loaded from: classes7.dex */
public final class spe extends gen {
    public btvo a;
    public dxio<bsvm> b;
    public dxio<afha> c;

    @Override // defpackage.ges
    public final void Nv() {
        ((spf) btsx.b(spf.class, this)).bJ(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        ff J = J();
        cjkp B = cjkr.B();
        B.t(J.getString(R.string.LOCATION_HISTORY_INFO_DIALOG_TITLE));
        cjke cjkeVar = (cjke) B;
        cjkeVar.e = J.getString(R.string.LOCATION_HISTORY_INFO_DIALOG_BODY);
        B.v(J.getString(R.string.LOCATION_HISTORY_INFO_DIALOG_CONTROL_BUTTON), new View.OnClickListener(this) { // from class: spc
            private final spe a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.a().j();
            }
        }, cjtd.a(dtxu.cT));
        B.y(J.getString(R.string.LOCATION_HISTORY_INFO_DIALOG_LEARN_MORE_BUTTON), new View.OnClickListener(this) { // from class: spd
            private final spe a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                spe speVar = this.a;
                speVar.c.a().m(cjxr.i(speVar.a), 4);
            }
        }, cjtd.a(dtxu.cU));
        B.z(J.getString(R.string.LOCATION_HISTORY_INFO_DIALOG_OK_BUTTON), null, cjtd.a(dtxu.cS));
        cjkeVar.a = ibn.l();
        return B.u(J).q();
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxu.cR;
    }
}
