package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mno  reason: default package */
/* loaded from: classes3.dex */
public final class mno extends ajsl {
    public final Context a;
    public final aafo b;
    public final ajmy c;
    public final aadd d;
    mnn e;
    private final gem f;
    private final ajyc g;
    private final FrameLayout h;
    private final ajxz i;
    private mnn j;
    private mnn k;

    public mno(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar, aadd aaddVar) {
        this.a = context;
        this.f = gemVar;
        this.c = ajmyVar;
        this.b = aafoVar;
        this.g = ajycVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        this.i = ajxzVar;
        this.d = aaddVar;
        gemVar.c(frameLayout);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f.b;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        int i;
        avhn avhnVar;
        ImageView imageView;
        aukb aukbVar = (aukb) obj;
        this.h.removeAllViews();
        if (zew.y(this.a)) {
            int bR = awwc.bR(aukbVar.m);
            if (bR == 0) {
                bR = 1;
            }
            i = bR + (-1) != 5 ? R.layout.grid_radio_item : R.layout.grid_radio_item_v2;
            this.e = g(i);
        } else if (f() == 2) {
            int bR2 = awwc.bR(aukbVar.m);
            if (bR2 == 0) {
                bR2 = 1;
            }
            int i2 = bR2 - 1;
            i = i2 != 3 ? i2 != 4 ? R.layout.landscape_playlist_item : R.layout.landscape_programmed_playlist_item : R.layout.landscape_playlist_item_three_up;
            mnn g = g(i);
            this.j = g;
            this.e = g;
        } else {
            int bR3 = awwc.bR(aukbVar.m);
            if (bR3 == 0) {
                bR3 = 1;
            }
            int i3 = bR3 - 1;
            i = (i3 == 1 || i3 == 2) ? R.layout.full_bleed_playlist_item : i3 != 3 ? i3 != 4 ? R.layout.playlist_item : R.layout.programmed_playlist_item : R.layout.full_bleed_playlist_item_three_up;
            mnn g2 = g(i);
            this.k = g2;
            this.e = g2;
        }
        if (i == R.layout.landscape_programmed_playlist_item || i == R.layout.programmed_playlist_item) {
            final mnn mnnVar = this.e;
            final apuq apuqVar = aukbVar.o;
            if (apuqVar == null) {
                apuqVar = apuq.a;
            }
            apur apurVar = apuqVar.c;
            if (apurVar == null) {
                apurVar = apur.a;
            }
            if ((apurVar.b & 1) != 0) {
                apur apurVar2 = apuqVar.c;
                if (apurVar2 == null) {
                    apurVar2 = apur.a;
                }
                avhnVar = apurVar2.c;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
            } else {
                avhnVar = null;
            }
            if (avhnVar != null && (imageView = mnnVar.o) != null) {
                zag.o(imageView, true);
                mnnVar.p.c.h(mnnVar.o, avhnVar);
                mnnVar.o.setOnClickListener(new View.OnClickListener() { // from class: mnm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        mnn mnnVar2 = mnn.this;
                        apuq apuqVar2 = apuqVar;
                        if (mnn.o(apuqVar2) != null) {
                            mnnVar2.p.b.a(mnn.o(apuqVar2));
                        }
                    }
                });
            }
        }
        if (i == R.layout.landscape_programmed_playlist_item) {
            this.e.i.setPaddingRelative(this.a.getResources().getDimensionPixelSize(R.dimen.programmed_playlist_landscape_contextual_menu_anchor_padding_start), this.a.getResources().getDimensionPixelSize(R.dimen.programmed_playlist_landscape_contextual_menu_anchor_padding_top), this.a.getResources().getDimensionPixelSize(R.dimen.programmed_playlist_landscape_contextual_menu_anchor_padding_end), this.a.getResources().getDimensionPixelSize(R.dimen.programmed_playlist_landscape_contextual_menu_anchor_padding_bottom));
        }
        this.h.addView(this.e.d);
        this.e.oK(ajrsVar, aukbVar);
        mnn mnnVar2 = this.e;
        View view = this.f.b;
        ates atesVar = aukbVar.k;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        mnnVar2.f(view, atesVar, aukbVar, ajrsVar.a);
        this.f.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aukb) obj).n.I();
    }

    public final int f() {
        return this.a.getResources().getConfiguration().orientation;
    }

    final mnn g(int i) {
        return new mnn(this, this.a, this.c, i, this.f, this.b, this.g, this.i);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mnn mnnVar = this.e;
        if (mnnVar != null) {
            mnnVar.qZ(ajsaVar);
        }
    }
}
