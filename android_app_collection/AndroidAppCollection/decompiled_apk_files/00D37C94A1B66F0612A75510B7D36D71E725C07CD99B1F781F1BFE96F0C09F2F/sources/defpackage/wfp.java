package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
/* compiled from: PG */
/* renamed from: wfp  reason: default package */
/* loaded from: classes4.dex */
final class wfp implements Runnable {
    final /* synthetic */ AccountIdentity a;
    final /* synthetic */ waj b;
    final /* synthetic */ apzg c;
    final /* synthetic */ wfv d;

    public wfp(wfv wfvVar, AccountIdentity accountIdentity, waj wajVar, apzg apzgVar) {
        this.d = wfvVar;
        this.a = accountIdentity;
        this.b = wajVar;
        this.c = apzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.d(this.a, this.b, this.c);
    }
}
