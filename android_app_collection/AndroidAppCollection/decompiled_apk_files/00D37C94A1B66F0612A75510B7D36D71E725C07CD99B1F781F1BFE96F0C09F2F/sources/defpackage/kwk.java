package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kwk  reason: default package */
/* loaded from: classes3.dex */
public final class kwk extends fse {
    public MenuItem a;
    final /* synthetic */ kwm b;
    private final Resources c;
    private final lyb d;

    public kwk(kwm kwmVar, Context context, lya lyaVar) {
        this.b = kwmVar;
        this.c = context.getResources();
        this.d = lyaVar.b();
    }

    @Override // defpackage.fse
    public final int b() {
        return this.d.a;
    }

    @Override // defpackage.fse
    public final CharSequence c() {
        return this.c.getString(R.string.overflow_search_filter);
    }

    @Override // defpackage.fry
    public final int g() {
        return this.d.a();
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        this.a = menuItem;
    }

    @Override // defpackage.fry
    public final boolean l() {
        return false;
    }

    @Override // defpackage.fry
    public final boolean m() {
        this.b.s();
        return true;
    }
}
