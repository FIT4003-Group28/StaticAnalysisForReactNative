package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cvpc  reason: default package */
/* loaded from: classes5.dex */
public final class cvpc {
    private final cvoe a;
    private final cvmd b;
    private final dxio<Map<Integer, cvos>> c;
    private final cvmy d;

    public cvpc(cvmy cvmyVar, cvoe cvoeVar, cvmd cvmdVar, dxio dxioVar) {
        this.d = cvmyVar;
        this.a = cvoeVar;
        this.b = cvmdVar;
        this.c = dxioVar;
    }

    public final void a(cvlm cvlmVar) {
        if (cvlmVar.d().isEmpty()) {
            return;
        }
        if (cvlmVar.i() == 1) {
            if (this.c.a().containsKey(Integer.valueOf(cvlmVar.a()))) {
                this.c.a().get(Integer.valueOf(cvlmVar.a())).a(cvlmVar);
            } else {
                cvlw.b("SystemTrayUserEventHelper", "No handler installed for system tray events of type %s", Integer.valueOf(cvlmVar.a()));
            }
        }
        ArrayList arrayList = new ArrayList(cvlmVar.d().size());
        for (int i = 0; i < cvlmVar.d().size(); i++) {
            arrayList.add(cvlmVar.d().get(i).a());
        }
        this.b.b(cvlmVar.c(), arrayList, cvlmVar.e(), cvlmVar.i(), cvlmVar.j());
        if (cvlmVar.i() == 4 || dsef.f.equals(cvlmVar.e())) {
            return;
        }
        if (cvlmVar.c() != null) {
            cvoe cvoeVar = this.a;
            cvkc c = cvlmVar.c();
            dsef e = cvlmVar.e();
            String b = cvlmVar.b();
            int i2 = cvlmVar.i();
            List<dsbc> u = cvkj.u(cvlmVar.d());
            cvnn cvnnVar = ((cvog) cvoeVar).a;
            boolean z = c != null;
            czhz.c();
            dbsk.a(z);
            dbsk.a(!u.isEmpty());
            String b2 = c.b();
            for (dsbc dsbcVar : u) {
                cvtf bZ = cvtg.f.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cvtg cvtgVar = (cvtg) bZ.b;
                dsbcVar.getClass();
                cvtgVar.b();
                cvtgVar.b.add(dsbcVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cvtg cvtgVar2 = (cvtg) bZ.b;
                e.getClass();
                cvtgVar2.c = e;
                int i3 = cvtgVar2.a | 1;
                cvtgVar2.a = i3;
                b.getClass();
                cvtgVar2.a = i3 | 4;
                cvtgVar2.e = b;
                int i4 = i2 - 1;
                if (i2 != 0) {
                    int i5 = 3;
                    if (i4 == 0) {
                        i5 = 2;
                    } else if (i4 != 1) {
                        i5 = i4 != 2 ? 1 : 4;
                    }
                    cvtg cvtgVar3 = (cvtg) bZ.b;
                    cvtgVar3.d = i5 - 1;
                    cvtgVar3.a |= 2;
                    ((cvnu) cvnnVar).d.a(b2, 100, bZ.bK().bS());
                } else {
                    throw null;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b2);
            cvnt a = ((cvnu) cvnnVar).h.a();
            try {
                ((cvnu) cvnnVar).c.b(c, 100, "RPC_BATCH_UPDATE_THREAD_STATE", bundle, 5000L);
                return;
            } catch (cvno unused) {
                cvlw.f("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_BATCH_UPDATE_THREAD_STATE");
                a.d(bundle);
                return;
            }
        }
        for (cvkj cvkjVar : cvlmVar.d()) {
            if (!TextUtils.isEmpty(cvkjVar.i())) {
                cvmy cvmyVar = this.d;
                String i6 = cvkjVar.i();
                dsef e2 = cvlmVar.e();
                drzx bZ2 = drzy.d.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                drzy drzyVar = (drzy) bZ2.b;
                i6.getClass();
                int i7 = drzyVar.a | 1;
                drzyVar.a = i7;
                drzyVar.b = i6;
                e2.getClass();
                drzyVar.c = e2;
                drzyVar.a = i7 | 2;
                drzy bK = bZ2.bK();
                cvty<dsaa> j = cvmyVar.b.j(bK);
                cvmyVar.a(null, j, 18);
                cvmr.f(bK, j);
            }
        }
    }
}
