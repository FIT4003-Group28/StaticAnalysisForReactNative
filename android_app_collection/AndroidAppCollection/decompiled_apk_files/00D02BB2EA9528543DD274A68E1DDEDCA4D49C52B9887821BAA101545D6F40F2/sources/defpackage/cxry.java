package defpackage;

import android.content.Context;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousDataLayer;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.android.libraries.social.populous.android.AndroidLibAutocompleteSession;
import com.google.android.libraries.social.populous.core.ClientId;
import com.google.android.libraries.social.populous.core.SessionContext;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cxry  reason: default package */
/* loaded from: classes5.dex */
public final class cxry implements cxrj {
    private final cydz[] a;
    private final cyhd b;
    private Boolean c;

    public cxry(cydz[] cydzVarArr, cyhd cyhdVar) {
        this.a = cydzVarArr;
        this.b = cyhdVar;
    }

    private final synchronized boolean d(Context context, int i) {
        if (this.c == null) {
            cxsg.a(context);
            boolean z = true;
            if (!cxsg.h.f().booleanValue() && i != 55) {
                z = false;
            }
            this.c = Boolean.valueOf(z);
        }
        return this.c.booleanValue();
    }

    @Override // defpackage.cxrj
    public final /* bridge */ /* synthetic */ PeopleKitDataLayer a(Context context, ExecutorService executorService, PeopleKitConfig peopleKitConfig, cxqo cxqoVar) {
        cybo c = c(context, peopleKitConfig, executorService);
        cydz e = e(peopleKitConfig.t());
        cygq f = SessionContext.f();
        ((cybs) f).a = dbsg.j(peopleKitConfig.c());
        AndroidLibAutocompleteSession a = c.a(context, e, f.f(), null);
        cxrx cxrxVar = new cxrx();
        cxrxVar.b = c;
        cxrxVar.a = a;
        cxrxVar.c = new cxsc(context, executorService, c, peopleKitConfig, d(context, peopleKitConfig.t()));
        cxrxVar.d = peopleKitConfig;
        cxrxVar.e = cxqoVar;
        cxrxVar.f = d(context, peopleKitConfig.t());
        dbsk.s(cxrxVar.a);
        dbsk.s(cxrxVar.b);
        return new PopulousDataLayer(cxrxVar);
    }

    @Override // defpackage.cxrj
    public final void b(Context context, PeopleKitConfig peopleKitConfig, ExecutorService executorService) {
        cxsg.a(context);
        c(context, peopleKitConfig, executorService).b(e(((PeopleKitConfigImpl) peopleKitConfig).c));
    }

    public final cybo c(Context context, PeopleKitConfig peopleKitConfig, ExecutorService executorService) {
        cybl cyblVar = new cybl();
        cyblVar.e(peopleKitConfig.a(), dbsj.d(peopleKitConfig.b()) ? "com.google" : peopleKitConfig.b());
        cyblVar.f(context.getApplicationContext());
        cyblVar.g(e(peopleKitConfig.t()));
        cyblVar.i = true;
        cyblVar.e = executorService;
        cyblVar.g = this.b;
        cyblVar.o = d(context, peopleKitConfig.t());
        return cyblVar.d();
    }

    private final cydz e(int i) {
        ClientId clientId;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 14) {
                clientId = ClientId.c;
            } else if (i2 == 18) {
                clientId = ClientId.e;
            } else if (i2 == 24) {
                clientId = ClientId.i;
            } else if (i2 == 27) {
                clientId = ClientId.l;
            } else if (i2 == 31) {
                clientId = ClientId.k;
            } else if (i2 == 36) {
                clientId = ClientId.g;
            } else if (i2 == 39) {
                clientId = ClientId.h;
            } else if (i2 == 42) {
                clientId = ClientId.j;
            } else if (i2 == 43) {
                clientId = ClientId.b;
            } else if (i2 == 53) {
                clientId = ClientId.n;
            } else if (i2 == 54) {
                clientId = ClientId.m;
            } else {
                clientId = ClientId.d;
            }
            cydz[] cydzVarArr = this.a;
            for (int i3 = 0; i3 < 3; i3++) {
                cydz cydzVar = cydzVarArr[i3];
                if (cydzVar.a().equals(clientId)) {
                    return cydzVar;
                }
            }
            StringBuilder sb = new StringBuilder(59);
            sb.append("Populous client config not found for Client Id: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        throw null;
    }
}
