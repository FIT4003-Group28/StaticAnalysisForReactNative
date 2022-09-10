package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aqao  reason: default package */
/* loaded from: classes2.dex */
public final class aqao implements csup {
    private final Context a;
    private final dxio<ckcw> b;
    private final dxio<btvo> c;

    public aqao(Context context, dxio<ckcw> dxioVar, dxio<btvo> dxioVar2) {
        this.a = context;
        this.b = dxioVar;
        this.c = dxioVar2;
    }

    @Override // defpackage.csup
    public final void a(String str) {
        try {
            cmrb.c(this.a, str);
        } catch (Exception unused) {
            ((ckcn) this.b.a().a(ckgs.L)).a();
        }
    }

    @Override // defpackage.csup
    @dzsi
    public final String b(Account account) {
        int i;
        try {
            if (this.c.a().getBusinessMessagingParameters().B) {
                return cmrb.a(this.a, account, "oauth2:https://www.googleapis.com/auth/tachyon", new Bundle());
            }
            return cmrh.g(this.a, account, "oauth2:https://www.googleapis.com/auth/tachyon", new Bundle());
        } catch (Exception e) {
            ckco ckcoVar = (ckco) this.b.a().a(ckgs.K);
            boolean z = e instanceof UserRecoverableAuthException;
            if (z) {
                i = 2;
            } else if (e instanceof IOException) {
                i = 3;
            } else {
                i = e instanceof cmra ? 4 : 1;
            }
            ckcoVar.a(i - 1);
            if (!z) {
                throw e;
            }
            return null;
        }
    }
}
