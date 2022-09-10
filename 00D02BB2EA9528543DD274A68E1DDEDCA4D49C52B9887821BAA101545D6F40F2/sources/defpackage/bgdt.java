package defpackage;
/* compiled from: PG */
/* renamed from: bgdt  reason: default package */
/* loaded from: classes3.dex */
public final class bgdt {
    @dzsi
    public btxx a;
    private final btvo b;
    private final ckcw c;
    private final bgdz d;

    public bgdt(btvo btvoVar, ckcw ckcwVar, bgdz bgdzVar) {
        this.b = btvoVar;
        this.c = ckcwVar;
        this.d = bgdzVar;
    }

    public final synchronized void a(dwcw dwcwVar, begq begqVar) {
        b();
        bgds bgdsVar = new bgds(this, begqVar);
        btxz btxzVar = new btxz(this.c, dunt.TACTILE_LOCATION_DETAILS_REQUEST);
        int i = this.b.getOfflineMapsParameters().e;
        bgdz bgdzVar = this.d;
        bvrj bvrjVar = bvrj.UI_THREAD;
        btpc a = bgdzVar.a.a();
        bgdz.a(a, 1);
        bupz a2 = bgdzVar.b.a();
        bgdz.a(a2, 2);
        avnt a3 = bgdzVar.c.a();
        bgdz.a(a3, 3);
        cqat a4 = bgdzVar.d.a();
        bgdz.a(a4, 4);
        bvrb a5 = bgdzVar.e.a();
        bgdz.a(a5, 5);
        bgdz.a(dwcwVar, 6);
        bgdz.a(btxzVar, 7);
        bgdz.a(bgdsVar, 8);
        bgdz.a(bvrjVar, 9);
        bgdy bgdyVar = new bgdy(a, a2, a3, a4, a5, dwcwVar, btxzVar, bgdsVar, bvrjVar, i);
        this.a = bgdyVar;
        bgdyVar.a();
    }

    public final synchronized void b() {
        btxx btxxVar = this.a;
        if (btxxVar != null) {
            btxxVar.b();
        }
        this.a = null;
    }
}
