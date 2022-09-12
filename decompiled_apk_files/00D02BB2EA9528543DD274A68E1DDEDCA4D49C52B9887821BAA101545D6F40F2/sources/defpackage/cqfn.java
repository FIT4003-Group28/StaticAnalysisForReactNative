package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqfn  reason: default package */
/* loaded from: classes.dex */
public final class cqfn implements View.OnFocusChangeListener {
    public cqnx<cqkp, Void> a;
    public cqnx<cqkp, Void> b;
    public View.OnFocusChangeListener c;
    private final View d;

    private cqfn(View view) {
        this.d = view;
    }

    public static final cqfn a(View view) {
        cqfn cqfnVar = (cqfn) view.getTag(R.id.focus_listener);
        if (cqfnVar == null) {
            cqfn cqfnVar2 = new cqfn(view);
            view.setOnFocusChangeListener(cqfnVar2);
            view.setTag(R.id.focus_listener, cqfnVar2);
            return cqfnVar2;
        }
        return cqfnVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.c;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        cqkp o = cqjz.o(this.d);
        if (o == null) {
            return;
        }
        if (z) {
            cqnx<cqkp, Void> cqnxVar = this.a;
            if (cqnxVar == null) {
                return;
            }
            cqnxVar.a(o, new Object[0]);
            return;
        }
        cqnx<cqkp, Void> cqnxVar2 = this.b;
        if (cqnxVar2 == null) {
            return;
        }
        cqnxVar2.a(o, new Object[0]);
    }
}
