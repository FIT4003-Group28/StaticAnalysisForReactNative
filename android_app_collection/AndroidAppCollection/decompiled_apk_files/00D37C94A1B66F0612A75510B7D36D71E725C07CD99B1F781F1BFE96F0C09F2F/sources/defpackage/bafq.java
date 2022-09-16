package defpackage;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bafq  reason: default package */
/* loaded from: classes2.dex */
public final class bafq implements bage {
    final /* synthetic */ bagd a;
    private final /* synthetic */ int b;

    public bafq(bagd bagdVar) {
        this.a = bagdVar;
    }

    public bafq(bagd bagdVar, int i) {
        this.b = i;
        this.a = bagdVar;
    }

    @Override // defpackage.bage
    public final void a() {
        List list;
        int i = this.b;
        if (i == 0) {
            this.a.j.close();
            return;
        }
        boolean z = false;
        if (i == 1) {
            if (this.a.q == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            String str = "http/1.1";
            int i2 = 0;
            while (true) {
                String headerFieldKey = this.a.q.getHeaderFieldKey(i2);
                if (headerFieldKey == null) {
                    break;
                }
                if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                    str = this.a.q.getHeaderField(i2);
                }
                if (!headerFieldKey.startsWith("X-Android")) {
                    arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, this.a.q.getHeaderField(i2)));
                }
                i2++;
            }
            int responseCode = this.a.q.getResponseCode();
            bagd bagdVar = this.a;
            bagdVar.o = new bagp(new ArrayList(bagdVar.f), responseCode, this.a.q.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "", 0L);
            if (responseCode < 300 || responseCode >= 400 || (list = (List) this.a.o.getAllHeaders().get("location")) == null) {
                this.a.i();
                if (responseCode >= 400) {
                    InputStream errorStream = this.a.q.getErrorStream();
                    this.a.n = errorStream == null ? null : baez.a(errorStream);
                    this.a.b.b();
                    return;
                }
                bagd bagdVar2 = this.a;
                bagdVar2.n = baez.a(bagdVar2.q.getInputStream());
                this.a.b.b();
                return;
            }
            bagd bagdVar3 = this.a;
            bagdVar3.m(1, 2, new bafs(bagdVar3, (String) list.get(0)));
        } else if (this.a.g.get() != 8) {
            URL url = new URL(this.a.m);
            HttpURLConnection httpURLConnection = this.a.q;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.a.q = null;
            }
            this.a.q = (HttpURLConnection) url.openConnection();
            this.a.q.setInstanceFollowRedirects(false);
            if (!this.a.e.containsKey("User-Agent")) {
                bagd bagdVar4 = this.a;
                bagdVar4.e.put("User-Agent", bagdVar4.d);
            }
            for (Map.Entry entry : this.a.e.entrySet()) {
                this.a.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            bagd bagdVar5 = this.a;
            if (bagdVar5.i == null) {
                bagdVar5.i = "GET";
            }
            bagdVar5.q.setRequestMethod(bagdVar5.i);
            bagd bagdVar6 = this.a;
            bagw bagwVar = bagdVar6.j;
            if (bagwVar != null) {
                bagdVar6.r = new bafk(bagdVar6, bagdVar6.k, bagdVar6.c, bagdVar6.q, bagwVar);
                bagd bagdVar7 = this.a;
                bafk bafkVar = bagdVar7.r;
                if (bagdVar7.f.size() == 1) {
                    z = true;
                }
                bafkVar.a(new bafj(bafkVar, z));
                return;
            }
            bagdVar6.l = 10;
            this.a.q.connect();
            this.a.k();
        }
    }
}
