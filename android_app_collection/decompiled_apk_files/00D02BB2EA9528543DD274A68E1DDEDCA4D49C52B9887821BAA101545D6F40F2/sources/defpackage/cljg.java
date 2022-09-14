package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: cljg  reason: default package */
/* loaded from: classes5.dex */
public final class cljg implements cllf {
    public static final /* synthetic */ int a = 0;
    private static final dcep<String> b = dcep.C("http", "https");
    private final CronetEngine c;
    private final Executor d;

    public cljg(CronetEngine cronetEngine, Executor executor) {
        this.c = cronetEngine;
        this.d = executor;
    }

    @Override // defpackage.cllf
    public final cllg a(String str) {
        deig d = deig.d();
        return new cljf(this.c.mo29newUrlRequestBuilder(str, new cljb(d), this.d), d);
    }

    @Override // defpackage.cllf
    public final Set<String> b() {
        return b;
    }
}
