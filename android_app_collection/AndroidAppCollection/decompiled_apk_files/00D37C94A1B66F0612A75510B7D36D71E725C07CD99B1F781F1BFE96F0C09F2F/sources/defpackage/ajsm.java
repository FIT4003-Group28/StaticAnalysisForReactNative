package defpackage;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: ajsm  reason: default package */
/* loaded from: classes.dex */
public class ajsm extends ync implements ajqm {
    private final ajqc a;

    public ajsm() {
        super(new ArrayList(), new ynb());
        this.a = new ajqc();
    }

    @Override // defpackage.ajqm
    public final int a() {
        return size();
    }

    @Override // defpackage.ync, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ylr.c();
        super.add(i, obj);
    }

    @Override // defpackage.ync, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        ylr.c();
        return super.addAll(i, collection);
    }

    public long b(int i) {
        return i;
    }

    @Override // defpackage.ajqm
    public final Object c(int i) {
        return get(i);
    }

    @Override // defpackage.ync, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        ylr.c();
        super.clear();
    }

    @Override // defpackage.ync, defpackage.ymz
    public final void h(int i, int i2) {
        ylr.c();
        zdk.a(i, size() - 1);
        zdk.a(i + i2, size());
        for (int i3 = 0; i3 < i2; i3++) {
            this.b.remove(i);
        }
        this.c.c(i, i2);
    }

    public final void k(Collection collection) {
        collection.addAll(this.b);
    }

    public final void l() {
        this.c.g();
    }

    public /* bridge */ /* synthetic */ void lT(ajql ajqlVar) {
        super.i(ajqlVar);
    }

    public final void m(ampt amptVar) {
        ylr.c();
        amptVar.getClass();
        int size = this.b.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (amptVar.a(this.b.get(size))) {
                    this.b.remove(size);
                    this.c.d(size);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ajqm
    public final void mG(ajrt ajrtVar) {
        this.a.b(ajrtVar);
    }

    @Override // defpackage.ajqm
    public final void mH(ajrs ajrsVar, int i) {
        this.a.a(ajrsVar, this, i);
    }

    public final void n(int i, Object obj) {
        ylr.c();
        aqxo.p(i < size());
        obj.getClass();
        this.b.set(i, obj);
        this.c.a(i, 1);
    }

    public final void o(Object obj, Object obj2) {
        ylr.c();
        obj.getClass();
        obj2.getClass();
        int indexOf = this.b.indexOf(obj);
        if (indexOf >= 0) {
            n(indexOf, obj2);
        }
    }

    public final void p(Collection collection) {
        ylr.c();
        this.b.clear();
        this.b.addAll(collection);
        l();
    }

    public /* bridge */ /* synthetic */ void pl(ajql ajqlVar) {
        super.j(ajqlVar);
    }

    @Override // defpackage.ync, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ylr.c();
        return super.remove(i);
    }
}
