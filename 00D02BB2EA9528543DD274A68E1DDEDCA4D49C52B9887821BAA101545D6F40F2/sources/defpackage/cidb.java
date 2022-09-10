package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cidb  reason: default package */
/* loaded from: classes4.dex */
public final class cidb implements View.OnLayoutChangeListener, jiw {
    private int a;
    private final bvqg<Integer> b;

    public cidb(final chrx chrxVar, final chxl chxlVar) {
        chxp chxpVar = chxlVar.i;
        int i = (chxpVar == null ? chxp.k : chxpVar).f;
        bvqg<Integer> bvqgVar = new bvqg(chrxVar, chxlVar) { // from class: cicz
            private final chrx a;
            private final chxl b;

            {
                this.a = chrxVar;
                this.b = chxlVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                chrx chrxVar2 = this.a;
                final Integer num = (Integer) obj;
                chxr chxrVar = this.b.b;
                if (chxrVar == null) {
                    chxrVar = chxr.e;
                }
                chrxVar2.Q(chxrVar, new dbrn(num) { // from class: cida
                    private final Integer a;

                    {
                        this.a = num;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Integer num2 = this.a;
                        chxp chxpVar2 = (chxp) obj2;
                        dsqp dsqpVar = (dsqp) chxpVar2.cu(5);
                        dsqpVar.bC(chxpVar2);
                        chxm chxmVar = (chxm) dsqpVar;
                        int intValue = num2.intValue();
                        if (chxmVar.c) {
                            chxmVar.bF();
                            chxmVar.c = false;
                        }
                        chxp chxpVar3 = (chxp) chxmVar.b;
                        chxp chxpVar4 = chxp.k;
                        chxpVar3.a |= 4;
                        chxpVar3.f = intValue;
                        return chxmVar.bK();
                    }
                });
            }
        };
        this.a = i;
        this.b = bvqgVar;
    }

    @Override // defpackage.jiw
    public final void a(int i) {
        this.a = i;
        this.b.NU(Integer.valueOf(i));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.setScrollX(this.a);
    }
}
