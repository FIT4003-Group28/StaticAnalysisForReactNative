package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: bxnq  reason: default package */
/* loaded from: classes.dex */
public final class bxnq {
    public final dxio<InputMethodManager> a;

    public bxnq(Context context) {
        final Context applicationContext = context.getApplicationContext();
        this.a = new dxio(applicationContext) { // from class: bxnp
            private final Context a;

            {
                this.a = applicationContext;
            }

            @Override // defpackage.dxio
            public final Object a() {
                InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
                dbsk.s(inputMethodManager);
                return inputMethodManager;
            }
        };
    }

    public bxnq(dxio<InputMethodManager> dxioVar) {
        this.a = dxioVar;
    }

    public final void a(View view, CompletionInfo[] completionInfoArr) {
        this.a.a().displayCompletions(view, completionInfoArr);
    }
}
