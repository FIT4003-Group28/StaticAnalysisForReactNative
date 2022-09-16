package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayno  reason: default package */
/* loaded from: classes3.dex */
public class ayno implements aymn {
    public final gga a;
    public final ges b;
    private final aymh c;
    @dzsi
    private final bwrs<baad> d;
    private final ayak e;
    private final jkf f;
    private final axwg g;
    private final dzsj<ayfn> h;
    private Integer i = 0;
    private jib j = null;

    public ayno(gga ggaVar, aymh aymhVar, ayak ayakVar, fd fdVar, jkf jkfVar, axwg axwgVar, dzsj<ayfn> dzsjVar, @dzsi bwrs<baad> bwrsVar) {
        this.a = ggaVar;
        this.c = aymhVar;
        this.e = ayakVar;
        this.b = (ges) fdVar;
        this.f = jkfVar;
        this.d = bwrsVar;
        this.g = axwgVar;
        this.h = dzsjVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        dcdc<jho> a;
        if (this.j == null) {
            jhz a2 = jhz.a();
            a2.a = c();
            a2.u = ibm.t();
            a2.q = ibm.b();
            a2.d = ibq.E();
            a2.f(new View.OnClickListener(this) { // from class: aynn
                private final ayno a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ayno aynoVar = this.a;
                    ges gesVar = aynoVar.b;
                    if (!gesVar.aD || !gesVar.e()) {
                        aynoVar.a.s();
                    }
                }
            });
            if (this.g.c()) {
                a2.b = d();
                a2.v = ibm.n();
                a2.C = 1;
                a2.D = 1;
            }
            this.j = a2.b();
        }
        jhz e = this.j.e();
        e.e();
        e.b = this.g.c() ? d() : null;
        if (!this.g.c() || !ayfn.h(this.h.a().a.l().L()) || !btpf.c(this.a).f) {
            bwrs<baad> bwrsVar = this.d;
            if (bwrsVar != null) {
                ayak ayakVar = this.e;
                baad c = bwrsVar.c();
                dbsk.s(c);
                a = ayakVar.b(c, true);
            } else {
                a = this.e.a();
            }
            e.d(a);
        }
        return e.b();
    }

    @Override // defpackage.aymn
    public void b(jib jibVar) {
        this.j = jibVar;
    }

    public String c() {
        bwrs<baad> bwrsVar = this.d;
        if (bwrsVar != null) {
            baad c = bwrsVar.c();
            dbsk.s(c);
            return c.E(this.a.getApplicationContext());
        }
        return this.a.getString(R.string.STARRED_PLACES_BUILT_IN_LIST_TITLE);
    }

    public CharSequence d() {
        bwrs<baad> bwrsVar = this.d;
        if (bwrsVar != null) {
            aymh aymhVar = this.c;
            baad c = bwrsVar.c();
            dbsk.s(c);
            return aymhVar.a(c, ibm.n(), true);
        }
        return this.c.b(drcs.PRIVATE, ibm.n(), this.i.intValue());
    }

    public void e(int i) {
        this.i = Integer.valueOf(i);
    }

    public boolean f() {
        if (!this.b.aD || this.f.l().L() != jjn.HIDDEN) {
            return false;
        }
        if (this.g.c()) {
            this.h.a().e();
            return true;
        }
        this.f.B(jjn.EXPANDED);
        return true;
    }
}
