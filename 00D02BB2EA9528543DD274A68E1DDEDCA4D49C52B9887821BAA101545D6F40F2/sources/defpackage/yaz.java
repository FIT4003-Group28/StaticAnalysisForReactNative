package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: yaz  reason: default package */
/* loaded from: classes7.dex */
class yaz implements zdr {
    final /* synthetic */ yba a;
    private final amuk b;

    public yaz(yba ybaVar, amuk amukVar) {
        this.a = ybaVar;
        this.b = amukVar;
    }

    @Override // defpackage.zdr
    public CharSequence a() {
        return this.b.a();
    }

    @Override // defpackage.zdr
    public CharSequence b() {
        return e().booleanValue() ? this.a.a.getString(R.string.DIRECTIONS_SUB_TAB_SELECTED, new Object[]{a()}) : a();
    }

    @Override // defpackage.zdr
    public String c() {
        return this.b.c();
    }

    @Override // defpackage.zdr
    @dzsi
    public jhk d() {
        return this.b.b();
    }

    @Override // defpackage.zdr
    public Boolean e() {
        return Boolean.valueOf(this.a.Os().intValue() == this.a.d.indexOf(this));
    }

    @Override // defpackage.zdr
    public cjtd f() {
        return this.a.e.b(dtxn.ab);
    }
}
