package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: oye  reason: default package */
/* loaded from: classes7.dex */
public class oye implements jay, bqlb {
    public final cjzt a;
    public final cjqy b;
    public final bwrs<ilo> c;
    public final dthb d;
    public final dxio<bbut> e;
    public final dxio<bqji> f;
    private final Context g;
    private final bvrb h;
    @dzsi
    private final Integer i;
    @dzsi
    private jht j;

    public oye(Context context, cjzt cjztVar, cjqy cjqyVar, bvrb bvrbVar, bwrs<ilo> bwrsVar, dthb dthbVar, dxio<bbut> dxioVar, dxio<bqji> dxioVar2, @dzsi dtkq dtkqVar) {
        this.g = context;
        this.a = cjztVar;
        this.b = cjqyVar;
        this.h = bvrbVar;
        this.c = bwrsVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        dbsk.a((dthbVar.a & 32) != 0);
        this.d = dthbVar;
        this.i = dtkqVar == null ? null : oxa.e(dtkqVar);
    }

    @Override // defpackage.jay
    public List a() {
        return dcdc.e();
    }

    @Override // defpackage.jay
    public jht b() {
        if (this.j == null) {
            dtrm dtrmVar = this.d.g;
            if (dtrmVar == null) {
                dtrmVar = dtrm.l;
            }
            boolean isEmpty = dtrmVar.e.isEmpty();
            boolean z = !isEmpty;
            jhu h = jhv.h();
            dtrm dtrmVar2 = this.d.g;
            if (dtrmVar2 == null) {
                dtrmVar2 = dtrm.l;
            }
            if ((dtrmVar2.a & 4) != 0) {
                h.d(jhm.b(z ? R.string.EDIT_REVIEW : R.string.EDIT_RATING).c());
                h.d(jhm.b(true != isEmpty ? R.string.DELETE_REVIEW : R.string.DELETE_RATING).c());
            }
            h.d(jhm.b(R.string.POST_A_PHOTO).c());
            jhi jhiVar = (jhi) h;
            jhiVar.b = new jhr(this) { // from class: oyd
                private final oye a;

                {
                    this.a = this;
                }

                @Override // defpackage.jhr
                public final void a(int i) {
                    oye oyeVar = this.a;
                    if (i == R.string.EDIT_RATING || i == R.string.EDIT_REVIEW) {
                        cjqm i2 = oyeVar.b.i(cjtd.a(dtyd.dw));
                        cjzt cjztVar = oyeVar.a;
                        cjztVar.c.j(oyeVar.d, nxc.a(cjztVar.a, cjztVar.b, i2));
                    } else if (i == R.string.DELETE_RATING || i == R.string.DELETE_REVIEW) {
                        oyeVar.b.i(cjtd.a(dtyd.dv));
                        bqji a = oyeVar.f.a();
                        dtrm dtrmVar3 = oyeVar.d.g;
                        if (dtrmVar3 == null) {
                            dtrmVar3 = dtrm.l;
                        }
                        a.d(dtrmVar3.c, dqgr.PUBLISHED, dnqh.p, oyeVar.c, oyeVar);
                    } else if (i != R.string.POST_A_PHOTO) {
                    } else {
                        oyeVar.b.i(cjtd.a(dtya.dh));
                        bbuz m = bbve.m();
                        m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
                        m.e(dwyd.REVIEW_PAGE);
                        ((bbsu) m).b = oyeVar.c.c();
                        oyeVar.e.a().j(m.a());
                    }
                }
            };
            jhiVar.c = this.i;
            this.j = h.b();
        }
        return this.j;
    }

    @Override // defpackage.jay
    public void c(int i) {
    }

    @Override // defpackage.bqlb
    public void d(bqlf bqlfVar) {
        bvrb bvrbVar = this.h;
        Context context = this.g;
        cjxu.g(bvrbVar, context, context.getString(R.string.DELETE_REVIEW_SUCCESS));
        dtha bZ = dthb.F.bZ();
        dtka bZ2 = dtkb.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dthb dthbVar = (dthb) bZ.b;
        dtkb bK = bZ2.bK();
        bK.getClass();
        dthbVar.m = bK;
        dthbVar.a |= 32768;
        cjzt cjztVar = this.a;
        this.a.c.j(bZ.bK(), nxc.a(cjztVar.a, cjztVar.b, cjqm.a));
    }

    @Override // defpackage.bqlb
    public void e() {
        bvrb bvrbVar = this.h;
        Context context = this.g;
        cjxu.g(bvrbVar, context, context.getString(R.string.DELETE_REVIEW_FAILED));
    }
}
