package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: drb  reason: default package */
/* loaded from: classes3.dex */
final class drb implements Iterator {
    final /* synthetic */ drc a;
    private int b = 0;
    private final /* synthetic */ int c;

    public drb(drc drcVar) {
        this.a = drcVar;
    }

    public drb(drc drcVar, int i) {
        this.c = i;
        this.a = drcVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != 0 ? this.b < this.a.a.length() : this.b < this.a.a.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.c == 0) {
            if (this.b < this.a.a.length()) {
                String str = this.a.a;
                int i = this.b;
                this.b = i + 1;
                return new drc(String.valueOf(str.charAt(i)));
            }
            throw new NoSuchElementException();
        } else if (this.b < this.a.a.length()) {
            int i2 = this.b;
            this.b = i2 + 1;
            return new drc(String.valueOf(i2));
        } else {
            throw new NoSuchElementException();
        }
    }
}
