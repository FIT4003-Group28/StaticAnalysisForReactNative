package defpackage;

import android.text.TextUtils;
import java.util.ArrayDeque;
/* compiled from: PG */
/* renamed from: aflp  reason: default package */
/* loaded from: classes.dex */
public final class aflp {
    final ArrayDeque a = new ArrayDeque();

    public final double a() {
        if (this.a.size() >= 4) {
            long j = ((aflo) this.a.getLast()).a - ((aflo) this.a.getFirst()).a;
            long j2 = ((aflo) this.a.getLast()).b - ((aflo) this.a.getFirst()).b;
            if (j >= 5000) {
                return (j2 * 1000) / j;
            }
        }
        return 0.0d;
    }

    public final String b() {
        if (this.a.size() < 4) {
            return "";
        }
        return TextUtils.join(".", arey.q(this.a, new fcp(((aflo) this.a.getLast()).a, 10)));
    }

    public final void c(long j, long j2) {
        aflo afloVar;
        if (this.a.isEmpty() || ((aflo) this.a.getLast()).a <= j) {
            this.a.addLast(new aflo(j, j2));
            long j3 = j - 5000;
            Object removeFirst = this.a.removeFirst();
            while (true) {
                afloVar = (aflo) removeFirst;
                if (this.a.size() <= 1 || ((aflo) this.a.peekFirst()).a >= j3) {
                    break;
                }
                removeFirst = this.a.removeFirst();
            }
            this.a.addFirst(afloVar);
            return;
        }
        afkj.d(afki.EXO, "DropFramerateAnalyzer observation skipped due to time skew");
    }

    public final void d() {
        this.a.clear();
    }

    public final boolean e(double d) {
        return d > 0.0d && a() > d;
    }
}
