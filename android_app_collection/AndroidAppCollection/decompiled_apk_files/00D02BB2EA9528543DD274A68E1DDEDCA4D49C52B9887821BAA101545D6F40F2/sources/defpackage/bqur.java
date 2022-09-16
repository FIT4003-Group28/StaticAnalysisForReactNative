package defpackage;

import android.app.Activity;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bqur  reason: default package */
/* loaded from: classes4.dex */
public class bqur implements bqsw {
    public static final /* synthetic */ int b = 0;
    private static final dcep<dqwx> c = dcep.G(dqwx.BUSINESS, dqwx.VACATION, dqwx.FAMILY, dqwx.FRIENDS, dqwx.SOLO, dqwx.COUPLE, new dqwx[0]);
    public final dcdc<bqxi> a;

    public bqur(final bqxj bqxjVar, ilo iloVar) {
        dqwy dqwyVar;
        if ((iloVar.bs().a & 67108864) == 0) {
            dqwyVar = iloVar.bq().G;
            if (dqwyVar == null) {
                dqwyVar = dqwy.c;
            }
        } else {
            dqwyVar = iloVar.bs().G;
            if (dqwyVar == null) {
                dqwyVar = dqwy.c;
            }
        }
        dcbg s = dcbg.b(dqwyVar.a).s(bqup.a);
        final dcep<dqwx> dcepVar = c;
        dcepVar.getClass();
        final dcep B = s.o(new dbsl(dcepVar) { // from class: bquq
            private final dcep a;

            {
                this.a = dcepVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.contains((dqwx) obj);
            }
        }).B();
        this.a = dcbg.b(dcepVar).s(new dbrn(B, bqxjVar) { // from class: bquk
            private final Set a;
            private final bqxj b;

            {
                this.a = B;
                this.b = bqxjVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Set set = this.a;
                bqxj bqxjVar2 = this.b;
                dqwx dqwxVar = (dqwx) obj;
                int i = bqur.b;
                boolean contains = set.contains(dqwxVar);
                Activity activity = (Activity) ((dxjd) bqxjVar2.a).a;
                bqxj.a(activity, 1);
                bqxj.a(bqxjVar2.b.a(), 2);
                btvo a = bqxjVar2.c.a();
                bqxj.a(a, 3);
                bqxj.a(dqwxVar, 4);
                return new bqxi(activity, a, dqwxVar, contains);
            }
        }).z();
    }

    @Override // defpackage.bqsw
    public dcdc<? extends bqtc> a() {
        return this.a;
    }

    public Boolean b() {
        return Boolean.valueOf(dcbg.b(this.a).p(bqun.a));
    }

    public Boolean c() {
        return Boolean.valueOf(dcbg.b(this.a).p(bquo.a));
    }
}
