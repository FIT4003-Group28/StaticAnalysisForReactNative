package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adyt  reason: default package */
/* loaded from: classes2.dex */
public final class adyt implements View.OnAttachStateChangeListener {
    final /* synthetic */ adyv a;

    public adyt(adyv adyvVar) {
        this.a = adyvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r5 != r1.get(r1.size() - 3).b()) goto L14;
     */
    @Override // android.view.View.OnAttachStateChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow(android.view.View r5) {
        /*
            r4 = this;
            adyv r0 = r4.a
            cqkp r5 = defpackage.cqkx.i(r5)
            boolean r1 = r5 instanceof defpackage.advs
            if (r1 == 0) goto L65
            advs r5 = (defpackage.advs) r5
            advg r1 = r0.g
            MessageType extends dsqw<MessageType, BuilderType> r1 = r1.b
            advh r1 = (defpackage.advh) r1
            dspd r1 = r1.d
            boolean r1 = r1.u()
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L65
            advg r1 = r0.g
            MessageType extends dsqw<MessageType, BuilderType> r1 = r1.b
            advh r1 = (defpackage.advh) r1
            boolean r1 = r1.f
            if (r1 != 0) goto L65
            java.util.List<cqix<advs>> r1 = r0.c
            int r1 = r1.size()
            r2 = 3
            if (r1 < r2) goto L4b
            java.util.List<cqix<advs>> r1 = r0.c
            int r3 = r1.size()
            int r3 = r3 + (-3)
            java.lang.Object r1 = r1.get(r3)
            cqix r1 = (defpackage.cqix) r1
            cqkp r1 = r1.b()
            if (r5 == r1) goto L61
        L4b:
            java.util.List<cqix<advs>> r1 = r0.c
            int r1 = r1.size()
            if (r1 >= r2) goto L65
            java.util.List<cqix<advs>> r1 = r0.c
            java.lang.Object r1 = defpackage.dcft.s(r1)
            cqix r1 = (defpackage.cqix) r1
            cqkp r1 = r1.b()
            if (r5 != r1) goto L65
        L61:
            r5 = 0
            r0.d(r5)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adyt.onViewAttachedToWindow(android.view.View):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
