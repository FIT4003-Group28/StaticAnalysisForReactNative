package defpackage;

import android.graphics.Picture;
/* compiled from: PG */
/* renamed from: dyn  reason: default package */
/* loaded from: classes6.dex */
final class dyn {
    public final dfer a;
    public final dyq b;
    public final dfmf c;
    public dfhp d;
    private final dfeq<dfhp> e;

    public dyn(dfer dferVar, dyq dyqVar, dfmf dfmfVar) {
        this.a = dferVar;
        this.b = dyqVar;
        this.c = dfmfVar;
        dfeq<dfhp> dfeqVar = new dfeq(this) { // from class: dyl
            private final dyn a;

            {
                this.a = this;
            }

            @Override // defpackage.dfeq
            public final void n(Object obj) {
                final dyn dynVar = this.a;
                dfhp dfhpVar = (dfhp) obj;
                dna.c(dynVar.a, new dhh(dynVar) { // from class: dym
                    private final dyn a;

                    {
                        this.a = dynVar;
                    }

                    @Override // defpackage.dhh
                    public final Picture a(float f) {
                        dyn dynVar2 = this.a;
                        return dynVar2.b.c(dynVar2.c, f);
                    }
                }, dna.b(dynVar.d), dfhpVar);
                dynVar.d = dfhpVar;
            }
        };
        this.e = dfeqVar;
        dferVar.a(dfeqVar);
    }

    public final void a() {
        this.a.b(this.e);
        this.a.h();
    }
}
