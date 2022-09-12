package defpackage;
/* compiled from: PG */
/* renamed from: bywv  reason: default package */
/* loaded from: classes4.dex */
public final class bywv {
    public final auhi a;
    public final auhj b;
    private final auhz c;

    public bywv(auhi auhiVar, auhj auhjVar, auhz auhzVar) {
        this.a = auhiVar;
        this.b = auhjVar;
        this.c = auhzVar;
    }

    public static int b(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 3) {
                return -1;
            }
            return i2 != 4 ? 0 : -2;
        }
        return 2;
    }

    public final void a(int i, dlgf dlgfVar, augc augcVar) {
        auod m = auoe.m(dlgfVar.b);
        int a = dlhf.a(dlgfVar.e);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        int a2 = aunx.a(a);
        String str = dlgfVar.c;
        auhz auhzVar = this.c;
        if ((dlgfVar.a & 16) == 0) {
            z = false;
        }
        dplx dplxVar = dlgfVar.f;
        if (dplxVar == null) {
            dplxVar = dplx.g;
        }
        augcVar.B(m.i(i, a2, str, auhzVar.b(z, dplxVar, dlgfVar.d, dlgfVar.g), auhw.ACTIVITY, false));
    }
}
