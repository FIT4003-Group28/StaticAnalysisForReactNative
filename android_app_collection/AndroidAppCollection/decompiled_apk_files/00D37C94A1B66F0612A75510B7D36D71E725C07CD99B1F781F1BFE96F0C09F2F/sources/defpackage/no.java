package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: no  reason: default package */
/* loaded from: classes3.dex */
public final class no implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ nv c;
    private final /* synthetic */ int d;

    public no(nv nvVar, View view, View view2) {
        this.c = nvVar;
        this.a = view;
        this.b = view2;
    }

    public no(nv nvVar, View view, View view2, int i) {
        this.d = i;
        this.c = nvVar;
        this.a = view;
        this.b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            nv.a(this.c.f, this.a, this.b);
        } else {
            nv.a(this.c.q, this.a, this.b);
        }
    }
}
