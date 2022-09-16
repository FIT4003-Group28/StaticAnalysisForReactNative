package defpackage;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cctr  reason: default package */
/* loaded from: classes4.dex */
public final class cctr extends ex {
    private boolean ad;
    private int ae = R.string.SENDING;

    public static cctr aJ(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("msg_res", i);
        cctr cctrVar = new cctr();
        cctrVar.B(bundle);
        return cctrVar;
    }

    @Override // defpackage.fd
    public final void ak() {
        super.ak();
        if (this.ad) {
            f();
        }
    }

    @Override // defpackage.ex, defpackage.ajyl
    public final void f() {
        boolean z;
        if (U()) {
            super.f();
            z = false;
        } else {
            z = true;
        }
        this.ad = z;
    }

    @Override // defpackage.ex, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        int i = bundle == null ? 0 : bundle.getInt("msg_res");
        if (i != 0) {
            this.ae = i;
        }
        i(false);
    }

    @Override // defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(J(), 0);
        progressDialog.setMessage(Rp(this.ae));
        return progressDialog;
    }
}
