package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ayv  reason: default package */
/* loaded from: classes3.dex */
public class ayv extends ayn {
    int p;
    private ArrayList<ayn> r = new ArrayList<>();
    private boolean s = true;
    boolean q = false;
    private int t = 0;

    private final void M(ayn aynVar) {
        this.r.add(aynVar);
        aynVar.h = this;
    }

    @Override // defpackage.ayn
    public final /* bridge */ /* synthetic */ void C(View view) {
        for (int i = 0; i < this.r.size(); i++) {
            this.r.get(i).C(view);
        }
        super.C(view);
    }

    @Override // defpackage.ayn
    public final /* bridge */ /* synthetic */ void F(View view) {
        for (int i = 0; i < this.r.size(); i++) {
            this.r.get(i).F(view);
        }
        super.F(view);
    }

    @Override // defpackage.ayn
    public final /* bridge */ /* synthetic */ void H(TimeInterpolator timeInterpolator) {
        this.t |= 1;
        ArrayList<ayn> arrayList = this.r;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.r.get(i).H(timeInterpolator);
            }
        }
        this.c = timeInterpolator;
    }

    @Override // defpackage.ayn
    public final /* bridge */ /* synthetic */ void I(long j) {
        this.a = j;
    }

    public final void J(ayn aynVar) {
        M(aynVar);
        long j = this.b;
        if (j >= 0) {
            aynVar.G(j);
        }
        if ((this.t & 1) != 0) {
            aynVar.H(this.c);
        }
        if ((this.t & 2) != 0) {
            aynVar.w(this.m);
        }
        if ((this.t & 4) != 0) {
            aynVar.u(this.o);
        }
        if ((this.t & 8) != 0) {
            aynVar.v(this.n);
        }
    }

    @Override // defpackage.ayn
    /* renamed from: K */
    public final void G(long j) {
        ArrayList<ayn> arrayList;
        this.b = j;
        if (this.b < 0 || (arrayList = this.r) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.r.get(i).G(j);
        }
    }

    public final void L(int i) {
        this.s = i == 0;
    }

    @Override // defpackage.ayn
    public final void b(ayx ayxVar) {
        if (h(ayxVar.b)) {
            ArrayList<ayn> arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ayn aynVar = arrayList.get(i);
                if (aynVar.h(ayxVar.b)) {
                    aynVar.b(ayxVar);
                    ayxVar.c.add(aynVar);
                }
            }
        }
    }

    @Override // defpackage.ayn
    public final void c(ayx ayxVar) {
        if (h(ayxVar.b)) {
            ArrayList<ayn> arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ayn aynVar = arrayList.get(i);
                if (aynVar.h(ayxVar.b)) {
                    aynVar.c(ayxVar);
                    ayxVar.c.add(aynVar);
                }
            }
        }
    }

    @Override // defpackage.ayn
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    public final int e() {
        return this.r.size();
    }

    public final ayn f(int i) {
        if (i < 0 || i >= this.r.size()) {
            return null;
        }
        return this.r.get(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayn
    public final void g(ViewGroup viewGroup, ayy ayyVar, ayy ayyVar2, ArrayList<ayx> arrayList, ArrayList<ayx> arrayList2) {
        long j = this.a;
        int size = this.r.size();
        int i = 0;
        while (i < size) {
            ayn aynVar = this.r.get(i);
            if (j > 0) {
                if (!this.s) {
                    if (i == 0) {
                        i = 0;
                    }
                }
                long j2 = aynVar.a;
                if (j2 > 0) {
                    aynVar.I(j2 + j);
                } else {
                    aynVar.I(j);
                }
            }
            aynVar.g(viewGroup, ayyVar, ayyVar2, arrayList, arrayList2);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayn
    public final void j() {
        if (!this.r.isEmpty()) {
            ayu ayuVar = new ayu(this);
            ArrayList<ayn> arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).A(ayuVar);
            }
            this.p = this.r.size();
            if (this.s) {
                ArrayList<ayn> arrayList2 = this.r;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.get(i2).j();
                }
                return;
            }
            for (int i3 = 1; i3 < this.r.size(); i3++) {
                this.r.get(i3 - 1).A(new ayt(this.r.get(i3)));
            }
            ayn aynVar = this.r.get(0);
            if (aynVar == null) {
                return;
            }
            aynVar.j();
            return;
        }
        r();
        s();
    }

    @Override // defpackage.ayn
    public final void o(View view) {
        super.o(view);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            this.r.get(i).o(view);
        }
    }

    @Override // defpackage.ayn
    public final void p(View view) {
        super.p(view);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            this.r.get(i).p(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ayn
    public final void t() {
        super.t();
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            this.r.get(i).t();
        }
    }

    @Override // defpackage.ayn
    public final void u(axy axyVar) {
        super.u(axyVar);
        this.t |= 4;
        if (this.r != null) {
            for (int i = 0; i < this.r.size(); i++) {
                this.r.get(i).u(axyVar);
            }
        }
    }

    @Override // defpackage.ayn
    public final void v(ayl aylVar) {
        this.n = aylVar;
        this.t |= 8;
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            this.r.get(i).v(aylVar);
        }
    }

    @Override // defpackage.ayn
    public final void w(ays aysVar) {
        this.m = aysVar;
        this.t |= 2;
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            this.r.get(i).w(aysVar);
        }
    }

    @Override // defpackage.ayn
    public final void x(ayx ayxVar) {
        super.x(ayxVar);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            this.r.get(i).x(ayxVar);
        }
    }

    @Override // defpackage.ayn
    public final ayn y() {
        ayv ayvVar = (ayv) super.clone();
        ayvVar.r = new ArrayList<>();
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ayvVar.M(this.r.get(i).clone());
        }
        return ayvVar;
    }

    @Override // defpackage.ayn
    public final String z(String str) {
        String z = super.z(str);
        for (int i = 0; i < this.r.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(z);
            sb.append("\n");
            sb.append(this.r.get(i).z(str + "  "));
            z = sb.toString();
        }
        return z;
    }
}
