package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: iem  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class iem implements View.OnClickListener {
    public final /* synthetic */ Runnable a;
    private final /* synthetic */ int b;

    public /* synthetic */ iem(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.run();
        } else {
            this.a.run();
        }
    }
}
