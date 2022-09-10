package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqfo  reason: default package */
/* loaded from: classes.dex */
public final class cqfo implements TextWatcher, View.OnAttachStateChangeListener {
    public cqnx<cqkp, Void> a;
    public cqnx<cqkp, Void> b;
    private final TextView c;
    private boolean d;

    private cqfo(TextView textView) {
        this.c = textView;
    }

    public static final cqfo a(TextView textView) {
        cqfo cqfoVar = (cqfo) textView.getTag(R.id.text_watcher);
        if (cqfoVar == null) {
            cqfo cqfoVar2 = new cqfo(textView);
            textView.addTextChangedListener(cqfoVar2);
            textView.setTag(R.id.text_watcher, cqfoVar2);
            textView.addOnAttachStateChangeListener(cqfoVar2);
            return cqfoVar2;
        }
        return cqfoVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        cqkp o;
        if (!this.d || this.b == null || (o = cqjz.o(this.c)) == null) {
            return;
        }
        this.b.a(o, editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        cqkp o;
        if (!this.d || this.a == null || (o = cqjz.o(this.c)) == null) {
            return;
        }
        this.a.a(o, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.d = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.d = false;
    }
}
