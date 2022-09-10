package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jmn  reason: default package */
/* loaded from: classes7.dex */
public class jmn implements View.OnClickListener {
    private final Class<? extends fd> a;

    public jmn(Class<? extends fd> cls) {
        this.a = cls;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gga L = gga.L(view.getContext());
        fd K = L.K();
        if (K == null || !K.getClass().equals(this.a) || !K.U()) {
            return;
        }
        L.g().e();
    }
}
