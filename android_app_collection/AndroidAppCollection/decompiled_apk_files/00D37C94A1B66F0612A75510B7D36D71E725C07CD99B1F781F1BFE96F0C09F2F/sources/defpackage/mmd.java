package defpackage;

import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: mmd  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mmd implements Runnable {
    public final /* synthetic */ FrameLayout a;
    private final /* synthetic */ int b;

    public /* synthetic */ mmd(FrameLayout frameLayout, int i) {
        this.b = i;
        this.a = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.requestFocus();
        } else {
            this.a.setVisibility(8);
        }
    }
}
