package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: pfh  reason: default package */
/* loaded from: classes4.dex */
final class pfh extends pfj {
    public final long a;
    public final List b;
    public final List c;

    public pfh(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final pfh a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            pfh pfhVar = (pfh) this.c.get(i2);
            if (pfhVar.d == i) {
                return pfhVar;
            }
        }
        return null;
    }

    public final pfi b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            pfi pfiVar = (pfi) this.b.get(i2);
            if (pfiVar.d == i) {
                return pfiVar;
            }
        }
        return null;
    }

    @Override // defpackage.pfj
    public final String toString() {
        String e = e(this.d);
        String arrays = Arrays.toString(this.b.toArray());
        String arrays2 = Arrays.toString(this.c.toArray());
        int length = String.valueOf(e).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(e);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
