package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afcd  reason: default package */
/* loaded from: classes.dex */
public final class afcd extends afcq implements aemh {
    public final aetg d;
    public final afbi e;

    public afcd(Executor executor, pnp pnpVar, afci afciVar, Handler handler, afbi afbiVar, aetg aetgVar, aflm aflmVar, afbq afbqVar) {
        super(executor, pnpVar, afciVar, handler, afbiVar, aflmVar, afbqVar);
        afms.a(afbiVar.d);
        this.d = aetgVar;
        this.e = afbiVar;
    }

    @Override // defpackage.aemh
    public final void a(aent aentVar, int i) {
        this.e.d.j(aentVar.c, aentVar.d, aentVar.j, aentVar.e, aentVar.b.length - 1);
        t();
    }
}
