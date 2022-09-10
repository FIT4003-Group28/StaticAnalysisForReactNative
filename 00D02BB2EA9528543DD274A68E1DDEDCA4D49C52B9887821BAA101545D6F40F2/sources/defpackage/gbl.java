package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: gbl  reason: default package */
/* loaded from: classes6.dex */
public final class gbl extends gen {
    public gcb a;
    cjkr b;

    @Override // defpackage.ges
    protected final void Nv() {
        ((gbm) btsx.b(gbm.class, this)).bH(this);
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        final gga ggaVar = this.aE;
        gcb gcbVar = this.a;
        gga a = gcbVar.a.a();
        gcb.a(a, 1);
        btvo a2 = gcbVar.b.a();
        gcb.a(a2, 2);
        dxio a3 = ((dxjh) gcbVar.c).a();
        gcb.a(a3, 3);
        gca gcaVar = new gca(a, a2, a3);
        cjkp B = cjkr.B();
        B.t(Rp(R.string.DIALOG_TITLE));
        ((cjke) B).f = cqgr.fT(new gbt(), gcaVar);
        B.z(Rp(R.string.OK_BUTTON), new View.OnClickListener(this, ggaVar) { // from class: gbk
            private final gbl a;
            private final gga b;

            {
                this.a = this;
                this.b = ggaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gbl gblVar = this.a;
                gga ggaVar2 = this.b;
                if (ggaVar2 == null) {
                    return;
                }
                cjxu.i(ggaVar2, gblVar.Rp(R.string.ZOOM_OUT_TOAST_MESSAGE));
            }
        }, cjtd.a(dddv.b));
        B.y(Rp(R.string.LEARN_MORE), gcaVar.g(), cjtd.a(dddv.c));
        dbsk.s(ggaVar);
        cjkr u = B.u(ggaVar);
        this.b = u;
        return u.q();
    }
}
