package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: eiz  reason: default package */
/* loaded from: classes3.dex */
final class eiz implements TextWatcher {
    final /* synthetic */ ejf a;

    public eiz(ejf ejfVar) {
        this.a = ejfVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        eje ejeVar;
        ejf ejfVar = this.a;
        ejfVar.d();
        String obj = ejfVar.h.getText().toString();
        if (obj.isEmpty()) {
            arag aragVar = ejfVar.j.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            ejeVar = eje.a(aragVar);
        } else if (obj.equals(ejfVar.j.c)) {
            ejeVar = eje.b();
        } else {
            ejfVar.m = new ejd(ejfVar);
            Handler handler = ejfVar.d;
            Runnable runnable = ejfVar.m;
            aptv aptvVar = ejfVar.j;
            handler.postDelayed(runnable, (aptvVar.b & 64) != 0 ? aptvVar.g : 1000L);
            ejeVar = new eje(2, null);
        }
        ejfVar.f(ejeVar);
    }
}
