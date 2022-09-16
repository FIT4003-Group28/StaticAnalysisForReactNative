package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bjzd  reason: default package */
/* loaded from: classes3.dex */
public class bjzd implements cqkp {
    public final btrm a;
    public final bjgh b;
    public final Runnable c;
    public Boolean d = false;
    public final btzi<djar, djav> e;
    private final gga f;
    private final bwqv g;
    private final bjyr h;
    private final bkak i;
    private final bjxd j;
    private final dxio<afha> k;
    private final bjgy l;
    private final bwrs<ilo> m;
    private final bjjo n;

    public bjzd(final gga ggaVar, bwqv bwqvVar, bjyr bjyrVar, bkak bkakVar, bjxd bjxdVar, btrm btrmVar, final bvfk bvfkVar, final Executor executor, bjgi bjgiVar, dxio dxioVar, bjgy bjgyVar, bwrs bwrsVar, final djao djaoVar, bjjo bjjoVar) {
        new bjzb(this);
        this.e = new bjzc(this);
        this.f = ggaVar;
        this.g = bwqvVar;
        this.h = bjyrVar;
        this.i = bkakVar;
        this.j = bjxdVar;
        this.a = btrmVar;
        this.k = dxioVar;
        this.l = bjgyVar;
        this.m = bwrsVar;
        ggaVar.getClass();
        new Runnable(ggaVar) { // from class: bjyx
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.onBackPressed();
            }
        };
        this.n = bjjoVar;
        final ilo iloVar = (ilo) bwrsVar.c();
        dbsk.s(iloVar);
        this.b = bjgiVar.b(iloVar);
        this.c = new Runnable(this, bvfkVar, iloVar, djaoVar, executor) { // from class: bjyy
            private final bjzd a;
            private final bvfk b;
            private final ilo c;
            private final djao d;
            private final Executor e;

            {
                this.a = this;
                this.b = bvfkVar;
                this.c = iloVar;
                this.d = djaoVar;
                this.e = executor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjzd bjzdVar = this.a;
                bvfk bvfkVar2 = this.b;
                ilo iloVar2 = this.c;
                djao djaoVar2 = this.d;
                Executor executor2 = this.e;
                djap bZ = djar.l.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djar djarVar = (djar) bZ.b;
                djarVar.b = 3;
                djarVar.a |= 1;
                String o = iloVar2.ai().o();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djar djarVar2 = (djar) bZ.b;
                o.getClass();
                djarVar2.a |= 4;
                djarVar2.d = o;
                String cG = iloVar2.cG();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djar djarVar3 = (djar) bZ.b;
                cG.getClass();
                djarVar3.a |= 8;
                djarVar3.e = cG;
                djam djamVar = djaoVar2.b;
                if (djamVar == null) {
                    djamVar = djam.m;
                }
                String str = djamVar.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djar djarVar4 = (djar) bZ.b;
                str.getClass();
                djarVar4.a |= 2;
                djarVar4.c = str;
                bvfkVar2.b(bZ.bK(), bjzdVar.e, executor2);
            }
        };
        bjgr.d(iloVar);
        a(djaoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(final defpackage.djao r18) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjzd.a(djao):void");
    }
}
