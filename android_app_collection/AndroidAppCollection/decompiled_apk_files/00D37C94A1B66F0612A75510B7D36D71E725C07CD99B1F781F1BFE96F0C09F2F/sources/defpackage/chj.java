package defpackage;

import java.util.Map;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chj  reason: default package */
/* loaded from: classes2.dex */
public final class chj implements cil {
    public final chb a;
    public cik b;
    private final chi c;
    private final cnf d;

    public chj(chi chiVar, chb chbVar, cnf cnfVar) {
        this.c = chiVar;
        this.a = chbVar;
        this.d = cnfVar;
    }

    @Override // defpackage.cil
    public final Class a() {
        return this.a.a();
    }

    @Override // defpackage.cil
    public final void b() {
        chf chfVar;
        UrlRequest urlRequest;
        chi chiVar = this.c;
        cnf cnfVar = this.d;
        synchronized (chiVar) {
            chfVar = (chf) chiVar.d.get(cnfVar);
        }
        if (chfVar != null) {
            synchronized (chfVar.g) {
                chfVar.a.remove(this);
                if (chfVar.a.isEmpty()) {
                    chfVar.e = true;
                    chfVar.g.d.remove(chfVar.b);
                }
            }
            if (!chfVar.e || (urlRequest = chfVar.d) == null) {
                return;
            }
            urlRequest.cancel();
        }
    }

    @Override // defpackage.cil
    public final void c() {
    }

    @Override // defpackage.cil
    public final void d(cfv cfvVar, cik cikVar) {
        chf chfVar;
        boolean z;
        this.b = cikVar;
        chi chiVar = this.c;
        cnf cnfVar = this.d;
        synchronized (chiVar) {
            chfVar = (chf) chiVar.d.get(cnfVar);
            if (chfVar == null) {
                chfVar = chiVar.c.a(cnfVar);
                chiVar.d.put(cnfVar, chfVar);
                z = true;
            } else {
                z = false;
            }
            synchronized (chfVar.g) {
                chfVar.a.add(this);
            }
        }
        if (z) {
            chfVar.c = cfvVar;
            ajnp ajnpVar = chiVar.e;
            String c = cnfVar.c();
            int intValue = ((Integer) chi.a.get(cfvVar)).intValue();
            Map d = cnfVar.d();
            UrlRequest.Builder mo568setPriority = ((CronetEngine) ajnpVar.a.get()).mo551newUrlRequestBuilder(c, chfVar, anjk.a).mo564allowDirectExecutor().mo568setPriority(intValue);
            for (Map.Entry entry : d.entrySet()) {
                String str = (String) entry.getKey();
                if (!"Accept-Encoding".equalsIgnoreCase(str) && !"User-Agent".equalsIgnoreCase(str)) {
                    mo568setPriority.mo563addHeader((String) entry.getKey(), (String) entry.getValue());
                }
            }
            chfVar.d = mo568setPriority.mo565build();
            chfVar.d.start();
            if (!chfVar.e) {
                return;
            }
            chfVar.d.cancel();
        }
    }

    @Override // defpackage.cil
    public final int e() {
        return 2;
    }
}
