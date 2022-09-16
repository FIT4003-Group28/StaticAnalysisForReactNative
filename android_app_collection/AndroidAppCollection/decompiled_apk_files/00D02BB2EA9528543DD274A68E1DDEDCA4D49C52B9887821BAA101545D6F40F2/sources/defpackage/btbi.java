package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btbi  reason: default package */
/* loaded from: classes4.dex */
public final class btbi extends gen {
    public Activity a;
    public dxio<afha> b;

    @Override // defpackage.ges
    protected final void Nv() {
        ((btbj) btsx.b(btbj.class, this)).dk(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        cjkp B = cjkr.B();
        B.t(this.a.getString(R.string.APP_LANGUAGE_SETTINGS_DOWNLOAD_FAILED_DIALOG_TITLE));
        ((cjke) B).e = this.a.getString(R.string.APP_LANGUAGE_SETTINGS_DOWNLOAD_FAILED_DIALOG_TEXT);
        B.v(this.a.getString(R.string.LEARN_MORE), new View.OnClickListener(this) { // from class: btbh
            private final btbi a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                btbi btbiVar = this.a;
                int i = cjxr.a;
                btbiVar.b.a().m(cjxr.r(), 4);
            }
        }, cjtd.a(dtxj.bd));
        B.x(2131232473);
        B.y(this.a.getString(R.string.OK_BUTTON), null, cjtd.a(dtxj.be));
        return B.u(this.a).q();
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxj.bc;
    }
}
