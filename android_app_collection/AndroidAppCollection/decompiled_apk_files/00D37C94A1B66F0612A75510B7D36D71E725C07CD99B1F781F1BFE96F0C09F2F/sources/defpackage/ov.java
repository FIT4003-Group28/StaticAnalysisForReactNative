package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ov  reason: default package */
/* loaded from: classes4.dex */
public class ov extends Dialog implements ob {
    private oc WJ;
    private final ka WK;

    public ov(Context context, int i) {
        super(context, a(context, i));
        this.WK = new ou(this);
        oc c = c();
        ((ot) c).y = a(context, i);
        c.z();
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
        c().j(view, layoutParams);
    }

    public final oc c() {
        if (this.WJ == null) {
            this.WJ = oc.f(this, this);
        }
        return this.WJ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        c().m();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return kb.a(this.WK, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        c().y(1);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return c().i(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().k();
        super.onCreate(bundle);
        c().z();
    }

    @Override // android.app.Dialog
    protected final void onStop() {
        super.onStop();
        c().p();
    }

    @Override // defpackage.ob
    public final void onSupportActionModeFinished(re reVar) {
    }

    @Override // defpackage.ob
    public final void onSupportActionModeStarted(re reVar) {
    }

    @Override // defpackage.ob
    public final re onWindowStartingSupportActionMode(rd rdVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c().r(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        c().x(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        c().s(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().t(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().x(charSequence);
    }
}
