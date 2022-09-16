package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: zdp  reason: default package */
/* loaded from: classes4.dex */
public final class zdp {
    private static final IntentFilter g = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    public final BatteryManager a;
    public final snc b;
    public final ayoi c;
    public long d;
    public int e;
    public boolean f;
    private final Context h;

    public zdp(Context context, ExecutorService executorService, snc sncVar) {
        context.getClass();
        this.h = context;
        sncVar.getClass();
        this.b = sncVar;
        this.a = (BatteryManager) context.getSystemService("batterymanager");
        executorService.getClass();
        ayor b = azpj.b(executorService);
        this.c = ayoi.S(0L, 1L, TimeUnit.SECONDS, b).X(b).L(new ayqe() { // from class: zdn
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                final zdp zdpVar = zdp.this;
                final Long l = (Long) obj;
                return ayoc.u(new Callable() { // from class: zdo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zdp zdpVar2 = zdp.this;
                        long longValue = l.longValue();
                        zdm zdmVar = null;
                        if (zdpVar2.a != null) {
                            long d = zdpVar2.b.d();
                            if (longValue > 0 && zdpVar2.f) {
                                zdmVar = new zdm(zdpVar2.e, d - zdpVar2.d);
                            }
                            zdpVar2.d = d;
                            if (zdpVar2.b()) {
                                zdpVar2.f = false;
                            } else {
                                zdpVar2.f = true;
                                zdpVar2.e = zdpVar2.a.getIntProperty(2);
                            }
                        }
                        return zdmVar;
                    }
                });
            }
        }).aa();
    }

    private final Bundle c() {
        Intent registerReceiver = this.h.registerReceiver(null, g);
        if (registerReceiver == null) {
            return new Bundle();
        }
        return registerReceiver.getExtras();
    }

    public final float a() {
        Bundle c = c();
        float f = c.getInt("level", -1);
        float f2 = c.getInt("scale", -1);
        if (f < 0.0f || f2 <= 0.0f) {
            return -1.0f;
        }
        return f / f2;
    }

    public final boolean b() {
        return c().getInt("plugged", 0) != 0;
    }
}
