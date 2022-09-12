package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbzo  reason: default package */
/* loaded from: classes.dex */
public final class dbzo implements Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ dbzp d;

    public dbzo(dbzp dbzpVar) {
        this.d = dbzpVar;
        this.a = dbzpVar.b;
        this.b = dbzpVar.k();
    }

    private final void a() {
        if (this.d.b == this.a) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.b;
            this.c = i;
            dbzp dbzpVar = this.d;
            Object obj = dbzpVar.a[i];
            this.b = dbzpVar.l(i);
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        dbzb.c(this.c >= 0);
        this.a += 32;
        dbzp dbzpVar = this.d;
        dbzpVar.remove(dbzpVar.a[this.c]);
        this.b = this.d.m(this.b, this.c);
        this.c = -1;
    }
}
