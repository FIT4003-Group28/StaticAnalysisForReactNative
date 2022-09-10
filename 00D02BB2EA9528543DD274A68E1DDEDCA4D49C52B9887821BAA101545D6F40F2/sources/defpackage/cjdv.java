package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cjdv  reason: default package */
/* loaded from: classes4.dex */
public class cjdv implements cjdt {
    private final cjdi a;
    private final dlif b;
    private final List<cjdq> c;
    private final dxio<aesb> d;
    private final dxio<anhg> e;

    public cjdv(final cjdi cjdiVar, dlif dlifVar, cjds cjdsVar, dxio<aesb> dxioVar, dxio<anhg> dxioVar2) {
        this.a = cjdiVar;
        this.b = dlifVar;
        this.c = dcdc.q(dcft.o(dlifVar.c, new dbrn(cjdiVar) { // from class: cjdu
            private final cjdi a;

            {
                this.a = cjdiVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cjdi cjdiVar2 = this.a;
                dlie dlieVar = (dlie) obj;
                String str = dlieVar.b;
                dgrh dgrhVar = dlieVar.a;
                if (dgrhVar == null) {
                    dgrhVar = dgrh.d;
                }
                cjds.a(cjdiVar2, 1);
                cjds.a(str, 2);
                cjds.a(dgrhVar, 3);
                return new cjdr(cjdiVar2, str, dgrhVar);
            }
        }));
        this.d = dxioVar;
        this.e = dxioVar2;
    }

    @Override // defpackage.cjdt
    public List<cjdq> a() {
        return this.c;
    }

    @Override // defpackage.cjdt
    public cqkl b() {
        this.d.a().m(false, false, this.a);
        return cqkl.a;
    }

    @Override // defpackage.cjdt
    public cqkl c() {
        this.e.a().D(anhy.m(new eapg(this.b.b)));
        return cqkl.a;
    }
}
