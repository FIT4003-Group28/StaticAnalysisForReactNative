package defpackage;

import android.accounts.Account;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
/* compiled from: PG */
/* renamed from: vzc  reason: default package */
/* loaded from: classes4.dex */
public final class vzc {
    public final whp a;

    public vzc(whp whpVar) {
        this.a = whpVar;
    }

    public final Account a(afvm afvmVar) {
        if (!(afvmVar instanceof AccountIdentity)) {
            return null;
        }
        return this.a.b(((AccountIdentity) afvmVar).a());
    }

    public final Account b(afvm afvmVar) {
        if (!(afvmVar instanceof AccountIdentity)) {
            return null;
        }
        return whp.a(((AccountIdentity) afvmVar).a(), this.a.i());
    }
}
