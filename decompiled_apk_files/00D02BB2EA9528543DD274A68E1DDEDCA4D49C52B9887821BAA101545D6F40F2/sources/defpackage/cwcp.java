package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cwcp  reason: default package */
/* loaded from: classes5.dex */
public class cwcp extends cwbz {
    final z<String> q;
    final z<dbsg<String>> r;
    final z<dcdc<String>> s;
    final z<dbsg<Integer>> t;
    final z<dbsg<Drawable>> u;

    /* JADX INFO: Access modifiers changed from: protected */
    public cwcp(String str, Drawable drawable) {
        super(drawable);
        this.r = new z<>(dbpy.a);
        this.s = new z<>(dcdc.e());
        this.t = new z<>(dbpy.a);
        this.u = new z<>(dbpy.a);
        this.q = new z<>(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(String str) {
        cwip.a(this.q, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(dbsg<String> dbsgVar) {
        cwip.a(this.r, dbsgVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(dcdc<String> dcdcVar) {
        cwip.a(this.s, dcdcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(dbsg<Integer> dbsgVar) {
        cwip.a(this.t, dbsgVar);
    }
}
