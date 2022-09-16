package defpackage;

import android.os.Looper;
import com.google.android.gms.car.CarUiInfo;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cneg  reason: default package */
/* loaded from: classes5.dex */
public final class cneg extends cmyd {
    private final Set<cngq> a = new aih();
    private final cojb b = new cojb(Looper.getMainLooper());

    @Override // defpackage.cmye
    public final synchronized void b(CarUiInfo carUiInfo) {
        for (final cngq cngqVar : this.a) {
            this.b.post(new Runnable(cngqVar) { // from class: cnef
                private final cngq a;

                {
                    this.a = cngqVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.t();
                }
            });
        }
    }

    public final synchronized void c() {
        this.a.clear();
    }

    public final synchronized void d(cngq cngqVar) {
        this.a.add(cngqVar);
    }

    public final synchronized void e(cngq cngqVar) {
        this.a.remove(cngqVar);
    }
}
