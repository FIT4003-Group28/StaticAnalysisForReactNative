package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cmdj  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmdj implements cmej {
    private Looper e;
    private clpb f;
    private final ArrayList<cmei> d = new ArrayList<>(1);
    public final HashSet<cmei> a = new HashSet<>(1);
    public final cmeq b = new cmeq();
    public final cltr c = new cltr();

    protected void B() {
    }

    protected abstract void a(cmlo cmloVar);

    protected void c() {
    }

    protected abstract void d();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(clpb clpbVar) {
        this.f = clpbVar;
        ArrayList<cmei> arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a(clpbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cmeq f(cmeh cmehVar) {
        return this.b.h(0, cmehVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cltr g(cmeh cmehVar) {
        return this.c.a(0, cmehVar);
    }

    @Override // defpackage.cmej
    public final void h(Handler handler, cmer cmerVar) {
        cmmn.f(cmerVar);
        this.b.a(handler, cmerVar);
    }

    @Override // defpackage.cmej
    public final void i(cmer cmerVar) {
        cmeq cmeqVar = this.b;
        Iterator<cmep> it = cmeqVar.c.iterator();
        while (it.hasNext()) {
            cmep next = it.next();
            if (next.b == cmerVar) {
                cmeqVar.c.remove(next);
            }
        }
    }

    @Override // defpackage.cmej
    public final void j(Handler handler, clts cltsVar) {
        cmmn.f(cltsVar);
        this.c.b(handler, cltsVar);
    }

    @Override // defpackage.cmej
    public final void k(cmei cmeiVar, cmlo cmloVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        cmmn.a(z);
        clpb clpbVar = this.f;
        this.d.add(cmeiVar);
        if (this.e == null) {
            this.e = myLooper;
            this.a.add(cmeiVar);
            a(cmloVar);
        } else if (clpbVar == null) {
        } else {
            l(cmeiVar);
            cmeiVar.a(clpbVar);
        }
    }

    @Override // defpackage.cmej
    public final void l(cmei cmeiVar) {
        cmmn.f(this.e);
        boolean isEmpty = this.a.isEmpty();
        this.a.add(cmeiVar);
        if (isEmpty) {
            B();
        }
    }

    @Override // defpackage.cmej
    public final void m(cmei cmeiVar) {
        boolean isEmpty = this.a.isEmpty();
        this.a.remove(cmeiVar);
        if (!(!isEmpty) || !this.a.isEmpty()) {
            return;
        }
        c();
    }

    @Override // defpackage.cmej
    public final void n(cmei cmeiVar) {
        this.d.remove(cmeiVar);
        if (this.d.isEmpty()) {
            this.e = null;
            this.f = null;
            this.a.clear();
            d();
            return;
        }
        m(cmeiVar);
    }

    @Override // defpackage.cmej
    public final clpb o() {
        return null;
    }

    @Override // defpackage.cmej
    public final boolean p() {
        return true;
    }
}
