package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: qp  reason: default package */
/* loaded from: classes7.dex */
final class qp implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ qw c;

    public qp(qw qwVar, View view, View view2) {
        this.c = qwVar;
        this.a = view;
        this.b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qw.e(this.c.f, this.a, this.b);
    }
}
