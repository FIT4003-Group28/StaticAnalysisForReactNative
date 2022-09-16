package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: byed  reason: default package */
/* loaded from: classes4.dex */
public abstract class byed implements Serializable {
    public static byec e() {
        return new bydg();
    }

    public abstract byeb a();

    @dzsi
    public abstract byef b();

    @dzsi
    public abstract byef c();

    @dzsi
    public abstract byea d();

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof byed) {
            byed byedVar = (byed) obj;
            if (dbsd.a(a(), byedVar.a()) && dbsd.a(b(), byedVar.b()) && dbsd.a(c(), byedVar.c()) && dbsd.a(d(), byedVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c(), d()});
    }
}
