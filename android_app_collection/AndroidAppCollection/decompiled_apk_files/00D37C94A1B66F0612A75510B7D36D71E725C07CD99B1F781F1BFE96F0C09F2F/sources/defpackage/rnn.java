package defpackage;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rnn  reason: default package */
/* loaded from: classes4.dex */
public final class rnn implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ rnm b;
    final /* synthetic */ rnm c;
    final /* synthetic */ long d;
    final /* synthetic */ rns e;

    public rnn(rns rnsVar, Bundle bundle, rnm rnmVar, rnm rnmVar2, long j) {
        this.e = rnsVar;
        this.a = bundle;
        this.b = rnmVar;
        this.c = rnmVar2;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rns rnsVar = this.e;
        Bundle bundle = this.a;
        rnm rnmVar = this.b;
        rnm rnmVar2 = this.c;
        long j = this.d;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        rnsVar.q(rnmVar, rnmVar2, j, true, rnsVar.N().x(null, "screen_view", bundle, null, false));
    }
}
