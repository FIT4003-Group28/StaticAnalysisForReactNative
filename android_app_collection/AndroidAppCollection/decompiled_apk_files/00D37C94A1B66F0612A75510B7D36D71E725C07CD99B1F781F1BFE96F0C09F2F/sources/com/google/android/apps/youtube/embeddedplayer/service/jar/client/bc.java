package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.view.View;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bc implements ahyg {
    public final /* synthetic */ bp a;
    private final /* synthetic */ int b;

    public /* synthetic */ bc(bp bpVar) {
        this.a = bpVar;
    }

    public /* synthetic */ bc(bp bpVar, int i) {
        this.b = i;
        this.a = bpVar;
    }

    @Override // defpackage.ahyg
    public final void d(ahyh ahyhVar, View view) {
        int i = this.b;
        if (i == 0) {
            bp bpVar = this.a;
            bpVar.o.addView(view, bpVar.q.c());
        } else if (i == 1) {
            bp bpVar2 = this.a;
            bpVar2.o.addView(view, 1, bpVar2.x.c());
        } else if (i == 2) {
            bp bpVar3 = this.a;
            bpVar3.o.addView(view, bpVar3.w.c());
        } else if (i != 3) {
            if (i != 4) {
                bp bpVar4 = this.a;
                bpVar4.o.addView(view, bpVar4.z.c());
                return;
            }
            bp bpVar5 = this.a;
            bpVar5.o.addView(view, bpVar5.y.c());
        } else {
            bp bpVar6 = this.a;
            int childCount = bpVar6.o.getChildCount();
            if (bpVar6.q.nI()) {
                childCount = Math.min(childCount, bpVar6.o.indexOfChild(bpVar6.q.kZ()));
            }
            if (bpVar6.y.nI()) {
                childCount = Math.min(childCount, bpVar6.o.indexOfChild(bpVar6.y.kZ()));
            }
            bpVar6.o.addView(view, childCount, bpVar6.p.c());
            if (!bpVar6.p.nI()) {
                return;
            }
            bpVar6.q.q(bpVar6.p.z());
            bpVar6.q.s(bpVar6.p.F());
        }
    }
}
