package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ajfp  reason: default package */
/* loaded from: classes.dex */
public final class ajfp {
    public final TreeMap a = new TreeMap();
    public long b;
    public ajfq c;
    public final zgz d;
    public final String e;
    public final PlayerResponseModel f;

    public ajfp(ajfq ajfqVar, zgz zgzVar, long j, String str, PlayerResponseModel playerResponseModel) {
        this.c = ajfqVar;
        this.d = zgzVar;
        this.f = playerResponseModel;
        this.e = str;
        this.b = e(playerResponseModel, j);
    }

    private static long e(PlayerResponseModel playerResponseModel, long j) {
        return (playerResponseModel.F() || playerResponseModel.H()) ? j : Math.min(j, TimeUnit.SECONDS.toMillis(playerResponseModel.a()));
    }

    public final ajfo a(long j) {
        return b(j, this.b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ajbr, java.lang.Object] */
    public final ajfo b(long j, long j2) {
        ?? a = this.d.a();
        if (a != 0) {
            return new ajfo(a, j, j2, !this.f.F() && j2 >= TimeUnit.SECONDS.toMillis((long) this.f.a()));
        }
        return null;
    }

    public final void c(long j) {
        long e = e(this.f, j);
        long j2 = this.b;
        if (j2 != e) {
            long j3 = j2 - e;
            ajfq ajfqVar = this.c;
            ajfp ajfpVar = ajfqVar.e;
            ajfq r = ajfqVar.r();
            if (d()) {
                ajfq ajfqVar2 = this.c;
                if (ajfqVar2.d && ajfpVar != null && r != null) {
                    for (ajfq ajfqVar3 : ajfpVar.a.tailMap(Long.valueOf(ajfqVar2.a)).values()) {
                        r.w(ajfqVar3);
                        if (ajfqVar3 != this.c) {
                            ajfqVar3.g -= j3;
                        } else {
                            ajfqVar3.f -= j3;
                        }
                        r.v(ajfqVar3);
                    }
                }
            }
            this.b = e;
        }
    }

    public final boolean d() {
        return this.f.c() != null && this.f.c().ai();
    }
}
