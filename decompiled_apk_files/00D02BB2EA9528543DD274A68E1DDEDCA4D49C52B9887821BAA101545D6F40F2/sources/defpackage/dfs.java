package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dfs  reason: default package */
/* loaded from: classes6.dex */
public final class dfs extends des {
    public Activity ah;
    public cqkj ai;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dev
    public final ddho aR() {
        return dtxw.x;
    }

    @Override // defpackage.ry, defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        iii iiiVar = new iii();
        iiiVar.b = this.ah.getString(R.string.AR_INCOGNITO_WARNING_DESCRIPTION);
        iiiVar.c(this.ah.getString(R.string.AR_INCOGNITO_WARING_CANCEL_BUTTON), null, cjtd.a(dtxw.v));
        iiiVar.d(this.ah.getString(R.string.AR_INCOGNITO_WARNING_CONTINUE_BUTTON), new View.OnClickListener(this) { // from class: dfr
            private final dfs a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dfs dfsVar = this.a;
                czp o = dfsVar.ag.o();
                o.e(true);
                dfsVar.aK(o.d());
            }
        }, cjtd.a(dtxw.w));
        return iiiVar.a(this.ah, this.ai).l();
    }

    @Override // defpackage.des, defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        aQ(cjtd.a(dtxw.x));
    }
}
