package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: chiu  reason: default package */
/* loaded from: classes4.dex */
public class chiu {
    private final Activity a;

    public chiu(Activity activity) {
        this.a = activity;
    }

    public final jic a(String str) {
        cqrp d = cqrp.d(2.0d);
        dsnh b = ckqj.b(str);
        b.e(false);
        b.c(100);
        b.b(16777215);
        b.a.d(dsne.BORDER_SIZE, Integer.valueOf(d.e(this.a)));
        b.a.c(dsne.BORDER_SIZE);
        b.i();
        return new jic(ckqj.a(b, str), ckqc.FIFE_MERGE, cqui.c(cquh.a(1), cquh.e(d, ibm.b()), cquh.f(ibm.j())), 250);
    }
}
