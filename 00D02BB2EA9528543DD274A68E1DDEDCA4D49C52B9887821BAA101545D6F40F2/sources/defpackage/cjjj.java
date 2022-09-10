package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cjjj  reason: default package */
/* loaded from: classes4.dex */
public final class cjjj {
    public final cjqq a;
    private final Activity b;

    public cjjj(Activity activity, cjqq cjqqVar) {
        dzvx.c(activity, "activity");
        this.b = activity;
        this.a = cjqqVar;
    }

    public final void a(cjjf cjjfVar) {
        dzvx.c(cjjfVar, "configuration");
        View c = cjjfVar.c();
        if (dzvx.d(c.getTag(R.id.terraCallout), true)) {
            return;
        }
        cjjc.a(c, true);
        cjjp cjjpVar = new cjjp(this.b, cjjfVar.a(), cjjfVar.b());
        dzwc dzwcVar = new dzwc();
        int i = 0;
        dzwcVar.a = false;
        cjjh cjjhVar = new cjjh(this, dzwcVar, cjjfVar, c);
        Integer d = cjjfVar.d();
        if (d != null) {
            i = d.intValue();
        }
        cjjpVar.setOnDismissListener(new cjjg(c, new cjkc(c, i, new cjji(cjjpVar, cjjhVar, c, cjjfVar)), cjjfVar));
    }
}
