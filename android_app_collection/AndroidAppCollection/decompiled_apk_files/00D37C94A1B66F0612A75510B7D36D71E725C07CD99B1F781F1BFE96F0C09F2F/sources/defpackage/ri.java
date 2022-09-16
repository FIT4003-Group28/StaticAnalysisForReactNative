package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
/* compiled from: PG */
/* renamed from: ri  reason: default package */
/* loaded from: classes4.dex */
public final class ri extends ActionMode {
    final Context a;
    final re b;

    public ri(Context context, re reVar) {
        this.a = context;
        this.b = reVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.f();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.c();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.Menu, hv] */
    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new sw(this.a, this.b.a());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.b();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.d;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.n();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.h(view);
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
        this.b.k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.m(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.j(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.l(charSequence);
    }
}
