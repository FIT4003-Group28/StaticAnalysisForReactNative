package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dkw  reason: default package */
/* loaded from: classes6.dex */
public final class dkw extends des {
    public Activity ah;
    public cqkj ai;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dev
    public final ddho aR() {
        return dtxw.y;
    }

    @Override // defpackage.ry, defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        iii iiiVar = new iii();
        iiiVar.a = this.ah.getString(R.string.AR_LOW_END_DEVICE_TITLE);
        iiiVar.b = this.ah.getString(R.string.AR_LOW_END_DEVICE_DESCRIPTION);
        iiiVar.c(this.ah.getString(R.string.AR_LOW_END_DEVICE_CANCEL_BUTTON), null, cjtd.a(dtxw.z));
        iiiVar.d(this.ah.getString(R.string.AR_LOW_END_DEVICE_GOT_IT_BUTTON), new View.OnClickListener(this) { // from class: dkv
            private final dkw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dkw dkwVar = this.a;
                czp o = dkwVar.ag.o();
                o.g(true);
                dkwVar.aK(o.d());
            }
        }, cjtd.a(dtxw.A));
        return iiiVar.a(this.ah, this.ai).l();
    }

    @Override // defpackage.des, defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        aQ(cjtd.a(dtxw.y));
    }
}
