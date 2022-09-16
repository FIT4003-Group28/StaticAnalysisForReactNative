package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clnq  reason: default package */
/* loaded from: classes5.dex */
public final class clnq {
    public final cmeg a;
    public final Object b;
    public final cmfk[] c;
    public boolean d;
    public boolean e;
    public clnr f;
    public boolean g;
    public clnq h;
    public TrackGroupArray i = TrackGroupArray.a;
    public cmjr j;
    public long k;
    private final boolean[] l;
    private final clon[] m;
    private final cmjq n;
    private final cloa o;

    public clnq(clon[] clonVarArr, long j, cmjq cmjqVar, cmkk cmkkVar, cloa cloaVar, clnr clnrVar, cmjr cmjrVar) {
        this.m = clonVarArr;
        this.k = j;
        this.n = cmjqVar;
        this.o = cloaVar;
        this.b = clnrVar.a.a;
        this.f = clnrVar;
        this.j = cmjrVar;
        int length = clonVarArr.length;
        this.c = new cmfk[length];
        this.l = new boolean[length];
        cmeh cmehVar = clnrVar.a;
        long j2 = clnrVar.b;
        long j3 = clnrVar.d;
        Object a = clok.a(cmehVar.a);
        cmeh a2 = cmehVar.a(clok.b(cmehVar.a));
        clny clnyVar = cloaVar.c.get(a);
        cmmn.f(clnyVar);
        cloaVar.h.add(clnyVar);
        clnx clnxVar = cloaVar.g.get(clnyVar);
        if (clnxVar != null) {
            clnxVar.a.l(clnxVar.b);
        }
        clnyVar.c.add(a2);
        cmeg t = clnyVar.a.t(a2, cmkkVar, j2);
        cloaVar.b.put(t, clnyVar);
        cloaVar.d();
        if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            t = new cmdm(t, 0L, j3);
        }
        this.a = t;
    }

    private final void m() {
        if (j()) {
            int i = 0;
            while (true) {
                cmjr cmjrVar = this.j;
                if (i >= cmjrVar.a) {
                    return;
                }
                cmjrVar.a(i);
                this.j.c.a(i);
                i++;
            }
        }
    }

    private final void n() {
        if (j()) {
            int i = 0;
            while (true) {
                cmjr cmjrVar = this.j;
                if (i >= cmjrVar.a) {
                    return;
                }
                cmjrVar.a(i);
                this.j.c.a(i);
                i++;
            }
        }
    }

    public final long a(long j) {
        return j + this.k;
    }

    public final long b(long j) {
        return j - this.k;
    }

    public final long c() {
        return this.f.b + this.k;
    }

    public final boolean d() {
        return this.d && (!this.e || this.a.i() == Long.MIN_VALUE);
    }

    public final long e() {
        if (!this.d) {
            return this.f.b;
        }
        long i = this.e ? this.a.i() : Long.MIN_VALUE;
        return i == Long.MIN_VALUE ? this.f.e : i;
    }

    public final long f() {
        if (!this.d) {
            return 0L;
        }
        return this.a.l();
    }

    public final long g(cmjr cmjrVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= cmjrVar.a) {
                break;
            }
            boolean[] zArr2 = this.l;
            if (z || !cmjrVar.b(this.j, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        cmfk[] cmfkVarArr = this.c;
        int i2 = 0;
        while (true) {
            clon[] clonVarArr = this.m;
            if (i2 >= clonVarArr.length) {
                break;
            }
            if (clonVarArr[i2].a() == 7) {
                cmfkVarArr[i2] = null;
            }
            i2++;
        }
        n();
        this.j = cmjrVar;
        m();
        cmjn cmjnVar = cmjrVar.c;
        long f = this.a.f(cmjnVar.b(), this.l, this.c, zArr, j);
        cmfk[] cmfkVarArr2 = this.c;
        int i3 = 0;
        while (true) {
            clon[] clonVarArr2 = this.m;
            if (i3 >= clonVarArr2.length) {
                break;
            }
            if (clonVarArr2[i3].a() == 7 && this.j.a(i3)) {
                cmfkVarArr2[i3] = new cmdv();
            }
            i3++;
        }
        this.e = false;
        int i4 = 0;
        while (true) {
            cmfk[] cmfkVarArr3 = this.c;
            if (i4 < cmfkVarArr3.length) {
                if (cmfkVarArr3[i4] != null) {
                    cmmn.c(cmjrVar.a(i4));
                    if (this.m[i4].a() != 7) {
                        this.e = true;
                    }
                } else {
                    cmmn.c(cmjnVar.a(i4) == null);
                }
                i4++;
            } else {
                return f;
            }
        }
    }

    public final void h() {
        n();
        long j = this.f.d;
        cloa cloaVar = this.o;
        cmeg cmegVar = this.a;
        try {
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                cloaVar.b(cmegVar);
            } else {
                cloaVar.b(((cmdm) cmegVar).a);
            }
        } catch (RuntimeException e) {
            cmna.a("Period release failed.", e);
        }
    }

    public final void i(clnq clnqVar) {
        if (clnqVar == this.h) {
            return;
        }
        n();
        this.h = clnqVar;
        m();
    }

    public final boolean j() {
        return this.h == null;
    }

    public final long k(cmjr cmjrVar, long j) {
        return g(cmjrVar, j, false, new boolean[this.m.length]);
    }

    public final cmjr l() {
        int length;
        cmjm[] b;
        int length2;
        int[] iArr;
        cmjq cmjqVar = this.n;
        clon[] clonVarArr = this.m;
        TrackGroupArray trackGroupArray = this.i;
        cmeh cmehVar = this.f.a;
        int length3 = clonVarArr.length + 1;
        int[] iArr2 = new int[length3];
        TrackGroup[][] trackGroupArr = new TrackGroup[length3];
        int[][][] iArr3 = new int[length3][];
        int i = 0;
        for (int i2 = 0; i2 < length3; i2++) {
            int i3 = trackGroupArray.b;
            trackGroupArr[i2] = new TrackGroup[i3];
            iArr3[i2] = new int[i3];
        }
        int length4 = clonVarArr.length;
        int[] iArr4 = new int[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            iArr4[i4] = clonVarArr[i4].s();
        }
        int i5 = 0;
        while (i5 < trackGroupArray.b) {
            TrackGroup a = trackGroupArray.a(i5);
            int g = cmnf.g(a.a(i).l);
            int length5 = clonVarArr.length;
            int i6 = 0;
            int i7 = 0;
            boolean z = true;
            while (true) {
                length2 = clonVarArr.length;
                if (i6 >= length2) {
                    break;
                }
                clon clonVar = clonVarArr[i6];
                TrackGroupArray trackGroupArray2 = trackGroupArray;
                int i8 = 0;
                for (int i9 = 0; i9 < a.a; i9++) {
                    i8 = Math.max(i8, clom.a(clonVar.N(a.a(i9))));
                }
                boolean z2 = iArr2[i6] == 0;
                if (i8 > i7) {
                    i7 = i8;
                    z = z2;
                    length5 = i6;
                } else if (i8 == i7 && g == 5 && !z && z2) {
                    i7 = i8;
                    length5 = i6;
                    z = true;
                }
                i6++;
                trackGroupArray = trackGroupArray2;
            }
            TrackGroupArray trackGroupArray3 = trackGroupArray;
            if (length5 == length2) {
                iArr = new int[a.a];
            } else {
                clon clonVar2 = clonVarArr[length5];
                int[] iArr5 = new int[a.a];
                for (int i10 = 0; i10 < a.a; i10++) {
                    iArr5[i10] = clonVar2.N(a.a(i10));
                }
                iArr = iArr5;
            }
            int i11 = iArr2[length5];
            trackGroupArr[length5][i11] = a;
            iArr3[length5][i11] = iArr;
            iArr2[length5] = i11 + 1;
            i5++;
            trackGroupArray = trackGroupArray3;
            i = 0;
        }
        int length6 = clonVarArr.length;
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[length6];
        String[] strArr = new String[length6];
        int[] iArr6 = new int[length6];
        int i12 = 0;
        while (true) {
            length = clonVarArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = iArr2[i12];
            trackGroupArrayArr[i12] = new TrackGroupArray((TrackGroup[]) cmny.e(trackGroupArr[i12], i13));
            iArr3[i12] = (int[][]) cmny.e(iArr3[i12], i13);
            strArr[i12] = clonVarArr[i12].J();
            iArr6[i12] = clonVarArr[i12].a();
            i12++;
        }
        new TrackGroupArray((TrackGroup[]) cmny.e(trackGroupArr[length], iArr2[length]));
        cmjj cmjjVar = new cmjj(iArr6, trackGroupArrayArr);
        Pair<cloo[], cmjm[]> d = ((cmjk) cmjqVar).d(cmjjVar, iArr3, iArr4);
        cmjr cmjrVar = new cmjr((cloo[]) d.first, (cmjm[]) d.second, cmjjVar);
        for (cmjm cmjmVar : cmjrVar.c.b()) {
        }
        return cmjrVar;
    }
}
