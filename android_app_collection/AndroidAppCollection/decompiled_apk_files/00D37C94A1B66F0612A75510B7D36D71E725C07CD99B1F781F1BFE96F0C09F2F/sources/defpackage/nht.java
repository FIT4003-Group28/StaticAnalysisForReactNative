package defpackage;

import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: nht  reason: default package */
/* loaded from: classes3.dex */
final class nht extends fse {
    private final apzg a;
    private final CharSequence b;
    private final aafo c;
    private final int d;

    public nht(apzg apzgVar, CharSequence charSequence, aafo aafoVar, int i) {
        this.a = apzgVar;
        this.b = charSequence;
        this.c = aafoVar;
        if (i == 1) {
            this.d = 1;
        } else {
            this.d = 2;
        }
    }

    @Override // defpackage.fse
    public final int b() {
        return 0;
    }

    @Override // defpackage.fse
    public final CharSequence c() {
        return this.b;
    }

    @Override // defpackage.fry
    public final int g() {
        return this.d;
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
        CharSequence charSequence = this.b;
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
        this.c.c(this.a, null);
        return true;
    }
}
