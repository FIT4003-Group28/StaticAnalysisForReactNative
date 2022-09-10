package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import android.widget.ListView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xw  reason: default package */
/* loaded from: classes7.dex */
public final class xw implements DialogInterface.OnClickListener, yd {
    qy a;
    final /* synthetic */ ye b;
    private ListAdapter c;
    private CharSequence d;

    public xw(ye yeVar) {
        this.b = yeVar;
    }

    @Override // defpackage.yd
    public final void MZ(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.yd
    public final void b(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.yd
    public final CharSequence c() {
        return this.d;
    }

    @Override // defpackage.yd
    public final void d(int i, int i2) {
        if (this.c == null) {
            return;
        }
        qx qxVar = new qx(this.b.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            qxVar.j(charSequence);
        }
        ListAdapter listAdapter = this.c;
        int selectedItemPosition = this.b.getSelectedItemPosition();
        qt qtVar = qxVar.a;
        qtVar.o = listAdapter;
        qtVar.p = this;
        qtVar.u = selectedItemPosition;
        qtVar.t = true;
        qy b = qxVar.b();
        this.a = b;
        ListView listView = b.a.f;
        listView.setTextDirection(i);
        listView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.yd
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.yd
    public final void f(int i) {
    }

    @Override // defpackage.yd
    public final void g(int i) {
    }

    @Override // defpackage.yd
    public final Drawable h() {
        return null;
    }

    @Override // defpackage.yd
    public final int i() {
        return 0;
    }

    @Override // defpackage.yd
    public final int j() {
        return 0;
    }

    @Override // defpackage.yd
    public final void k() {
        qy qyVar = this.a;
        if (qyVar != null) {
            qyVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.yd
    public final void l(int i) {
    }

    @Override // defpackage.yd
    public final boolean m() {
        qy qyVar = this.a;
        if (qyVar != null) {
            return qyVar.isShowing();
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.setSelection(i);
        if (this.b.getOnItemClickListener() != null) {
            this.b.performItemClick(null, i, this.c.getItemId(i));
        }
        k();
    }
}
