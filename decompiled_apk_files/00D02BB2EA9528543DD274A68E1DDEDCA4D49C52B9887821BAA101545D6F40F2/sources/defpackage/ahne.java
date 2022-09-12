package defpackage;

import defpackage.ahnc;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahne  reason: default package */
/* loaded from: classes.dex */
public class ahne<T extends ahnc> {
    @dzsi
    public final T a;

    public ahne(@dzsi T t) {
        this.a = t;
    }

    @dzsi
    public T a() {
        return this.a;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        return dbsd.a(this.a, ((ahne) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("location", a());
        return b.toString();
    }
}
