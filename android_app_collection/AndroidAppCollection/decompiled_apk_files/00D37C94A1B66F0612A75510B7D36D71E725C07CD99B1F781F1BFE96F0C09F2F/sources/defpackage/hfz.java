package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: hfz  reason: default package */
/* loaded from: classes3.dex */
public final class hfz {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public auuo c;
    public Long d;
    public Long e;

    public final ampq a(long j) {
        if (this.a.isEmpty()) {
            return amon.a;
        }
        int binarySearch = Collections.binarySearch(this.a, Long.valueOf(j));
        if (binarySearch >= 0) {
            return ampq.j((Long) this.a.get(binarySearch));
        }
        int i = -(binarySearch + 1);
        if (i == this.a.size()) {
            i--;
        }
        long abs = Math.abs(j - ((Long) this.a.get(i)).longValue());
        int i2 = i - 1;
        if (i2 >= 0) {
            long abs2 = Math.abs(j - ((Long) this.a.get(i2)).longValue());
            if (abs2 <= 10000 && abs2 <= abs) {
                return ampq.j((Long) this.a.get(i2));
            }
        }
        return abs <= 10000 ? ampq.j((Long) this.a.get(i)) : amon.a;
    }

    public final ampq b() {
        return ampq.i(this.d);
    }

    public final void c(auup auupVar) {
        this.a.clear();
        if ((auupVar.b & 1) != 0) {
            auuo auuoVar = auupVar.c;
            if (auuoVar == null) {
                auuoVar = auuo.a;
            }
            this.c = auuoVar;
            this.a.add(Long.valueOf(auuoVar.c));
        }
        if (auupVar.d.size() > 0) {
            for (auuo auuoVar2 : auupVar.d) {
                if ((auuoVar2.b & 1) != 0) {
                    this.a.add(Long.valueOf(auuoVar2.c));
                }
                if (!auuoVar2.equals(this.c)) {
                    this.b.add(auuoVar2);
                }
            }
        }
        Collections.sort(this.a);
    }
}
