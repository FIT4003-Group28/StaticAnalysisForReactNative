package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kwx  reason: default package */
/* loaded from: classes7.dex */
public final class kwx implements dbty<vsk> {
    final /* synthetic */ kwy a;

    public kwx(kwy kwyVar) {
        this.a = kwyVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ vsk a() {
        btsp b = btsp.b(this.a.B);
        kwy kwyVar = this.a;
        hwe a = this.a.u.a();
        kwy kwyVar2 = this.a;
        Context context = kwyVar2.b;
        atln atlnVar = new atln(kwyVar2.a, kwyVar2.n);
        aldd alddVar = new aldd(btsp.b(new dbty(this) { // from class: kwr
            private final kwx a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return ((kwf) this.a.a.u).A.a().aj().aF();
            }
        }), btsp.b(new dbty(this) { // from class: kws
            private final kwx a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return ((kwf) this.a.a.u).A.a().aj().aE();
            }
        }), this.a.b.getResources(), this.a.t);
        btsp b2 = btsp.b(new dbty(this) { // from class: kwt
            private final kwx a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return ((kwf) this.a.a.u).A.a().aj().aE();
            }
        });
        btsp b3 = btsp.b(new dbty(this) { // from class: kwu
            private final kwx a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return ((kwf) this.a.a.u).A.a().aj().aA();
            }
        });
        btsp.b(new dbty(this) { // from class: kwv
            private final kwx a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return ((kwf) this.a.a.u).A.a().aj().aF();
            }
        });
        alec alecVar = new alec(b2, b3, ((kwf) this.a.u).A.a(), this.a.b.getResources(), ((kwf) this.a.u).p);
        kwy kwyVar3 = this.a;
        cjqy cjqyVar = kwyVar3.k;
        cjqq cjqqVar = kwyVar3.l;
        aufc aufcVar = kwyVar3.t;
        akzh k = ((kwf) kwyVar3.u).A.a().k();
        alwc b4 = this.a.c.b();
        kwy kwyVar4 = this.a;
        vtb vtbVar = new vtb(this.a.r.a(), kwyVar.i, kwyVar.g, kwyVar.h, ((kwf) kwyVar.u).A.a(), a, context, atlnVar, b, alddVar, alecVar, cjqyVar, cjqqVar, aufcVar, k, b4, kwyVar4.e, kwyVar4.o, null, null, kwyVar4.v.i());
        Resources resources = this.a.b.getResources();
        akox a2 = ((kwf) this.a.u).A.a();
        hwe a3 = this.a.u.a();
        dxio<axxl> dxioVar = ((kwf) this.a.u).z;
        dxio dxioVar2 = new dxio(this) { // from class: kww
            private final kwx a;

            {
                this.a = this;
            }

            @Override // defpackage.dxio
            public final Object a() {
                return ((kwf) this.a.a.u).A.a().k();
            }
        };
        kxu j = this.a.j();
        kwy kwyVar5 = this.a;
        return new vsk(resources, a2, a3, dxioVar, dxioVar2, vtbVar, j, kwyVar5.i, kwyVar5.t, kwyVar5.x);
    }
}
