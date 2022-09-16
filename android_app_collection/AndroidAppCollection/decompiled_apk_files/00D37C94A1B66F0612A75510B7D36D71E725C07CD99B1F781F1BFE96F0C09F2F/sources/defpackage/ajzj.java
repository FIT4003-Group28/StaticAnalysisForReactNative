package defpackage;

import android.support.v7.widget.LinearLayoutManager;
/* compiled from: PG */
/* renamed from: ajzj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajzj implements Runnable {
    public final /* synthetic */ ajzq a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ ajzj(ajzq ajzqVar, int i) {
        this.a = ajzqVar;
        this.b = i;
    }

    public /* synthetic */ ajzj(ajzq ajzqVar, int i, int i2) {
        this.c = i2;
        this.a = ajzqVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            ajzq ajzqVar = this.a;
            ajzqVar.f60J.ab(this.b);
            return;
        }
        ajzq ajzqVar2 = this.a;
        int i = this.b;
        xw xwVar = ajzqVar2.f60J.n;
        if (xwVar == null) {
            return;
        }
        ((LinearLayoutManager) xwVar).aa(i, 0);
    }
}
