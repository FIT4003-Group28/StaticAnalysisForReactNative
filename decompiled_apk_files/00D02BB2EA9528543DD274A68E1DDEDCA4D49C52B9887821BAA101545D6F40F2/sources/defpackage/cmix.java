package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cmix  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmix implements cmjm {
    private final Format[] a;
    protected final TrackGroup b;
    protected final int c;
    protected final int[] d;
    private int e;

    public cmix(TrackGroup trackGroup, int... iArr) {
        int length = iArr.length;
        cmmn.c(length > 0);
        cmmn.f(trackGroup);
        this.b = trackGroup;
        this.c = length;
        this.a = new Format[length];
        for (int i = 0; i < iArr.length; i++) {
            this.a[i] = trackGroup.a(iArr[i]);
        }
        Arrays.sort(this.a, cmiw.a);
        this.d = new int[this.c];
        for (int i2 = 0; i2 < this.c; i2++) {
            int[] iArr2 = this.d;
            Format format = this.a[i2];
            int i3 = 0;
            while (true) {
                Format[] formatArr = trackGroup.b;
                if (i3 >= formatArr.length) {
                    i3 = -1;
                    break;
                } else if (format == formatArr[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
            iArr2[i2] = i3;
        }
    }

    @Override // defpackage.cmjm
    public final TrackGroup c() {
        return this.b;
    }

    @Override // defpackage.cmjm
    public final int d() {
        return this.d.length;
    }

    @Override // defpackage.cmjm
    public final Format e(int i) {
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cmix cmixVar = (cmix) obj;
            if (this.b == cmixVar.b && Arrays.equals(this.d, cmixVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cmjm
    public final int f(int i) {
        return this.d[i];
    }

    @Override // defpackage.cmjm
    public final Format g() {
        return this.a[a()];
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.b) * 31) + Arrays.hashCode(this.d);
            this.e = identityHashCode;
            return identityHashCode;
        }
        return i;
    }
}
