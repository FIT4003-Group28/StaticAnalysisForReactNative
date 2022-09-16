package defpackage;

import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agbl  reason: default package */
/* loaded from: classes.dex */
public final class agbl implements yjo {
    private final azqb a;
    private final aadd b;

    public agbl(azqb azqbVar, aadd aaddVar) {
        this.a = azqbVar;
        this.b = aaddVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(yjs yjsVar, atpn atpnVar) {
        if (!d(atpnVar)) {
            try {
                yjsVar.c("notification_registration_task");
                return;
            } catch (NoSuchMethodError unused) {
                return;
            }
        }
        yjsVar.d("notification_registration_task", atpnVar.c, atpnVar.d, true, 2, false, null, null);
    }

    public static void c(aadd aaddVar, final yjs yjsVar, azqb azqbVar) {
        aaddVar.a.X(azpj.b((Executor) azqbVar.get())).V(aaku.n).B().as(new ayqb() { // from class: agbk
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                agbl.b(yjs.this, (atpn) obj);
            }
        });
    }

    private static boolean d(atpn atpnVar) {
        return atpnVar.b && atpnVar.c > 0 && atpnVar.d > 0;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        atps atpsVar = this.b.a().p;
        if (atpsVar == null) {
            atpsVar = atps.a;
        }
        atpn atpnVar = atpsVar.h;
        if (atpnVar == null) {
            atpnVar = atpn.a;
        }
        if (!d(atpnVar)) {
            return 0;
        }
        ((aget) this.a.get()).d();
        return 0;
    }
}
