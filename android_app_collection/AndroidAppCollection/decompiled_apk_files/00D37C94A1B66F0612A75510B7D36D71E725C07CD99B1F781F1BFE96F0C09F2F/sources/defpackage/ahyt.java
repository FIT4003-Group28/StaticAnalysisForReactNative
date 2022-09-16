package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahyt  reason: default package */
/* loaded from: classes.dex */
public final class ahyt {
    final /* synthetic */ ahyz a;
    private final Runnable b = new Runnable() { // from class: ahyr
        @Override // java.lang.Runnable
        public final void run() {
            FormatStreamModel[] formatStreamModelArr;
            ahyt ahytVar = ahyt.this;
            synchronized (ahytVar.a.L) {
                formatStreamModelArr = ahytVar.a.M;
            }
            if (formatStreamModelArr == null) {
                ahytVar.a();
                return;
            }
            long j = -1;
            for (FormatStreamModel formatStreamModel : formatStreamModelArr) {
                long a = ahytVar.a.t.a(formatStreamModel, TimeUnit.MILLISECONDS.toMicros(ahytVar.a.G));
                j = j < 0 ? a : Math.min(j, a);
            }
            ahytVar.a.K = TimeUnit.MICROSECONDS.toMillis(j);
            final ahyz ahyzVar = ahytVar.a;
            ahyzVar.v.execute(new Runnable() { // from class: ahys
                @Override // java.lang.Runnable
                public final void run() {
                    ahyz.this.f();
                }
            });
            ahyz ahyzVar2 = ahytVar.a;
            if (ahyzVar2.K < ahyzVar2.I) {
                return;
            }
            ahytVar.a();
        }
    };
    private ScheduledFuture c;

    public ahyt(ahyz ahyzVar) {
        this.a = ahyzVar;
    }

    public final synchronized void a() {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.c = null;
        }
    }

    public final void b() {
        a();
        this.c = this.a.u.scheduleAtFixedRate(this.b, 0L, 10L, TimeUnit.SECONDS);
    }
}
