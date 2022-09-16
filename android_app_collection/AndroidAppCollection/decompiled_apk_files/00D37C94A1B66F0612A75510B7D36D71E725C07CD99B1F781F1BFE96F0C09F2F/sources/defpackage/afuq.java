package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: afuq  reason: default package */
/* loaded from: classes.dex */
public final class afuq {
    public final String a;
    public final boolean b;
    protected final Pair c;

    public afuq(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = new Pair(str, Boolean.valueOf(z));
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == getClass() && ((afuq) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
