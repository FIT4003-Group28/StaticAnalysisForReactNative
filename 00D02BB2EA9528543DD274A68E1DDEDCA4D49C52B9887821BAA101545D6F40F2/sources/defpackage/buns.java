package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: buns  reason: default package */
/* loaded from: classes.dex */
public final class buns implements btzp<Void, Void> {
    private final CronetEngine a;
    private final btuh b;
    private final bvrb c;

    public buns(btuh btuhVar, CronetEngine cronetEngine, bvrb bvrbVar) {
        this.a = cronetEngine;
        this.b = btuhVar;
        this.c = bvrbVar;
    }

    @Override // defpackage.btzp
    public final /* bridge */ /* synthetic */ btzc a(Void r2, btzi<Void, Void> btziVar, bvrj bvrjVar) {
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return d(btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final /* bridge */ /* synthetic */ btzc b(Void r1, btzi<Void, Void> btziVar, Executor executor) {
        return d(executor);
    }

    @Override // defpackage.btzp
    public final dehn<btzx<Void, Void>> c(Void r1) {
        throw null;
    }

    public final btzc d(Executor executor) {
        try {
            this.a.mo29newUrlRequestBuilder(new URL("https", this.b.a().getHost(), "/generate_204").toExternalForm(), new bunr(), executor).mo45setHttpMethod("GET").mo43build().start();
        } catch (MalformedURLException unused) {
        }
        return bunq.a;
    }
}
