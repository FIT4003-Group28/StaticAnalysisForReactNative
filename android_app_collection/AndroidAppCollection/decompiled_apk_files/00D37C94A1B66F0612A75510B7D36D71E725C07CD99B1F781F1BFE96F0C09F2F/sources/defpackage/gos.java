package defpackage;

import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gos  reason: default package */
/* loaded from: classes3.dex */
public final class gos {
    public final afvn a;
    public final Executor b;
    public SettableFuture c;
    public boolean d;
    public final vzc e;

    public gos(afvn afvnVar, vzc vzcVar, Executor executor) {
        this.a = afvnVar;
        this.e = vzcVar;
        this.b = executor;
    }

    public final void a(GalFlowActivity galFlowActivity, gor gorVar) {
        if (gorVar == gor.PENDING) {
            return;
        }
        galFlowActivity.finish();
        this.c.o(gorVar);
        this.c = null;
        this.d = false;
    }
}
