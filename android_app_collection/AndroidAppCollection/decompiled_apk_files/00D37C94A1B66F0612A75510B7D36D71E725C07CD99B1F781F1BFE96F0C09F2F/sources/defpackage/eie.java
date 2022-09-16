package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: eie  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eie implements View.OnClickListener {
    public final /* synthetic */ eig a;
    private final /* synthetic */ int b;

    public /* synthetic */ eie(eig eigVar, int i) {
        this.b = i;
        this.a = eigVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            eig eigVar = this.a;
            vwj vwjVar = (vwj) eigVar.f.get();
            vwj.a(eigVar.c);
            fvg d = fvl.d();
            d.k(eigVar.c.getString(R.string.user_turn_on_bedtime_snackbar_confirmation));
            d.m(eigVar.c.getString(R.string.user_turn_on_bedtime_snackbar_settings), eigVar.a());
            ((fvf) eigVar.b.get()).i(d.b());
            return;
        }
        dt dtVar = this.a.c;
        dtVar.startActivity(etk.a(dtVar));
    }
}
