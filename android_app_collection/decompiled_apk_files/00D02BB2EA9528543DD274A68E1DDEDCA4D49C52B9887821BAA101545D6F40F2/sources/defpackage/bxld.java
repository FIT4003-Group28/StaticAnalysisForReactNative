package defpackage;
/* compiled from: PG */
/* renamed from: bxld  reason: default package */
/* loaded from: classes4.dex */
public final class bxld implements btxx {
    public final btxz a;
    public final bxec b;
    private final btpc c;
    private final avnt d;
    private final dvvu e;
    @dzsi
    private btzc f;
    @dzsi
    private btzc g;
    private final btzi<dvvu, dvvw> h = new bxlb(this);
    private final btzi<dvvu, dvvw> i = new bxlc(this);
    private final bute j;

    public bxld(btpc btpcVar, bute buteVar, avnt avntVar, btxz btxzVar, dvvu dvvuVar, bxec bxecVar) {
        this.c = btpcVar;
        this.j = buteVar;
        this.d = avntVar;
        this.a = btxzVar;
        this.e = dvvuVar;
        this.b = bxecVar;
    }

    @Override // defpackage.btxx
    public final synchronized void a() {
        boolean z = true;
        dbsk.a(this.f == null);
        if (this.g != null) {
            z = false;
        }
        dbsk.a(z);
        if (!this.c.i()) {
            this.g = this.d.f(this.e, bttv.a, this.i, bvrj.SUGGEST_CALLBACK_THREAD);
        } else {
            this.f = this.j.a(this.e, this.h, bvrj.SUGGEST_CALLBACK_THREAD);
        }
    }

    @Override // defpackage.btxx
    public final synchronized void b() {
        btzc btzcVar = this.f;
        if (btzcVar != null) {
            btzcVar.a();
        }
        btzc btzcVar2 = this.g;
        if (btzcVar2 != null) {
            btzcVar2.a();
        }
    }
}
