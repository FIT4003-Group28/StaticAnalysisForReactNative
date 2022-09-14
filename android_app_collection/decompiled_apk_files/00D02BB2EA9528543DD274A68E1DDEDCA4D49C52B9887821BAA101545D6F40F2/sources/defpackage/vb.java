package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
/* compiled from: PG */
/* renamed from: vb  reason: default package */
/* loaded from: classes.dex */
public final class vb implements AdapterView.OnItemClickListener, vt {
    Context a;
    public LayoutInflater b;
    vf c;
    public ExpandedMenuView d;
    public vs e;
    public va f;

    public vb(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.vt
    public final void a(Context context, vf vfVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = vfVar;
        va vaVar = this.f;
        if (vaVar != null) {
            vaVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.vt
    public final void b(vs vsVar) {
        throw null;
    }

    public final ListAdapter c() {
        if (this.f == null) {
            this.f = new va(this);
        }
        return this.f;
    }

    @Override // defpackage.vt
    public final void d(vf vfVar, boolean z) {
        vs vsVar = this.e;
        if (vsVar != null) {
            vsVar.b(vfVar, z);
        }
    }

    @Override // defpackage.vt
    public final boolean e(wb wbVar) {
        if (!wbVar.hasVisibleItems()) {
            return false;
        }
        vg vgVar = new vg(wbVar);
        vf vfVar = vgVar.a;
        qx qxVar = new qx(vfVar.a);
        vgVar.c = new vb(qxVar.a());
        vb vbVar = vgVar.c;
        vbVar.e = vgVar;
        vgVar.a.a(vbVar);
        qxVar.d(vgVar.c.c(), vgVar);
        View view = vfVar.g;
        if (view != null) {
            qxVar.a.e = view;
        } else {
            qxVar.e(vfVar.f);
            qxVar.j(vfVar.e);
        }
        qxVar.a.m = vgVar;
        vgVar.b = qxVar.b();
        vgVar.b.setOnDismissListener(vgVar);
        WindowManager.LayoutParams attributes = vgVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        vgVar.b.show();
        vs vsVar = this.e;
        if (vsVar == null) {
            return true;
        }
        vsVar.a(wbVar);
        return true;
    }

    @Override // defpackage.vt
    public final boolean f() {
        return false;
    }

    @Override // defpackage.vt
    public final boolean g(vi viVar) {
        return false;
    }

    @Override // defpackage.vt
    public final boolean h(vi viVar) {
        return false;
    }

    @Override // defpackage.vt
    public final void i() {
        va vaVar = this.f;
        if (vaVar != null) {
            vaVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.p(this.f.getItem(i), this, 0);
    }
}
