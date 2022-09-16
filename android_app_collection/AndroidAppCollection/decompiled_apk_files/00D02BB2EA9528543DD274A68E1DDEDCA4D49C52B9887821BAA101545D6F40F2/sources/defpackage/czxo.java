package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: czxo  reason: default package */
/* loaded from: classes5.dex */
final class czxo extends abx {
    final /* synthetic */ czyg a;
    final /* synthetic */ MaterialButton b;
    final /* synthetic */ czxs c;

    public czxo(czxs czxsVar, czyg czygVar, MaterialButton materialButton) {
        this.c = czxsVar;
        this.a = czygVar;
        this.b = materialButton;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int ae;
        if (i < 0) {
            ae = this.c.f().ac();
        } else {
            ae = this.c.f().ae();
        }
        this.c.c = this.a.a(ae);
        MaterialButton materialButton = this.b;
        czyg czygVar = this.a;
        materialButton.setText(czygVar.a(ae).i(czygVar.a));
    }
}
