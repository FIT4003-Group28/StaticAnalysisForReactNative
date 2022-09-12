package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: btjt  reason: default package */
/* loaded from: classes4.dex */
public final class btjt {
    public final Activity a;
    public final bvsx b;

    public btjt(Activity activity) {
        this.a = activity;
        this.b = new bvsx(activity.getResources());
    }

    public final CharSequence a(int i) {
        bvsv a = this.b.a(this.a.getString(i));
        a.g(" ");
        a.i();
        a.n();
        return a.c();
    }
}
