package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afev  reason: default package */
/* loaded from: classes.dex */
public abstract class afev {
    protected final aeub a;
    protected final afjz b;
    private HashMap c = new HashMap();
    private String d;
    private boolean e;
    private long f;

    public afev(afjz afjzVar, aeub aeubVar) {
        afms.b(aeubVar != null);
        this.b = afjzVar;
        this.a = aeubVar;
    }

    public abstract void a(List list, long j, long j2, afes[] afesVarArr, afer aferVar);

    public void b(boolean z) {
    }

    public void c() {
    }

    public void d(float f) {
    }

    public void e() {
    }

    public void f(aegx aegxVar) {
    }

    public void g(afmv afmvVar) {
    }

    public final boolean h(adzz adzzVar, afes afesVar, String str, PlayerConfigModel playerConfigModel, long j) {
        String d = afesVar.d();
        if (!this.b.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_ENABLE_CACHE_OPTIMIZATIONS)) {
            if (adzzVar != null && !TextUtils.isEmpty(str) && !playerConfigModel.Z()) {
                aqwu aqwuVar = playerConfigModel.c.e;
                if (aqwuVar == null) {
                    aqwuVar = aqwu.b;
                }
                int i = aqwuVar.E;
                if (adzzVar.e(str, d, j, i == 0 ? 10 : i, 0, 1)) {
                    return true;
                }
            }
            return false;
        }
        String str2 = this.d;
        if (str2 == null || str2 != str || this.f > j) {
            this.d = str;
            this.c = new HashMap();
            this.f = 0L;
            this.e = false;
            afki afkiVar = afki.ABR;
        }
        this.f = j;
        adzx adzxVar = (adzx) this.c.get(d);
        if (adzxVar == null) {
            if (str != null) {
                adzxVar = adzzVar.c(str, d, j, true);
            }
            if (adzxVar == null) {
                return false;
            }
            this.c.put(d, adzxVar);
        }
        long j2 = adzxVar.a;
        if (j2 >= 0) {
            long j3 = adzxVar.c;
            if (j3 > 0) {
                if (j2 > j) {
                    afki afkiVar2 = afki.ABR;
                    TimeUnit.MICROSECONDS.toSeconds(adzxVar.a - j);
                    return false;
                }
                long j4 = j3 - j;
                if (j4 <= 0) {
                    this.c.remove(d);
                    afki afkiVar3 = afki.ABR;
                    return false;
                }
                afki afkiVar4 = afki.ABR;
                TimeUnit.MICROSECONDS.toSeconds(j4);
                return j4 > TimeUnit.SECONDS.toMicros(5L) * 10;
            }
        }
        if (!this.e && adzxVar.e == 5) {
            this.e = true;
            this.a.d(new afkn("cache", TimeUnit.MICROSECONDS.toMillis(j), d.length() != 0 ? "info.nochunkindex;fmt.".concat(d) : new String("info.nochunkindex;fmt.")));
        }
        return false;
    }
}
