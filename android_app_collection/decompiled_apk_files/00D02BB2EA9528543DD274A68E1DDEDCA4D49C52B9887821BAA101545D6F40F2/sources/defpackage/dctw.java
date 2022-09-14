package defpackage;

import java.util.Collections;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: dctw  reason: default package */
/* loaded from: classes.dex */
public final class dctw {
    public static final Comparator<Object> a = new dctp();
    public static final dctw b = new dctw(new dctu(Collections.emptyList()));
    public final dctu c;

    private dctw(dctu dctuVar) {
        this.c = dctuVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dctw) && ((dctw) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ (-1);
    }

    public final String toString() {
        return this.c.toString();
    }
}
