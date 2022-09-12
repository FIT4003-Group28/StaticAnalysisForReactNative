package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: clwx  reason: default package */
/* loaded from: classes5.dex */
final class clwx extends clwz {
    public final long a;
    public final List<clwy> b;
    public final List<clwx> c;

    public clwx(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void a(clwy clwyVar) {
        this.b.add(clwyVar);
    }

    public final void b(clwx clwxVar) {
        this.c.add(clwxVar);
    }

    public final clwy c(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            clwy clwyVar = this.b.get(i2);
            if (clwyVar.d == i) {
                return clwyVar;
            }
        }
        return null;
    }

    public final clwx d(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            clwx clwxVar = this.c.get(i2);
            if (clwxVar.d == i) {
                return clwxVar;
            }
        }
        return null;
    }

    @Override // defpackage.clwz
    public final String toString() {
        String g = g(this.d);
        String arrays = Arrays.toString(this.b.toArray());
        String arrays2 = Arrays.toString(this.c.toArray());
        int length = String.valueOf(g).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(g);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
