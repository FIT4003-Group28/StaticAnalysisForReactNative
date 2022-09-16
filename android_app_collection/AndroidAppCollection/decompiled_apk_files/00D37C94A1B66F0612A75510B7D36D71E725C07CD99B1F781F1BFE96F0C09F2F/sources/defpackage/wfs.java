package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.libraries.youtube.account.identity.C$AutoValue_AccountIdentity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wfs  reason: default package */
/* loaded from: classes4.dex */
public final class wfs implements Runnable {
    final /* synthetic */ AccountIdentity a;
    final /* synthetic */ aarw b;
    final /* synthetic */ apzg c;
    final /* synthetic */ wfv d;

    public wfs(wfv wfvVar, AccountIdentity accountIdentity, aarw aarwVar, apzg apzgVar) {
        this.d = wfvVar;
        this.a = accountIdentity;
        this.b = aarwVar;
        this.c = apzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wfv wfvVar = this.d;
        AccountIdentity accountIdentity = this.a;
        wfvVar.d(accountIdentity, new waj(((C$AutoValue_AccountIdentity) accountIdentity).b, this.b), this.c);
    }
}
