package defpackage;

import android.net.Uri;
import java.util.Date;
/* compiled from: PG */
/* renamed from: bzsi  reason: default package */
/* loaded from: classes4.dex */
public final class bzsi implements cdgp {
    private final btvo a;
    private final bbtk b;
    private final bztp c;

    public bzsi(btvo btvoVar, bbtk bbtkVar, bztp bztpVar) {
        this.a = btvoVar;
        this.b = bbtkVar;
        this.c = bztpVar;
    }

    @Override // defpackage.cdgp
    public final boolean a() {
        return this.c.a().booleanValue();
    }

    @Override // defpackage.cdgp
    public final void b(cdhe cdheVar) {
        eaol a;
        Uri uri = cdheVar.a;
        bbtj a2 = this.b.a(uri);
        Date k = a2.k();
        if (k != null) {
            a = new eaol(k.getTime());
        } else {
            dbsg<Date> l = a2.l();
            if (l.a()) {
                a = new eaol(l.b().getTime());
            } else {
                a = eaol.a();
            }
        }
        akqq akqqVar = cdheVar.d;
        boolean contains = cdheVar.f.contains(cdhg.FACE_DETECTION_FOUND_FACE);
        dvlp dvlpVar = this.a.getPhotoTakenNotificationParameters().j;
        if (dvlpVar == null) {
            dvlpVar = dvlp.f;
        }
        final float f = dvlpVar.e;
        dcdc z = dcbg.b(dchl.c(cdheVar.e)).o(new dbsl(f) { // from class: bzsg
            private final float a;

            {
                this.a = f;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((cpfx) obj).b >= this.a;
            }
        }).s(bzsh.a).z();
        bztp bztpVar = this.c;
        bzti j = bztl.j();
        j.e(uri);
        bzte bzteVar = (bzte) j;
        bzteVar.a = a;
        bzteVar.b = akqqVar;
        j.d(cdheVar.a());
        j.g(false);
        j.c(contains);
        j.b(z);
        final bztl a3 = j.a();
        final deig d = deig.d();
        final bzsz bzszVar = (bzsz) bztpVar;
        bzszVar.d.execute(new Runnable(bzszVar, d, a3) { // from class: bzsm
            private final bzsz a;
            private final deig b;
            private final bztl c;

            {
                this.a = bzszVar;
                this.b = d;
                this.c = a3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0265 A[Catch: bvjv -> 0x0283, TRY_ENTER, TRY_LEAVE, TryCatch #8 {bvjv -> 0x0283, blocks: (B:62:0x0265, B:79:0x0281, B:74:0x0278), top: B:93:0x0018 }] */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0278 A[Catch: all -> 0x027c, TRY_ENTER, TRY_LEAVE, TryCatch #8 {bvjv -> 0x0283, blocks: (B:62:0x0265, B:79:0x0281, B:74:0x0278), top: B:93:0x0018 }] */
            /* JADX WARN: Type inference failed for: r1v0, types: [bzsm] */
            /* JADX WARN: Type inference failed for: r1v1, types: [deig] */
            /* JADX WARN: Type inference failed for: r1v2 */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 670
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bzsm.run():void");
            }
        });
        deha.s(d);
    }
}
