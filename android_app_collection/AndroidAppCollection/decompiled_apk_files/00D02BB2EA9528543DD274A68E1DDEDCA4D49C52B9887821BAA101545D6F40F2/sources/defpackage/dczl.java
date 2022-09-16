package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dczl  reason: default package */
/* loaded from: classes5.dex */
final class dczl implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;
    private final String c;

    public dczl(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    private Object readResolve() {
        return new dczm(this.a, this.b, this.c);
    }
}
