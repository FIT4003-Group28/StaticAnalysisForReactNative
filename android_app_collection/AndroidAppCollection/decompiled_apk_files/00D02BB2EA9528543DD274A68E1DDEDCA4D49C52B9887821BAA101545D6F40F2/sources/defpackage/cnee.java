package defpackage;

import android.graphics.Rect;
import android.os.Looper;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cnee  reason: default package */
/* loaded from: classes5.dex */
public final class cnee extends cnez {
    private final Set<cnae> a = new aih();
    private final cojb b = new cojb(Looper.getMainLooper());

    @Override // defpackage.cnfa
    public final void b(CarDisplayId carDisplayId, Rect rect) {
        for (final cnae cnaeVar : this.a) {
            this.b.post(new Runnable(cnaeVar) { // from class: cned
                private final cnae a;

                {
                    this.a = cnaeVar;
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
