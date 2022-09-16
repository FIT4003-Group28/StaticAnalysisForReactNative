package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: xvl  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xvl implements View.OnClickListener {
    public final /* synthetic */ xvr a;
    private final /* synthetic */ int b;

    public /* synthetic */ xvl(xvr xvrVar, int i) {
        this.b = i;
        this.a = xvrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            Runnable runnable = this.a.u;
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        Runnable runnable2 = this.a.v;
        if (runnable2 == null) {
            return;
        }
        runnable2.run();
    }
}
