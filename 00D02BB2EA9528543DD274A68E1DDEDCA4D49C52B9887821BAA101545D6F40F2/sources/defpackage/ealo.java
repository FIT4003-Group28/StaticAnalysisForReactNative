package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ealo  reason: default package */
/* loaded from: classes6.dex */
public final class ealo implements eamd {
    final /* synthetic */ eamc a;

    public ealo(eamc eamcVar) {
        this.a = eamcVar;
    }

    @Override // defpackage.eamd
    public final void a() {
        if (this.a.f.get().intValue() == 8) {
            return;
        }
        URL url = new URL(this.a.l);
        HttpURLConnection httpURLConnection = this.a.p;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.a.p = null;
        }
        this.a.p = (HttpURLConnection) url.openConnection();
        boolean z = false;
        this.a.p.setInstanceFollowRedirects(false);
        if (!this.a.d.containsKey("User-Agent")) {
            eamc eamcVar = this.a;
            eamcVar.d.put("User-Agent", eamcVar.c);
        }
        for (Map.Entry<String, String> entry : this.a.d.entrySet()) {
            this.a.p.setRequestProperty(entry.getKey(), entry.getValue());
        }
        eamc eamcVar2 = this.a;
        if (eamcVar2.h == null) {
            eamcVar2.h = "GET";
        }
        eamcVar2.p.setRequestMethod(eamcVar2.h);
        eamc eamcVar3 = this.a;
        eaml eamlVar = eamcVar3.i;
        if (eamlVar != null) {
            eamcVar3.q = new ealz(eamcVar3, eamcVar3.j, eamcVar3.b, eamcVar3.p, eamlVar);
            eamc eamcVar4 = this.a;
            ealz ealzVar = eamcVar4.q;
            if (eamcVar4.e.size() == 1) {
                z = true;
            }
            ealzVar.b(new eakz(ealzVar, z));
            return;
        }
        eamcVar3.k = 10;
        this.a.p.connect();
        this.a.g();
    }
}
