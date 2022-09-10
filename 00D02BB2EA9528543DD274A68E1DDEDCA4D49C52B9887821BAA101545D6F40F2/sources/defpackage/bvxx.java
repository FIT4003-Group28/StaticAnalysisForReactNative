package defpackage;

import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvxx  reason: default package */
/* loaded from: classes4.dex */
public final class bvxx implements Runnable {
    final /* synthetic */ AccountManagerFuture a;
    final /* synthetic */ bvxy b;
    final /* synthetic */ bvxz c;

    public bvxx(bvxz bvxzVar, AccountManagerFuture accountManagerFuture, bvxy bvxyVar) {
        this.c = bvxzVar;
        this.a = accountManagerFuture;
        this.b = bvxyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.c(this.b, ((Bundle) this.a.getResult()).getString("authtoken"));
        } catch (AuthenticatorException unused) {
            int i = bvxz.c;
            this.c.c(this.b, null);
        } catch (OperationCanceledException unused2) {
            int i2 = bvxz.c;
            this.c.c(this.b, null);
        } catch (IOException unused3) {
            int i3 = bvxz.c;
            this.c.c(this.b, null);
        }
    }
}
