package defpackage;

import com.google.android.setupdesign.view.BottomScrollView;
/* compiled from: PG */
/* renamed from: dapz  reason: default package */
/* loaded from: classes5.dex */
public final class dapz implements Runnable {
    final /* synthetic */ BottomScrollView a;

    public dapz(BottomScrollView bottomScrollView) {
        this.a = bottomScrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
    }
}
