package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cjpw  reason: default package */
/* loaded from: classes4.dex */
class cjpw implements cjpr {
    private final gga a;
    private final cqhn b;
    private final String c;
    private final cjpp d;
    private final cjtd e;
    private final cjtd f;
    private hxy h;
    @dzsi
    private Integer g = null;
    private boolean i = false;

    public cjpw(gga ggaVar, cqhn cqhnVar, String str, cjpp cjppVar, cjtd cjtdVar, cjtd cjtdVar2) {
        this.a = ggaVar;
        this.b = cqhnVar;
        this.c = str;
        this.d = cjppVar;
        this.e = cjtdVar;
        this.f = cjtdVar2;
        this.h = hya.f(cqhnVar).a();
    }

    @Override // defpackage.iao
    public CharSequence a() {
        return this.c;
    }

    @Override // defpackage.iao
    public cjtd b() {
        return d().booleanValue() ? this.f : this.e;
    }

    @Override // defpackage.iao
    public CharSequence c() {
        CharSequence a = a();
        return this.i ? this.a.getString(R.string.TAB_BUTTON_NEEDS_ATTENTION_CONTENT_DESCRIPTION, new Object[]{a}) : a;
    }

    @Override // defpackage.iao
    public Boolean d() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.iao
    public hxy e() {
        return this.h;
    }

    @Override // defpackage.iao
    public Integer f() {
        return ian.b();
    }

    @Override // defpackage.cjpr
    public cjpp g() {
        return this.d;
    }

    @Override // defpackage.cjpr
    public void h(boolean z) {
        bvrj.UI_THREAD.c();
        if (this.i != z) {
            this.i = z;
            cqkx.p(this);
        }
    }

    @Override // defpackage.cjpr
    public void i(@dzsi Integer num) {
        bvrj.UI_THREAD.c();
        if (dbsd.a(this.g, num)) {
            return;
        }
        this.g = num;
        hxz f = hya.f(this.b);
        f.d(num);
        this.h = f.a();
        if (!this.i) {
            return;
        }
        cqkx.p(this);
    }
}
