package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aobp  reason: default package */
/* loaded from: classes.dex */
public final class aobp {
    private static final Object a = new Object();
    private static aodb b;

    public static rve a(Context context, Intent intent) {
        aodb aodbVar;
        synchronized (a) {
            if (b == null) {
                b = new aodb(context);
            }
            aodbVar = b;
        }
        return aodbVar.a(intent).b(qrj.j, rcb.e);
    }

    public static final rve b(final Intent intent, final Context context, Executor executor) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (twx.g() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (!z || flags != 0) {
            return rwd.a(executor, new Callable() { // from class: aobo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i;
                    Context context2 = context;
                    Intent intent2 = intent;
                    aoci a2 = aoci.a();
                    a2.c.offer(intent2);
                    Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                    intent3.setPackage(context2.getPackageName());
                    String b2 = a2.b(context2, intent3);
                    if (b2 != null) {
                        intent3.setClassName(context2.getPackageName(), b2);
                    }
                    try {
                        ComponentName componentName = null;
                        if (a2.c(context2)) {
                            synchronized (aocv.b) {
                                if (aocv.c == null) {
                                    aocv.c = new ruh(context2);
                                    ruh ruhVar = aocv.c;
                                    synchronized (ruhVar.b) {
                                        ruhVar.g = true;
                                    }
                                }
                                boolean b3 = aocv.b(intent3);
                                aocv.a(intent3, true);
                                ComponentName startService = context2.startService(intent3);
                                if (startService != null) {
                                    if (!b3) {
                                        final ruh ruhVar2 = aocv.c;
                                        long j = aocv.a;
                                        ruhVar2.m.incrementAndGet();
                                        String str = ruhVar2.k;
                                        rug rugVar = ruh.p;
                                        long j2 = Long.MAX_VALUE;
                                        long max = Math.max(Math.min(Long.MAX_VALUE, ruh.a), 1L);
                                        if (j > 0) {
                                            max = Math.min(j, max);
                                        }
                                        synchronized (ruhVar2.b) {
                                            if (!ruhVar2.b()) {
                                                rug rugVar2 = ruh.p;
                                                rug rugVar3 = ruh.p;
                                                ruhVar2.i = rfh.a;
                                                ruhVar2.c.acquire();
                                                qyh qyhVar = ruhVar2.o;
                                                SystemClock.elapsedRealtime();
                                            }
                                            ruhVar2.d++;
                                            ruhVar2.h++;
                                            ruhVar2.c();
                                            ruf rufVar = (ruf) ruhVar2.l.get(null);
                                            if (rufVar == null) {
                                                rufVar = new ruf();
                                                ruhVar2.l.put(null, rufVar);
                                            }
                                            rug rugVar4 = ruh.p;
                                            String str2 = ruhVar2.j;
                                            rufVar.a++;
                                            qyh qyhVar2 = ruhVar2.o;
                                            long elapsedRealtime = SystemClock.elapsedRealtime();
                                            if (Long.MAX_VALUE - elapsedRealtime > max) {
                                                j2 = elapsedRealtime + max;
                                            }
                                            if (j2 > ruhVar2.f) {
                                                ruhVar2.f = j2;
                                                Future future = ruhVar2.e;
                                                if (future != null) {
                                                    future.cancel(false);
                                                }
                                                ruhVar2.e = ruhVar2.n.schedule(new Runnable() { // from class: rue
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ruh ruhVar3 = ruh.this;
                                                        synchronized (ruhVar3.b) {
                                                            if (!ruhVar3.b()) {
                                                                return;
                                                            }
                                                            Log.e("WakeLock", ruhVar3.j.concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                                                            ruhVar3.a();
                                                            if (!ruhVar3.b()) {
                                                                return;
                                                            }
                                                            ruhVar3.d = 1;
                                                            ruhVar3.d();
                                                        }
                                                    }
                                                }, max, TimeUnit.MILLISECONDS);
                                            }
                                        }
                                    }
                                    componentName = startService;
                                }
                            }
                        } else {
                            componentName = context2.startService(intent3);
                        }
                        if (componentName == null) {
                            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                            i = 404;
                        } else {
                            i = -1;
                        }
                    } catch (IllegalStateException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                        sb.append("Failed to start service while in background: ");
                        sb.append(valueOf);
                        Log.e("FirebaseMessaging", sb.toString());
                        i = 402;
                    } catch (SecurityException e2) {
                        Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                        i = 401;
                    }
                    return Integer.valueOf(i);
                }
            }).c(executor, new rui() { // from class: aobn
                @Override // defpackage.rui
                public final Object a(rve rveVar) {
                    return (!twx.g() || ((Integer) rveVar.g()).intValue() != 402) ? rveVar : aobp.a(context, intent).b(qrj.j, rcb.f);
                }
            });
        }
        return a(context, intent);
    }
}
