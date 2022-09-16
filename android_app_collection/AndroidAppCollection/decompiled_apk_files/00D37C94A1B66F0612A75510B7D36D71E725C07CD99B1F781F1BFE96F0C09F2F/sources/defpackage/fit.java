package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fit  reason: default package */
/* loaded from: classes3.dex */
final class fit implements View.OnClickListener {
    final /* synthetic */ airw a;
    final /* synthetic */ awmt b;
    final /* synthetic */ axnm c;
    final /* synthetic */ ImageView d;
    final /* synthetic */ awmt e;
    final /* synthetic */ cyv f;

    public fit(airw airwVar, awmt awmtVar, axnm axnmVar, ImageView imageView, awmt awmtVar2, cyv cyvVar) {
        this.a = airwVar;
        this.b = awmtVar;
        this.c = axnmVar;
        this.d = imageView;
        this.e = awmtVar2;
        this.f = cyvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tcs a = tcs.a().a();
        if (this.a.E().d() && this.b != null) {
            ((tcu) this.c.get()).b(this.b, a).T();
            this.d.setImageResource(R.drawable.player_play);
        } else if (this.e != null) {
            ((tcu) this.c.get()).b(this.e, a).T();
            this.d.setImageResource(R.drawable.player_pause);
        }
        this.d.setColorFilter(zhn.d(this.f.b, R.attr.ytTextPrimary));
    }
}
