package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: cvjj  reason: default package */
/* loaded from: classes5.dex */
public final class cvjj implements cvji {
    private final cvnn a;
    private final cvkf b;

    public cvjj(cvnn cvnnVar, cvkf cvkfVar) {
        this.a = cvnnVar;
        this.b = cvkfVar;
    }

    @Override // defpackage.cvji
    public final synchronized void a(String str, List<String> list) {
        czhz.c();
        if (TextUtils.isEmpty(str)) {
            cviw.c(new IllegalArgumentException("Account name must not be empty."));
        } else if (list == null || list.isEmpty()) {
            cviw.c(new IllegalArgumentException("List of topics can't be null/empty."));
        } else {
            try {
                cvkc b = this.b.b(str);
                ArrayList<String> arrayList = new ArrayList(new TreeSet(list));
                cvlw.a("ChimeTopicsApiImpl", "CreateUserSubscription scheduled for account: [%s], topics: [%s].", str, TextUtils.join(",", arrayList));
                cvnn cvnnVar = this.a;
                boolean z = b != null;
                czhz.c();
                dbsk.a(z);
                dbsk.a(!arrayList.isEmpty());
                String b2 = b.b();
                Bundle bundle = new Bundle();
                bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b2);
                for (String str2 : arrayList) {
                    ((cvnu) cvnnVar).d.a(b2, 3, str2.getBytes(cvnu.a));
                }
                cvnw a = ((cvnu) cvnnVar).i.a();
                try {
                    ((cvnu) cvnnVar).c.a(b, 3, "RPC_CREATE_USER_SUBSCRIPTION", bundle);
                } catch (cvno unused) {
                    cvlw.f("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_CREATE_USER_SUBSCRIPTION");
                    a.d(bundle);
                }
                cviw cviwVar = cviw.a;
            } catch (cvke e) {
                cviw.c(e);
            }
        }
    }

    @Override // defpackage.cvji
    public final synchronized void b(String str, List<String> list) {
        czhz.c();
        if (TextUtils.isEmpty(str)) {
            cviw.c(new IllegalArgumentException("Account name must not be empty."));
        } else if (list == null || list.isEmpty()) {
            cviw.c(new IllegalArgumentException("List of topics can't be null/empty."));
        } else {
            try {
                cvkc b = this.b.b(str);
                ArrayList<String> arrayList = new ArrayList(new TreeSet(list));
                cvlw.a("ChimeTopicsApiImpl", "DeleteUserSubscription scheduled for account: [%s], topics: [%s].", str, TextUtils.join(",", arrayList));
                cvnn cvnnVar = this.a;
                boolean z = b != null;
                czhz.c();
                dbsk.a(z);
                dbsk.a(!arrayList.isEmpty());
                String b2 = b.b();
                Bundle bundle = new Bundle();
                bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b2);
                for (String str2 : arrayList) {
                    ((cvnu) cvnnVar).d.a(b2, 4, str2.getBytes(cvnu.a));
                }
                cvnx a = ((cvnu) cvnnVar).j.a();
                try {
                    ((cvnu) cvnnVar).c.a(b, 4, "RPC_DELETE_USER_SUBSCRIPTION", bundle);
                } catch (cvno unused) {
                    cvlw.f("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_DELETE_USER_SUBSCRIPTION");
                    a.d(bundle);
                }
                cviw cviwVar = cviw.a;
            } catch (cvke e) {
                cviw.c(e);
            }
        }
    }
}
