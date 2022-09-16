package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
/* compiled from: PG */
/* renamed from: ycb  reason: default package */
/* loaded from: classes4.dex */
final class ycb implements afzf {
    private final acrr a;
    private final yzj b;
    private final ydq c;
    private final ydp d;
    private final azqb e;
    private final acti f;
    private final Activity g;
    private final yat h;
    private final YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint i;
    private final arrh j;

    public ycb(acrr acrrVar, yzj yzjVar, ydq ydqVar, azqb azqbVar, acti actiVar, Activity activity, yat yatVar, YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint, ydp ydpVar) {
        arrh arrhVar;
        this.a = acrrVar;
        this.b = yzjVar;
        this.c = ydqVar;
        this.e = azqbVar;
        this.f = actiVar;
        this.g = activity;
        this.h = yatVar;
        this.i = ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
        this.d = ydpVar;
        if (!ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.c.H()) {
            ybr ybrVar = new ybr();
            ybrVar.a = ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.c;
            ybrVar.b = 3;
            arrhVar = ybrVar.b();
        } else {
            arrhVar = null;
        }
        this.j = arrhVar;
    }

    private final void d() {
        arrh arrhVar = this.j;
        if (arrhVar != null) {
            this.a.c(arrhVar);
        }
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.h.a();
        d();
        yzj yzjVar = this.b;
        yzjVar.d(yzjVar.b(cffVar));
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    @Override // defpackage.cfa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void lG(java.lang.Object r5) {
        /*
            r4 = this;
            ashn r5 = (defpackage.ashn) r5
            yat r0 = r4.h
            r0.a()
            awja r0 = defpackage.yce.b(r5)
            if (r0 == 0) goto L3b
            java.lang.CharSequence r5 = defpackage.yic.i(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L21
            android.app.Activity r5 = r4.g
            r0 = 2132018809(0x7f140679, float:1.9675935E38)
            java.lang.String r5 = r5.getString(r0)
            goto L25
        L21:
            java.lang.String r5 = r5.toString()
        L25:
            yzj r0 = r4.b
            r0.d(r5)
            ydp r5 = r4.d
            if (r5 == 0) goto L32
            r5.mE()
            goto L37
        L32:
            ydq r5 = r4.c
            r5.a()
        L37:
            r4.d()
            return
        L3b:
            r0 = 0
            if (r5 == 0) goto L5d
            ashf r1 = r5.d
            if (r1 != 0) goto L44
            ashf r1 = defpackage.ashf.a
        L44:
            int r1 = r1.b
            r2 = 64099105(0x3d21321, float:1.23470825E-36)
            if (r1 != r2) goto L5d
            ashf r1 = r5.d
            if (r1 != 0) goto L51
            ashf r1 = defpackage.ashf.a
        L51:
            int r3 = r1.b
            if (r3 != r2) goto L5a
            java.lang.Object r1 = r1.c
            aqft r1 = (defpackage.aqft) r1
            goto L5e
        L5a:
            aqft r1 = defpackage.aqft.a
            goto L5e
        L5d:
            r1 = r0
        L5e:
            if (r1 == 0) goto L73
            android.app.Activity r5 = r4.g
            azqb r2 = r4.e
            java.lang.Object r2 = r2.get()
            aafo r2 = (defpackage.aafo) r2
            acti r3 = r4.f
            defpackage.ajgx.n(r5, r1, r2, r3, r0)
            r4.d()
            return
        L73:
            azqb r1 = r4.e
            java.lang.Object r1 = r1.get()
            aafo r1 = (defpackage.aafo) r1
            aopu r2 = r5.f
            r1.d(r2, r0)
            ydp r0 = r4.d
            if (r0 == 0) goto L88
            r0.mF(r5)
            goto L8d
        L88:
            ydq r0 = r4.c
            r0.c(r5)
        L8d:
            int r0 = r5.b
            r0 = r0 & 64
            if (r0 == 0) goto La3
            int r5 = r5.h
            int r5 = defpackage.awwc.L(r5)
            if (r5 != 0) goto L9c
            goto La3
        L9c:
            r0 = 2
            if (r5 != r0) goto La3
            r4.d()
            return
        La3:
            com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint r5 = r4.i
            aoob r5 = r5.c
            boolean r5 = r5.H()
            if (r5 != 0) goto Lc1
            acrr r5 = r4.a
            ybr r0 = new ybr
            r0.<init>()
            com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint r1 = r4.i
            aoob r1 = r1.c
            r0.a = r1
            arrh r0 = r0.f()
            r5.c(r0)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycb.lG(java.lang.Object):void");
    }
}
