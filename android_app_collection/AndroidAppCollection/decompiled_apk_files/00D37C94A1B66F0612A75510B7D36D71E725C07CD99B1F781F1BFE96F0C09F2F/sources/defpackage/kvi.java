package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kvi  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kvi implements View.OnClickListener {
    public final /* synthetic */ kvz a;
    private final /* synthetic */ int b;

    public /* synthetic */ kvi(kvz kvzVar, int i) {
        this.b = i;
        this.a = kvzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            kvz kvzVar = this.a;
            kvzVar.aH.setText("");
            kvzVar.ai.c();
            kvzVar.aF();
            return;
        }
        this.a.aE();
    }
}
