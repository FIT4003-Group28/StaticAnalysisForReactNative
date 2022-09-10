package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cvog  reason: default package */
/* loaded from: classes5.dex */
public final class cvog implements cvoe {
    public final cvnn a;

    public cvog(cvnn cvnnVar) {
        this.a = cvnnVar;
    }

    @Override // defpackage.cvoe
    public final void a(cvkc cvkcVar, @dzsi Long l, int i) {
        long longValue = cvkcVar.d().longValue();
        if (longValue == 0) {
            cvlw.a("ChimeSyncHelperImpl", "SYNC request falled back to FULL_SYNC for account [%s]. Account never synced before.", cvkcVar.b());
            b(cvkcVar, i);
        } else if (l == null || longValue < l.longValue()) {
            Object[] objArr = new Object[3];
            objArr[0] = cvkcVar.b();
            objArr[1] = cvkcVar.d();
            objArr[2] = i != 3 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? "REMOTE_DELETED_MESSAGES" : "DELAYED_IMPRESSION" : "INBOX" : "GUNS_MIGRATION" : "COLLABORATOR_API_CALL" : "SYNC_INSTRUCTION";
            cvlw.a("ChimeSyncHelperImpl", "Sending SYNC request for account [%s], current sync version [%d], for reason [%s].", objArr);
            cvnn cvnnVar = this.a;
            boolean z = cvkcVar != null;
            czhz.c();
            dbsk.a(z);
            String b = cvkcVar.b();
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b);
            bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION", longValue);
            bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", i - 1);
            cvnu cvnuVar = (cvnu) cvnnVar;
            cvnz a = cvnuVar.f.a();
            if (!cvpo.d(cvnuVar.b)) {
                cvlw.a("ChimeScheduledRpcHelperImpl", "App not targeting Android O. Calling [%s] RPC in the current thread.", "RPC_FETCH_UPDATED_THREADS");
                a.d(bundle);
                return;
            }
            try {
                ((cvnu) cvnnVar).c.a(cvkcVar, 2, "RPC_FETCH_UPDATED_THREADS", bundle);
            } catch (cvno unused) {
                cvlw.f("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_FETCH_UPDATED_THREADS");
                a.d(bundle);
            }
        } else {
            cvlw.a("ChimeSyncHelperImpl", "SYNC request ignored for account [%s]. Current version [%d]. Requested version [%d].", cvkcVar.b(), cvkcVar.d(), l);
        }
    }

    @Override // defpackage.cvoe
    public final void b(cvkc cvkcVar, int i) {
        cvnn cvnnVar = this.a;
        boolean z = cvkcVar != null;
        czhz.c();
        dbsk.a(z);
        String b = cvkcVar.b();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION", 0L);
        bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", i - 1);
        cvnu cvnuVar = (cvnu) cvnnVar;
        cvny a = cvnuVar.e.a();
        if (!cvpo.d(cvnuVar.b)) {
            cvlw.a("ChimeScheduledRpcHelperImpl", "App not targeting Android O. Calling [%s] RPC in the current thread.", "RPC_FETCH_LATEST_THREADS");
            a.d(bundle);
            return;
        }
        try {
            ((cvnu) cvnnVar).c.a(cvkcVar, 2, "RPC_FETCH_LATEST_THREADS", bundle);
        } catch (cvno unused) {
            cvlw.f("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_FETCH_LATEST_THREADS");
            a.d(bundle);
        }
    }
}
