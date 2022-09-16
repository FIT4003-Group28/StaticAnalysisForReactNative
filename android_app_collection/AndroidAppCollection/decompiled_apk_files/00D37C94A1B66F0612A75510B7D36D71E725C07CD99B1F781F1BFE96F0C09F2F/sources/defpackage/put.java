package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: put  reason: default package */
/* loaded from: classes4.dex */
final class put implements psk {
    private final List a;
    private final long[] b;
    private final long[] c;

    public put(List list) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.b = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            pul pulVar = (pul) list.get(i);
            int i2 = i + i;
            long[] jArr = this.b;
            jArr[i2] = pulVar.b;
            jArr[i2 + 1] = pulVar.c;
        }
        long[] jArr2 = this.b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // defpackage.psk
    public final int a() {
        return this.c.length;
    }

    @Override // defpackage.psk
    public final int b(long j) {
        int ae = pxi.ae(this.c, j, false);
        if (ae < this.c.length) {
            return ae;
        }
        return -1;
    }

    @Override // defpackage.psk
    public final long c(int i) {
        boolean z = true;
        ptx.c(i >= 0);
        if (i >= this.c.length) {
            z = false;
        }
        ptx.c(z);
        return this.c[i];
    }

    @Override // defpackage.psk
    public final List d(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            long[] jArr = this.b;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                pul pulVar = (pul) this.a.get(i);
                psg psgVar = pulVar.a;
                if (psgVar.f == -3.4028235E38f) {
                    arrayList2.add(pulVar);
                } else {
                    arrayList.add(psgVar);
                }
            }
        }
        Collections.sort(arrayList2, fay.i);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            psf psfVar = new psf(((pul) arrayList2.get(i3)).a);
            psfVar.b((-1) - i3, 1);
            arrayList.add(psfVar.a());
        }
        return arrayList;
    }
}
