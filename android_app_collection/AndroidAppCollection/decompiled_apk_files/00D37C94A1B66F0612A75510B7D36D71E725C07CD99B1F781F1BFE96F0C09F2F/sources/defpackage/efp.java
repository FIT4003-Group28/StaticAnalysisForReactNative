package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: efp  reason: default package */
/* loaded from: classes3.dex */
final class efp implements Runnable {
    final /* synthetic */ Executor a;
    final /* synthetic */ efq b;

    public efp(efq efqVar, Executor executor) {
        this.b = efqVar;
        this.a = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afvm c = ((afvn) this.b.k.get()).c();
        if (!(c instanceof AccountIdentity)) {
            return;
        }
        ((vzm) this.b.l.get()).j(this.a, (AccountIdentity) c);
    }
}
