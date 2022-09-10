package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzxe  reason: default package */
/* loaded from: classes6.dex */
public final class dzxe implements Iterator<dzwi> {
    final /* synthetic */ dzxf a;
    private int b = -1;
    private int c;
    private int d;
    private dzwi e;

    public dzxe(dzxf dzxfVar) {
        this.a = dzxfVar;
        int length = dzxfVar.a.length();
        if (length >= 0) {
            this.c = 0;
            this.d = 0;
            return;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
    }

    private final void a() {
        int i = this.d;
        int i2 = 0;
        if (i >= 0) {
            if (i > this.a.a.length()) {
                this.e = new dzwi(this.c, dzxg.b(this.a.a));
                this.d = -1;
            } else {
                dzxf dzxfVar = this.a;
                dzsx<Integer, Integer> a = dzxfVar.b.a(dzxfVar.a, Integer.valueOf(this.d));
                if (a == null) {
                    this.e = new dzwi(this.c, dzxg.b(this.a.a));
                    this.d = -1;
                } else {
                    int intValue = a.a.intValue();
                    int intValue2 = a.b.intValue();
                    this.e = intValue <= Integer.MIN_VALUE ? dzwi.d : new dzwi(this.c, intValue - 1);
                    int i3 = intValue + intValue2;
                    this.c = i3;
                    if (intValue2 == 0) {
                        i2 = 1;
                    }
                    this.d = i3 + i2;
                }
            }
            this.b = 1;
            return;
        }
        this.b = 0;
        this.e = null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ dzwi next() {
        if (this.b == -1) {
            a();
        }
        if (this.b != 0) {
            dzwi dzwiVar = this.e;
            if (dzwiVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            this.e = null;
            this.b = -1;
            return dzwiVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
