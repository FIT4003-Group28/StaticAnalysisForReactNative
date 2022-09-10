package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajqq  reason: default package */
/* loaded from: classes2.dex */
public final class ajqq extends gen {
    public final dcqe a = dcqe.b();
    public final dzgl b = dzgl.h();
    public final dzut<dztc> c = new ajqm(this);
    public final dzut<dztc> d = new ajql(this);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        Resources resources;
        Resources resources2;
        Resources resources3;
        cjkp B = cjkr.B();
        B.x(2131232175);
        ff J = J();
        String str = null;
        B.t((J == null || (resources3 = J.getResources()) == null) ? null : resources3.getString(R.string.BATTERY_SAVER_PROMPT_TITLE));
        ff J2 = J();
        B.z((J2 == null || (resources2 = J2.getResources()) == null) ? null : resources2.getString(R.string.BATTERY_SAVER_PROMPT_SETTINGS_BUTTON), new ajqn(this), cjtd.a(dtxu.di));
        ff J3 = J();
        if (J3 != null && (resources = J3.getResources()) != null) {
            str = resources.getString(R.string.BATTERY_SAVER_PROMPT_CANCEL_BUTTON);
        }
        B.y(str, new ajqo(this), cjtd.a(dtxu.dh));
        cjke cjkeVar = (cjke) B;
        cjkeVar.g = new ajqp(this);
        cjkeVar.f = cqgr.fT(new ajqr(), new ajqs());
        cjkeVar.a = ibn.l();
        cjkr u = B.u(this.aE);
        dzvx.b(u, "com.google.android.apps.…      .build(gmmActivity)");
        AlertDialog q = u.q();
        dzvx.b(q, "com.google.android.apps.…ivity)\n      .alertDialog");
        return q;
    }
}
