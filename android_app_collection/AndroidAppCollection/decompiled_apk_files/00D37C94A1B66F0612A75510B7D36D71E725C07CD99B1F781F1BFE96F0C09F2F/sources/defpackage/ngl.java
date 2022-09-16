package defpackage;

import android.view.MenuItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ngl  reason: default package */
/* loaded from: classes3.dex */
public final class ngl extends fse {
    final /* synthetic */ ngm a;
    private final apzg b;
    private final CharSequence c;
    private final lyb d;

    public ngl(ngm ngmVar, apzg apzgVar, CharSequence charSequence, lya lyaVar) {
        this.a = ngmVar;
        this.b = apzgVar;
        this.c = charSequence;
        this.d = lyaVar.b();
    }

    @Override // defpackage.fse
    public final int b() {
        return this.d.a;
    }

    @Override // defpackage.fse
    public final CharSequence c() {
        return null;
    }

    @Override // defpackage.fry
    public final int g() {
        return this.d.a();
    }

    @Override // defpackage.fse, defpackage.fry
    public final int h() {
        return 0;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            menuItem.setTitle(charSequence);
        }
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fry
    public final boolean m() {
        this.a.e.a(this.b);
        return true;
    }
}
