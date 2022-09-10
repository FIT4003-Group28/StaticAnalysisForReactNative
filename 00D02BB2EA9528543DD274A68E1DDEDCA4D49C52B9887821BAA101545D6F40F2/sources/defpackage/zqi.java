package defpackage;

import android.app.Activity;
import java.util.Arrays;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zqi  reason: default package */
/* loaded from: classes7.dex */
public final class zqi {
    public final Activity a;
    public final zkq b;
    public final ycj c;
    public final umi d;
    public final zlf e;
    public final zqm f;
    public final zpy g;
    public final zfx h;
    public final cqhn i;
    @dzsi
    public final zkt j;
    public final vyp k;
    public final gce l;
    public final Executor m;
    public final qbv n;
    @dzsi
    private final dxio<qce> o;

    public zqi(Activity activity, zkq zkqVar, ycj ycjVar, umi umiVar, zlf zlfVar, zqm zqmVar, zfx zfxVar, @dzsi dxio<qce> dxioVar, zpy zpyVar, vyp vypVar, gce gceVar, cqhn cqhnVar, zkt zktVar, qbv qbvVar, Executor executor) {
        this.a = activity;
        this.b = zkqVar;
        this.c = ycjVar;
        this.d = umiVar;
        this.e = zlfVar;
        this.f = zqmVar;
        this.h = zfxVar;
        this.o = dxioVar;
        this.g = zpyVar;
        this.k = vypVar;
        this.l = gceVar;
        this.i = cqhnVar;
        this.j = zktVar;
        this.m = executor;
        this.n = qbvVar;
    }

    public final boolean a(amub amubVar) {
        dxio<qce> dxioVar;
        if (vyr.g(Arrays.asList(amubVar.o)) > 0 || (dxioVar = this.o) == null) {
            return false;
        }
        return dxioVar.a().i();
    }
}
