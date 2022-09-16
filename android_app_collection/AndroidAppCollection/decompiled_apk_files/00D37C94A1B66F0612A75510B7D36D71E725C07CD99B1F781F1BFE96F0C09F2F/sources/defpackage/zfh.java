package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: zfh  reason: default package */
/* loaded from: classes4.dex */
final class zfh implements Iterator, j$.util.Iterator {
    final /* synthetic */ zfi a;
    private int b = 0;
    private int c;
    private zfg d;
    private zfg e;
    private Object f;
    private final zff g;

    public zfh(zfi zfiVar, zff zffVar) {
        this.a = zfiVar;
        this.g = zffVar;
        this.c = zfiVar.b;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        if (this.c == this.a.b) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            zfg zfgVar = this.e;
            this.d = zfgVar;
            this.e = zfgVar.d;
            Object a = this.g.a(zfgVar);
            this.f = null;
            return a;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (this.c == this.a.b) {
            zfg zfgVar = this.d;
            if (zfgVar != null) {
                this.a.c(zfgVar);
                this.d = null;
                this.c++;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        zfg zfgVar;
        zfg zfgVar2 = this.e;
        if (zfgVar2 == null || (this.f == null && !zfgVar2.b)) {
            while (true) {
                zfg zfgVar3 = this.e;
                if (zfgVar3 == null) {
                    do {
                        int i = this.b;
                        zfg[] zfgVarArr = this.a.a;
                        if (i >= zfgVarArr.length) {
                            break;
                        }
                        this.b = i + 1;
                        zfgVar = zfgVarArr[i];
                        this.e = zfgVar;
                    } while (zfgVar == null);
                    zfgVar3 = this.e;
                    if (zfgVar3 == null) {
                        return false;
                    }
                }
                Object obj = zfgVar3.get();
                this.f = obj;
                if (obj != null) {
                    break;
                }
                zfg zfgVar4 = this.e;
                if (zfgVar4.b) {
                    break;
                }
                this.e = zfgVar4.d;
            }
        }
        return true;
    }
}
