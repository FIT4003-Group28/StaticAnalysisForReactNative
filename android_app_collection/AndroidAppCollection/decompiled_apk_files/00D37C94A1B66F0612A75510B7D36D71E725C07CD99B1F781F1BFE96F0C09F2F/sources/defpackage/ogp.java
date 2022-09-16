package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.watchwhile.StartupSignalStream;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: ogp  reason: default package */
/* loaded from: classes3.dex */
public final class ogp {
    public final axnm a;
    public final ems b;
    public final StartupSignalStream c;
    final aypf d = new aypf();
    final AtomicBoolean e = new AtomicBoolean(false);
    public final aacz f;
    private final SharedPreferences g;

    public ogp(axnm axnmVar, aacz aaczVar, ems emsVar, StartupSignalStream startupSignalStream, ypf ypfVar, SharedPreferences sharedPreferences) {
        this.a = axnmVar;
        this.f = aaczVar;
        this.b = emsVar;
        this.c = startupSignalStream;
        this.g = sharedPreferences;
        ypfVar.a().R(new ogn(this));
    }

    public final boolean a() {
        if (eog.be(this.f)) {
            asxj asxjVar = this.f.b().e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            if (asxjVar.cS) {
                long j = this.g.getLong("on_device_mdx_successful_cast_time", 0L);
                if (j <= 0) {
                    return true;
                }
                ChronoUnit chronoUnit = ChronoUnit.DAYS;
                Instant ofEpochMilli = Instant.ofEpochMilli(j);
                anhm anhmVar = anhm.a;
                long between = chronoUnit.between(ofEpochMilli, Instant.now());
                asxj asxjVar2 = this.f.b().e;
                if (asxjVar2 == null) {
                    asxjVar2 = asxj.a;
                }
                if (between <= asxjVar2.cT) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
