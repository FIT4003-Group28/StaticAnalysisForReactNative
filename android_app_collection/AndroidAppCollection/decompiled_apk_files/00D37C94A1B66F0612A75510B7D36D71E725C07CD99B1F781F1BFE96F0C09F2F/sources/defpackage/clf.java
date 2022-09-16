package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: clf  reason: default package */
/* loaded from: classes2.dex */
final class clf {
    final Object a;
    public List b;
    clf c;
    clf d;

    clf() {
        this(null);
    }

    public clf(Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }

    public final int a() {
        List list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Object b() {
        int a = a();
        if (a > 0) {
            return this.b.remove(a - 1);
        }
        return null;
    }
}
