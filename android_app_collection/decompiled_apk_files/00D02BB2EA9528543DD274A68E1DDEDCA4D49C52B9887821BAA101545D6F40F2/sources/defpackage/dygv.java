package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: dygv  reason: default package */
/* loaded from: classes6.dex */
public final class dygv {
    public final List<dyfw> a;
    private final dyel b;
    private final Object[][] c;

    public dygv(List<dyfw> list, dyel dyelVar, Object[][] objArr) {
        dbsk.t(list, "addresses are not set");
        this.a = list;
        dbsk.t(dyelVar, "attrs");
        this.b = dyelVar;
        this.c = objArr;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("addrs", this.a);
        b.b("attrs", this.b);
        b.b("customOptions", Arrays.deepToString(this.c));
        return b.toString();
    }
}
