package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: fae  reason: default package */
/* loaded from: classes3.dex */
public final class fae extends BroadcastReceiver {
    public final azqb a;
    public final azqb b;
    public final snc c;
    private final azpq d = azpq.e();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final aypj f = new aypj();

    public fae(azqb azqbVar, azqb azqbVar2, snc sncVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = sncVar;
    }

    public final void a(Context context) {
        if (Build.VERSION.SDK_INT >= 23 && !this.e.getAndSet(true)) {
            context.registerReceiver(this, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
            this.f.a(this.d.B().x(1000L, TimeUnit.MILLISECONDS).X(azpj.c()).as(new ayqb() { // from class: fad
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    fae faeVar = fae.this;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    aadd aaddVar = (aadd) faeVar.a.get();
                    atpo b = agbo.b(aaddVar);
                    boolean z = false;
                    int i = b != null ? b.n : 0;
                    atpo b2 = agbo.b(aaddVar);
                    boolean z2 = b2 != null && b2.p;
                    atpo b3 = agbo.b(aaddVar);
                    if (b3 != null && b3.o) {
                        z = true;
                    }
                    if (booleanValue) {
                        if (!z2) {
                            return;
                        }
                    } else if (!z) {
                        return;
                    }
                    agbo.e(aaddVar, (yjs) faeVar.b.get(), faeVar.c, i, true);
                }
            }));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (!"android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(intent.getAction())) {
            return;
        }
        this.d.c(Boolean.valueOf(powerManager.isDeviceIdleMode()));
    }
}
