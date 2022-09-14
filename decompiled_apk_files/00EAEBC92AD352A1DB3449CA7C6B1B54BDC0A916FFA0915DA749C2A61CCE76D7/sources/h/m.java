package h;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class m extends AbstractList<f> implements RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    final f[] f10165b;

    /* renamed from: c  reason: collision with root package name */
    final int[] f10166c;

    private m(f[] fVarArr, int[] iArr) {
        this.f10165b = fVarArr;
        this.f10166c = iArr;
    }

    private static int a(c cVar) {
        return (int) (cVar.e() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bc, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h.m a(h.f... r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h.m.a(h.f[]):h.m");
    }

    private static void a(long j, c cVar, int i, List<f> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        int i6;
        c cVar2;
        int i7 = i2;
        if (i7 < i3) {
            for (int i8 = i7; i8 < i3; i8++) {
                if (list.get(i8).g() < i) {
                    throw new AssertionError();
                }
            }
            f fVar = list.get(i2);
            f fVar2 = list.get(i3 - 1);
            int i9 = -1;
            if (i == fVar.g()) {
                i9 = list2.get(i7).intValue();
                i7++;
                fVar = list.get(i7);
            }
            int i10 = i7;
            if (fVar.a(i) == fVar2.a(i)) {
                int min = Math.min(fVar.g(), fVar2.g());
                int i11 = 0;
                for (int i12 = i; i12 < min && fVar.a(i12) == fVar2.a(i12); i12++) {
                    i11++;
                }
                long a2 = 1 + j + a(cVar) + 2 + i11;
                cVar.mo340writeInt(-i11);
                cVar.mo340writeInt(i9);
                int i13 = i;
                while (true) {
                    i4 = i + i11;
                    if (i13 >= i4) {
                        break;
                    }
                    cVar.mo340writeInt(fVar.a(i13) & 255);
                    i13++;
                }
                if (i10 + 1 == i3) {
                    if (i4 != list.get(i10).g()) {
                        throw new AssertionError();
                    }
                    cVar.mo340writeInt(list2.get(i10).intValue());
                    return;
                }
                c cVar3 = new c();
                cVar.mo340writeInt((int) ((a(cVar3) + a2) * (-1)));
                a(a2, cVar3, i4, list, i10, i3, list2);
                cVar.write(cVar3, cVar3.e());
                return;
            }
            int i14 = 1;
            for (int i15 = i10 + 1; i15 < i3; i15++) {
                if (list.get(i15 - 1).a(i) != list.get(i15).a(i)) {
                    i14++;
                }
            }
            long a3 = j + a(cVar) + 2 + (i14 * 2);
            cVar.mo340writeInt(i14);
            cVar.mo340writeInt(i9);
            for (int i16 = i10; i16 < i3; i16++) {
                byte a4 = list.get(i16).a(i);
                if (i16 == i10 || a4 != list.get(i16 - 1).a(i)) {
                    cVar.mo340writeInt(a4 & 255);
                }
            }
            c cVar4 = new c();
            int i17 = i10;
            while (i17 < i3) {
                byte a5 = list.get(i17).a(i);
                int i18 = i17 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i5 = i3;
                        break;
                    } else if (a5 != list.get(i19).a(i)) {
                        i5 = i19;
                        break;
                    } else {
                        i19++;
                    }
                }
                if (i18 == i5 && i + 1 == list.get(i17).g()) {
                    cVar.mo340writeInt(list2.get(i17).intValue());
                    i6 = i5;
                    cVar2 = cVar4;
                } else {
                    cVar.mo340writeInt((int) ((a(cVar4) + a3) * (-1)));
                    i6 = i5;
                    cVar2 = cVar4;
                    a(a3, cVar4, i + 1, list, i17, i5, list2);
                }
                cVar4 = cVar2;
                i17 = i6;
            }
            c cVar5 = cVar4;
            cVar.write(cVar5, cVar5.e());
            return;
        }
        throw new AssertionError();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: get */
    public f mo342get(int i) {
        return this.f10165b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10165b.length;
    }
}
