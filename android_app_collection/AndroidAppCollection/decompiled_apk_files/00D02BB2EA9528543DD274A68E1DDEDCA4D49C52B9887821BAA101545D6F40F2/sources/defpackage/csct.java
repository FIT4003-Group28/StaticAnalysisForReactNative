package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: csct  reason: default package */
/* loaded from: classes5.dex */
public final class csct {
    public final Context a;
    public final cscq b;
    public Collection<ckyq> c;
    public final Object d;
    public final ckyk e;
    public final ckyh f;
    @dzsi
    public brlc g;

    public csct(Context context, btso btsoVar) {
        cscq cscqVar = new cscq(context, btsoVar);
        this.c = new ArrayList();
        this.d = new Object();
        this.e = new cscr(this);
        this.f = new cscs(this);
        this.a = context;
        this.b = cscqVar;
    }

    public static dbsg<Long> a(@dzsi Bundle bundle) {
        if (bundle == null) {
            return dbpy.a;
        }
        long j = bundle.getLong("handover-session-id", -1L);
        return j != -1 ? dbsg.i(Long.valueOf(j)) : dbpy.a;
    }

    public final void b(ckyq ckyqVar) {
        synchronized (this.d) {
            cscq cscqVar = this.b;
            synchronized (cscqVar.e) {
                dbsk.t(cscqVar.c, "connect() must be called before onGenericClientEvent().");
                ckyj ckyjVar = cscqVar.g;
                if (ckyjVar != null) {
                    try {
                        ckyjVar.e(ckyqVar.bS());
                        int i = ckyqVar.b;
                    } catch (RemoteException e) {
                        e.toString();
                    }
                }
                this.c.add(ckyqVar);
            }
        }
    }

    public final void c(int i) {
        ckyp ckypVar = (ckyp) ckyq.c.bZ();
        if (ckypVar.c) {
            ckypVar.bF();
            ckypVar.c = false;
        }
        ckyq ckyqVar = (ckyq) ckypVar.b;
        ckyqVar.b = i - 1;
        ckyqVar.a |= 1;
        b((ckyq) ckypVar.bK());
    }
}
