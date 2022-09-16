package defpackage;

import android.util.SparseArray;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: oeg  reason: default package */
/* loaded from: classes3.dex */
public final class oeg implements oej {
    private static final int[] g = {1, 2, 4, 8, 16};
    public final SparseArray a;
    public final zas b;
    public final azpa c;
    public final nsj d;
    public aypg e;
    public int f;
    private final ocj h;
    private final int i;

    public oeg(View view, View view2, View view3, View view4, nml nmlVar, ocj ocjVar, nqr nqrVar, aacz aaczVar) {
        yye yyeVar = new yye(view, 0L, 8);
        yye yyeVar2 = new yye(view2, 0L, 8);
        npf npfVar = npf.a;
        yye yyeVar3 = new yye(view3);
        yyeVar3.l(npfVar);
        yye D = nmlVar.D();
        yye yyeVar4 = new yye(view4, 0L, 8);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.watch_panel_playlist_header_height);
        asxj asxjVar = aaczVar.b().e;
        boolean z = (asxjVar == null ? asxj.a : asxjVar).bU;
        this.h = ocjVar;
        SparseArray sparseArray = new SparseArray(5);
        this.a = sparseArray;
        this.f = 1;
        this.b = new oee(this, D, nmlVar);
        this.i = dimensionPixelSize;
        this.c = azpa.as(false);
        sparseArray.put(1, l(yyeVar));
        sparseArray.put(2, l(yyeVar2));
        sparseArray.put(4, l(yyeVar3));
        sparseArray.put(8, l(D));
        sparseArray.put(16, l(yyeVar4));
        nsj h = nmlVar.h();
        this.d = h;
        if (z) {
            nqrVar.a.Z(new oed(this, 1));
        } else {
            j(h);
        }
    }

    static int b(int i) {
        if (n(i, 8)) {
            return 8;
        }
        if (n(i, 4) && n(i, 2)) {
            return 6;
        }
        return i & 19;
    }

    static final oef l(yye yyeVar) {
        return new oef(yyeVar);
    }

    private final int m(int i, int i2, boolean z) {
        return !((oef) this.a.get(i2)).a ? i : z ? i | i2 : i & (i2 ^ (-1));
    }

    private static boolean n(int i, int i2) {
        return (i & i2) != 0;
    }

    @Override // defpackage.oej
    public final void a(boolean z) {
        if (z) {
            f(4);
        } else {
            c(4);
        }
    }

    public final void c(int i) {
        d(i, null);
    }

    public final void d(int i, zar zarVar) {
        i(m(this.f, i, false), true, zarVar);
    }

    public final void e(int i) {
        i(m(this.f, i, false), false, null);
    }

    public final void f(int i) {
        g(i, null);
    }

    public final void g(int i, zar zarVar) {
        i(m(this.f, i, true), true, zarVar);
    }

    public final void h(int i) {
        i(m(this.f, i, true), false, null);
    }

    public final void i(int i, boolean z, zar zarVar) {
        ArrayList arrayList = new ArrayList();
        int[] iArr = g;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            oef oefVar = (oef) this.a.get(i3);
            if (oefVar.a) {
                arrayList.add(Integer.valueOf(i3));
                oefVar.b.j(this.b);
            }
        }
        int b = b(this.f);
        int b2 = b(i);
        int i4 = b ^ b2;
        this.f = i;
        if (!z) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                int intValue = ((Integer) arrayList.get(i5)).intValue();
                ((oef) this.a.get(intValue)).a(n(b2, intValue), false);
            }
        } else {
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                int intValue2 = ((Integer) arrayList.get(i6)).intValue();
                oef oefVar2 = (oef) this.a.get(intValue2);
                if (n(19, intValue2)) {
                    oefVar2.a(n(b | i, intValue2), false);
                } else if (n(i4, intValue2)) {
                    if (intValue2 == 8) {
                        yye yyeVar = ((oef) this.a.get(8)).b;
                        if (zarVar == null) {
                            yyeVar.l(npf.b);
                        } else {
                            yyeVar.l(zarVar);
                        }
                        intValue2 = 8;
                    }
                    oefVar2.a(n(b2, intValue2), true);
                    oefVar2.b.h(this.b);
                } else {
                    oefVar2.a(n(b2, intValue2), false);
                }
            }
        }
        this.h.b(n(4, i), n(i, 8));
        ((oef) this.a.get(1)).b.b.setPadding(0, (!n(this.f, 16) && n(this.f, 2)) ? this.i : 0, 0, 0);
        this.c.c(Boolean.valueOf(((oef) this.a.get(16)).b.f()));
    }

    public final void j(nsj nsjVar) {
        this.e = nsjVar.l.Z(new oed(this));
    }

    public final boolean k(int i) {
        return n(this.f, i);
    }
}
