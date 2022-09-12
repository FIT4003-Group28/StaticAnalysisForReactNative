package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzwh  reason: default package */
/* loaded from: classes6.dex */
public final class dzwh extends dzty {
    public boolean a;
    private final int b;
    private int c;
    private final int d = 1;

    public dzwh(int i, int i2, int i3) {
        this.b = i2;
        boolean z = i <= i2;
        this.a = z;
        this.c = true != z ? i2 : i;
    }

    @Override // defpackage.dzty
    public final int a() {
        int i = this.c;
        if (i != this.b) {
            this.c = i + 1;
        } else if (this.a) {
            this.a = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }
}
