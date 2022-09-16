package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: non  reason: default package */
/* loaded from: classes3.dex */
public final class non {
    protected final npr a;
    protected final nqh b;
    private boolean c;
    private boolean d;
    private final boolean e;

    public non(nqh nqhVar, npr nprVar, aacz aaczVar) {
        this.b = nqhVar;
        this.a = nprVar;
        apzt apztVar = aaczVar.b().z;
        this.e = (apztVar == null ? apzt.a : apztVar).i;
        apzt apztVar2 = aaczVar.b().z;
        nprVar.u = (apztVar2 == null ? apzt.a : apztVar2).j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aynx a() {
        return this.b.n.B().i(aynq.LATEST);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(aqvq aqvqVar) {
        auqh auqhVar;
        aqvo aqvoVar = aqvqVar.g;
        if (aqvoVar == null) {
            aqvoVar = aqvo.a;
        }
        if (aqvoVar.b == 49399797) {
            auqhVar = (auqh) aqvoVar.c;
        } else {
            auqhVar = auqh.a;
        }
        auqd auqdVar = auqhVar.n;
        if (auqdVar == null) {
            auqdVar = auqd.a;
        }
        int bm = awwc.bm(auqdVar.d);
        if (bm == 0) {
            bm = 1;
        }
        if (bm == 2) {
            if (!this.e) {
                return;
            }
            this.d = true;
        } else if (bm != 3) {
        } else {
            this.c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(FrameLayout frameLayout, RecyclerView recyclerView) {
        if (this.d) {
            this.a.a(frameLayout, recyclerView);
        } else if (!this.c) {
        } else {
            this.b.a(frameLayout, recyclerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.aqvq r7) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.non.d(aqvq):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.c) {
            this.b.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (this.c) {
            this.b.f();
        } else if (!this.d) {
        } else {
            this.a.f();
        }
    }
}
