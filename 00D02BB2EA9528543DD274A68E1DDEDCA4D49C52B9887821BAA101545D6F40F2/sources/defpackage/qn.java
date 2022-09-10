package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: qn  reason: default package */
/* loaded from: classes7.dex */
final class qn implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ qw c;

    public qn(qw qwVar, View view, View view2) {
        this.c = qwVar;
        this.a = view;
        this.b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qw.e(this.c.r, this.a, this.b);
    }
}
