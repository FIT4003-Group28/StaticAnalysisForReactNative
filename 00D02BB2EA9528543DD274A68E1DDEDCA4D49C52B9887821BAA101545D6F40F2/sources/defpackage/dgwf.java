package defpackage;

import java.net.URL;
/* compiled from: PG */
/* renamed from: dgwf  reason: default package */
/* loaded from: classes6.dex */
final class dgwf extends dgtl<URL> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ URL a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        String h = dgxeVar.h();
        if ("null".equals(h)) {
            return null;
        }
        return new URL(h);
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, URL url) {
        URL url2 = url;
        dgxgVar.j(url2 == null ? null : url2.toExternalForm());
    }
}
