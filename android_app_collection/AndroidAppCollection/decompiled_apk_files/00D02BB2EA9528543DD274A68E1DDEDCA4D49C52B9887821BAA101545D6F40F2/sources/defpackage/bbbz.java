package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbbz  reason: default package */
/* loaded from: classes3.dex */
public class bbbz extends bbal implements bayk {
    public final aydl a;
    public baad c;
    private final aymh d;
    private final ayak e;
    private final dxio<axwo> f;
    private final axze g;
    private final jic h;
    private final axwg i;

    public bbbz(gga ggaVar, bwqv bwqvVar, ania aniaVar, aymh aymhVar, ayak ayakVar, dxio<axwo> dxioVar, batz batzVar, axze axzeVar, aydl aydlVar, axwg axwgVar, baad baadVar) {
        super(ggaVar, bwqvVar, aniaVar, batzVar);
        jic e;
        this.c = baadVar;
        this.d = aymhVar;
        this.e = ayakVar;
        this.f = dxioVar;
        this.g = axzeVar;
        this.a = aydlVar;
        this.i = axwgVar;
        if (v(baadVar)) {
            e = new jic(baadVar.P(), ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998, 0);
        } else if (axwgVar.f()) {
            e = bael.d(baadVar.o());
        } else {
            e = baam.e(baadVar.o());
        }
        this.h = e;
        ggaVar.getApplication().registerActivityLifecycleCallbacks(new bbby(this, axzeVar));
    }

    private static boolean v(baad baadVar) {
        return !baadVar.y() && baadVar.z();
    }

    @Override // defpackage.bayj
    public String a() {
        return this.c.E(this.t.getApplicationContext());
    }

    @Override // defpackage.bayj
    public CharSequence b() {
        aymh aymhVar = this.d;
        baad baadVar = this.c;
        if (!baadVar.y()) {
            return aymhVar.g(baadVar);
        }
        return aymhVar.k(baadVar);
    }

    @Override // defpackage.bayj
    public jic c() {
        return this.h;
    }

    @Override // defpackage.bayj
    public String d() {
        throw new UnsupportedOperationException("Page title is not supported for 'Lists'");
    }

    @Override // defpackage.bbal, defpackage.bayj
    public cqkl e() {
        this.f.a().i(this.c);
        return cqkl.a;
    }

    @Override // defpackage.bayj
    public ilo f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bayj
    public cjtd g() {
        ddho ddhoVar;
        if (v(this.c)) {
            ddhoVar = dtyg.v;
        } else {
            baab baabVar = baab.FAVORITES;
            int ordinal = this.c.o().ordinal();
            ddhoVar = ordinal != 0 ? ordinal != 1 ? ordinal != 5 ? null : dtyg.t : dtyg.S : dtyg.u;
        }
        if (ddhoVar == null) {
            return cjtd.b;
        }
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.i(this.x);
        return b.a();
    }

    @Override // defpackage.bayj
    public jht h() {
        cjtd cjtdVar = cjtd.b;
        if (this.i.f()) {
            cjta b = cjtd.b();
            b.d = v(this.c) ? dtxy.am : dtxy.aE;
            b.i(this.x);
            cjtdVar = b.a();
        }
        jhu h = jhv.h();
        h.e(this.e.b(this.c, false));
        ((jhi) h).e = this.t.getString(R.string.YOUR_PLACES_PLACE_ITEM_OVERFLOW_MENU_CONTENT_DESCRIPTION_FORMAT, new Object[]{a()});
        h.c(cjtdVar);
        return h.b();
    }

    @Override // defpackage.bayk
    public long i() {
        return this.c.ah();
    }

    @Override // defpackage.bbal, defpackage.bayj
    public Boolean n() {
        return Boolean.valueOf(v(this.c));
    }

    @Override // defpackage.bbal, defpackage.bayj
    public Boolean o() {
        return Boolean.valueOf(this.c.C());
    }

    @Override // defpackage.bbal, defpackage.bayj
    @dzsi
    public aydl p() {
        if (!o().booleanValue()) {
            return null;
        }
        this.a.i(false);
        this.a.h(this.c.N());
        this.g.a(this.c.n(), new dbsz(this) { // from class: bbbw
            private final bbbz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                bbbz bbbzVar = this.a;
                bbbzVar.a.j((List) obj);
                cqkx.p(bbbzVar);
            }
        }, new dbty(this) { // from class: bbbx
            private final bbbz a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(cqkx.l(this.a).iterator().hasNext());
            }
        });
        if (this.a.c().booleanValue()) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.bbal, defpackage.bayj
    public baab s() {
        return this.c.o();
    }

    public void u(baad baadVar) {
        this.c = baadVar;
    }
}
