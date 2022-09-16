package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: gyw  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gyw implements Runnable {
    public final /* synthetic */ gyx a;
    public final /* synthetic */ View b;
    private final /* synthetic */ int c;

    public /* synthetic */ gyw(gyx gyxVar, View view) {
        this.a = gyxVar;
        this.b = view;
    }

    public /* synthetic */ gyw(gyx gyxVar, View view, int i) {
        this.c = i;
        this.a = gyxVar;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            gyx gyxVar = this.a;
            gyy.d(this.b);
            gyxVar.b = false;
            gyxVar.d = false;
            return;
        }
        gyx gyxVar2 = this.a;
        gyy.c(this.b);
        gyxVar2.b = true;
        gyxVar2.c = false;
        gyxVar2.e = System.currentTimeMillis();
    }
}
