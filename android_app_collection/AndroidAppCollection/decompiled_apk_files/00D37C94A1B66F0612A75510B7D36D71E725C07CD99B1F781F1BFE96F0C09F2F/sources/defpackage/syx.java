package defpackage;

import com.facebook.yoga.YogaEdge;
/* compiled from: PG */
/* renamed from: syx  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class syx implements tfn {
    public final /* synthetic */ cyp a;
    private final /* synthetic */ int b;

    public /* synthetic */ syx(cyp cypVar, int i) {
        this.b = i;
        this.a = cypVar;
    }

    @Override // defpackage.tfn
    public final void a(YogaEdge yogaEdge, aodr aodrVar) {
        int i = this.b;
        if (i == 0) {
            cyp cypVar = this.a;
            int i2 = syy.a;
            if (aodrVar.c() == 2) {
                float b = aodrVar.b() * 100.0f;
                cym cymVar = (cym) cypVar.c.C().C();
                cymVar.a |= 4194304;
                if (cymVar.A == null) {
                    cymVar.A = new dam();
                }
                cymVar.A.d(yogaEdge, b);
                return;
            }
            cypVar.N(yogaEdge, cypVar.b.a(aodrVar.b()));
        } else if (i != 1) {
            cyp cypVar2 = this.a;
            int i3 = syy.a;
            if (aodrVar.c() == 2) {
                float b2 = aodrVar.b() * 100.0f;
                cym cymVar2 = (cym) cypVar2.c.C().C();
                cymVar2.a |= 16777216;
                if (cymVar2.z == null) {
                    cymVar2.z = new dam();
                }
                cymVar2.z.d(yogaEdge, b2);
                return;
            }
            cypVar2.z(yogaEdge, aodrVar.b());
        } else {
            cyp cypVar3 = this.a;
            int i4 = syy.a;
            if (aodrVar.c() == 2) {
                float b3 = aodrVar.b() * 100.0f;
                cym cymVar3 = (cym) cypVar3.c.C().C();
                cymVar3.a |= 67108864;
                if (cymVar3.x == null) {
                    cymVar3.x = new dam();
                }
                cymVar3.x.d(yogaEdge, b3);
                return;
            }
            cypVar3.n(yogaEdge, aodrVar.b());
        }
    }
}
