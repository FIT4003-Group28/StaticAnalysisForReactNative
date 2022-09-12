package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahbj  reason: default package */
/* loaded from: classes2.dex */
public class ahbj implements agyu, ahbl {
    private final gga a;
    private final dxio<afzv> b;
    private final dkzq c;
    private dcdc<ahbn> d;

    public ahbj(cqhn cqhnVar, final ahbo ahboVar, gga ggaVar, dxio<afzv> dxioVar, final btlu btluVar, final dkzq dkzqVar, List<dlas> list) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = dkzqVar;
        this.d = dcdc.r(dcbg.b(list).s(new dbrn(this, ahboVar, btluVar, dkzqVar) { // from class: ahbh
            private final ahbj a;
            private final ahbo b;
            private final btlu c;
            private final dkzq d;

            {
                this.a = this;
                this.b = ahboVar;
                this.c = btluVar;
                this.d = dkzqVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ahbj ahbjVar = this.a;
                ahbo ahboVar2 = this.b;
                btlu btluVar2 = this.c;
                dkzq dkzqVar2 = this.d;
                dlas dlasVar = (dlas) obj;
                cqhn a = ahboVar2.a.a();
                ahbo.a(a, 1);
                agwa a2 = ahboVar2.b.a();
                ahbo.a(a2, 2);
                gga a3 = ahboVar2.c.a();
                ahbo.a(a3, 3);
                dehq a4 = ahboVar2.d.a();
                ahbo.a(a4, 4);
                ahbo.a(btluVar2, 5);
                ahbo.a(dkzqVar2, 6);
                ahbo.a(dlasVar, 7);
                ahbo.a(ahbjVar, 8);
                return new ahbn(a, a2, a3, a4, btluVar2, dkzqVar2, dlasVar, ahbjVar);
            }
        }).z());
    }

    @Override // defpackage.agyu
    public CharSequence a() {
        return this.a.getString(this.c == dkzq.POSITIVE ? R.string.LOCALSTREAM_POSITIVE_EXPLICIT_PREFERENCE_TITLE : R.string.LOCALSTREAM_NEGATIVE_EXPLICIT_PREFERENCE_TITLE);
    }

    @Override // defpackage.agyu
    public cqtd b() {
        if (this.c == dkzq.POSITIVE) {
            return cqrt.j(iup.e(R.raw.localstream_arrow_upward_circle), ibm.o());
        }
        return cqrt.j(iup.e(R.raw.localstream_arrow_downward_circle), ibm.o());
    }

    @Override // defpackage.agyu
    public CharSequence c() {
        return this.a.getString(this.c == dkzq.POSITIVE ? R.string.LOCALSTREAM_NEGATIVE_EXPLICIT_PREFERENCE_DESCRIPTION : R.string.LOCALSTREAM_POSITIVE_EXPLICIT_PREFERENCE_DESCRIPTION);
    }

    @Override // defpackage.agyu
    public List<ahbn> d() {
        return this.d;
    }

    @Override // defpackage.agyu
    public cjtd e() {
        return cjtd.a(this.c == dkzq.POSITIVE ? dtxu.bi : dtxu.bh);
    }

    @Override // defpackage.agyu
    public CharSequence f() {
        return this.a.getString(this.c == dkzq.POSITIVE ? R.string.LOCALSTREAM_ACCESSIBILITY_ADD_POSITIVE_EXPLICIT_PREFERENCE_TEXT : R.string.LOCALSTREAM_ACCESSIBILITY_ADD_NEGATIVE_EXPLICIT_PREFERENCE_TEXT);
    }

    @Override // defpackage.agyu
    public cqkl g() {
        this.b.a().j(this.c);
        return cqkl.a;
    }

    @Override // defpackage.ahbl
    public void h(final ahbn ahbnVar) {
        this.d = dcdc.r(dcbg.b(this.d).o(new dbsl(ahbnVar) { // from class: ahbi
            private final ahbn a;

            {
                this.a = ahbnVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((ahbn) obj) != this.a;
            }
        }).z());
        cqkx.p(this);
    }
}
