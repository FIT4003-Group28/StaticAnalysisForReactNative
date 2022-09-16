package defpackage;

import android.opengl.GLES20;
import android.util.SparseArray;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amxe  reason: default package */
/* loaded from: classes.dex */
public final class amxe extends amxj {
    private final Object A;
    private final Set<bnvl> B;
    private final SparseArray<bnvl> C;
    private List<alxp> D;
    private boolean E;
    @dzsi
    public amgl a;
    public List<amxd> b;
    public int c;

    public amxe(bnrw bnrwVar) {
        super(bnrwVar);
        this.A = new Object();
        this.B = new HashSet();
        this.C = new SparseArray<>();
        this.D = new ArrayList();
        this.b = new ArrayList();
    }

    private final void w(@dzsi bnvl bnvlVar) {
        if (bnvlVar == null || this.l == null || this.B.contains(bnvlVar)) {
            return;
        }
        bnvlVar.d(this.l);
        this.B.add(bnvlVar);
    }

    @Override // defpackage.bnsc, defpackage.bnsa
    @dzsi
    public final bnvl D(int i) {
        bntb bntbVar;
        bnva bnvaVar = null;
        if (i >= 0 && i < 8) {
            bnvl bnvlVar = this.C.get(i);
            if (bnvlVar != null) {
                w(bnvlVar);
                return bnvlVar;
            } else if (this.b.isEmpty()) {
                return null;
            } else {
                amgj amgjVar = this.b.get(this.c).a.get(i);
                amgl amglVar = this.a;
                bnva r = (amglVar == null || amgjVar == null) ? null : amglVar.r(amgjVar);
                if (r != null || (bntbVar = this.l) == null) {
                    bnvaVar = r;
                } else if (i == 1 || i == 2) {
                    bnvaVar = bntbVar.d(R.drawable.client_injected_default_cap);
                } else if (i == 3) {
                    bnvaVar = bntbVar.d(R.drawable.white_pixel);
                }
                w(bnvaVar);
            }
        }
        return bnvaVar;
    }

    @Override // defpackage.bnsc, defpackage.bnsa
    public final void E(boolean z) {
        super.E(z);
        for (bnvl bnvlVar : this.B) {
            bnvlVar.e(z);
        }
        this.B.clear();
    }

    @Override // defpackage.amxj, defpackage.bnsc, defpackage.bnsa
    public final void b(@dzsi bnsa bnsaVar, @dzsi bnsa bnsaVar2, bnrr bnrrVar) {
        GLES20.glEnable(2884);
        GLES20.glCullFace(1029);
        synchronized (this.A) {
            int size = this.b.size();
            this.c = 0;
            while (this.c < size) {
                super.b(bnsaVar, bnsaVar2, bnrrVar);
                this.c++;
            }
        }
        GLES20.glDisable(2884);
    }

    @Override // defpackage.bnsc
    public final void e(int i, bnvl bnvlVar) {
        if (this.t) {
            bnuq bnuqVar = bnuq.INVALID;
            bnvl bnvlVar2 = this.C.get(i);
            if (bnvlVar2 == bnvlVar) {
                return;
            }
            if (bnvlVar2 != null && this.B.contains(bnvlVar2)) {
                this.B.remove(bnvlVar2);
                bnvlVar2.e(false);
            }
            this.B.add(bnvlVar);
            bntb bntbVar = this.l;
            dbsk.s(bntbVar);
            bnvlVar.d(bntbVar);
        }
        this.C.put(i, bnvlVar);
    }

    public final void f(List<alxp> list, boolean z) {
        this.D = list;
        this.E = z;
    }

    public final void g(float f) {
        int i = 0;
        for (alxp alxpVar : this.D) {
            alxo c = alxpVar.c((int) f);
            i = Math.max(i, (this.E ? c.n : c.o).length);
        }
        ArrayList arrayList = new ArrayList(i);
        int size = this.D.size();
        for (int i2 = 0; i2 < i && i2 < 4; i2++) {
            amxd amxdVar = new amxd();
            arrayList.add(amxdVar);
            alxl alxlVar = null;
            for (int i3 = 0; i3 < size && i3 < 8; i3++) {
                alxo c2 = this.D.get(i3).c((int) f);
                alxl[] alxlVarArr = this.E ? c2.n : c2.o;
                if (alxlVarArr.length > 0) {
                    alxl alxlVar2 = alxlVarArr[i2];
                    float[] fArr = amxdVar.b;
                    float f2 = alxlVar2.c;
                    fArr[i3] = f2;
                    if (f2 != 0.0f) {
                        alxlVar = alxlVar2;
                    }
                }
            }
            if (alxlVar != null) {
                int i4 = alxlVar.e;
                int i5 = alxlVar.f;
                while (i4 / i5 > 64) {
                    i5 += i5;
                }
                amxdVar.d = i5;
                if (i4 == 0) {
                    amxdVar.c = 1.0f;
                } else {
                    amxdVar.c = i4;
                }
                amgj amgjVar = alxlVar.i;
                amgj amgjVar2 = alxlVar.j;
                amgj amgjVar3 = alxlVar.h;
                amxdVar.a.put(1, amgjVar);
                amxdVar.a.put(2, amgjVar2);
                amxdVar.a.put(3, amgjVar3);
            }
        }
        synchronized (this.A) {
            this.b = arrayList;
        }
    }

    public amxe(bnrz bnrzVar, bnrw bnrwVar) {
        super(bnrzVar, true, bnrwVar);
        this.A = new Object();
        this.B = new HashSet();
        this.C = new SparseArray<>();
        this.D = new ArrayList();
        this.b = new ArrayList();
    }
}
