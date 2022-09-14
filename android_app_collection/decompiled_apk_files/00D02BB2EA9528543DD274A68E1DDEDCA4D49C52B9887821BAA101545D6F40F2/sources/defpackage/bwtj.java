package defpackage;

import android.widget.ListView;
/* compiled from: PG */
/* renamed from: bwtj  reason: default package */
/* loaded from: classes4.dex */
final class bwtj implements Runnable {
    final /* synthetic */ ListView a;
    final /* synthetic */ int b;

    public bwtj(ListView listView, int i) {
        this.a = listView;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setSelection((this.b - (this.a.getLastVisiblePosition() - this.a.getFirstVisiblePosition())) + 2);
    }
}
