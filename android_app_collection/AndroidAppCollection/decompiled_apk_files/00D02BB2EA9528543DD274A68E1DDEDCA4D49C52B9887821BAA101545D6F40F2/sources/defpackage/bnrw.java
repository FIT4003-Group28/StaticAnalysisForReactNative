package defpackage;

import com.google.android.filament.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bnrw  reason: default package */
/* loaded from: classes.dex */
public final class bnrw implements Comparable<bnrw> {
    public static final bnrw e = new bnrw(0, 0, 0, 0);
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bnrw(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(bnrw bnrwVar) {
        if (bnrwVar != null) {
            long j = this.a;
            long j2 = bnrwVar.a;
            if (j < j2) {
                return -1;
            }
            if (j != j2) {
                return 1;
            }
            long j3 = this.b;
            long j4 = bnrwVar.b;
            if (j3 < j4) {
                return -1;
            }
            if (j3 != j4) {
                return 1;
            }
            long j5 = this.c;
            long j6 = bnrwVar.c;
            if (j5 < j6) {
                return -1;
            }
            return j5 == j6 ? 0 : 1;
        }
        return 1;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof bnrw)) {
            return false;
        }
        bnrw bnrwVar = (bnrw) obj;
        return this.a == bnrwVar.a && this.b == bnrwVar.b && this.c == bnrwVar.c && this.d == bnrwVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_windowFixedHeightMajor);
        sb.append("[plane: ");
        sb.append(j);
        sb.append(", grade: ");
        sb.append(j2);
        sb.append(", within grade: ");
        sb.append(j3);
        sb.append(", id: ");
        sb.append(j4);
        sb.append("]");
        return sb.toString();
    }
}
