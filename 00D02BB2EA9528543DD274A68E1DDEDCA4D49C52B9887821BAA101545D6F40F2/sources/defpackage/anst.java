package defpackage;

import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: anst  reason: default package */
/* loaded from: classes2.dex */
final class anst implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ jho a;
    final /* synthetic */ ansu b;

    public anst(ansu ansuVar, jho jhoVar) {
        this.b = ansuVar;
        this.a = jhoVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        cjtd cjtdVar = this.a.c;
        cjqm cjqmVar = cjqm.a;
        if (cjtdVar != null) {
            cjqmVar = this.b.b.j(cjql.a, cjtdVar);
        }
        this.a.d(null, cjqmVar);
        return true;
    }
}
