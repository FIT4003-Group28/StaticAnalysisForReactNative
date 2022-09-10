package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: derm  reason: default package */
/* loaded from: classes6.dex */
public final class derm {
    private static final Object a = new Object();
    private static deso b;
    private final Context c;
    private final Executor d;

    public derm(Context context) {
        this.c = context;
        this.d = derh.a;
    }

    public derm(Context context, ExecutorService executorService) {
        this.c = context;
        this.d = executorService;
    }

    public static cpcq<Integer> b(Context context, Intent intent) {
        deso desoVar;
        synchronized (a) {
            if (b == null) {
                b = new deso(context);
            }
            desoVar = b;
        }
        return desoVar.a(intent).g(dero.a, derk.a);
    }

    public static void reset() {
        synchronized (a) {
            b = null;
        }
    }

    public final cpcq<Integer> a(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.c;
        if (cnxs.a() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (!z || flags != 0) {
            return cpda.c(this.d, new Callable(context, intent) { // from class: deri
                private final Context a;
                private final Intent b;

                {
                    this.a = context;
                    this.b = intent;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i;
                    ComponentName startService;
                    Context context2 = this.a;
                    Intent intent2 = this.b;
                    desd desdVar = desd.getInstance();
                    desdVar.c.offer(intent2);
                    Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                    intent3.setPackage(context2.getPackageName());
                    String a2 = desdVar.a(context2, intent3);
                    if (a2 != null) {
                        intent3.setClassName(context2.getPackageName(), a2);
                    }
                    try {
                        if (desdVar.b(context2)) {
                            startService = desi.startWakefulService(context2, intent3);
                        } else {
                            startService = context2.startService(intent3);
                        }
                        i = startService == null ? 404 : -1;
                    } catch (IllegalStateException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                        sb.append("Failed to start service while in background: ");
                        sb.append(valueOf);
                        sb.toString();
                        i = 402;
                    } catch (SecurityException unused) {
                        i = 401;
                    }
                    return Integer.valueOf(i);
                }
            }).h(this.d, new cpbu(context, intent) { // from class: derj
                private final Context a;
                private final Intent b;

                {
                    this.a = context;
                    this.b = intent;
                }

                @Override // defpackage.cpbu
                public final Object a(cpcq cpcqVar) {
                    return (!cnxs.a() || ((Integer) cpcqVar.d()).intValue() != 402) ? cpcqVar : derm.b(this.a, this.b).g(dero.a, derl.a);
                }
            });
        }
        return b(context, intent);
    }
}
