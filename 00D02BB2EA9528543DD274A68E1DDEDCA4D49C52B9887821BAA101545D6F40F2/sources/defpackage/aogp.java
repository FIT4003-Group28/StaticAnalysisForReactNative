package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aogp  reason: default package */
/* loaded from: classes2.dex */
public abstract class aogp implements Serializable {
    public static aogp c(eapg eapgVar, dbsg<eapi> dbsgVar) {
        return new aofw(eapgVar, dbsgVar);
    }

    public static aogp d(eaph eaphVar) {
        return c(eaphVar.b(), dbsg.i(eaphVar.c()));
    }

    public abstract eapg a();

    public abstract dbsg<eapi> b();

    public final dbsg<eaph> e() {
        if (b().a()) {
            eapg a = a();
            eapi b = b().b();
            if (b == null) {
                throw new IllegalArgumentException("The time must not be null");
            }
            eaok eaokVar = a.b;
            if (eaokVar != b.c) {
                throw new IllegalArgumentException("The chronology of the time does not match");
            }
            return dbsg.i(new eaph(a.a + b.b, eaokVar));
        }
        return dbpy.a;
    }
}
