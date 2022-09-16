package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aclg  reason: default package */
/* loaded from: classes.dex */
public final class aclg implements View.OnClickListener {
    final /* synthetic */ acll a;
    private final /* synthetic */ int b;

    public aclg(acll acllVar) {
        this.a = acllVar;
    }

    public aclg(acll acllVar, int i) {
        this.b = i;
        this.a = acllVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.aF();
        } else {
            this.a.aB.V();
        }
    }
}
