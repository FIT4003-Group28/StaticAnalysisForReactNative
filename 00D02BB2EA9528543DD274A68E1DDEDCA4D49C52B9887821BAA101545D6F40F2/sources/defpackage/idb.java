package defpackage;

import android.view.View;
import android.widget.PopupMenu;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: idb  reason: default package */
/* loaded from: classes6.dex */
public final class idb implements View.OnClickListener {
    final /* synthetic */ dcdc a;
    final /* synthetic */ idc b;

    public idb(idc idcVar, dcdc dcdcVar) {
        this.b = idcVar;
        this.a = dcdcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.d(view, cjqg.k(view));
        idc idcVar = this.b;
        idcVar.e = idcVar.i.a(idcVar.d);
        this.b.e.a(this.a);
        this.b.e.show();
        this.b.e.setOnDismissListener(new PopupMenu.OnDismissListener(this) { // from class: ida
            private final idb a;

            {
                this.a = this;
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public final void onDismiss(PopupMenu popupMenu) {
                this.a.b.e = null;
            }
        });
    }
}
