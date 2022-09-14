package defpackage;

import java.io.Serializable;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ddbc  reason: default package */
/* loaded from: classes5.dex */
public abstract class ddbc implements Iterable<Integer>, Serializable {
    public static int c(double d) {
        return decl.b((long) d);
    }

    public static void d(int i) {
        dbsk.a(i > 0);
    }

    public static ddbc e(int i, int i2) {
        return new ddaz(i, i2);
    }

    public boolean a(int i) {
        return b(i) >= 0;
    }

    public abstract int b(int i);

    public final int f(int i) {
        if (!a(i)) {
            return -1;
        }
        return b(i);
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new dday(this, dbug.b).iterator();
    }
}
