package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
/* compiled from: PG */
/* renamed from: up  reason: default package */
/* loaded from: classes4.dex */
public final class up implements DialogInterface.OnClickListener, uv {
    nx a;
    final /* synthetic */ AppCompatSpinner b;
    private ListAdapter c;
    private CharSequence d;

    public up(AppCompatSpinner appCompatSpinner) {
        this.b = appCompatSpinner;
    }

    @Override // defpackage.uv
    public final int a() {
        return 0;
    }

    @Override // defpackage.uv
    public final int b() {
        return 0;
    }

    @Override // defpackage.uv
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.uv
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.uv
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.uv
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.uv
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.uv
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.uv
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.uv
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.uv
    public final void k() {
        nx nxVar = this.a;
        if (nxVar != null) {
            nxVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.uv
    public final void l(int i, int i2) {
        if (this.c == null) {
            return;
        }
        nw nwVar = new nw(this.b.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            nwVar.o(charSequence);
        }
        nwVar.m(this.c, this.b.getSelectedItemPosition(), this);
        nx b = nwVar.b();
        this.a = b;
        ListView listView = b.a.f;
        listView.setTextDirection(i);
        listView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.setSelection(i);
        if (this.b.getOnItemClickListener() != null) {
            this.b.performItemClick(null, i, this.c.getItemId(i));
        }
        k();
    }

    @Override // defpackage.uv
    public final boolean u() {
        nx nxVar = this.a;
        if (nxVar != null) {
            return nxVar.isShowing();
        }
        return false;
    }
}
