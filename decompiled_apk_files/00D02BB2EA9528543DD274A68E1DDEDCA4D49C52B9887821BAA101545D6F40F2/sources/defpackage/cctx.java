package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cctx  reason: default package */
/* loaded from: classes4.dex */
public final class cctx {
    private static final dcqe a = dcqe.c("cctx");
    private final buqs b;
    private final chhs c;
    private final Executor d;
    private final gga e;
    private dbsg<ex> f = dbpy.a;

    public cctx(gga ggaVar, Executor executor, buqs buqsVar, chht chhtVar) {
        this.b = buqsVar;
        this.c = chhtVar.a(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
        this.d = executor;
        this.e = ggaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.djhq c(defpackage.dgfb r7, int r8, defpackage.bbvj r9, int r10) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cctx.c(dgfb, int, bbvj, int):djhq");
    }

    private final void d() {
        if (this.f.a()) {
            this.f.b().f();
            this.f = dbpy.a;
        }
    }

    public final void a(djhq djhqVar, final cctw cctwVar) {
        bvrj.UI_THREAD.c();
        if (this.f.a()) {
            bvoo.h("Tried to show a progress dialog but one is already present", new Object[0]);
            d();
        }
        dbsg<ex> i = dbsg.i(cctr.aJ(R.string.SENDING));
        this.f = i;
        i.b().e(this.e.g(), "dialog");
        this.b.b(djhqVar, new ccts(new bvqg(this, cctwVar) { // from class: cctu
            private final cctx a;
            private final cctw b;

            {
                this.a = this;
                this.b = cctwVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.b(dbsg.i((djhs) obj), this.b);
            }
        }, new bvqg(this, cctwVar) { // from class: cctv
            private final cctx a;
            private final cctw b;

            {
                this.a = this;
                this.b = cctwVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                btzy btzyVar = (btzy) obj;
                this.a.b(dbpy.a, this.b);
            }
        }), this.d);
    }

    public final void b(dbsg<djhs> dbsgVar, cctw cctwVar) {
        djgl bK;
        bvrj.UI_THREAD.c();
        d();
        if (dbsgVar.a() && (dbsgVar.b().a & 1) != 0) {
            bK = dbsgVar.b().b;
            if (bK == null) {
                bK = djgl.g;
            }
        } else {
            chhs chhsVar = this.c;
            djgk bZ = djgl.g.bZ();
            djfu bZ2 = djfx.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djfx djfxVar = (djfx) bZ2.b;
            djfxVar.b = 6;
            djfxVar.a |= 1;
            djva bZ3 = djvd.d.bZ();
            djvc djvcVar = djvc.MAJOR_TYPE;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            djvd djvdVar = (djvd) bZ3.b;
            djvdVar.b = djvcVar.d;
            djvdVar.a |= 1;
            String string = chhsVar.b.getString(R.string.OFFERING_ANNOTATION_THANKS_FOR_ANSWERING);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            djvd djvdVar2 = (djvd) bZ3.b;
            string.getClass();
            djvdVar2.a |= 2;
            djvdVar2.c = string;
            bZ2.c(bZ3);
            djva bZ4 = djvd.d.bZ();
            djvc djvcVar2 = djvc.MINOR_TYPE;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djvd djvdVar3 = (djvd) bZ4.b;
            djvdVar3.b = djvcVar2.d;
            djvdVar3.a |= 1;
            String string2 = chhsVar.b.getString(R.string.OFFERING_ANNOTATION_YOU_HELPED_OTHERS_DECIDE);
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djvd djvdVar4 = (djvd) bZ4.b;
            string2.getClass();
            djvdVar4.a |= 2;
            djvdVar4.c = string2;
            bZ2.c(bZ4);
            bZ2.b(chhsVar.c);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djgl djglVar = (djgl) bZ.b;
            djfx bK2 = bZ2.bK();
            bK2.getClass();
            djglVar.c = bK2;
            djglVar.b = 1;
            bK = bZ.bK();
        }
        cctwVar.a(bK);
    }
}
