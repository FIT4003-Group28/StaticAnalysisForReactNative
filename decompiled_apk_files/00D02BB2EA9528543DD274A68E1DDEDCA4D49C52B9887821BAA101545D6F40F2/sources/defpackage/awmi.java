package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: awmi  reason: default package */
/* loaded from: classes3.dex */
public final class awmi<T> implements Iterable<T> {
    public int a = 0;
    public int b = 0;
    @dzsi
    public awmh<T> c = null;
    @dzsi
    public awmh<T> d = null;

    public final T a() {
        return b(this.d);
    }

    public final T b(@dzsi awmh<T> awmhVar) {
        if (awmhVar != null) {
            this.a--;
            this.b++;
            awmh<T> awmhVar2 = awmhVar.c;
            awmh<T> awmhVar3 = awmhVar.b;
            if (awmhVar2 != null) {
                awmhVar2.b = awmhVar3;
            } else {
                this.c = awmhVar3;
            }
            awmh<T> awmhVar4 = awmhVar.b;
            if (awmhVar4 != null) {
                awmhVar4.c = awmhVar2;
            } else {
                this.d = awmhVar2;
            }
            awmhVar.b = null;
            awmhVar.c = null;
            return awmhVar.a;
        }
        throw new NoSuchElementException();
    }

    public final boolean c(awmh<T> awmhVar) {
        return awmhVar.c == null && this.c != awmhVar && awmhVar.b == null && this.d != awmhVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new awmg(this);
    }
}
