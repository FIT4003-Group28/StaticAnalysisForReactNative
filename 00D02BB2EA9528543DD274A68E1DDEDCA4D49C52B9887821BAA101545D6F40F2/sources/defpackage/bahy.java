package defpackage;

import com.google.android.apps.maps.R;
import defpackage.bayj;
/* compiled from: PG */
/* renamed from: bahy  reason: default package */
/* loaded from: classes3.dex */
class bahy<V extends bayj> implements baes {
    final dcdc<V> a;
    final bahx b;
    final baht c;
    final baht d;
    boolean e;

    public bahy(cqhn cqhnVar, dcdc<V> dcdcVar, bahx bahxVar, boolean z) {
        this.a = dcdcVar;
        this.b = bahxVar;
        this.c = new baht(cqrt.l(bahxVar == bahx.OWNED ? R.string.SAVED_TAB_YOUR_LISTS_MODULE_EXPAND_BUTTON_LABEL : R.string.SAVED_TAB_FOLLOWED_LISTS_MODULE_EXPAND_BUTTON_LABEL), cqrt.l(bahxVar == bahx.OWNED ? R.string.SAVED_TAB_YOUR_LISTS_MODULE_EXPAND_BUTTON_CONTENT_DESCRIPTION : R.string.SAVED_TAB_FOLLOWED_LISTS_MODULE_EXPAND_BUTTON_CONTENT_DESCRIPTION), iup.c(R.raw.hardware_keyboard_arrow_down_black_24dp, ibm.m()), new Runnable(this) { // from class: bahv
            private final bahy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bahy bahyVar = this.a;
                bahyVar.e = true;
                cqkx.p(bahyVar);
            }
        }, cjtd.a(bahxVar == bahx.OWNED ? dtxy.aG : dtxy.ao));
        this.d = new baht(cqrt.l(bahxVar == bahx.OWNED ? R.string.SAVED_TAB_YOUR_LISTS_MODULE_COLLAPSE_BUTTON_LABEL : R.string.SAVED_TAB_FOLLOWED_LISTS_MODULE_COLLAPSE_BUTTON_LABEL), cqrt.l(bahxVar == bahx.OWNED ? R.string.SAVED_TAB_YOUR_LISTS_MODULE_COLLAPSE_BUTTON_CONTENT_DESCRIPTION : R.string.SAVED_TAB_FOLLOWED_LISTS_MODULE_COLLAPSE_BUTTON_CONTENT_DESCRIPTION), iup.c(R.raw.hardware_keyboard_arrow_up_black_24dp, ibm.m()), new Runnable(this) { // from class: bahw
            private final bahy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bahy bahyVar = this.a;
                bahyVar.e = false;
                cqkx.p(bahyVar);
            }
        }, cjtd.a(bahxVar == bahx.OWNED ? dtxy.aF : dtxy.an));
        this.e = z;
        for (int i = 0; i < dcdcVar.size(); i++) {
            dcdcVar.get(i).t(i);
        }
    }

    @Override // defpackage.baes
    public Boolean b() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.baes
    public baer c() {
        return this.c;
    }

    @Override // defpackage.baes
    public baer d() {
        return this.d;
    }

    @Override // defpackage.baes
    public int e() {
        return this.b == bahx.OWNED ? 6 : 5;
    }

    @Override // defpackage.baes
    public int f() {
        return this.b == bahx.OWNED ? 4 : 3;
    }

    @Override // defpackage.baes
    /* renamed from: g */
    public dcdc<V> a() {
        return this.a;
    }
}
