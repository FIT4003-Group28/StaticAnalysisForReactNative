package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: PG */
/* renamed from: dchu  reason: default package */
/* loaded from: classes5.dex */
public abstract class dchu<T> implements Iterator<T> {
    int a;
    int b = -1;
    dcia c;
    AtomicReferenceArray d;
    dchv e;
    dciu f;
    dciu g;
    final /* synthetic */ dciv h;

    public dchu(dciv dcivVar) {
        this.h = dcivVar;
        this.a = dcivVar.c.length - 1;
        a();
    }

    final void a() {
        this.f = null;
        if (!b() && !c()) {
            while (true) {
                int i = this.a;
                if (i < 0) {
                    return;
                }
                dcia[] dciaVarArr = this.h.c;
                this.a = i - 1;
                dcia dciaVar = dciaVarArr[i];
                this.c = dciaVar;
                if (dciaVar.b != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.c.e;
                    this.d = atomicReferenceArray;
                    this.b = atomicReferenceArray.length() - 1;
                    if (c()) {
                        return;
                    }
                }
            }
        }
    }

    final boolean b() {
        dchv dchvVar = this.e;
        if (dchvVar != null) {
            while (true) {
                this.e = dchvVar.c();
                dchv dchvVar2 = this.e;
                if (dchvVar2 == null) {
                    return false;
                }
                if (d(dchvVar2)) {
                    return true;
                }
                dchvVar = this.e;
            }
        } else {
            return false;
        }
    }

    final boolean c() {
        while (true) {
            int i = this.b;
            if (i >= 0) {
                AtomicReferenceArray atomicReferenceArray = this.d;
                this.b = i - 1;
                dchv dchvVar = (dchv) atomicReferenceArray.get(i);
                this.e = dchvVar;
                if (dchvVar != null && (d(dchvVar) || b())) {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    final boolean d(dchv dchvVar) {
        try {
            Object a = dchvVar.a();
            Object d = dchvVar.a() == null ? null : dchvVar.d();
            if (d == null) {
                this.c.l();
                return false;
            }
            this.f = new dciu(this.h, a, d);
            this.c.l();
            return true;
        } catch (Throwable th) {
            this.c.l();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dciu e() {
        dciu dciuVar = this.f;
        if (dciuVar != null) {
            this.g = dciuVar;
            a();
            return this.g;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        dbzb.c(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
