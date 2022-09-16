package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adye  reason: default package */
/* loaded from: classes.dex */
public final class adye implements afle {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ adxw c;
    final /* synthetic */ aadd d;
    final /* synthetic */ Executor e;
    final /* synthetic */ aepf f;
    final /* synthetic */ afmj g;
    final /* synthetic */ adzo h;
    final /* synthetic */ aeju i;
    final /* synthetic */ azqb j;
    final /* synthetic */ afla k;
    final /* synthetic */ aegh l;
    final /* synthetic */ ScheduledExecutorService m;
    final /* synthetic */ snc n;
    final /* synthetic */ aeln o;
    final /* synthetic */ yrj p;
    final /* synthetic */ aehz q;
    final /* synthetic */ afex r;
    final /* synthetic */ afgz s;
    final /* synthetic */ yrh t;
    final /* synthetic */ afgv u;
    final /* synthetic */ aeky v;
    final /* synthetic */ afmj w;
    final /* synthetic */ afjz x;
    final /* synthetic */ afbz y;
    final /* synthetic */ agpr z;

    public adye(Context context, String str, adxw adxwVar, aadd aaddVar, Executor executor, aepf aepfVar, afmj afmjVar, adzo adzoVar, aeju aejuVar, azqb azqbVar, afla aflaVar, aegh aeghVar, afbz afbzVar, ScheduledExecutorService scheduledExecutorService, snc sncVar, aeln aelnVar, yrj yrjVar, aehz aehzVar, afjz afjzVar, afex afexVar, afgz afgzVar, agpr agprVar, yrh yrhVar, afgv afgvVar, aeky aekyVar, afmj afmjVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
        this.b = str;
        this.c = adxwVar;
        this.d = aaddVar;
        this.e = executor;
        this.f = aepfVar;
        this.g = afmjVar;
        this.h = adzoVar;
        this.i = aejuVar;
        this.j = azqbVar;
        this.k = aflaVar;
        this.l = aeghVar;
        this.y = afbzVar;
        this.m = scheduledExecutorService;
        this.n = sncVar;
        this.o = aelnVar;
        this.p = yrjVar;
        this.q = aehzVar;
        this.x = afjzVar;
        this.r = afexVar;
        this.s = afgzVar;
        this.z = agprVar;
        this.t = yrhVar;
        this.u = afgvVar;
        this.v = aekyVar;
        this.w = afmjVar2;
    }

    @Override // defpackage.afle
    public final aflf a(afld afldVar, int i) {
        int i2;
        atk[] atkVarArr;
        int i3 = i - 1;
        if (i3 == 0 || i3 == 3 || i3 == 4 || i3 == 5) {
            return new aflf(this.a, this.b, this.c, this.d, this.e, new atk[]{this.f.i()}, new atk[]{new aevq(afldVar.e), this.g}, this.h, this.i, this.j, i == 1 ? null : this.k, i == 1 ? null : this.l, this.y, this.m, this.n, this.o, this.p, this.q, i, i == 5, this.x, this.r, this.s, this.z, this.t, this.u, afldVar, this.v, null, null, null);
        }
        if (i == 2) {
            atkVarArr = new atk[]{this.w};
            i2 = 2;
        } else {
            i2 = i;
            atkVarArr = null;
        }
        return new aflf(this.a, this.b, this.c, this.d, this.e, null, atkVarArr, null, null, this.j, null, null, null, this.m, this.n, this.o, this.p, aeia.b, i2, false, this.x, this.r, this.s, this.z, this.t, this.u, afldVar, this.v, null, null, null);
    }
}
