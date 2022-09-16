package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iyq  reason: default package */
/* loaded from: classes3.dex */
public abstract class iyq implements adwm {
    protected final Context b;
    protected final azqb c;
    protected final izu d;
    protected final oeq e;
    protected final azqb f;
    protected final ajyc g;
    protected final jaa h;
    protected final boolean i;
    protected final iyo j;
    protected final airw k;
    protected ViewGroup l;
    protected TextView m;
    protected ImageView n;
    protected boolean o;
    protected LoadingFrameLayout p;
    protected View q;
    protected izz r;
    protected iyn s;
    protected adwj t;
    protected final aypf u = new aypf();

    /* JADX INFO: Access modifiers changed from: protected */
    public iyq(Context context, azqb azqbVar, izu izuVar, oeq oeqVar, azqb azqbVar2, ajyc ajycVar, jaa jaaVar, iyo iyoVar, acwu acwuVar, airw airwVar) {
        this.b = context;
        this.c = azqbVar;
        this.d = izuVar;
        this.e = oeqVar;
        this.f = azqbVar2;
        this.g = ajycVar;
        this.h = jaaVar;
        this.i = acwuVar.i;
        this.j = iyoVar;
        this.k = airwVar;
    }

    public void a(ViewGroup viewGroup) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.e.a();
        this.m.setText(R.string.mdx_remote_queue_status_no_videos);
        this.g.h();
        this.q.setVisibility(0);
        this.l.setVisibility(8);
        this.p.setVisibility(8);
        this.n.setVisibility(8);
    }
}
