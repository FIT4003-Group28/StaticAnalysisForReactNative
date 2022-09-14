package androidx.appcompat.app;

import a.a.o.b;
import a.g.m.e;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class h extends Dialog implements e {

    /* renamed from: b  reason: collision with root package name */
    private f f933b;

    /* renamed from: c  reason: collision with root package name */
    private final e.a f934c;

    /* loaded from: classes.dex */
    class a implements e.a {
        a() {
        }

        @Override // a.g.m.e.a
        public boolean a(KeyEvent keyEvent) {
            return h.this.a(keyEvent);
        }
    }

    public h(Context context, int i) {
        super(context, a(context, i));
        this.f934c = new a();
        f a2 = a();
        a2.d(a(context, i));
        a2.a((Bundle) null);
    }

    private static int a(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(a.a.a.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // androidx.appcompat.app.e
    public a.a.o.b a(b.a aVar) {
        return null;
    }

    public f a() {
        if (this.f933b == null) {
            this.f933b = f.a(this, this);
        }
        return this.f933b;
    }

    @Override // androidx.appcompat.app.e
    public void a(a.a.o.b bVar) {
    }

    public boolean a(int i) {
        return a().b(i);
    }

    boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    @Override // androidx.appcompat.app.e
    public void b(a.a.o.b bVar) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a.g.m.e.a(this.f934c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().a(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().d();
        super.onCreate(bundle);
        a().a(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().i();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().c(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }
}
