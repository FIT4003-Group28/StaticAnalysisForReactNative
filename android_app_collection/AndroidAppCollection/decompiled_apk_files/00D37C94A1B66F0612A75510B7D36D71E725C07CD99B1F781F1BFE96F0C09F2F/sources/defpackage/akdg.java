package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: akdg  reason: default package */
/* loaded from: classes.dex */
public final class akdg implements ajzm {
    public final boolean a;
    public int b;
    public boolean c;
    private final dlc d;
    private final akdd e;
    private final ajsf f;
    private final ViewTreeObserver.OnPreDrawListener g;
    private final View.OnLayoutChangeListener h;
    private int i = 0;
    private int j = 0;

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public akdg(android.support.v7.widget.RecyclerView r21, defpackage.ajsf r22, defpackage.swq r23, defpackage.acti r24, defpackage.ajjr r25, defpackage.ajkd r26, defpackage.ajkj r27, defpackage.tdu r28, defpackage.azqb r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akdg.<init>(android.support.v7.widget.RecyclerView, ajsf, swq, acti, ajjr, ajkd, ajkj, tdu, azqb, java.lang.Object):void");
    }

    @Override // defpackage.ajzm
    public final void a(RecyclerView recyclerView) {
        recyclerView.getContext();
        akdd akddVar = this.e;
        aypf aypfVar = akddVar.h;
        if (aypfVar != null) {
            aypfVar.qr();
        }
        akddVar.h = new aypf();
        this.f.u(this.e);
        this.e.c();
        c(recyclerView);
        recyclerView.getViewTreeObserver().addOnPreDrawListener(this.g);
        recyclerView.addOnLayoutChangeListener(this.h);
    }

    @Override // defpackage.ajzm
    public final void b(RecyclerView recyclerView) {
        recyclerView.getViewTreeObserver().removeOnPreDrawListener(this.g);
        recyclerView.removeOnLayoutChangeListener(this.h);
        this.f.v(this.e);
        xw xwVar = recyclerView.n;
        this.d.e(recyclerView);
        aypf aypfVar = this.e.h;
        if (aypfVar != null) {
            aypfVar.qr();
        }
        recyclerView.ag(xwVar);
        this.j = 0;
        this.i = 0;
    }

    public final void c(RecyclerView recyclerView) {
        int width = recyclerView.getWidth();
        int height = recyclerView.getHeight();
        if (this.i != width || this.j != height) {
            this.i = width;
            this.j = height;
            if (this.c) {
                this.d.e(recyclerView);
            }
            this.d.d(width, height);
            this.d.c(recyclerView);
            if (this.c) {
                recyclerView.getClass();
                recyclerView.post(new xk(recyclerView, 2, null));
            }
            this.c = false;
            return;
        }
        this.d.c(recyclerView);
    }
}
