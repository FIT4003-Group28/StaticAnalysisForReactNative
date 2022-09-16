package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
/* compiled from: PG */
/* renamed from: sb  reason: default package */
/* loaded from: classes4.dex */
public final class sb implements AdapterView.OnItemClickListener, st {
    Context a;
    public LayoutInflater b;
    sf c;
    public ExpandedMenuView d;
    public ss e;
    public sa f;

    public sb(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.f == null) {
            this.f = new sa(this);
        }
        return this.f;
    }

    @Override // defpackage.st
    public final void b(Context context, sf sfVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = sfVar;
        sa saVar = this.f;
        if (saVar != null) {
            saVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.st
    public final void c(sf sfVar, boolean z) {
        ss ssVar = this.e;
        if (ssVar != null) {
            ssVar.a(sfVar, z);
        }
    }

    @Override // defpackage.st
    public final void d(ss ssVar) {
        throw null;
    }

    @Override // defpackage.st
    public final boolean e() {
        return false;
    }

    @Override // defpackage.st
    public final boolean f(tb tbVar) {
        if (!tbVar.hasVisibleItems()) {
            return false;
        }
        sg sgVar = new sg(tbVar);
        sf sfVar = sgVar.a;
        nw nwVar = new nw(sfVar.a);
        sgVar.c = new sb(nwVar.a());
        sb sbVar = sgVar.c;
        sbVar.e = sgVar;
        sgVar.a.g(sbVar);
        ListAdapter a = sgVar.c.a();
        ns nsVar = nwVar.a;
        nsVar.p = a;
        nsVar.q = sgVar;
        View view = sfVar.g;
        if (view == null) {
            nwVar.e(sfVar.f);
            nwVar.o(sfVar.e);
        } else {
            nwVar.d(view);
        }
        nwVar.a.n = sgVar;
        sgVar.b = nwVar.b();
        sgVar.b.setOnDismissListener(sgVar);
        WindowManager.LayoutParams attributes = sgVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        sgVar.b.show();
        ss ssVar = this.e;
        if (ssVar == null) {
            return true;
        }
        ssVar.b(tbVar);
        return true;
    }

    @Override // defpackage.st
    public final boolean g(si siVar) {
        return false;
    }

    @Override // defpackage.st
    public final boolean h(si siVar) {
        return false;
    }

    @Override // defpackage.st
    public final void i() {
        sa saVar = this.f;
        if (saVar != null) {
            saVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.A(this.f.getItem(i), this, 0);
    }
}
