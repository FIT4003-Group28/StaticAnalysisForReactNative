package defpackage;

import android.view.View;
import android.widget.Button;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cztp  reason: default package */
/* loaded from: classes5.dex */
public final class cztp implements View.OnClickListener {
    final /* synthetic */ czts a;
    final /* synthetic */ cztt b;

    public cztp(cztt czttVar, czts cztsVar) {
        this.b = czttVar;
        this.a = cztsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c.onClick(view);
        Button button = (Button) view;
        for (cztx cztxVar : this.b.k) {
            cztxVar.a.e(1);
        }
    }
}
