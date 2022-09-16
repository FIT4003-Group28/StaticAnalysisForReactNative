package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aaom  reason: default package */
/* loaded from: classes.dex */
public abstract class aaom implements aaoo, ymb {
    protected final List a;
    protected final axnm b;
    private final Object c;

    public aaom(axnm axnmVar) {
        axnmVar.getClass();
        this.b = axnmVar;
        this.a = new ArrayList();
        this.c = new Object();
    }

    @Override // defpackage.aaoo
    public final void a(Object obj) {
        ymc a;
        if (d(obj) && (a = ((aaon) this.b.get()).a(obj, this)) != null) {
            synchronized (this.c) {
                this.a.add(a);
            }
            a.d();
        }
    }

    @Override // defpackage.ymb
    public final void b(ymc ymcVar) {
        synchronized (this.c) {
            this.a.remove(ymcVar);
        }
    }

    public final void c() {
        int size;
        ymc[] ymcVarArr;
        synchronized (this.c) {
            size = this.a.size();
            ymcVarArr = new ymc[size];
            this.a.toArray(ymcVarArr);
            this.a.clear();
        }
        for (int i = 0; i < size; i++) {
            ymcVarArr[i].c();
        }
    }

    protected abstract boolean d(Object obj);
}
