package defpackage;

import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnmj  reason: default package */
/* loaded from: classes3.dex */
public final class bnmj implements cjqv {
    final /* synthetic */ bnmm a;

    public bnmj(bnmm bnmmVar) {
        this.a = bnmmVar;
    }

    @Override // defpackage.cjqv
    public final void a(cjtd cjtdVar) {
        if (this.a.w()) {
            bnmm bnmmVar = this.a;
            ddho ddhoVar = cjtdVar.g;
            if (ddhoVar == null) {
                return;
            }
            int b = ddhoVar.b();
            boolean e = bnmmVar.j.e();
            dcha<Integer, dvev> dchaVar = bnmmVar.b;
            Integer valueOf = Integer.valueOf(b);
            if (!dchaVar.m(valueOf)) {
                return;
            }
            for (dvev dvevVar : bnmmVar.b.c(valueOf)) {
                if (e || !dvevVar.f) {
                    int hashCode = Arrays.hashCode(new Object[]{dvevVar.b, dvevVar.c});
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("nudgebarLastDisplayedPrefix");
                    sb.append(hashCode);
                    String sb2 = sb.toString();
                    long b2 = bnmmVar.h.b();
                    SharedPreferences sharedPreferences = bnmmVar.t;
                    if (sharedPreferences != null && b2 - sharedPreferences.getLong(sb2, 0L) >= TimeUnit.DAYS.toMillis(dvevVar.g)) {
                        Set<Integer> set = bnmmVar.a;
                        Integer valueOf2 = Integer.valueOf(b);
                        if (!set.contains(valueOf2)) {
                            bnmmVar.a.add(valueOf2);
                            bnmmVar.k.b(new bnmk(bnmmVar, sb2, b2, dvevVar), bvrj.BACKGROUND_THREADPOOL);
                            return;
                        }
                    }
                }
            }
        }
    }
}
