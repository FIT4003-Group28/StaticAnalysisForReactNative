package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: dlu  reason: default package */
/* loaded from: classes3.dex */
final class dlu implements Runnable {
    public final djr a;
    final /* synthetic */ dlw b;
    private final View c;

    public dlu(dlw dlwVar, djr djrVar, View view) {
        this.b = dlwVar;
        this.a = djrVar;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.l = this.a.a(this.c);
    }
}
