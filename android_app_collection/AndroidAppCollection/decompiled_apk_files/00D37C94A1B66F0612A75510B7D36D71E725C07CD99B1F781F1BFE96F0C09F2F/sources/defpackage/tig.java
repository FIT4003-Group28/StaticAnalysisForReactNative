package defpackage;

import com.facebook.litho.ComponentTree;
/* compiled from: PG */
/* renamed from: tig  reason: default package */
/* loaded from: classes4.dex */
public class tig {
    public final swq a;
    public final tdi b;
    public final boolean c;
    public final dhk d;
    public final amuk i;
    public final ajhh j;
    private final cyv k;
    public cyr f = null;
    public ComponentTree g = null;
    public int h = -1;
    private ddm l = null;
    private boolean m = false;
    public final aypf e = new aypf();

    public tig(swq swqVar, tdi tdiVar, tcr tcrVar, boolean z, cyv cyvVar, dhk dhkVar, ajhh ajhhVar) {
        this.a = swqVar;
        this.b = tdiVar;
        this.c = z;
        this.k = cyvVar;
        this.d = dhkVar;
        this.j = ajhhVar;
        this.i = amuk.r(tcrVar);
    }

    public final ComponentTree a() {
        if (this.g == null) {
            cyv cyvVar = this.k;
            if (this.f == null) {
                tif tifVar = new tif(this);
                dhk dhkVar = this.d;
                tic ticVar = new tic();
                tic.d(ticVar, dhkVar, new tie());
                ticVar.a.a = tifVar;
                ticVar.d.set(0);
                this.f = ticVar.a();
            }
            czf c = ComponentTree.c(cyvVar, this.f);
            c.h = this.l;
            c.i = this.m;
            c.d = this.c;
            this.g = c.a();
        }
        return this.g;
    }

    public final void b() {
        ComponentTree componentTree = this.g;
        if (componentTree != null) {
            this.l = componentTree.d();
            this.m = this.g.p;
            this.e.c();
            this.g.o();
            this.g = null;
            this.h = -1;
        }
    }
}
