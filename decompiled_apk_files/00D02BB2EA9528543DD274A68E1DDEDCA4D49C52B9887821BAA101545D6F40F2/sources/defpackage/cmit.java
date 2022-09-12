package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmit  reason: default package */
/* loaded from: classes5.dex */
final class cmit implements cmga {
    private final List<cmij> a;
    private final long[] b;
    private final long[] c;

    public cmit(List<cmij> list) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.b = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            cmij cmijVar = list.get(i);
            int i2 = i + i;
            long[] jArr = this.b;
            jArr[i2] = cmijVar.b;
            jArr[i2 + 1] = cmijVar.c;
        }
        long[] jArr2 = this.b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // defpackage.cmga
    public final int a(long j) {
        int ac = cmny.ac(this.c, j, false);
        if (ac < this.c.length) {
            return ac;
        }
        return -1;
    }

    @Override // defpackage.cmga
    public final int b() {
        return this.c.length;
    }

    @Override // defpackage.cmga
    public final long c(int i) {
        boolean z = true;
        cmmn.a(i >= 0);
        if (i >= this.c.length) {
            z = false;
        }
        cmmn.a(z);
        return this.c[i];
    }

    @Override // defpackage.cmga
    public final List<cmfw> d(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            long[] jArr = this.b;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                cmij cmijVar = this.a.get(i);
                cmfw cmfwVar = cmijVar.a;
                if (cmfwVar.e == -3.4028235E38f) {
                    arrayList2.add(cmijVar);
                } else {
                    arrayList.add(cmfwVar);
                }
            }
        }
        Collections.sort(arrayList2, cmis.a);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            cmfv cmfvVar = new cmfv(((cmij) arrayList2.get(i3)).a);
            cmfvVar.b((-1) - i3, 1);
            arrayList.add(cmfvVar.a());
        }
        return arrayList;
    }
}
