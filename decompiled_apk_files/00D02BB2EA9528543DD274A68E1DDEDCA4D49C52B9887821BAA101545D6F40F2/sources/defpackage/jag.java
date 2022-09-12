package defpackage;

import android.text.TextWatcher;
import android.view.View;
/* renamed from: jag  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class jag {
    public static View.OnFocusChangeListener a(final jaj jajVar) {
        return new View.OnFocusChangeListener(jajVar) { // from class: jah
            private final jaj a;

            {
                this.a = jajVar;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.a.e(z);
            }
        };
    }

    public static TextWatcher b(jaj jajVar) {
        return new jai(jajVar);
    }
}
