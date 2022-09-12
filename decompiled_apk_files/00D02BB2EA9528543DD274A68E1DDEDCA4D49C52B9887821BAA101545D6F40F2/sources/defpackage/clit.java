package defpackage;

import java.net.URI;
/* compiled from: PG */
/* renamed from: clit  reason: default package */
/* loaded from: classes5.dex */
public final class clit extends cljv {
    public URI a;
    public dced<String, String> b;
    public cljr c;
    public cljs d;

    @Override // defpackage.cljv
    public final void a(cljr cljrVar) {
        if (cljrVar != null) {
            this.c = cljrVar;
            return;
        }
        throw new NullPointerException("Null downloadConstraints");
    }
}
