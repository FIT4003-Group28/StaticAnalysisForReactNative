package defpackage;

import android.util.Pair;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: hca  reason: default package */
/* loaded from: classes3.dex */
public final class hca implements hdb {
    private final hcy a;

    public hca(hcy hcyVar) {
        this.a = hcyVar;
    }

    @Override // defpackage.hdb
    public final /* bridge */ /* synthetic */ hcv a(axbm axbmVar) {
        axca axcaVar;
        axcp axcpVar;
        axbk i = axbmVar.i();
        if (i.c == 1) {
            axcaVar = (axca) i.d;
        } else {
            axcaVar = axca.a;
        }
        int i2 = axcaVar.i;
        axak axakVar = axak.FONT_FAMILY_UNSPECIFIED;
        axcs n = axbmVar.n();
        if (n.b == 1) {
            axcpVar = (axcp) n.c;
        } else {
            axcpVar = axcp.a;
        }
        long j = -1;
        long j2 = -1;
        for (Long l : Collections.unmodifiableMap(axcpVar.b).keySet()) {
            long longValue = l.longValue();
            if (longValue >= 0) {
                if (j >= 0) {
                    if (longValue < j) {
                        j2 = j;
                    } else {
                        j2 = longValue;
                    }
                }
                j = longValue;
            }
        }
        Pair pair = new Pair(Long.valueOf(j), Long.valueOf(j2));
        hcy hcyVar = this.a;
        String str = axcaVar.c;
        long e = axbmVar.e();
        aotk aotkVar = axcaVar.e;
        if (aotkVar == null) {
            aotkVar = aotk.a;
        }
        int h = hqs.h(aotkVar);
        aotk aotkVar2 = axcaVar.f;
        if (aotkVar2 == null) {
            aotkVar2 = aotk.a;
        }
        return new hcn(hcyVar, str, e, h, hqs.h(aotkVar2), TimeUnit.MICROSECONDS.toMillis(((Long) pair.first).longValue()), TimeUnit.MICROSECONDS.toMillis(((Long) pair.second).longValue()));
    }

    @Override // defpackage.hdb
    public final boolean b(axbm axbmVar) {
        return axbmVar.i().c == 1;
    }
}
