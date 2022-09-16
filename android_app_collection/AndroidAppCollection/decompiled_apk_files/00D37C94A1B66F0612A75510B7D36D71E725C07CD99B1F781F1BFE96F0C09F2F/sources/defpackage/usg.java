package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: usg  reason: default package */
/* loaded from: classes4.dex */
public final class usg {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "YT_MAIN_ANDROID" : "YT_KIDS_ANDROID" : "FAMILY_LINK_ANDROID" : "UNKNOWN";
    }

    public static ankt b(final qta qtaVar, final ampg ampgVar, final Executor executor) {
        final SettableFuture f = SettableFuture.f();
        qtaVar.i(new qtf() { // from class: urv
            @Override // defpackage.qtf
            public final void a(final qte qteVar) {
                final SettableFuture settableFuture = SettableFuture.this;
                Executor executor2 = executor;
                final ampg ampgVar2 = ampgVar;
                Status a = qteVar.a();
                if (a.g != 14) {
                    if (!a.c()) {
                        settableFuture.e(new urp(qteVar, a));
                        usg.c(qteVar);
                        return;
                    }
                    executor2.execute(new Runnable() { // from class: urx
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettableFuture settableFuture2 = SettableFuture.this;
                            ampg ampgVar3 = ampgVar2;
                            qte qteVar2 = qteVar;
                            try {
                                settableFuture2.o(ampgVar3.apply(qteVar2));
                            } catch (RuntimeException e) {
                                settableFuture2.e(e);
                            } finally {
                                usg.c(qteVar2);
                            }
                        }
                    });
                    return;
                }
                String valueOf = String.valueOf(qteVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("We never use the blocking API for these calls: ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            }
        }, TimeUnit.SECONDS);
        f.qY(ammo.f(new Runnable() { // from class: urw
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = SettableFuture.this;
                qta qtaVar2 = qtaVar;
                if (settableFuture.isCancelled()) {
                    qtaVar2.f();
                }
            }
        }), anjk.a);
        return f;
    }

    public static void c(qte qteVar) {
        if (qteVar instanceof qtb) {
            ((qtb) qteVar).b();
        }
    }

    public static String d(Object obj) {
        String str;
        String str2;
        String str3;
        str = ((ulx) obj).b;
        String d = amps.d(str);
        str2 = ((ulx) obj).c;
        String d2 = amps.d(str2);
        if (d.isEmpty() && d2.isEmpty()) {
            str3 = ((ulx) obj).c;
            return str3;
        } else if (d.isEmpty()) {
            return d2;
        } else {
            if (d2.isEmpty() || d.equals(d2)) {
                return d;
            }
            StringBuilder sb = new StringBuilder(d.length() + 1 + d2.length());
            sb.append(d);
            sb.append(" ");
            sb.append(d2);
            return sb.toString();
        }
    }
}
