package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hdv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hdv implements View.OnClickListener {
    public final /* synthetic */ hdz a;
    private final /* synthetic */ int b;

    public /* synthetic */ hdv(hdz hdzVar, int i) {
        this.b = i;
        this.a = hdzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            hdy hdyVar = this.a.d;
            if (hdyVar == null) {
                return;
            }
            hdyVar.lP();
            return;
        }
        hdy hdyVar2 = this.a.d;
        if (hdyVar2 == null) {
            return;
        }
        hdyVar2.e();
    }
}
