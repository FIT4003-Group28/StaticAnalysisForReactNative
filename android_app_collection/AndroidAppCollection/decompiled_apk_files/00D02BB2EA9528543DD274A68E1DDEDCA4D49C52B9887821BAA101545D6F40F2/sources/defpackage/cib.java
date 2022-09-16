package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cib  reason: default package */
/* loaded from: classes4.dex */
public abstract class cib<T> implements cij<T> {
    private chs a;

    public cib() {
        if (cjp.b(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            return;
        }
        StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_textColorSearchUrl);
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(Integer.MIN_VALUE);
        sb.append(" and height: ");
        sb.append(Integer.MIN_VALUE);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.cij
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.cgp
    public final void d() {
    }

    @Override // defpackage.cgp
    public final void e() {
    }

    @Override // defpackage.cgp
    public final void f() {
    }

    @Override // defpackage.cij
    public final void g(cii ciiVar) {
        ciiVar.j(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.cij
    public final void h(cii ciiVar) {
    }

    @Override // defpackage.cij
    public final void i(chs chsVar) {
        this.a = chsVar;
    }

    @Override // defpackage.cij
    public final chs j() {
        return this.a;
    }

    @Override // defpackage.cij
    public final void k(Drawable drawable) {
    }
}
