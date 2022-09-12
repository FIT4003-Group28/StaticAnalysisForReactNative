package defpackage;

import android.accounts.Account;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cmuz  reason: default package */
/* loaded from: classes5.dex */
public final class cmuz implements cnnu, cnnw {
    public final String a;
    public final int b;
    public final Account c;
    public String d;

    protected cmuz(String str, Account account) {
        cnwc.n(str, "moduleId must not be null");
        this.a = str;
        this.b = 1;
        this.c = account;
    }

    public static cmuz a(String str, Account account) {
        cnwc.l(str);
        return new cmuz(str, account);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cmuz cmuzVar = (cmuz) obj;
            if (cnvv.a(this.a, cmuzVar.a) && cnvv.a(null, null) && cnvv.a(null, null) && cnvv.a(this.c, cmuzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, 1, null, null, -1, this.c});
    }
}
