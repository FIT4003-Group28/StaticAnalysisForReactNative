package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: anmu  reason: default package */
/* loaded from: classes.dex */
public final class anmu {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static anmt a(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            anmt anmtVar = (anmt) it.next();
            if (anmtVar.a()) {
                return anmtVar;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
