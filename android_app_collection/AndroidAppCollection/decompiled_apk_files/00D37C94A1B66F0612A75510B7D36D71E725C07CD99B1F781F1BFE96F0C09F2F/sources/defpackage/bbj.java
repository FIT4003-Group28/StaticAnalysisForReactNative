package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbj  reason: default package */
/* loaded from: classes2.dex */
final class bbj extends bbl {
    public final long a;
    public final List b;
    public final List c;

    public bbj(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final bbj a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            bbj bbjVar = (bbj) this.c.get(i2);
            if (bbjVar.d == i) {
                return bbjVar;
            }
        }
        return null;
    }

    public final bbk b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            bbk bbkVar = (bbk) this.b.get(i2);
            if (bbkVar.d == i) {
                return bbkVar;
            }
        }
        return null;
    }

    public final void c(bbj bbjVar) {
        this.c.add(bbjVar);
    }

    public final void d(bbk bbkVar) {
        this.b.add(bbkVar);
    }

    @Override // defpackage.bbl
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
