package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: axzz  reason: default package */
/* loaded from: classes2.dex */
public final class axzz {
    public final List a;
    private final axyb b;
    private final Object[][] c;

    public axzz(List list, axyb axybVar, Object[][] objArr) {
        list.getClass();
        this.a = list;
        axybVar.getClass();
        this.b = axybVar;
        this.c = objArr;
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("addrs", this.a);
        c.b("attrs", this.b);
        c.b("customOptions", Arrays.deepToString(this.c));
        return c.toString();
    }
}
