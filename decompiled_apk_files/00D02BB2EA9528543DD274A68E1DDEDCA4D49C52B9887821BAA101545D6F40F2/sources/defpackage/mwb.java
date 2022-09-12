package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: mwb  reason: default package */
/* loaded from: classes7.dex */
public final class mwb implements krx {
    @Override // defpackage.krx
    public final void a(kqp kqpVar, View view) {
        if (!kqpVar.b()) {
            int i = krq.a;
            kqpVar.a((EditText) view.findViewById(R.id.edittext_view_id));
        }
    }

    @Override // defpackage.krx
    public final void b(kqp kqpVar, View view) {
        if (kqpVar.b()) {
            view.getWindowToken();
            kqpVar.c();
        }
    }
}
