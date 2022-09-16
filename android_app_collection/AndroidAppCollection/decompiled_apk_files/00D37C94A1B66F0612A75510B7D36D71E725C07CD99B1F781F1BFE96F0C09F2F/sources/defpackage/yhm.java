package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: yhm  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class yhm implements View.OnClickListener {
    public final /* synthetic */ yhn a;
    private final /* synthetic */ int b;

    public /* synthetic */ yhm(yhn yhnVar, int i) {
        this.b = i;
        this.a = yhnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.e(false);
        } else {
            this.a.e(true);
        }
    }
}
