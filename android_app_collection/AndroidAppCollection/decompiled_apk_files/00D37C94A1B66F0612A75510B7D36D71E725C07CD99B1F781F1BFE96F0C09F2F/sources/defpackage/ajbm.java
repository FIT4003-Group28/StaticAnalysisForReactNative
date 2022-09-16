package defpackage;

import android.text.TextUtils;
import java.util.UUID;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: ajbm  reason: default package */
/* loaded from: classes.dex */
public class ajbm {
    public final ajbl n;
    public final ajbl o;
    public final String p;
    public final int q;

    public ajbm(long j, long j2, int i, String str) {
        aqxo.p(j <= j2);
        this.n = new ajbl(this, 1, j);
        this.o = new ajbl(this, 2, j2);
        this.q = i;
        this.p = TextUtils.isEmpty(str) ? UUID.randomUUID().toString() : str;
    }

    public static ajbl r(long j) {
        return new ajbm(j, j, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, "\u0000").n;
    }

    public final long p() {
        return this.o.a;
    }

    public final long q() {
        return this.n.a;
    }

    public final boolean s(long j) {
        if (j >= q()) {
            if (j < p()) {
                return true;
            }
            if (j == p() && q() == p()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String l = Long.toString(q());
        String l2 = Long.toString(p());
        String str = q() == p() ? "]" : ")";
        StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 11 + String.valueOf(l2).length() + str.length());
        sb.append("Interval[");
        sb.append(l);
        sb.append(", ");
        sb.append(l2);
        sb.append(str);
        return sb.toString();
    }
}
