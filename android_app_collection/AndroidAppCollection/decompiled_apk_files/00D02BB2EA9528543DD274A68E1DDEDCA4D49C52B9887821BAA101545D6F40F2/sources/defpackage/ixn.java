package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ixn  reason: default package */
/* loaded from: classes.dex */
public class ixn implements izp {
    public final Activity a;
    public final eeu b;
    @dzsi
    public bwrs<ilo> c;
    private final dzsj<axwy> d;
    private final dxio<axwq> e;
    private final dzsj<imb> f;
    private boolean g;
    private String h;
    @dzsi
    private String i;
    private final axwu j = new ixl(this);
    private final axvp k = new ixm(this);

    public ixn(Activity activity, eeu eeuVar, dzsj<axwy> dzsjVar, dxio<axwq> dxioVar, dzsj<imb> dzsjVar2) {
        this.a = activity;
        this.b = eeuVar;
        this.d = dzsjVar;
        this.e = dxioVar;
        this.f = dzsjVar2;
    }

    private final void q(dndr dndrVar, @dzsi ddho ddhoVar) {
        dbsk.s(this.c);
        ilo c = this.c.c();
        dbsk.s(c);
        akqi ai = c.ai();
        axwy a = this.d.a();
        axwu axwuVar = this.j;
        axvp axvpVar = this.k;
        String str = this.i;
        dbsk.s(str);
        a.I(dndrVar, axwuVar, axvpVar, false, str, akqi.d(ai) ? ai.o() : null, null, ddhoVar, null);
    }

    private final void r(String str, String str2, @dzsi ddho ddhoVar) {
        dbsk.s(this.c);
        ilo c = this.c.c();
        dbsk.s(c);
        this.d.a().ac(dndr.NICKNAME, this.j, this.k, false, str, str2, ddhoVar, null, c, null);
    }

    private final cqkl s() {
        b(false);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.izp
    public Boolean a() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.izp
    public void b(boolean z) {
        this.g = z;
    }

    @Override // defpackage.izp
    public void c(String str) {
        this.i = str;
    }

    @Override // defpackage.izp
    public void d(bwrs<ilo> bwrsVar) {
        this.c = bwrsVar;
    }

    @Override // defpackage.izp
    public Boolean e() {
        return Boolean.valueOf(dcft.j(this.e.a().n(), ixh.a));
    }

    @Override // defpackage.izp
    public Boolean f() {
        return Boolean.valueOf(dcft.j(this.e.a().n(), ixi.a));
    }

    @Override // defpackage.izp
    public Boolean g() {
        return Boolean.valueOf(dcft.j(this.e.a().n(), new dbsl(this) { // from class: ixj
            private final ixn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                ixn ixnVar = this.a;
                return ixnVar.a.getString(R.string.SCHOOL_LOCATION).equals(((azva) obj).e(ixnVar.a));
            }
        }));
    }

    @Override // defpackage.izp
    public Boolean h() {
        return Boolean.valueOf(dcft.j(this.e.a().n(), new dbsl(this) { // from class: ixk
            private final ixn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                ixn ixnVar = this.a;
                return ixnVar.a.getString(R.string.GYM_LOCATION).equals(((azva) obj).e(ixnVar.a));
            }
        }));
    }

    @Override // defpackage.izp
    public cqkl i() {
        bwrs<ilo> bwrsVar = this.c;
        if (bwrsVar != null) {
            ilo c = bwrsVar.c();
            dbsk.s(c);
            this.f.a().d(c);
        }
        b(false);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.izp
    public cqkl j() {
        q(dndr.HOME, dtyi.D);
        return s();
    }

    @Override // defpackage.izp
    public cqkl k() {
        q(dndr.WORK, dtyi.D);
        return s();
    }

    @Override // defpackage.izp
    public cqkl l() {
        r(this.a.getString(R.string.SCHOOL_LOCATION), "/m/06zdj", dtyi.D);
        return s();
    }

    @Override // defpackage.izp
    public cqkl m() {
        r(this.a.getString(R.string.GYM_LOCATION), "/m/016yx7", dtyi.D);
        return s();
    }

    @Override // defpackage.izp
    public cqkl n() {
        bwrs<ilo> bwrsVar = this.c;
        dbsk.s(bwrsVar);
        this.d.a().k(bwrsVar);
        return s();
    }

    @Override // defpackage.izp
    public String o() {
        return this.h;
    }

    @Override // defpackage.izp
    public void p(String str) {
        this.h = str;
    }
}
