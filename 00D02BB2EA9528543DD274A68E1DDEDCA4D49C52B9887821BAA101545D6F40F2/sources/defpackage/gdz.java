package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gdz  reason: default package */
/* loaded from: classes6.dex */
public final class gdz implements View.OnClickListener {
    final /* synthetic */ geb a;

    public gdz(geb gebVar) {
        this.a = gebVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        geb gebVar = this.a;
        if (gebVar.aD) {
            gebVar.J().g().f();
        }
    }
}
