package a.r;

import a.r.x;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b0 extends x {
    int M;
    private ArrayList<x> K = new ArrayList<>();
    private boolean L = true;
    boolean N = false;
    private int O = 0;

    /* loaded from: classes.dex */
    class a extends y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f553a;

        a(b0 b0Var, x xVar) {
            this.f553a = xVar;
        }

        @Override // a.r.x.f
        public void e(x xVar) {
            this.f553a.o();
            xVar.mo24b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends y {

        /* renamed from: a  reason: collision with root package name */
        b0 f554a;

        b(b0 b0Var) {
            this.f554a = b0Var;
        }

        @Override // a.r.y, a.r.x.f
        public void a(x xVar) {
            b0 b0Var = this.f554a;
            if (!b0Var.N) {
                b0Var.p();
                this.f554a.N = true;
            }
        }

        @Override // a.r.x.f
        public void e(x xVar) {
            b0 b0Var = this.f554a;
            b0Var.M--;
            if (b0Var.M == 0) {
                b0Var.N = false;
                b0Var.a();
            }
            xVar.mo24b(this);
        }
    }

    private void b(x xVar) {
        this.K.add(xVar);
        xVar.s = this;
    }

    private void r() {
        b bVar = new b(this);
        Iterator<x> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().mo20a(bVar);
        }
        this.M = this.K.size();
    }

    @Override // a.r.x
    /* renamed from: a */
    public b0 mo19a(long j) {
        ArrayList<x> arrayList;
        super.mo19a(j);
        if (this.f709d >= 0 && (arrayList = this.K) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).mo19a(j);
            }
        }
        return this;
    }

    @Override // a.r.x
    /* renamed from: a */
    public b0 mo20a(x.f fVar) {
        super.mo20a(fVar);
        return this;
    }

    public b0 a(x xVar) {
        b(xVar);
        long j = this.f709d;
        if (j >= 0) {
            xVar.mo19a(j);
        }
        if ((this.O & 1) != 0) {
            xVar.mo21a(e());
        }
        if ((this.O & 2) != 0) {
            xVar.a(h());
        }
        if ((this.O & 4) != 0) {
            xVar.a(g());
        }
        if ((this.O & 8) != 0) {
            xVar.a(d());
        }
        return this;
    }

    @Override // a.r.x
    /* renamed from: a */
    public b0 mo21a(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList<x> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).mo21a(timeInterpolator);
            }
        }
        super.mo21a(timeInterpolator);
        return this;
    }

    @Override // a.r.x
    /* renamed from: a */
    public b0 mo22a(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).mo22a(view);
        }
        super.mo22a(view);
        return this;
    }

    public x a(int i) {
        if (i < 0 || i >= this.K.size()) {
            return null;
        }
        return this.K.get(i);
    }

    @Override // a.r.x
    /* renamed from: a  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ x mo19a(long j) {
        mo19a(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // a.r.x
    public String a(String str) {
        String a2 = super.a(str);
        for (int i = 0; i < this.K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("\n");
            sb.append(this.K.get(i).a(str + "  "));
            a2 = sb.toString();
        }
        return a2;
    }

    @Override // a.r.x
    public void a(a0 a0Var) {
        super.a(a0Var);
        this.O |= 2;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).a(a0Var);
        }
    }

    @Override // a.r.x
    public void a(d0 d0Var) {
        if (b(d0Var.f584b)) {
            Iterator<x> it = this.K.iterator();
            while (it.hasNext()) {
                x next = it.next();
                if (next.b(d0Var.f584b)) {
                    next.a(d0Var);
                    d0Var.f585c.add(next);
                }
            }
        }
    }

    @Override // a.r.x
    public void a(p pVar) {
        super.a(pVar);
        this.O |= 4;
        if (this.K != null) {
            for (int i = 0; i < this.K.size(); i++) {
                this.K.get(i).a(pVar);
            }
        }
    }

    @Override // a.r.x
    public void a(x.e eVar) {
        super.a(eVar);
        this.O |= 8;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).a(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a.r.x
    public void a(ViewGroup viewGroup, e0 e0Var, e0 e0Var2, ArrayList<d0> arrayList, ArrayList<d0> arrayList2) {
        long i = i();
        int size = this.K.size();
        for (int i2 = 0; i2 < size; i2++) {
            x xVar = this.K.get(i2);
            if (i > 0 && (this.L || i2 == 0)) {
                long i3 = xVar.i();
                if (i3 > 0) {
                    xVar.mo23b(i3 + i);
                } else {
                    xVar.mo23b(i);
                }
            }
            xVar.a(viewGroup, e0Var, e0Var2, arrayList, arrayList2);
        }
    }

    public b0 b(int i) {
        if (i == 0) {
            this.L = true;
        } else if (i != 1) {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        } else {
            this.L = false;
        }
        return this;
    }

    @Override // a.r.x
    /* renamed from: b */
    public b0 mo23b(long j) {
        super.mo23b(j);
        return this;
    }

    @Override // a.r.x
    /* renamed from: b */
    public b0 mo24b(x.f fVar) {
        super.mo24b(fVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // a.r.x
    public void b(d0 d0Var) {
        super.b(d0Var);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).b(d0Var);
        }
    }

    @Override // a.r.x
    public void c(d0 d0Var) {
        if (b(d0Var.f584b)) {
            Iterator<x> it = this.K.iterator();
            while (it.hasNext()) {
                x next = it.next();
                if (next.b(d0Var.f584b)) {
                    next.c(d0Var);
                    d0Var.f585c.add(next);
                }
            }
        }
    }

    @Override // a.r.x
    public void c(View view) {
        super.c(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).c(view);
        }
    }

    @Override // a.r.x
    /* renamed from: clone */
    public x mo25clone() {
        b0 b0Var = (b0) super.clone();
        b0Var.K = new ArrayList<>();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            b0Var.b(this.K.get(i).clone());
        }
        return b0Var;
    }

    @Override // a.r.x
    /* renamed from: d */
    public b0 mo26d(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).mo26d(view);
        }
        super.mo26d(view);
        return this;
    }

    @Override // a.r.x
    public void e(View view) {
        super.e(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).e(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a.r.x
    public void o() {
        if (this.K.isEmpty()) {
            p();
            a();
            return;
        }
        r();
        if (this.L) {
            Iterator<x> it = this.K.iterator();
            while (it.hasNext()) {
                it.next().o();
            }
            return;
        }
        for (int i = 1; i < this.K.size(); i++) {
            this.K.get(i - 1).mo20a(new a(this, this.K.get(i)));
        }
        x xVar = this.K.get(0);
        if (xVar == null) {
            return;
        }
        xVar.o();
    }

    public int q() {
        return this.K.size();
    }
}
