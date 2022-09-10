package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: buhq  reason: default package */
/* loaded from: classes4.dex */
public final class buhq implements buae<String> {
    private static final buab<String> c = buab.c("connectivity", Boolean.toString(true));
    @dzsi
    public deig<buab<String>> a;
    final BroadcastReceiver b = new buhp(this);
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final btpc e;
    private final Context f;

    public buhq(Context context, btpc btpcVar) {
        this.e = btpcVar;
        this.f = context;
    }

    @Override // defpackage.buae
    public final dehn<buab<String>> a() {
        buab<String> b = b();
        synchronized (this) {
            if (b != null) {
                return deha.a(b);
            }
            deig<buab<String>> deigVar = this.a;
            if (deigVar == null) {
                deig<buab<String>> d = deig.d();
                this.a = d;
                return deha.o(d);
            }
            return deha.o(deigVar);
        }
    }

    @dzsi
    public final buab<String> b() {
        if (!this.d.getAndSet(true)) {
            this.f.registerReceiver(this.b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if (this.e.j()) {
            return c;
        }
        return null;
    }
}
