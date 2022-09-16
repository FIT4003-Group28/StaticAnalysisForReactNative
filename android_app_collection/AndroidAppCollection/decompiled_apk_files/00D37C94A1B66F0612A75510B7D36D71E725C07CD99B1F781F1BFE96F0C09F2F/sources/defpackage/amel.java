package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
@Deprecated
/* renamed from: amel  reason: default package */
/* loaded from: classes.dex */
public final class amel {
    public static final ankt a(final amek amekVar, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        SettableFuture f = SettableFuture.f();
        ankt x = anlz.x(f, 24L, timeUnit, scheduledExecutorService);
        f.lV(aed.c(new agr() { // from class: amei
            @Override // defpackage.agr
            public final Object a(agp agpVar) {
                return amek.this.a(new amej(agpVar));
            }
        }));
        return x;
    }

    public static int b(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }
}
