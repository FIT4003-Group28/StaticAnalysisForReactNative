package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mit  reason: default package */
/* loaded from: classes3.dex */
final class mit implements View.OnClickListener {
    final /* synthetic */ aafo a;
    final /* synthetic */ axnm b;
    final /* synthetic */ Context c;
    final /* synthetic */ miw d;

    public mit(miw miwVar, aafo aafoVar, axnm axnmVar, Context context) {
        this.d = miwVar;
        this.a = aafoVar;
        this.b = axnmVar;
        this.c = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final apzg apzgVar;
        miw miwVar = this.d;
        if (miwVar.a == null || (apzgVar = miwVar.c) == null) {
            return;
        }
        final Map map = miwVar.b;
        final miv mivVar = miwVar.d;
        Handler handler = new Handler();
        final aafo aafoVar = this.a;
        final axnm axnmVar = this.b;
        final Context context = this.c;
        handler.postDelayed(new Runnable() { // from class: mis
            @Override // java.lang.Runnable
            public final void run() {
                aafo aafoVar2 = aafo.this;
                apzg apzgVar2 = apzgVar;
                Map map2 = map;
                axnm axnmVar2 = axnmVar;
                Context context2 = context;
                miv mivVar2 = mivVar;
                aafoVar2.c(apzgVar2, map2);
                akfh l = ((akfg) axnmVar2.get()).l();
                l.k(context2.getString(R.string.dismissed_video_snackbar_message));
                l.j(false);
                ((akfg) axnmVar2.get()).n(l.b());
                if (mivVar2 != null) {
                    mivVar2.f();
                }
            }
        }, 500L);
        miw miwVar2 = this.d;
        if (miwVar2.e == null || miwVar2.f == null || miwVar2.d() == null) {
            return;
        }
        miw miwVar3 = this.d;
        miwVar3.e.H(3, new acte(miwVar3.d()), null);
    }
}
