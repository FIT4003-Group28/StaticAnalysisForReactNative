package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rx  reason: default package */
/* loaded from: classes.dex */
public class rx extends Dialog implements rc {
    private rd a;
    private final nj b;

    public rx(Context context, int i) {
        super(context, a(context, i));
        this.b = new rw(this);
        rd d = d();
        ((rv) d).D = a(context, i);
        d.q();
    }

    private static int a(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().i(view, layoutParams);
    }

    public final rd d() {
        if (this.a == null) {
            this.a = rd.b(this, this);
        }
        return this.a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().l();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return nk.a(this.b, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f() {
        d().s(1);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i) {
        return (T) d().e(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().k();
    }

    @Override // defpackage.rc
    public final ud l() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().m();
        super.onCreate(bundle);
        d().q();
    }

    @Override // android.app.Dialog
    protected final void onStop() {
        super.onStop();
        d().d();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d().g(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().j(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        d().f(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().h(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().j(charSequence);
    }
}
