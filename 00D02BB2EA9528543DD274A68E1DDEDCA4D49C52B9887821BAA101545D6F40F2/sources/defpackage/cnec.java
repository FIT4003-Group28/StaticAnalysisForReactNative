package defpackage;

import android.os.Looper;
import com.google.android.gms.car.display.CarDisplay;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cnec  reason: default package */
/* loaded from: classes5.dex */
public final class cnec extends cnex {
    private final Set<cnad> a = new aih();
    private final cojb b = new cojb(Looper.getMainLooper());

    @Override // defpackage.cney
    public final synchronized void b(CarDisplay carDisplay) {
        for (final cnad cnadVar : this.a) {
            this.b.post(new Runnable(cnadVar) { // from class: cneb
                private final cnad a;

                {
                    this.a = cnadVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
        }
    }

    public final synchronized void c() {
        this.a.clear();
    }
}
