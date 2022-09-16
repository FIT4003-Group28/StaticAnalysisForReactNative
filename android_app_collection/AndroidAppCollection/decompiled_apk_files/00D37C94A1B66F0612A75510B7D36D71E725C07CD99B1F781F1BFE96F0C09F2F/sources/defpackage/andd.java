package defpackage;

import java.util.Collections;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: andd  reason: default package */
/* loaded from: classes.dex */
public final class andd {
    public static final Comparator a = new ahdo(4);
    public static final andd b = new andd(new andb(Collections.emptyList()));
    public final andb c;

    private andd(andb andbVar) {
        this.c = andbVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof andd) && ((andd) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ (-1);
    }

    public final String toString() {
        return this.c.toString();
    }
}
