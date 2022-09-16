package defpackage;

import android.content.Context;
import android.os.FileObserver;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: dzs  reason: default package */
/* loaded from: classes3.dex */
public final class dzs implements dzc, ynl {
    axnm A;
    azqb B;
    azqb C;
    azqb D;
    azqb E;
    azqb F;
    azqb G;
    azqb H;
    axnm I;

    /* renamed from: J  reason: collision with root package name */
    axnm f199J;
    axnm K;
    azqb L;
    azqb M;
    azqb N;
    azqb O;
    axnm P;
    adxy Q;
    adyt R;
    dys S;
    acrb T;
    akpx U;
    azqb V;
    axnm W;
    azqb X;
    azqb Y;
    azqb Z;
    ykv a;
    azqb aA;
    azqb aB;
    azqb aC;
    azqb aD;
    azqb aE;
    azqb aF;
    azqb aG;
    azqb aH;
    azqb aI;
    azqb aJ;
    axnm aK;
    azqb aL;
    azqb aM;
    azqb aN;
    azqb aO;
    azqb aP;
    azqb aQ;
    azqb aR;
    azqb aS;
    azqb aT;
    azqb aU;
    azqb aV;
    azqb aW;
    azqb aX;
    azqb aY;
    aaca aZ;
    azqb aa;
    azqb ab;
    azqb ac;
    azqb ad;
    azqb ae;
    azqb af;
    azqb ag;
    azqb ah;
    azqb ai;
    azqb aj;
    axnm ak;
    azqb al;
    ayor am;
    azqb an;
    azqb ao;
    azqb ap;
    azqb aq;
    azqb ar;
    azqb as;
    azqb at;
    azqb au;
    azqb av;
    azqb aw;
    azqb ax;
    azqb ay;
    azqb az;
    public FileObserver b;
    azqb ba;
    azqb bb;
    public final Context bc;
    public final ywk bd;
    private final ajms be;
    private final azqb bf;
    private final azqb bg;
    azqb c;
    azqb d;
    azqb e;
    ankt f;
    azqb g;
    azqb h;
    azqb i;
    axnm j;
    axnm k;
    azqb l;
    azqb m;
    azqb n;
    azqb o;
    axnm p;
    axnm q;
    azqb r;
    azqb s;
    azqb t;
    azqb u;
    azqb v;
    azqb w;
    azqb x;
    azqb y;
    axnm z;

    public dzs(Context context, ajms ajmsVar, azqb azqbVar, azqb azqbVar2, ywk ywkVar) {
        this.bc = context;
        this.be = ajmsVar;
        this.bf = azqbVar;
        this.bg = azqbVar2;
        this.bd = ywkVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, dwk] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.Context, dwk] */
    private final void g() {
        boolean z;
        ylr.c();
        try {
            z = ((Boolean) this.f.get(500L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            z = false;
        }
        ((etn) this.af.get()).b(this.bc.c(), this.bc.b(), z, ((Boolean) this.g.get()).booleanValue());
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04c1  */
    @Override // defpackage.dzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzs.a():void");
    }

    public final void b(Executor executor) {
        executor.execute(new dzo(this, 13));
    }

    public final void c() {
        this.a.a();
    }

    public final void d(boolean z) {
        if (z) {
            azqb azqbVar = this.bf;
            azqbVar.getClass();
            ((Executor) this.aT.get()).execute(new ysg(azqbVar, 1));
            return;
        }
        this.bf.get();
    }

    public final void e(boolean z) {
        ((aksw) this.V.get()).c(z, this.aF);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                ((ces) this.ak.get()).b();
                ((aget) this.m.get()).b(ages.USER_CHANGED);
                ((akhf) this.n.get()).a();
                ((akhi) this.o.get()).a();
                ((ScheduledExecutorService) this.al.get()).execute(new dzo(this, 10));
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                ((ces) this.ak.get()).b();
                ((aget) this.m.get()).b(ages.USER_CHANGED);
                ((akhf) this.n.get()).a();
                ((akhi) this.o.get()).a();
                ahfe.h(this.bc);
                ((ScheduledExecutorService) this.al.get()).execute(new dzo(this, 11));
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
