package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kdw  reason: default package */
/* loaded from: classes7.dex */
public final class kdw implements btph {
    public final FrameLayout a;
    public final kdr b;
    public final crzm<dcep<ktr>> c;
    public final Executor d;
    @dzsi
    public crzp<dcep<ktr>> e;
    public final TextView f;
    public final Context g;
    public dbsg<crzp<Rect>> h = dbpy.a;

    public kdw(Context context, FrameLayout frameLayout, kdr kdrVar, crzm<dcep<ktr>> crzmVar, Executor executor) {
        this.a = frameLayout;
        this.b = kdrVar;
        dbsk.s(crzmVar);
        this.c = crzmVar;
        this.d = executor;
        dbsk.s(context);
        this.g = context;
        this.f = new TextView(context);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        r3 = defpackage.kdv.LOCATION_LOCKOUT;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.crzm<defpackage.dcep<defpackage.ktr>> r3) {
        /*
            r2 = this;
            bvrj r0 = defpackage.bvrj.UI_THREAD
            r0.c()
            java.lang.Object r3 = r3.l()
            dcep r3 = (defpackage.dcep) r3
            defpackage.dbsk.s(r3)
            ktr r0 = defpackage.ktr.PIN_LOCKED
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L19
            kdv r3 = defpackage.kdv.PIN_LOCKOUT
            goto L49
        L19:
            dcpd r3 = r3.iterator()
        L1d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r3.next()
            ktr r0 = (defpackage.ktr) r0
            int r0 = r0.ordinal()
            if (r0 == 0) goto L3f
            r1 = 1
            if (r0 == r1) goto L3c
            r1 = 3
            if (r0 == r1) goto L3c
            r1 = 4
            if (r0 == r1) goto L39
            goto L1d
        L39:
            kdv r3 = defpackage.kdv.KOREA_LOCKOUT
            goto L49
        L3c:
            kdv r3 = defpackage.kdv.LOCATION_LOCKOUT
            goto L49
        L3f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "PIN_LOCKED should have been handled earlier in the method"
            r3.<init>(r0)
            throw r3
        L47:
            kdv r3 = defpackage.kdv.NO_LOCKOUT
        L49:
            android.widget.FrameLayout r0 = r2.a
            int r1 = r3.f
            r0.setVisibility(r1)
            java.lang.Integer r3 = r3.e
            if (r3 == 0) goto L5d
            android.widget.TextView r0 = r2.f
            int r3 = r3.intValue()
            r0.setText(r3)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdw.a(crzm):void");
    }
}
