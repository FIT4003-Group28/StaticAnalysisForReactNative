package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: byje  reason: default package */
/* loaded from: classes4.dex */
public final class byje {
    public final axwq a;
    public final int b;
    public final int c;
    public final boolean d;
    public final dzsj<srv> e;
    public final vxa f;
    public final bvjj g;
    public final dxio<ahjq> h;
    public final Activity i;
    public final btrm j;
    public final boolean k;
    public srv l;
    @dzsi
    public amte m;
    public byjw n;
    @dzsi
    public byjd o;
    @dzsi
    public final dljj p;
    @dzsi
    public dlji q;

    public byje(bvjj bvjjVar, axwq axwqVar, btrm btrmVar, dzsj<srv> dzsjVar, vxa vxaVar, acyr acyrVar, dxio<ahjq> dxioVar, Activity activity, byex byexVar, btvo btvoVar, @dzsi dljj dljjVar) {
        this.g = bvjjVar;
        this.a = axwqVar;
        this.b = acyrVar.b().a;
        int i = acyrVar.b().b;
        this.c = i == 0 ? Integer.MAX_VALUE : i;
        this.j = btrmVar;
        this.e = dzsjVar;
        this.f = vxaVar;
        srv a = dzsjVar.a();
        dbsk.s(a);
        this.l = a;
        this.m = null;
        this.n = byjw.WAITING_TO_REQUEST;
        this.p = dljjVar;
        this.h = dxioVar;
        this.i = activity;
        this.k = byexVar.a();
        this.d = btvoVar.getTrafficHubParameters().a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        byjd byjdVar = this.o;
        if (byjdVar != null) {
            byjw byjwVar = this.n;
            dlji dljiVar = this.q;
            amte amteVar = this.m;
            byjy byjyVar = (byjy) byjdVar;
            byjx byjxVar = byjyVar.d;
            if (byjxVar == null) {
                return;
            }
            byip byipVar = byjyVar.b;
            byjxVar.s(byipVar.d, byjwVar, dljiVar, byipVar.c, amteVar);
        }
    }
}
