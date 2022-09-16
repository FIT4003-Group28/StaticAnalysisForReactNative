package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.Feature;
import java.util.Arrays;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: upy  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class upy implements Callable {
    public final /* synthetic */ upz a;
    private final /* synthetic */ int b;

    public /* synthetic */ upy(upz upzVar) {
        this.a = upzVar;
    }

    public /* synthetic */ upy(upz upzVar, int i) {
        this.b = i;
        this.a = upzVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return Arrays.asList(qhz.l(this.a.b));
            }
            Context context = this.a.b;
            qnm.b(context);
            qhz.g(context, 11400000);
            String str = context.getApplicationInfo().packageName;
            vbt.g(context);
            if (axqx.c() && qhz.i(context)) {
                qie j = qfl.j(context);
                qnm.n(str, "Client package name cannot be null!");
                qvx b = qvy.b();
                b.b = new Feature[]{qhq.c};
                b.a = new rte(str, 1);
                b.c = 1514;
                try {
                    Bundle bundle = (Bundle) qhz.d(((qst) j).v(b.a()), "google accounts access request");
                    String string = bundle.getString("Error");
                    Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
                    qiz a = qiz.a(string);
                    if (qiz.SUCCESS.equals(a)) {
                        return true;
                    }
                    if (!qiz.b(a)) {
                        throw new qhr(string);
                    }
                    saz sazVar = qhz.d;
                    String valueOf = String.valueOf(a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                    sb.append("isUserRecoverableError status: ");
                    sb.append(valueOf);
                    sazVar.b("GoogleAuthUtil", sb.toString());
                    throw new UserRecoverableAuthException(string, intent);
                } catch (qsp e) {
                    qhz.h(e, "google accounts access request");
                }
            }
            return (Boolean) qhz.c(context, qhz.c, new qhx(str));
        }
        return Arrays.asList(qhz.m(this.a.b, upz.a));
    }
}
