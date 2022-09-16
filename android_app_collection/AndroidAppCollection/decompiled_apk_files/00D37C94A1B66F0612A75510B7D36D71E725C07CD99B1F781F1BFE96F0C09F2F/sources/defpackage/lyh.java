package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lyh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lyh implements View.OnLongClickListener {
    public final /* synthetic */ lyn a;
    private final /* synthetic */ int b;

    public /* synthetic */ lyh(lyn lynVar, int i) {
        this.b = i;
        this.a = lynVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.b != 0) {
            lcs lcsVar = this.a.z;
            if (lcsVar != null) {
                lcsVar.c(null);
            }
            return false;
        }
        lyn lynVar = this.a;
        view.setHapticFeedbackEnabled(true);
        view.performHapticFeedback(0);
        lcs lcsVar2 = lynVar.z;
        if (lcsVar2 != null) {
            lcsVar2.c(null);
        }
        return false;
    }
}
