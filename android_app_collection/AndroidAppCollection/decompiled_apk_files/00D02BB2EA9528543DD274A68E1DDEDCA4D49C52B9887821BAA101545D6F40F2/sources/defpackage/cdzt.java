package defpackage;

import android.net.Uri;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdzt  reason: default package */
/* loaded from: classes4.dex */
public final class cdzt implements bdpj {
    final /* synthetic */ ceae a;

    public cdzt(ceae ceaeVar) {
        this.a = ceaeVar;
    }

    @Override // defpackage.bdpj
    public final void a(List<? extends Uri> list) {
        dzvx.c(list, "photoUris");
        this.a.g().c(this.a.i(list));
    }

    @Override // defpackage.bdpj
    public final void b(List<? extends Uri> list) {
        dzvx.c(list, "photoUris");
        this.a.g().c(this.a.i(list));
    }

    @Override // defpackage.bdpj
    public final void c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r2 == null) goto L8;
     */
    @Override // defpackage.bdpj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.net.Uri r4, android.net.Uri r5) {
        /*
            r3 = this;
            ceae r0 = r3.a
            ceaj r0 = r0.g()
            z<java.util.List<android.net.Uri>> r1 = r0.d
            java.lang.Object r2 = r1.h()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L20
            java.util.List r2 = defpackage.dzti.g(r2)
            int r4 = r2.indexOf(r4)
            r2.remove(r4)
            r2.add(r4, r5)
            if (r2 != 0) goto L24
        L20:
            java.util.List r2 = defpackage.dzti.a(r5)
        L24:
            r1.g(r2)
            java.util.List r4 = defpackage.dzti.a(r5)
            r0.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdzt.d(android.net.Uri, android.net.Uri):void");
    }
}
