package defpackage;

import java.io.InputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ealk  reason: default package */
/* loaded from: classes6.dex */
public final class ealk implements eamd {
    final /* synthetic */ eamc a;

    public ealk(eamc eamcVar) {
        this.a = eamcVar;
    }

    @Override // defpackage.eamd
    public final void a() {
        List<String> list;
        if (this.a.p == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = "http/1.1";
        int i = 0;
        while (true) {
            String headerFieldKey = this.a.p.getHeaderFieldKey(i);
            if (headerFieldKey == null) {
                break;
            }
            if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                str = this.a.p.getHeaderField(i);
            }
            if (!headerFieldKey.startsWith("X-Android")) {
                arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, this.a.p.getHeaderField(i)));
            }
            i++;
        }
        int responseCode = this.a.p.getResponseCode();
        eamc eamcVar = this.a;
        eamcVar.n = new eamj(new ArrayList(eamcVar.e), responseCode, this.a.p.getResponseMessage(), Collections.unmodifiableList(arrayList), str);
        if (responseCode < 300 || responseCode >= 400 || (list = this.a.n.getAllHeaders().get("location")) == null) {
            this.a.h();
            if (responseCode >= 400) {
                InputStream errorStream = this.a.p.getErrorStream();
                this.a.m = errorStream == null ? null : eako.a(errorStream);
                this.a.a.b();
                return;
            }
            eamc eamcVar2 = this.a;
            eamcVar2.m = eako.a(eamcVar2.p.getInputStream());
            this.a.a.b();
            return;
        }
        eamc eamcVar3 = this.a;
        eamcVar3.f(1, 2, new ealn(eamcVar3, list.get(0)));
    }
}
