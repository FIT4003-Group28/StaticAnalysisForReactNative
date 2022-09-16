package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zpk  reason: default package */
/* loaded from: classes7.dex */
public class zpk extends ivw implements zew {
    private final byyp c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zpk(android.app.Activity r11, defpackage.byyp r12, defpackage.dbty<defpackage.dbsg<defpackage.amub>> r13) {
        /*
            r10 = this;
            ivu r2 = defpackage.ivu.FIXED
            jaq r3 = defpackage.jaq.NO_TINT_DAY_NIGHT_ON_WHITE
            java.lang.Boolean r0 = h(r12)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            r0 = 2131232976(0x7f0808d0, float:1.8082076E38)
            cqss r1 = defpackage.ibm.p()
            cqtd r0 = defpackage.cqrt.g(r0, r1)
            goto L25
        L1a:
            r0 = 2131232974(0x7f0808ce, float:1.8082072E38)
            cqss r1 = defpackage.ibm.p()
            cqtd r0 = defpackage.cqrt.g(r0, r1)
        L25:
            r4 = r0
            java.lang.Boolean r0 = h(r12)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L38
            r0 = 2131951847(0x7f1300e7, float:1.954012E38)
            java.lang.String r0 = r11.getString(r0)
            goto L3f
        L38:
            r0 = 2131951848(0x7f1300e8, float:1.9540122E38)
            java.lang.String r0 = r11.getString(r0)
        L3f:
            r5 = r0
            java.lang.Boolean r0 = h(r12)
            boolean r0 = r0.booleanValue()
            java.lang.Object r1 = r13.a()
            dbsg r1 = (defpackage.dbsg) r1
            boolean r6 = r1.a()
            if (r6 != 0) goto L59
            cjta r1 = defpackage.cjtd.b()
            goto L69
        L59:
            java.lang.Object r1 = r1.b()
            amub r1 = (defpackage.amub) r1
            amve r1 = r1.d
            cjtd r1 = defpackage.vyb.t(r1)
            cjta r1 = defpackage.cjtd.c(r1)
        L69:
            ddho r6 = defpackage.dtyc.dj
            r1.d = r6
            deab r6 = defpackage.deab.c
            dsqp r6 = r6.bZ()
            ddzy r6 = (defpackage.ddzy) r6
            if (r0 == 0) goto L7a
            deaa r0 = defpackage.deaa.TOGGLE_ON
            goto L7c
        L7a:
            deaa r0 = defpackage.deaa.TOGGLE_OFF
        L7c:
            boolean r7 = r6.c
            r8 = 0
            if (r7 == 0) goto L86
            r6.bF()
            r6.c = r8
        L86:
            MessageType extends dsqw<MessageType, BuilderType> r7 = r6.b
            deab r7 = (defpackage.deab) r7
            int r0 = r0.d
            r7.b = r0
            int r0 = r7.a
            r9 = 1
            r0 = r0 | r9
            r7.a = r0
            dsqw r0 = r6.bK()
            deab r0 = (defpackage.deab) r0
            r1.a = r0
            cjtd r6 = r1.a()
            java.lang.Object r13 = r13.a()
            dbsg r13 = (defpackage.dbsg) r13
            boolean r0 = r13.a()
            if (r0 != 0) goto Laf
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            goto Ld0
        Laf:
            java.lang.Object r0 = r13.b()
            amub r0 = (defpackage.amub) r0
            dqvj r0 = r0.h
            dqvj r1 = defpackage.dqvj.TRANSIT
            if (r0 != r1) goto Lcc
            bzdk r0 = r12.c()
            java.lang.Object r13 = r13.b()
            amub r13 = (defpackage.amub) r13
            boolean r13 = r0.a(r13)
            if (r13 == 0) goto Lcc
            r8 = 1
        Lcc:
            java.lang.Boolean r13 = g(r11, r8)
        Ld0:
            boolean r7 = r13.booleanValue()
            r8 = 0
            ivv r9 = defpackage.ivv.MOD_MINI
            r0 = r10
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.c = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpk.<init>(android.app.Activity, byyp, dbty):void");
    }

    public static Boolean g(Activity activity, boolean z) {
        View findViewById = activity.findViewById(R.id.mainmap_container);
        if (findViewById.getHeight() < cqrp.d(360.0d).e(activity)) {
            return false;
        }
        return Boolean.valueOf(z);
    }

    private static Boolean h(byyp byypVar) {
        return Boolean.valueOf(byypVar.c().r());
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        bzem bzemVar = ((bzcb) ((byym) this.c).b).c;
        if (bzemVar != null) {
            final bzfg bzfgVar = (bzfg) bzemVar;
            bzfgVar.p(new Runnable(bzfgVar) { // from class: bzer
                private final bzfg a;

                {
                    this.a = bzfgVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bzfg bzfgVar2 = this.a;
                    bzel.a();
                    bzfgVar2.x = !bzfgVar2.x;
                    bzfgVar2.m();
                    bzfgVar2.e();
                    bzfgVar2.c.S(bvjk.dk, bzfgVar2.x);
                }
            });
        }
        return cqkl.a;
    }

    @Override // defpackage.zew
    public cqtv f() {
        return gwu.b();
    }
}
