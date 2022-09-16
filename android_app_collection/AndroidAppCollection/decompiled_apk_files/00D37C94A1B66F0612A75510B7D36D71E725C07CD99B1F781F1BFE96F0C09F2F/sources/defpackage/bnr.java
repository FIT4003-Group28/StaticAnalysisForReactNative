package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bnr  reason: default package */
/* loaded from: classes2.dex */
public final class bnr extends bnk {
    int p;
    boolean q;
    private ArrayList r;
    private boolean s;
    private int t;

    public bnr(byte[] bArr) {
        this();
        J(1);
        f(new bne(2));
        f(new bnb());
        f(new bne(1));
    }

    private final void N(bnk bnkVar) {
        this.r.add(bnkVar);
        bnkVar.h = this;
    }

    @Override // defpackage.bnk
    public final void E() {
        this.t |= 2;
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((bnk) this.r.get(i)).E();
        }
    }

    @Override // defpackage.bnk
    public final /* bridge */ /* synthetic */ void F(long j) {
        this.a = j;
    }

    @Override // defpackage.bnk
    public final void G(adj adjVar) {
        this.n = null;
        this.t |= 8;
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((bnk) this.r.get(i)).G(null);
        }
    }

    @Override // defpackage.bnk
    public final void H(adi adiVar) {
        super.H(adiVar);
        this.t |= 4;
        if (this.r != null) {
            for (int i = 0; i < this.r.size(); i++) {
                ((bnk) this.r.get(i)).H(adiVar);
            }
        }
    }

    @Override // defpackage.bnk
    /* renamed from: I */
    public final void C(long j) {
        ArrayList arrayList;
        this.b = j;
        if (this.b < 0 || (arrayList = this.r) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bnk) this.r.get(i)).C(j);
        }
    }

    public final void J(int i) {
        this.s = i == 0;
    }

    public final void K() {
        for (int i = 0; i < this.r.size(); i++) {
            ((bnk) this.r.get(i)).y(R.id.inner_container);
        }
        super.y(R.id.inner_container);
    }

    @Override // defpackage.bnk
    /* renamed from: L */
    public final void z(View view) {
        for (int i = 0; i < this.r.size(); i++) {
            ((bnk) this.r.get(i)).z(view);
        }
        super.z(view);
    }

    @Override // defpackage.bnk
    /* renamed from: M */
    public final void D(TimeInterpolator timeInterpolator) {
        this.t |= 1;
        ArrayList arrayList = this.r;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bnk) this.r.get(i)).D(timeInterpolator);
            }
        }
        this.c = timeInterpolator;
    }

    @Override // defpackage.bnk
    public final void b(bnt bntVar) {
        if (w(bntVar.b)) {
            ArrayList arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bnk bnkVar = (bnk) arrayList.get(i);
                if (bnkVar.w(bntVar.b)) {
                    bnkVar.b(bntVar);
                    bntVar.c.add(bnkVar);
                }
            }
        }
    }

    @Override // defpackage.bnk
    public final void c(bnt bntVar) {
        if (w(bntVar.b)) {
            ArrayList arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bnk bnkVar = (bnk) arrayList.get(i);
                if (bnkVar.w(bntVar.b)) {
                    bnkVar.c(bntVar);
                    bntVar.c.add(bnkVar);
                }
            }
        }
    }

    @Override // defpackage.bnk
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    public final void e(bnj bnjVar) {
        super.x(bnjVar);
    }

    public final void f(bnk bnkVar) {
        N(bnkVar);
        long j = this.b;
        if (j >= 0) {
            bnkVar.C(j);
        }
        if ((this.t & 1) != 0) {
            bnkVar.D(this.c);
        }
        if ((this.t & 2) != 0) {
            bnkVar.E();
        }
        if ((this.t & 4) != 0) {
            bnkVar.H(this.o);
        }
        if ((this.t & 8) != 0) {
            bnkVar.G(null);
        }
    }

    @Override // defpackage.bnk
    public final bnk h() {
        bnr bnrVar = (bnr) super.clone();
        bnrVar.r = new ArrayList();
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            bnrVar.N(((bnk) this.r.get(i)).clone());
        }
        return bnrVar;
    }

    @Override // defpackage.bnk
    public final String k(String str) {
        String k = super.k(str);
        for (int i = 0; i < this.r.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(k);
            sb.append("\n");
            sb.append(((bnk) this.r.get(i)).k(str + "  "));
            k = sb.toString();
        }
        return k;
    }

    @Override // defpackage.bnk
    public final void l(bnt bntVar) {
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((bnk) this.r.get(i)).l(bntVar);
        }
    }

    @Override // defpackage.bnk
    public final void o(ViewGroup viewGroup, bnu bnuVar, bnu bnuVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.a;
        int size = this.r.size();
        int i = 0;
        while (i < size) {
            bnk bnkVar = (bnk) this.r.get(i);
            if (j > 0) {
                if (!this.s) {
                    if (i == 0) {
                        i = 0;
                    }
                }
                long j2 = bnkVar.a;
                if (j2 > 0) {
                    bnkVar.F(j2 + j);
                } else {
                    bnkVar.F(j);
                }
            }
            bnkVar.o(viewGroup, bnuVar, bnuVar2, arrayList, arrayList2);
            i++;
        }
    }

    @Override // defpackage.bnk
    public final void q(ViewGroup viewGroup) {
        super.q(viewGroup);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((bnk) this.r.get(i)).q(viewGroup);
        }
    }

    @Override // defpackage.bnk
    public final void r(View view) {
        super.r(view);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((bnk) this.r.get(i)).r(view);
        }
    }

    @Override // defpackage.bnk
    public final void s(View view) {
        super.s(view);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((bnk) this.r.get(i)).s(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnk
    public final void t() {
        if (!this.r.isEmpty()) {
            bnq bnqVar = new bnq(this);
            ArrayList arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bnk) arrayList.get(i)).x(bnqVar);
            }
            this.p = this.r.size();
            if (this.s) {
                ArrayList arrayList2 = this.r;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((bnk) arrayList2.get(i2)).t();
                }
                return;
            }
            for (int i3 = 1; i3 < this.r.size(); i3++) {
                ((bnk) this.r.get(i3 - 1)).x(new bnp((bnk) this.r.get(i3)));
            }
            bnk bnkVar = (bnk) this.r.get(0);
            if (bnkVar == null) {
                return;
            }
            bnkVar.t();
            return;
        }
        u();
        p();
    }

    @Override // defpackage.bnk
    public final /* bridge */ /* synthetic */ void y(int i) {
        K();
    }

    public bnr() {
        this.r = new ArrayList();
        this.s = true;
        this.q = false;
        this.t = 0;
    }
}
