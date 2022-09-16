package defpackage;

import android.app.Activity;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: pxm  reason: default package */
/* loaded from: classes7.dex */
final class pxm implements vyo {
    private static final dcqe a = dcqe.c("pxm");
    private final Activity b;
    private final dxio<brba> c;
    private final puy d;
    private final vnk e;

    public pxm(Activity activity, dxio<brba> dxioVar, puy puyVar, vnk vnkVar) {
        this.b = activity;
        this.c = dxioVar;
        this.d = puyVar;
        this.e = vnkVar;
    }

    @Override // defpackage.vyo
    public final void a() {
        this.d.aJ();
        this.e.q();
        this.d.bU(12, null, false, false, false);
    }

    @Override // defpackage.vyo
    public final void b(brln brlnVar) {
        amsz amszVar = brlnVar.c;
        if (!this.d.bg() || amszVar == null || amszVar.d != amvi.ATTACH_PARKING || !amszVar.c()) {
            return;
        }
        if (brlnVar.e.d() == 0) {
            Activity activity = this.b;
            Toast.makeText(activity, activity.getString(R.string.NO_PARKING_LOTS_FOUND), 1).show();
            if (!this.d.bn()) {
                bvoo.h("No snapshot state to restore.", new Object[0]);
            }
            puy puyVar = this.d;
            gek gekVar = puyVar.bg;
            dbsk.s(gekVar);
            puyVar.bU(12, gekVar.c, true, false, true);
            return;
        }
        this.e.ak(amszVar.c);
        bral g = bram.g(bwrs.a(brlnVar), this.d);
        g.b(false);
        g.d(true);
        this.c.a().E(g.a());
    }

    @Override // defpackage.vyo
    public final void c() {
    }

    @Override // defpackage.vyo
    public final void d(bttq bttqVar) {
        if (!this.d.bg()) {
            return;
        }
        bttqVar.toString();
        Activity activity = this.b;
        Toast.makeText(activity, activity.getString(R.string.PARKING_SEARCH_FAILED), 0).show();
    }
}
