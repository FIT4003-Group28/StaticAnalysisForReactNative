package defpackage;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: puw  reason: default package */
/* loaded from: classes4.dex */
public abstract class puw implements pvf {
    protected final TrackGroup a;
    protected final int b;
    public final int[] c;
    private final Format[] d;
    private final long[] e;
    private int f;

    public puw(TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, null);
    }

    @Override // defpackage.pvf
    public int a(long j, List list) {
        return list.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            puw puwVar = (puw) obj;
            if (this.a == puwVar.a && Arrays.equals(this.c, puwVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pvf
    public void f() {
    }

    @Override // defpackage.pvf
    public void g() {
    }

    @Override // defpackage.pvf
    public void h(float f) {
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
            this.f = identityHashCode;
            return identityHashCode;
        }
        return i;
    }

    @Override // defpackage.pvj
    public final int j(int i) {
        return this.c[i];
    }

    @Override // defpackage.pvj
    public final int k(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.pvj
    public final int l(Format format) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == format) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.pvj
    public final int m() {
        return this.c.length;
    }

    @Override // defpackage.pvj
    public final Format n(int i) {
        return this.d[i];
    }

    @Override // defpackage.pvf
    public final Format o() {
        return this.d[b()];
    }

    @Override // defpackage.pvj
    public final TrackGroup p() {
        return this.a;
    }

    @Override // defpackage.pvf
    public boolean q(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean r = r(i, elapsedRealtime);
        int i2 = 0;
        while (true) {
            if (i2 < this.b) {
                if (r) {
                    break;
                }
                r = i2 != i && !r(i2, elapsedRealtime);
                i2++;
            } else if (!r) {
                return false;
            }
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], pxi.ac(elapsedRealtime, j));
        return true;
    }

    @Override // defpackage.pvf
    public boolean r(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.pvf
    public final /* synthetic */ void s() {
    }

    public puw(TrackGroup trackGroup, int[] iArr, byte[] bArr) {
        int length = iArr.length;
        ptx.e(length > 0);
        ptx.a(trackGroup);
        this.a = trackGroup;
        this.b = length;
        this.d = new Format[length];
        for (int i = 0; i < iArr.length; i++) {
            this.d[i] = trackGroup.a(iArr[i]);
        }
        Arrays.sort(this.d, fay.j);
        this.c = new int[this.b];
        int i2 = 0;
        while (true) {
            int i3 = this.b;
            if (i2 >= i3) {
                this.e = new long[i3];
                return;
            }
            int[] iArr2 = this.c;
            Format format = this.d[i2];
            int i4 = 0;
            while (true) {
                Format[] formatArr = trackGroup.b;
                if (i4 >= formatArr.length) {
                    i4 = -1;
                    break;
                } else if (format == formatArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            iArr2[i2] = i4;
            i2++;
        }
    }
}
