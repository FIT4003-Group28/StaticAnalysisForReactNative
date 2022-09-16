package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afbx  reason: default package */
/* loaded from: classes.dex */
public final class afbx implements axs {
    private static final afbw c = new afbm();
    private static final afbw d = new afbn();
    public final afls a;
    public final amqo b;
    private final Map e = new HashMap();
    private final yrj f;
    private final afgz g;
    private final amqo h;
    private final afjz i;

    public afbx(yrj yrjVar, afgz afgzVar, afjz afjzVar, amqo amqoVar, amqo amqoVar2) {
        this.a = new afls(new aflr(amqoVar, 1));
        this.f = yrjVar;
        this.g = afgzVar;
        this.b = amqoVar;
        this.h = amqoVar2;
        this.i = afjzVar;
    }

    public static axp d(pvf pvfVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int m = pvfVar.m();
        int i = 0;
        for (int i2 = 0; i2 < m; i2++) {
            if (pvfVar.r(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new axp(m, i);
    }

    @Override // defpackage.axs
    public final int a(int i) {
        throw null;
    }

    @Override // defpackage.axs
    public final axq b(axp axpVar, axr axrVar) {
        if (axpVar.a - axpVar.b > 1) {
            long c2 = f(e(axrVar.a.a), axrVar.b).c();
            if (c2 == -9223372036854775807L) {
                return null;
            }
            return new axq(c2);
        }
        return null;
    }

    @Override // defpackage.axs
    public final void c(long j) {
        this.e.remove(Long.valueOf(j));
    }

    public final afbo e(long j) {
        Map map = this.e;
        Long valueOf = Long.valueOf(j);
        afbo afboVar = (afbo) map.get(valueOf);
        if (afboVar == null) {
            afbo afboVar2 = new afbo();
            this.e.put(valueOf, afboVar2);
            return afboVar2;
        }
        return afboVar;
    }

    public final afbw f(afbo afboVar, IOException iOException) {
        if (!(iOException instanceof afkb) || ((afkb) iOException).e != 204) {
            if (iOException instanceof aeyn) {
                return d;
            }
            boolean z = iOException instanceof atg;
            if (!z || !this.g.e((atg) iOException, (VideoStreamingData) this.h.get())) {
                if (!(iOException instanceof aeyt) && !(iOException instanceof afkp)) {
                    if (!this.f.p() || !z) {
                        if (iOException instanceof ate) {
                            return new afbt(this, afboVar);
                        }
                        if ((iOException instanceof axn) || (iOException instanceof pds)) {
                            return c;
                        }
                        if (iOException instanceof afko) {
                            return new afbt(this, afboVar);
                        }
                        return new afbv(this, afboVar);
                    }
                    aqwu aqwuVar = ((PlayerConfigModel) this.b.get()).c.e;
                    if (aqwuVar == null) {
                        aqwuVar = aqwu.b;
                    }
                    long j = aqwuVar.bw;
                    if (!this.i.Q() || j <= 0) {
                        return new afbv(this, afboVar);
                    }
                    return new afbu(j);
                }
                return c;
            }
            return c;
        }
        aqwu aqwuVar2 = ((PlayerConfigModel) this.b.get()).c.e;
        if (aqwuVar2 == null) {
            aqwuVar2 = aqwu.b;
        }
        return (!aqwuVar2.bo || !(iOException instanceof aeyp)) ? d : new afbs(this, afboVar, (int) ((aeyp) iOException).d);
    }
}
