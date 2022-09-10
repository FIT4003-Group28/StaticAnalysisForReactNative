package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: ojy  reason: default package */
/* loaded from: classes7.dex */
final class ojy extends abx {
    private final oxr a;
    @dzsi
    private final cjtd b;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ojy(defpackage.oxr r3) {
        /*
            r2 = this;
            r2.<init>()
            r2.a = r3
            java.util.List r0 = r3.d()
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L39
            java.util.List r3 = r3.d()
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            oxq r3 = (defpackage.oxq) r3
            oxi r0 = r3.b()
            if (r0 == 0) goto L2a
            oxi r3 = r3.b()
            cjtd r3 = r3.a()
            goto L3a
        L2a:
            jba r0 = r3.a()
            if (r0 == 0) goto L39
            jba r3 = r3.a()
            cjtd r3 = r3.b()
            goto L3a
        L39:
            r3 = r1
        L3a:
            if (r3 != 0) goto L3d
            goto L4b
        L3d:
            cjta r3 = defpackage.cjtd.c(r3)
            ddho r0 = defpackage.dtxl.g
            r3.d = r0
            r3.g = r1
            cjtd r1 = r3.a()
        L4b:
            r2.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojy.<init>(oxr):void");
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (this.b == null || i == 0) {
            return;
        }
        this.a.g(new cjte(deaf.DRAG, i > 0 ? dead.LEFT : dead.RIGHT), this.b);
    }
}
