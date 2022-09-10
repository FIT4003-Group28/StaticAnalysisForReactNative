package defpackage;

import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: bugo  reason: default package */
/* loaded from: classes.dex */
public final class bugo implements bugn {
    private final dxio<bugk> a;
    private final Map<String, Runnable> b = new ConcurrentHashMap();

    public bugo(dxio<bugk> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.bugn
    public final void a(String str) {
        Runnable remove = this.b.remove(str);
        if (remove != null) {
            remove.run();
        }
    }

    @Override // defpackage.bugn
    public final void b(String str) {
        if (str != null) {
            this.b.remove(str);
            bugk a = this.a.a();
            try {
                bcl bclVar = a.a;
                ((bdn) bclVar).k.a(bha.b(str, (bdn) bclVar, true));
            } catch (RuntimeException e) {
                a.b.a(11, e);
            }
        }
    }

    @Override // defpackage.bugn
    public final String c(Runnable runnable) {
        bugk bugkVar;
        dehn a;
        String uuid = UUID.randomUUID().toString();
        this.b.put(uuid, runnable);
        try {
            final bugk a2 = this.a.a();
            try {
                bbo bboVar = new bbo();
                bboVar.e("worker_name_key", "LowPriorityRequestTaskServiceWorker");
                bboVar.e("taskId", uuid);
                bbp a3 = bboVar.a();
                bbk bbkVar = new bbk();
                bbkVar.c = 2;
                bbkVar.a = false;
                final bcb f = new bca(GmmWorkerWrapper.class).d("SEND_LOW_PRIORITY_REQUESTS").c(a3).b(bbkVar.a()).f();
                a = deew.h(a2.a.d(uuid, 2, f).a(), new dbrn(a2, f) { // from class: bugj
                    private final bugk a;
                    private final bcb b;

                    {
                        this.a = a2;
                        this.b = f;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        bugk bugkVar2 = this.a;
                        try {
                            return this.b.a;
                        } catch (RuntimeException e) {
                            bugkVar2.b.c(11, e);
                            return bbx.c();
                        }
                    }
                }, cjh.b);
            } catch (RuntimeException e) {
                bugkVar.b.c(11, e);
                a = deha.a(bbx.c());
            }
            a.get();
        } catch (InterruptedException | ExecutionException unused) {
            this.b.remove(uuid);
        }
        return uuid;
    }
}
