package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: jxj  reason: default package */
/* loaded from: classes3.dex */
public final class jxj extends ahiq implements ezg, kls, aiby, frn, ynl {
    public asaa a;
    private final fet i;
    private final aadd j;
    private final egn k;
    private final nub l;
    private final ajdz m;
    private final fdu n;
    private final ayqb o;
    private final frr p;
    private ezx q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private WatchNextResponseModel w;
    private aypg x;

    public jxj(ahix ahixVar, jxn jxnVar, feu feuVar, aafo aafoVar, acti actiVar, aire aireVar, zah zahVar, yrj yrjVar, egn egnVar, yni yniVar, aadd aaddVar, nub nubVar, frr frrVar, ajdz ajdzVar, fdu fduVar, azqb azqbVar) {
        super(ahixVar, jxnVar, feuVar, aafoVar, actiVar, aireVar, zahVar, yrjVar, yniVar, azqbVar);
        this.q = ezx.NONE;
        this.j = aaddVar;
        this.i = new fet(feuVar);
        this.k = egnVar;
        this.l = nubVar;
        this.p = frrVar;
        this.m = ajdzVar;
        this.n = fduVar;
        this.o = new jxi(this, 2);
    }

    private final boolean A() {
        return this.s && this.t;
    }

    private final boolean B() {
        return this.n.b == fdq.WATCH_WHILE;
    }

    @Override // defpackage.frn
    public final void a(auaz auazVar) {
        x(auazVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahiq
    public final int b() {
        int i;
        return (!this.q.e() || (i = this.r) < 0) ? super.b() : i;
    }

    @Override // defpackage.ahiq
    public final void c(ahhw ahhwVar) {
        super.c(ahhwVar);
        aika aikaVar = aika.NEW;
        int ordinal = ahhwVar.c().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            aypg aypgVar = this.x;
            if (aypgVar != null && !aypgVar.e()) {
                azof.f((AtomicReference) this.x);
            }
            this.x = null;
            this.a = null;
        } else if (ordinal != 2 || this.m == null) {
        } else {
            aypg aypgVar2 = this.x;
            if (aypgVar2 != null && !aypgVar2.e()) {
                return;
            }
            this.x = this.m.c.n().Z(this.o);
        }
    }

    public final void d(ahia ahiaVar) {
        this.u = ahiaVar.a() == 9;
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0024  */
    @Override // defpackage.kls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r4.A()
            boolean r1 = r4.s
            r2 = 1
            r3 = 2
            if (r5 == r3) goto Lf
            if (r5 != r2) goto Ld
            goto Lf
        Ld:
            r5 = 0
            goto L10
        Lf:
            r5 = 1
        L10:
            r4.s = r5
            if (r5 != r1) goto L1b
            boolean r5 = r4.t
            if (r5 != 0) goto L1d
            if (r6 == 0) goto L1d
            r6 = 1
        L1b:
            r4.t = r6
        L1d:
            boolean r5 = r4.A()
            if (r0 != r5) goto L24
            return
        L24:
            r4.y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxj.e(int, boolean):void");
    }

    @Override // defpackage.ahiq, defpackage.airt
    public final aypg[] g(airw airwVar) {
        aypg[] g = super.g(airwVar);
        aypg[] aypgVarArr = {airwVar.G().i.Z(new jxi(this)), this.k.b().ae(aypa.a()).as(new jxi(this, 1))};
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, aypgVarArr);
        Collections.addAll(arrayList, g);
        return (aypg[]) arrayList.toArray(new aypg[0]);
    }

    @Override // defpackage.ahiq
    protected final void i(WatchNextResponseModel watchNextResponseModel) {
        this.w = watchNextResponseModel;
        if (!TextUtils.isEmpty(watchNextResponseModel.b)) {
            frm a = this.p.a(watchNextResponseModel.b);
            WeakReference weakReference = new WeakReference(this);
            a.f.add(weakReference);
            List list = a.h;
            if (list == null) {
                return;
            }
            frm.d(list, amuk.q(), amuk.q(), amuk.q(), amuk.r(weakReference), a.b);
        }
    }

    @Override // defpackage.ahiq
    protected final void j() {
        aaks aaksVar;
        aako a;
        apzg a2;
        WatchNextResponseModel watchNextResponseModel = this.w;
        if (watchNextResponseModel == null || (aaksVar = watchNextResponseModel.h) == null || (a = aaksVar.a(false, false, false, false)) == null || (a2 = a.a()) == null) {
            return;
        }
        aijl d = PlaybackStartDescriptor.d();
        d.a = a2;
        d.e = true;
        d.f = true;
        this.l.f(d.a(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ahiq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void k() {
        /*
            r5 = this;
            asaa r0 = r5.a
            r1 = 0
            if (r0 == 0) goto L29
            arzu r0 = r0.n
            if (r0 != 0) goto Lb
            arzu r0 = defpackage.arzu.a
        Lb:
            asuv r0 = r0.c
            if (r0 != 0) goto L11
            asuv r0 = defpackage.asuv.a
        L11:
            int r2 = r0.b
            r3 = 4
            r2 = r2 & r3
            if (r2 == 0) goto L29
            int r2 = r0.e
            int r2 = defpackage.akzj.w(r2)
            if (r2 != 0) goto L20
            goto L29
        L20:
            if (r2 != r3) goto L29
            apzg r0 = r0.c
            if (r0 != 0) goto L2a
            apzg r0 = defpackage.apzg.a
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2d
            goto L4f
        L2d:
            auaz r2 = r5.g
            aopg r3 = com.google.protos.youtube.api.innertube.WatchEndpointOuterClass.watchEndpoint
            java.lang.Object r3 = r0.qm(r3)
            awel r3 = (defpackage.awel) r3
            java.lang.String r3 = r3.c
            if (r2 == 0) goto L4e
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L49
            java.lang.String r4 = r2.p
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L4e
        L49:
            boolean r2 = r2.o
            if (r2 != 0) goto L4e
            goto L4f
        L4e:
            r1 = r0
        L4f:
            if (r1 == 0) goto L54
            r5.w(r1)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxj.k():void");
    }

    @Override // defpackage.ahiq, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == jxj.class) {
            if (i == -1) {
                return new Class[]{ahia.class};
            }
            if (i == 0) {
                d((ahia) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return ahfe.a(this, obj, i);
    }

    @Override // defpackage.ahiq
    protected final boolean l() {
        return !this.u && !this.q.d() && !A() && B() && !this.v && !this.k.g();
    }

    @Override // defpackage.ahiq
    protected final boolean m() {
        return B();
    }

    @Override // defpackage.aiby
    public final void nt(int i, long j) {
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        this.v = z;
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (this.q != ezxVar) {
            this.q = ezxVar;
            if (ezxVar.l()) {
                this.i.a();
            } else {
                this.i.b();
            }
            if (!this.q.e()) {
                return;
            }
            this.r = eog.l(this.j);
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
