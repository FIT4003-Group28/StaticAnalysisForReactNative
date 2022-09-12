package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: bbuq  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbuq implements Serializable {
    public final bbvl a;
    public final bbuu b;
    private transient CopyOnWriteArraySet<WeakReference<bbup>> c;

    public bbuq() {
        this(new bbuw(), new bbuu());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = new CopyOnWriteArraySet<>();
    }

    public abstract void a(int i, int i2);

    public abstract int b();

    public abstract boolean c();

    public abstract int d();

    @dzsi
    public abstract dwfl e(int i);

    public abstract int f(dwfl dwflVar);

    public boolean g() {
        return false;
    }

    public void h(buti butiVar) {
    }

    public abstract void i(int i);

    public abstract void j(Collection<dwfl> collection);

    public abstract void k(String str, String str2);

    public abstract void l(String str, List<dwfa> list);

    public abstract void m(String str, String str2);

    public void n(String str, boolean z) {
    }

    @dzsi
    public Boolean o(String str) {
        return null;
    }

    public void p(int i) {
    }

    @dzsi
    public Boolean q(int i) {
        return null;
    }

    public final void r(bbup bbupVar) {
        this.c.add(new WeakReference<>(bbupVar));
    }

    public final void s(bbup bbupVar) {
        Iterator<WeakReference<bbup>> it = this.c.iterator();
        while (it.hasNext()) {
            WeakReference<bbup> next = it.next();
            if (next.get() == bbupVar) {
                this.c.remove(next);
                return;
            }
        }
    }

    public final void t(dbsz<bbup> dbszVar) {
        Iterator<WeakReference<bbup>> it = this.c.iterator();
        while (it.hasNext()) {
            WeakReference<bbup> next = it.next();
            bbup bbupVar = next.get();
            if (bbupVar == null) {
                this.c.remove(next);
            } else {
                dbszVar.NU(bbupVar);
            }
        }
    }

    public final void u() {
        t(bbum.a);
    }

    public final void v() {
        t(bbun.a);
    }

    public bbuq(bbvl bbvlVar, bbuu bbuuVar) {
        this.c = new CopyOnWriteArraySet<>();
        this.a = bbvlVar;
        this.b = bbuuVar;
    }
}
