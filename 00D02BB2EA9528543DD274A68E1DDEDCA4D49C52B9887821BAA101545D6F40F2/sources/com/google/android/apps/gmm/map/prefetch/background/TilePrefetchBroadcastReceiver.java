package com.google.android.apps.gmm.map.prefetch.background;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TilePrefetchBroadcastReceiver extends BroadcastReceiver implements btsz {
    public amxc a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Integer valueOf;
        intent.getAction();
        dxiq.c(this, context);
        final amxc amxcVar = this.a;
        if ("com.google.android.apps.maps.PREFETCH".equals(intent.getAction())) {
            amxa amxaVar = new amxa(intent);
            cqat cqatVar = amxcVar.a;
            amwh amwhVar = amxcVar.b;
            Intent intent2 = amxaVar.c;
            if (intent2 != null) {
                amxaVar.e = (Messenger) intent2.getParcelableExtra("messenger");
                if (amxaVar.e != null) {
                    PendingIntent pendingIntent = (PendingIntent) amxaVar.c.getParcelableExtra("sender");
                    if (pendingIntent == null) {
                        amxaVar.a(1);
                    } else {
                        amxaVar.d = pendingIntent.getTargetPackage();
                        if (!amxa.a.containsKey(amxaVar.d)) {
                            amxa.a.keySet();
                            amxaVar.a(2);
                        } else {
                            String string = amxaVar.c.getExtras().getString("locations");
                            if (string == null) {
                                amxaVar.a(3);
                            } else {
                                String[] split = string.split(",");
                                int length = split.length;
                                if (length == 2 || length == 4) {
                                    if (split[0].equals(split[1])) {
                                        String str = split[0];
                                        String str2 = split[1];
                                        amxaVar.a(3);
                                    } else {
                                        amxaVar.f = new double[length];
                                        for (int i = 0; i < split.length; i++) {
                                            try {
                                                amxaVar.f[i] = Double.parseDouble(split[i]);
                                            } catch (NumberFormatException e) {
                                                e.getMessage();
                                                amxaVar.a(3);
                                            }
                                        }
                                        for (int i2 = 0; i2 < split.length; i2 += 2) {
                                            double[] dArr = amxaVar.f;
                                            double d = dArr[i2];
                                            if (d >= -80.0d && d <= 80.0d) {
                                                double d2 = dArr[i2 + 1];
                                                if (d2 < -180.0d || d2 > 180.0d) {
                                                    amxaVar.a(3);
                                                    break;
                                                }
                                            } else {
                                                amxaVar.a(3);
                                                break;
                                            }
                                        }
                                        String string2 = amxaVar.c.getExtras().getString("deadline_seconds");
                                        long seconds = TimeUnit.MILLISECONDS.toSeconds(cqatVar.b());
                                        amxaVar.h = seconds;
                                        if (string2 != null) {
                                            try {
                                                long parseLong = Long.parseLong(string2);
                                                amxaVar.g = parseLong;
                                                if (parseLong <= 0) {
                                                    amxaVar.a(4);
                                                } else {
                                                    seconds = amxaVar.h;
                                                    if (parseLong < seconds) {
                                                        amxaVar.a(4);
                                                    }
                                                }
                                            } catch (NumberFormatException e2) {
                                                e2.getMessage();
                                                amxaVar.a(4);
                                            }
                                        }
                                        long j = amxaVar.g;
                                        if (j != 0) {
                                            valueOf = Integer.valueOf((int) (j - seconds));
                                        } else {
                                            valueOf = amxaVar.d.equals("com.google.android.googlequicksearchbox") ? Integer.valueOf(amxa.b) : null;
                                        }
                                        int i3 = 0;
                                        while (true) {
                                            double[] dArr2 = amxaVar.f;
                                            if (i3 >= dArr2.length) {
                                                break;
                                            }
                                            amwhVar.b(akra.c((int) (dArr2[i3] * 1000000.0d), (int) (dArr2[i3 + 1] * 1000000.0d)), amwh.a, amxaVar.d, valueOf);
                                            i3 += 2;
                                        }
                                        amwhVar.c();
                                        amxaVar.a(0);
                                    }
                                } else {
                                    amxaVar.a(3);
                                }
                            }
                        }
                    }
                }
            }
            amxcVar.e.a().k(new Runnable(amxcVar) { // from class: amxb
                private final amxc a;

                {
                    this.a = amxcVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dehn a;
                    amxc amxcVar2 = this.a;
                    try {
                        long max = Math.max(0L, TimeUnit.MINUTES.toSeconds(amxcVar2.c.getPrefetcherSettingsParameters().d));
                        amwr a2 = amxcVar2.d.a();
                        try {
                            bbo bboVar = new bbo();
                            bboVar.e("worker_name_key", "TrackedTilePrefetcherWorker");
                            bbp a3 = bboVar.a();
                            bbk bbkVar = new bbk();
                            bbkVar.c = 1;
                            bbkVar.a = false;
                            bcb f = new bca(GmmWorkerWrapper.class).d("TRACKED_TILE_PREFETCHER").c(a3).e(max, TimeUnit.SECONDS).b(bbkVar.a()).f();
                            a = deew.h(a2.a.a().d("TRACKED_TILE_PREFETCHER", 1, f).a(), new dbrn(a2, f) { // from class: amwq
                                private final amwr a;
                                private final bcb b;

                                {
                                    this.a = a2;
                                    this.b = f;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj) {
                                    amwr amwrVar = this.a;
                                    try {
                                        return this.b.a;
                                    } catch (RuntimeException e3) {
                                        amwrVar.b.a().c(20, e3);
                                        return bbx.c();
                                    }
                                }
                            }, dege.a);
                        } catch (RuntimeException e3) {
                            a2.b.a().c(20, e3);
                            a = deha.a(bbx.c());
                        }
                        a.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }, amxcVar.f, bvkw.ON_STARTUP_FULLY_COMPLETE);
        }
    }
}
