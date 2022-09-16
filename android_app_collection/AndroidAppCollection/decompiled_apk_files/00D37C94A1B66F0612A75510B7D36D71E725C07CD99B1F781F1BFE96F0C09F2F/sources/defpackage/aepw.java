package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aepw  reason: default package */
/* loaded from: classes.dex */
public final class aepw extends aepg {
    private final afmi a = new afmi();
    private final auff b;

    public aepw(auff auffVar) {
        afms.a(auffVar);
        this.b = auffVar;
    }

    public static aepw k(aadd aaddVar, boolean z) {
        auff auffVar;
        arhd a = aaddVar.a();
        if (a == null) {
            return null;
        }
        atdy atdyVar = a.i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        if ((atdyVar.b & 32) == 0) {
            return null;
        }
        apmv apmvVar = atdyVar.e;
        if (apmvVar == null) {
            apmvVar = apmv.a;
        }
        if (z) {
            auffVar = apmvVar.d;
            if (auffVar == null) {
                auffVar = auff.a;
            }
        } else {
            auffVar = apmvVar.c;
            if (auffVar == null) {
                auffVar = auff.a;
            }
        }
        if (auffVar != null && auffVar.b.size() != 0) {
            return new aepw(auffVar);
        }
        return null;
    }

    private final int l(int i) {
        return Math.min(this.b.b.size() - 1, i);
    }

    @Override // defpackage.aepg
    protected final float a(int i, List list) {
        ArrayList arrayList = list;
        int e = e(i);
        if (list.size() != e) {
            ArrayList arrayList2 = new ArrayList(e);
            Float f = (Float) arrayList.get(0);
            for (int i2 = 0; i2 < e - list.size(); i2++) {
                arrayList2.add(f);
            }
            arrayList2.addAll(arrayList);
            arrayList = arrayList2;
        }
        afmi afmiVar = this.a;
        aufg aufgVar = (aufg) this.b.b.get(l(i));
        afms.a(aufgVar);
        afms.a(arrayList);
        long size = aufgVar.d.size();
        int i3 = aufgVar.c;
        int i4 = aufgVar.b;
        long j = 0;
        for (int i5 = 0; i5 <= i4; i5++) {
            long j2 = i5;
            long j3 = (i3 + j2) - 1;
            long j4 = 1;
            if (j2 <= j3) {
                long j5 = 1;
                long j6 = 1;
                while (j5 <= j2) {
                    j6 = (j6 * j3) / j5;
                    j5++;
                    j3--;
                }
                j4 = j6;
            }
            j += j4;
        }
        boolean z = true;
        afms.b(size == j);
        if (aufgVar.c != arrayList.size()) {
            z = false;
        }
        afms.b(z);
        afmiVar.a = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 <= aufgVar.b; i6++) {
            f2 += afmiVar.a(aufgVar, arrayList, i6, 0);
        }
        return f2;
    }

    @Override // defpackage.aepg
    protected final float c(float f) {
        return ((float) Math.pow(10.0d, f)) * 1000.0f;
    }

    @Override // defpackage.aepg
    protected final float d(float f) {
        if (f > 0.0f) {
            return (float) Math.log10(f / 1000.0f);
        }
        return -3.4028235E38f;
    }

    @Override // defpackage.aepg
    protected final int e(int i) {
        auff auffVar = this.b;
        return ((aufg) auffVar.b.get(l(i))).c;
    }

    @Override // defpackage.aepg, defpackage.aepy
    public final int j() {
        return 4;
    }
}
