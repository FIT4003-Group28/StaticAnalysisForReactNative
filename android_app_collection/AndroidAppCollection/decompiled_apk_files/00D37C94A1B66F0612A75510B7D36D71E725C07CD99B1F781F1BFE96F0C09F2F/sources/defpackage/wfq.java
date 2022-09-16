package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
/* compiled from: PG */
/* renamed from: wfq  reason: default package */
/* loaded from: classes4.dex */
final class wfq implements Runnable {
    final /* synthetic */ AccountIdentity a;
    final /* synthetic */ apzg b;
    final /* synthetic */ wfv c;

    public wfq(wfv wfvVar, AccountIdentity accountIdentity, apzg apzgVar) {
        this.c = wfvVar;
        this.a = accountIdentity;
        this.b = apzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.d(this.a, waj.a, this.b);
    }
}
