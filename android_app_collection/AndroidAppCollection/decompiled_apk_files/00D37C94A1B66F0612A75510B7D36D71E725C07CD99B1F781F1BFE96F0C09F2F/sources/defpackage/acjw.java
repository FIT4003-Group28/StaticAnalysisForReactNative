package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: acjw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acjw implements View.OnClickListener {
    public final /* synthetic */ acke a;
    private final /* synthetic */ int b;

    public /* synthetic */ acjw(acke ackeVar, int i) {
        this.b = i;
        this.a = ackeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            abxk abxkVar = this.a.aL;
            if (abxkVar == null) {
                return;
            }
            abxkVar.a(false);
            return;
        }
        acke ackeVar = this.a;
        ackeVar.e.N(false);
        abxk abxkVar2 = ackeVar.aL;
        if (abxkVar2 == null) {
            return;
        }
        abxkVar2.a(true);
    }
}
