package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dki  reason: default package */
/* loaded from: classes3.dex */
public final class dki implements czj {
    final /* synthetic */ diz a;
    final /* synthetic */ dlc b;

    public dki(dlc dlcVar, diz dizVar) {
        this.b = dlcVar;
        this.a = dizVar;
    }

    @Override // defpackage.czj
    public final void a(int i, int i2) {
        int i3;
        if (this.a.a() == i2) {
            return;
        }
        this.a.m(i2);
        dlc dlcVar = this.b;
        if (dlcVar.x == null) {
            i3 = -1;
        } else if (dlcVar.H.h() == 0) {
            i3 = dlcVar.x.b;
        } else {
            i3 = dlcVar.x.a;
        }
        if (i3 != -1 && this.a.a() <= i3) {
            return;
        }
        synchronized (this.b) {
            dlc dlcVar2 = this.b;
            if (dlcVar2.x != null && !dlcVar2.k) {
                int size = dlcVar2.b.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    int a = ((diz) dlcVar2.b.get(i5)).a();
                    if (a > i4) {
                        i4 = a;
                    }
                }
                if (i4 != dlcVar2.x.b) {
                    int max = Math.max(dlcVar2.H.a(View.MeasureSpec.getSize(dlcVar2.r), View.MeasureSpec.getSize(dlcVar2.s), i, i4), 1);
                    dlcVar2.x.b = i4;
                    dlcVar2.w = max;
                }
            }
            this.b.J();
        }
    }
}
