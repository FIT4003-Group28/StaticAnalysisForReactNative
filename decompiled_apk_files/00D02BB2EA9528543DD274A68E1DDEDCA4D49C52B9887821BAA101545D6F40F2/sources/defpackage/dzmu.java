package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzmu  reason: default package */
/* loaded from: classes6.dex */
final class dzmu extends dzks {
    int a = 0;
    final /* synthetic */ dzmv b;

    public dzmu(dzmv dzmvVar) {
        this.b = dzmvVar;
    }

    @Override // defpackage.dzks, defpackage.dzna
    public final long b() {
        if (hasNext()) {
            long[] jArr = this.b.a;
            int i = this.a;
            this.a = i + 1;
            return jArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.b;
    }

    @Override // defpackage.dzks, java.util.Iterator
    public final void remove() {
        dzmv dzmvVar = this.b;
        int i = dzmvVar.b;
        dzmvVar.b = i - 1;
        int i2 = this.a;
        int i3 = i2 - 1;
        this.a = i3;
        long[] jArr = dzmvVar.a;
        System.arraycopy(jArr, i3 + 1, jArr, i3, i - i2);
    }
}
