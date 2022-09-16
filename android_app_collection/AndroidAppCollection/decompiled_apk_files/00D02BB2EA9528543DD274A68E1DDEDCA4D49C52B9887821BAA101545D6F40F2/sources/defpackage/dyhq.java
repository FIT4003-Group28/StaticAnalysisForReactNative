package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dyhq  reason: default package */
/* loaded from: classes6.dex */
final class dyhq implements Iterator {
    final /* synthetic */ dyhr a;
    private boolean b = true;
    private int c;

    public dyhq(dyhr dyhrVar) {
        this.a = dyhrVar;
        this.c = dyhrVar.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.b) {
            while (true) {
                int i = this.c;
                dyhr dyhrVar = this.a;
                dyhw dyhwVar = dyhrVar.c;
                if (i >= dyhwVar.e) {
                    return false;
                }
                if (Arrays.equals(dyhrVar.a.b, dyhwVar.a(i))) {
                    this.b = true;
                    return true;
                }
                this.c++;
            }
        } else {
            return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.b = false;
            dyhr dyhrVar = this.a;
            dyhw dyhwVar = dyhrVar.c;
            int i = this.c;
            this.c = i + 1;
            return dyhwVar.d(i, dyhrVar.a);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
