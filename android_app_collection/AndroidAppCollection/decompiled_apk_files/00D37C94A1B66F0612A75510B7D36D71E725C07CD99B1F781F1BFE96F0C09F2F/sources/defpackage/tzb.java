package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: tzb  reason: default package */
/* loaded from: classes4.dex */
public final class tzb {
    public final boolean a;
    private final Object b;
    private final Object c;

    private tzb(boolean z, Object obj, Object obj2) {
        this.a = z;
        this.b = obj;
        this.c = obj2;
    }

    public static tzb a(Object obj) {
        return new tzb(true, obj, null);
    }

    public static tzb b(Object obj) {
        return new tzb(false, null, obj);
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final Object c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Either was not left");
    }

    public final Object d() {
        if (f()) {
            return this.c;
        }
        throw new IllegalStateException("Either was not right");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tzb)) {
            return false;
        }
        tzb tzbVar = (tzb) obj;
        return this.a ? tzbVar.a && e(c(), tzbVar.c()) : tzbVar.f() && e(d(), tzbVar.d());
    }

    public final boolean f() {
        return !this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c});
    }

    public static boolean g(tzb tzbVar, tzb tzbVar2, Comparator comparator) {
        Object obj;
        if (tzbVar == null || !tzbVar.a || (obj = tzbVar.b) == null || tzbVar2 == null || !tzbVar2.a || tzbVar2.b == null) {
            return e(tzbVar, tzbVar2);
        }
        ArrayList arrayList = new ArrayList((Collection) obj);
        ArrayList arrayList2 = new ArrayList((Collection) tzbVar2.b);
        Collections.sort(arrayList, comparator);
        Collections.sort(arrayList2, comparator);
        return arrayList.equals(arrayList2);
    }
}
