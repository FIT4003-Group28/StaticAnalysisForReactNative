package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dssz  reason: default package */
/* loaded from: classes6.dex */
public final class dssz implements Iterator<dsoz> {
    private final ArrayDeque<dstb> a;
    private dsoz b;

    public dssz(dspd dspdVar) {
        if (dspdVar instanceof dstb) {
            dstb dstbVar = (dstb) dspdVar;
            ArrayDeque<dstb> arrayDeque = new ArrayDeque<>(dstbVar.g);
            this.a = arrayDeque;
            arrayDeque.push(dstbVar);
            this.b = b(dstbVar.e);
            return;
        }
        this.a = null;
        this.b = (dsoz) dspdVar;
    }

    private final dsoz b(dspd dspdVar) {
        while (dspdVar instanceof dstb) {
            dstb dstbVar = (dstb) dspdVar;
            this.a.push(dstbVar);
            int i = dstb.h;
            dspdVar = dstbVar.e;
        }
        return (dsoz) dspdVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final dsoz next() {
        dsoz dsozVar;
        dsoz dsozVar2 = this.b;
        if (dsozVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque<dstb> arrayDeque = this.a;
            dsozVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            int i = dstb.h;
            dsozVar = b(this.a.pop().f);
        } while (dsozVar.u());
        this.b = dsozVar;
        return dsozVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
