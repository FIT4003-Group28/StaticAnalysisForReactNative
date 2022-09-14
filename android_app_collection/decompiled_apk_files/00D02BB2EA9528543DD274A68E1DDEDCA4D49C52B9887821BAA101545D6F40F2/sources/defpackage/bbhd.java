package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: bbhd  reason: default package */
/* loaded from: classes3.dex */
final class bbhd extends cqiw<bbht> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bbht bbhtVar, Context context, cqiv cqivVar) {
        boolean z;
        final bbht bbhtVar2 = bbhtVar;
        boolean z2 = true;
        if (!TextUtils.isEmpty(bbhtVar2.l())) {
            cqivVar.a(new bbhb(), new bbhc(bbhtVar2) { // from class: bbgz
                private final bbht a;

                {
                    this.a = bbhtVar2;
                }

                @Override // defpackage.bbhc
                public CharSequence a() {
                    bbht bbhtVar3 = this.a;
                    int i2 = bbhd.a;
                    return bbhtVar3.l();
                }
            });
            z = true;
        } else {
            z = false;
        }
        if (!TextUtils.isEmpty(bbhtVar2.k())) {
            if (z) {
                cqivVar.a(new bbhb(), bbgn.a);
            }
            cqivVar.a(new bbhb(), new bbhc(bbhtVar2) { // from class: bbgo
                private final bbht a;

                {
                    this.a = bbhtVar2;
                }

                @Override // defpackage.bbhc
                public CharSequence a() {
                    bbht bbhtVar3 = this.a;
                    int i2 = bbhd.a;
                    return bbhtVar3.k();
                }
            });
        } else {
            z2 = z;
        }
        if (!TextUtils.isEmpty(bbhtVar2.m())) {
            if (z2) {
                cqivVar.a(new bbhb(), bbgp.a);
            }
            cqivVar.a(new bbhb(), new bbhc(bbhtVar2) { // from class: bbgq
                private final bbht a;

                {
                    this.a = bbhtVar2;
                }

                @Override // defpackage.bbhc
                public CharSequence a() {
                    bbht bbhtVar3 = this.a;
                    int i2 = bbhd.a;
                    return bbhtVar3.m();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bbht> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.dr(1), cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), ibq.f(), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eN(5), cqgr.eM(bbgm.a)), cqgr.gd(cqgr.dr(1), cqgr.cd(-2), cqgr.bp(-2), cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(0), cqgr.aJ(16), iue.f(cqgr.aF(cqjv.x(bbgr.a)), cqgr.bG(irh.n()), ibq.p(), cqgr.eU(ibm.n()), cqgr.eN(5), cqgr.eM(bbgs.a)), jfb.a(cqgr.aF(cqjv.x(bbgt.a)), cqgr.bG(irh.n()), jfb.f(jfo.d), jfb.c(bbgu.a)), iue.f(cqgr.aF(cqjv.x(bbgv.a)), ibq.p(), cqgr.eU(ibm.n()), cqgr.eN(5), cqgr.eM(bbgw.a))), cqgr.gd(cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.ck(C()))), cqgr.gq(cqgr.aF(cqjv.x(bbgx.a)), cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(irh.m()), cqgr.bG(irh.k()), ibq.p(), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eU(ibm.n()), cqgr.eN(5), cqgr.eM(bbgy.a))));
    }
}
