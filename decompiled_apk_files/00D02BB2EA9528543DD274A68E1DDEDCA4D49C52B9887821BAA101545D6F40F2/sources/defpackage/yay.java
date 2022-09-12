package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: yay  reason: default package */
/* loaded from: classes7.dex */
class yay implements xzd {
    public final wuo a;
    final /* synthetic */ yba b;

    public yay(yba ybaVar, wuo wuoVar) {
        this.b = ybaVar;
        this.a = wuoVar;
    }

    @Override // defpackage.xzd
    public cqtd a() {
        wur j = this.a.a().j();
        String b = j != null ? j.b() : "//maps.gstatic.com/mapfiles/transit/iw2/svg/limo/economy.svg";
        int intrinsicWidth = this.b.a.getResources().getDrawable(2131231116).getIntrinsicWidth();
        byae byaeVar = this.b.b;
        bvlv f = bvlw.f();
        Integer valueOf = Integer.valueOf(intrinsicWidth);
        bvld bvldVar = (bvld) f;
        bvldVar.a = valueOf;
        bvldVar.b = valueOf;
        cqtd a = byaeVar.a(b, f.c(), this);
        return a != null ? a : cqrt.f(2131231116);
    }

    @Override // defpackage.xzd
    public CharSequence b() {
        return this.a.a().a();
    }

    @Override // defpackage.xzd
    public CharSequence c() {
        return dbsj.e(this.a.a().y(this.b.a.getResources()));
    }

    @Override // defpackage.xzd
    public CharSequence d() {
        return this.a.a().z(this.b.a.getResources());
    }

    @Override // defpackage.xzd
    public CharSequence e() {
        return this.a.a().A(this.b.a.getResources());
    }

    @Override // defpackage.xzd
    public CharSequence f() {
        return this.a.a().A(this.b.a.getResources());
    }

    @Override // defpackage.xzd
    public Boolean g() {
        return Boolean.valueOf(this.a.equals(this.b.f));
    }

    @Override // defpackage.xzd
    public View.OnClickListener h() {
        return new View.OnClickListener(this) { // from class: yax
            private final yay a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yay yayVar = this.a;
                if (!yayVar.g().booleanValue()) {
                    xyz xyzVar = yayVar.b.g;
                    if (xyzVar != null) {
                        xyzVar.d(true);
                    }
                    yayVar.b.c.p(yayVar.a);
                }
            }
        };
    }

    @Override // defpackage.xzd
    public cjtd i() {
        return this.b.e.b(dtxn.aa);
    }
}
