package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager;
/* compiled from: PG */
/* renamed from: zq  reason: default package */
/* loaded from: classes4.dex */
public final class zq implements Runnable {
    final /* synthetic */ StaggeredGridLayoutManager a;

    public zq(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.a = staggeredGridLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.I();
    }
}
