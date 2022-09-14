package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public class c extends h implements DialogInterface {

    /* renamed from: d  reason: collision with root package name */
    final AlertController f894d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f895a;

        /* renamed from: b  reason: collision with root package name */
        private final int f896b;

        public a(Context context) {
            this(context, c.a(context, 0));
        }

        public a(Context context, int i) {
            this.f895a = new AlertController.f(new ContextThemeWrapper(context, c.a(context, i)));
            this.f896b = i;
        }

        public a a(DialogInterface.OnKeyListener onKeyListener) {
            this.f895a.u = onKeyListener;
            return this;
        }

        public a a(Drawable drawable) {
            this.f895a.f871d = drawable;
            return this;
        }

        public a a(View view) {
            this.f895a.f874g = view;
            return this;
        }

        public a a(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f895a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f895a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a a(CharSequence charSequence) {
            this.f895a.f873f = charSequence;
            return this;
        }

        public c a() {
            c cVar = new c(this.f895a.f868a, this.f896b);
            this.f895a.a(cVar.f894d);
            cVar.setCancelable(this.f895a.r);
            if (this.f895a.r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f895a.s);
            cVar.setOnDismissListener(this.f895a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f895a.u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context b() {
            return this.f895a.f868a;
        }
    }

    protected c(Context context, int i) {
        super(context, a(context, i));
        this.f894d = new AlertController(getContext(), this, getWindow());
    }

    static int a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.a.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView b() {
        return this.f894d.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f894d.b();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f894d.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f894d.b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f894d.b(charSequence);
    }
}
