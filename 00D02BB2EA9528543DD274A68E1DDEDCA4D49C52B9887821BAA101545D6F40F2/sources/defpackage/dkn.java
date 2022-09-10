package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dkn  reason: default package */
/* loaded from: classes6.dex */
public final class dkn {
    private final ite a;
    private final cjqy b;

    public dkn(ite iteVar, cjqy cjqyVar) {
        this.a = iteVar;
        this.b = cjqyVar;
    }

    public final void a(View view, @dzsi cjtd cjtdVar) {
        if (cjtdVar == null) {
            return;
        }
        cjqg.h(view, cjtdVar);
        this.a.c(view);
    }

    public final void b(View view, @dzsi View.OnClickListener onClickListener) {
        dkm dkmVar = (dkm) view.getTag(R.id.view_logger_click_listener);
        if (dkmVar == null) {
            dkmVar = new dkm(this.b);
            view.setTag(R.id.view_logger_click_listener, dkmVar);
        }
        view.setOnClickListener(dkmVar);
        dkmVar.a = onClickListener;
    }
}
