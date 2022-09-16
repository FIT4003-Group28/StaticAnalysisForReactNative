package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: oys  reason: default package */
/* loaded from: classes4.dex */
final class oys extends oyu {
    public final long a;
    public final List b;
    public final List c;

    public oys(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final oys a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            oys oysVar = (oys) this.c.get(i2);
            if (oysVar.aQ == i) {
                return oysVar;
            }
        }
        return null;
    }

    public final oyt b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            oyt oytVar = (oyt) this.b.get(i2);
            if (oytVar.aQ == i) {
                return oytVar;
            }
        }
        return null;
    }

    public final void c(oys oysVar) {
        this.c.add(oysVar);
    }

    public final void d(oyt oytVar) {
        this.b.add(oytVar);
    }

    @Override // defpackage.oyu
    public final String toString() {
        String g = g(this.aQ);
        String arrays = Arrays.toString(this.b.toArray(new oyt[0]));
        String arrays2 = Arrays.toString(this.c.toArray(new oys[0]));
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
