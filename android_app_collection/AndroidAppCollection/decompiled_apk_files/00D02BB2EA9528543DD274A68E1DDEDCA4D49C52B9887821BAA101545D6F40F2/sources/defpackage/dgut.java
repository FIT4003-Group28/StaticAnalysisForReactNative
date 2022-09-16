package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dgut  reason: default package */
/* loaded from: classes6.dex */
abstract class dgut<T> implements Iterator<T> {
    dguu a;
    dguu b = null;
    int c;
    final /* synthetic */ dguv d;

    public dgut(dguv dguvVar) {
        this.d = dguvVar;
        this.a = dguvVar.e.d;
        this.c = dguvVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dguu a() {
        dguu dguuVar = this.a;
        dguv dguvVar = this.d;
        if (dguuVar != dguvVar.e) {
            if (dguvVar.d != this.c) {
                throw new ConcurrentModificationException();
            }
            this.a = dguuVar.d;
            this.b = dguuVar;
            return dguuVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        dguu dguuVar = this.b;
        if (dguuVar == null) {
            throw new IllegalStateException();
        }
        this.d.d(dguuVar, true);
        this.b = null;
        this.c = this.d.d;
    }
}
