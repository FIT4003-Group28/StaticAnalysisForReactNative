package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
/* compiled from: PG */
/* renamed from: dgwg  reason: default package */
/* loaded from: classes6.dex */
final class dgwg extends dgtl<URI> {
    public static final URI d(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        try {
            String h = dgxeVar.h();
            if (!"null".equals(h)) {
                return new URI(h);
            }
            return null;
        } catch (URISyntaxException e) {
            throw new dgtd(e);
        }
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ URI a(dgxe dgxeVar) {
        return d(dgxeVar);
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, URI uri) {
        URI uri2 = uri;
        dgxgVar.j(uri2 == null ? null : uri2.toASCIIString());
    }
}
