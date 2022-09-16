package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: vws  reason: default package */
/* loaded from: classes4.dex */
public final class vws implements yjo {
    private final wac a;
    private final wal b;
    private final vzm c;
    private final azqb d;
    private final axxp e;
    private final yni f;
    private final whn g;

    public vws(wac wacVar, wal walVar, vzm vzmVar, whn whnVar, azqb azqbVar, axxp axxpVar, yni yniVar) {
        this.a = wacVar;
        this.b = walVar;
        this.c = vzmVar;
        this.g = whnVar;
        this.d = azqbVar;
        this.e = axxpVar;
        this.f = yniVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        Boolean bool;
        aqxe aqxeVar = this.e.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        if (aqxeVar.a(45354251L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45354251L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45354251L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (!bool.booleanValue()) {
            return 0;
        }
        ylr.b();
        try {
            List<AccountIdentity> h = this.a.h(this.g.b());
            if (this.a.t() && (this.a.c() instanceof AccountIdentity)) {
                ArrayList arrayList = new ArrayList(h);
                Collection.EL.removeIf(arrayList, new oll(((AccountIdentity) this.a.c()).a(), 2));
                h = arrayList;
            }
            this.c.i(h);
            for (AccountIdentity accountIdentity : h) {
                this.b.j(accountIdentity);
                this.f.d(new afvq(accountIdentity));
                for (afvr afvrVar : (Set) this.d.get()) {
                    afvrVar.b(accountIdentity);
                }
            }
            this.a.m(h);
        } catch (RemoteException | qsc | qsd unused) {
        }
        return 0;
    }
}
