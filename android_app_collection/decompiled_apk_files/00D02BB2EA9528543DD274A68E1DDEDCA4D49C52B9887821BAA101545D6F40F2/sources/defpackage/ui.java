package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
/* compiled from: PG */
/* renamed from: ui  reason: default package */
/* loaded from: classes7.dex */
public final class ui extends ActionMode {
    final Context a;
    final ud b;

    public ui(Context context, ud udVar) {
        this.a = context;
        this.b = udVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.n();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new vw(this.a, (ky) this.b.b());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.a();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.k();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.d;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.d();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.m();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.e(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.i(i);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.d = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.h(i);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.l(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.f(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.g(charSequence);
    }
}
