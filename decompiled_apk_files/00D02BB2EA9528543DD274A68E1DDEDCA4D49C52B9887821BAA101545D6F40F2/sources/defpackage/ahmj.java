package defpackage;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import com.google.android.apps.gmm.location.mapinfo.GpsStatusEvent;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahmj  reason: default package */
/* loaded from: classes2.dex */
public final class ahmj implements ahkd {
    private static final long f = TimeUnit.SECONDS.toMillis(1);
    public final btrm a;
    public final cqat b;
    private final LocationManager g;
    private final ahmi h = new ahmi(this);
    private final ahmh i = new ahmh(this);
    public boolean c = false;
    public boolean d = false;
    private boolean j = false;
    final LocationListener e = new ahmg(this);

    public ahmj(Context context, cqat cqatVar, btrm btrmVar) {
        this.g = (LocationManager) context.getSystemService("location");
        this.b = cqatVar;
        this.a = btrmVar;
    }

    @Override // defpackage.ahkd
    public final void a() {
        btrm btrmVar = this.a;
        ahmi ahmiVar = this.h;
        dceq a = dcet.a();
        a.b(alsr.class, new ahml(alsr.class, ahmiVar, bvrj.LOCATION_DISPATCHER));
        btrmVar.g(ahmiVar, a.a());
        btrm btrmVar2 = this.a;
        ahmh ahmhVar = this.i;
        dceq a2 = dcet.a();
        a2.b(GpsStatusEvent.class, new ahmk(GpsStatusEvent.class, ahmhVar, bvrj.LOCATION_DISPATCHER));
        btrmVar2.g(ahmhVar, a2.a());
    }

    @Override // defpackage.ahkd
    public final void b() {
        this.a.a(this.h);
        this.a.a(this.i);
        this.d = false;
        this.c = false;
        c();
    }

    public final void c() {
        if (!this.d || !this.c) {
            if (!this.j) {
                return;
            }
            try {
                int i = ckfu.a;
                this.g.removeUpdates(this.e);
                this.j = false;
            } catch (Exception unused) {
            }
        } else if (this.j) {
        } else {
            try {
                int i2 = ckfu.a;
                this.g.requestLocationUpdates("network", f, 0.0f, this.e);
                this.j = true;
            } catch (Exception unused2) {
            }
        }
    }
}
