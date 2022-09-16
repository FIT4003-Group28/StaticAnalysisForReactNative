package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mnb  reason: default package */
/* loaded from: classes3.dex */
public final class mnb extends ajsl {
    mna a;
    private final Context b;
    private final gem c;
    private final aafo d;
    private final ajmy e;
    private final ajyc f;
    private final FrameLayout g;
    private final ajxz h;
    private mna i;
    private mna j;

    public mnb(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar) {
        this.b = context;
        this.c = gemVar;
        this.e = ajmyVar;
        this.d = aafoVar;
        this.f = ajycVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        this.h = ajxzVar;
        gemVar.c(frameLayout);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c.b;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        audn audnVar = (audn) obj;
        this.g.removeAllViews();
        if (this.b.getResources().getConfiguration().orientation == 2) {
            if (this.i == null) {
                this.i = f(R.layout.landscape_playlist_item);
            }
            this.a = this.i;
        } else {
            if (this.j == null) {
                this.j = f(R.layout.playlist_item);
            }
            this.a = this.j;
        }
        this.g.addView(this.a.d);
        this.a.oK(ajrsVar, audnVar);
        mna mnaVar = this.a;
        View view = this.c.b;
        ates atesVar = audnVar.l;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        mnaVar.f(view, atesVar, audnVar, ajrsVar.a);
        this.c.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((audn) obj).m.I();
    }

    final mna f(int i) {
        return new mna(this.b, this.e, i, this.c, this.d, this.f, this.h);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mna mnaVar = this.a;
        if (mnaVar != null) {
            mnaVar.qZ(ajsaVar);
        }
    }
}
