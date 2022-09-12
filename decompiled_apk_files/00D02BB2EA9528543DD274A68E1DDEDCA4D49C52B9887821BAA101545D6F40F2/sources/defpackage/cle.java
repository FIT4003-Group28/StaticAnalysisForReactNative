package defpackage;

import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cle  reason: default package */
/* loaded from: classes5.dex */
public final class cle {
    public final List<String> a;

    public cle(clp clpVar) {
        try {
            this.a = clpVar == null ? Collections.emptyList() : clpVar.e();
        } catch (RemoteException e) {
            throw new IllegalStateException("Error querying capabilities", e);
        }
    }
}
