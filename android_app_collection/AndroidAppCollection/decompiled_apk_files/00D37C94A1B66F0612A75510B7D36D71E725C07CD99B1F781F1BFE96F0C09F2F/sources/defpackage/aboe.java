package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aboe  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aboe implements View.OnClickListener {
    public final /* synthetic */ abop a;
    private final /* synthetic */ int b;

    public /* synthetic */ aboe(abop abopVar, int i) {
        this.b = i;
        this.a = abopVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.C();
                return;
            } else {
                this.a.I();
                return;
            }
        }
        abkm abkmVar = this.a.l;
        if (abkmVar == null) {
            return;
        }
        abkmVar.d();
    }
}
