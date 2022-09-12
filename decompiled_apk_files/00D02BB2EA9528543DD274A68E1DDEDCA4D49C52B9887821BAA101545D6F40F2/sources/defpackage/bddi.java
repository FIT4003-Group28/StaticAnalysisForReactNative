package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bddi  reason: default package */
/* loaded from: classes3.dex */
public final class bddi implements bdal {
    public final gfw a;
    private final Activity b;

    public bddi(Activity activity, gfw gfwVar) {
        this.b = activity;
        this.a = gfwVar;
    }

    @Override // defpackage.bdal
    @dzsi
    public final jho a(bczw bczwVar) {
        final dwfl a = bczwVar.a();
        jhm jhmVar = new jhm();
        jhmVar.h = 0;
        jhmVar.a = this.b.getResources().getString(R.string.MARK_AS_NOT_A_RECEIPT_MENU);
        jhmVar.d = ibl.b();
        jhmVar.b = this.b.getResources().getString(R.string.MARK_AS_NOT_A_RECEIPT_MENU);
        jhmVar.f = cjtd.a(dtyi.aB);
        jhmVar.d(new View.OnClickListener(this, a) { // from class: bddh
            private final bddi a;
            private final dwfl b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.Qn(anhd.c(this.b));
            }
        });
        return jhmVar.c();
    }
}
