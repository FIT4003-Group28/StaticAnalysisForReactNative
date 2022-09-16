package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acmw  reason: default package */
/* loaded from: classes2.dex */
public class acmw implements acmv {
    @dzsi
    cqtd a;
    private final CharSequence b;
    private final int c;
    private cqtv f = cqrt.d(R.dimen.badge_padding);
    private cqtv g = cqrt.d(R.dimen.badge_padding);
    private cqtv d = cqrp.d(-1.0d);
    private cqtv e = cqrp.d(-1.0d);
    private cqtv h = cqrt.d(R.dimen.default_badge_text_size);
    private cqtv i = cqrt.d(R.dimen.badge_corner_radius);
    private cqss j = cqrt.c(R.color.badge_foreground);
    private Integer k = 0;

    public acmw(CharSequence charSequence, int i) {
        this.b = charSequence;
        this.c = i;
    }

    @Override // defpackage.acmv
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.acmv
    public cqss b() {
        return this.j;
    }

    @Override // defpackage.acmv
    public cqtd c() {
        if (this.a == null) {
            this.a = cqtt.l(cqta.d(this.c), this.i);
        }
        return this.a;
    }

    @Override // defpackage.acmv
    public cqtv d() {
        return this.d;
    }

    @Override // defpackage.acmv
    public cqtv e() {
        return this.e;
    }

    @Override // defpackage.acmv
    public cqtv f() {
        return this.f;
    }

    @Override // defpackage.acmv
    public cqtv g() {
        return this.g;
    }

    @Override // defpackage.acmv
    public cqtv h() {
        return this.h;
    }

    @Override // defpackage.acmv
    public Integer i() {
        return this.k;
    }

    public void j(cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3) {
        this.d = cqtvVar;
        this.e = cqtvVar2;
        this.f = cqtvVar3;
        this.g = cqtvVar3;
    }

    public void k(cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqtv cqtvVar4) {
        this.d = cqtvVar;
        this.e = cqtvVar2;
        this.f = cqtvVar3;
        this.g = cqtvVar4;
    }

    public void l(cqtv cqtvVar) {
        this.h = cqtvVar;
    }

    public void m(cqtv cqtvVar) {
        this.i = cqtvVar;
    }

    public void n(cqtd cqtdVar) {
        this.a = cqtdVar;
    }

    public void o(cqss cqssVar) {
        this.j = cqssVar;
    }

    public void p(Integer num) {
        this.k = num;
    }
}
