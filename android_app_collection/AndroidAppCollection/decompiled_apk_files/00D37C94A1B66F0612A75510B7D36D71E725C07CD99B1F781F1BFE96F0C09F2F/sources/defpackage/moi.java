package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
/* compiled from: PG */
/* renamed from: moi  reason: default package */
/* loaded from: classes3.dex */
public final class moi extends ajsl {
    private final Context a;
    private final dt b;
    private final ajmy c;
    private final ajyc d;
    private final aafo e;
    private final gem f;
    private final ajxz g;
    private final gts h;
    private final akem i;
    private final mnw j;
    private final aadd k;
    private ajsl l;
    private ajsl m;
    private ajsl n;
    private ajsl o;
    private ajsl p;
    private ajsl q;
    private ajsl r;

    public moi(Context context, dt dtVar, ajmy ajmyVar, ajyc ajycVar, aafo aafoVar, gem gemVar, ajxz ajxzVar, gts gtsVar, akem akemVar, aadd aaddVar) {
        this.a = context;
        this.b = dtVar;
        this.c = ajmyVar;
        this.e = aafoVar;
        this.f = gemVar;
        this.g = ajxzVar;
        this.h = gtsVar;
        this.d = ajycVar;
        this.i = akemVar;
        this.k = aaddVar;
        mnw mnwVar = new mnw(context);
        this.j = mnwVar;
        gemVar.c(mnwVar);
    }

    public static String f(ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        aovs aovsVar = reelItemRendererOuterClass$ReelItemRenderer.q;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        if ((aovsVar.b & 1) != 0) {
            aovs aovsVar2 = reelItemRendererOuterClass$ReelItemRenderer.q;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar = aovsVar2.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            return aovrVar.c;
        }
        return null;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f.b;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        int bO;
        int bz;
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) obj;
        this.j.removeAllViews();
        int bO2 = awwc.bO(reelItemRendererOuterClass$ReelItemRenderer.r);
        if (bO2 != 0 && bO2 == 6) {
            if (this.m == null) {
                this.m = new mnv(this.a, this.d, this.c, this.e, this.h);
            }
            this.j.a();
            zgd.v(this.j, -1, -2);
            this.l = this.m;
        } else {
            int bO3 = awwc.bO(reelItemRendererOuterClass$ReelItemRenderer.r);
            if (bO3 != 0 && bO3 == 7) {
                if (this.n == null) {
                    this.n = new mob(this.a, this.d, this.c, this.e, this.h);
                    zgd.v(this.j, -1, -2);
                }
                this.j.a();
                this.l = this.n;
            } else {
                int bO4 = awwc.bO(reelItemRendererOuterClass$ReelItemRenderer.r);
                if (bO4 != 0 && bO4 == 8) {
                    if (this.o == null) {
                        this.o = new mny(this.a, this.b, this.d, this.c, this.e, this.h, this.g);
                    }
                    this.j.a();
                    zgd.v(this.j, -2, -2);
                    this.l = this.o;
                } else {
                    int bO5 = awwc.bO(reelItemRendererOuterClass$ReelItemRenderer.r);
                    if (bO5 != 0 && bO5 == 9) {
                        if (this.p == null) {
                            this.p = new moa(this.a, this.b, this.d, this.c, this.e, this.h, this.g, R.layout.reel_item_thumbnail_shelf_style, ((Double) ajrsVar.d("aspectRatio", Double.valueOf(0.5625d))).doubleValue(), this.k);
                        }
                        this.j.a();
                        zgd.v(this.j, -2, -2);
                        this.l = this.p;
                    } else {
                        int bO6 = awwc.bO(reelItemRendererOuterClass$ReelItemRenderer.r);
                        if ((bO6 != 0 && bO6 == 10) || ((bO = awwc.bO(reelItemRendererOuterClass$ReelItemRenderer.r)) != 0 && bO == 11)) {
                            int i = reelItemRendererOuterClass$ReelItemRenderer.b & 2048;
                            int i2 = R.layout.reel_item_shorts_style_video;
                            if (i != 0 && (bz = awwc.bz(reelItemRendererOuterClass$ReelItemRenderer.l)) != 0 && bz == 2) {
                                i2 = R.layout.reel_item_shorts_style_story;
                            }
                            ajsl ajslVar = this.q;
                            if (!(ajslVar instanceof moa) || ((moa) ajslVar).k != i2) {
                                this.q = new moa(this.a, this.b, this.d, this.c, this.e, this.h, this.g, i2, ((Double) ajrsVar.d("aspectRatio", Double.valueOf(0.6d))).doubleValue(), this.k);
                            }
                            this.j.a();
                            zgd.v(this.j, -2, -2);
                            this.l = this.q;
                        } else {
                            int bO7 = awwc.bO(reelItemRendererOuterClass$ReelItemRenderer.r);
                            if (bO7 == 0 || bO7 != 12) {
                                return;
                            }
                            if (this.r == null) {
                                this.r = new moc(this.a, this.b, this.d, this.c, this.e, this.h, this.g, this.k);
                            }
                            mnw mnwVar = this.j;
                            if (mnwVar.a != 0.6d) {
                                mnwVar.a = 0.6d;
                                mnwVar.requestLayout();
                            }
                            zgd.v(this.j, -1, -2);
                            this.l = this.r;
                        }
                    }
                }
            }
        }
        this.j.addView(this.l.a());
        View findViewById = this.l.a().findViewById(R.id.reel_item_portrait_container);
        if (findViewById != null) {
            this.i.c(findViewById, this.i.a(findViewById, null));
        }
        this.l.oK(ajrsVar, reelItemRendererOuterClass$ReelItemRenderer);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ReelItemRendererOuterClass$ReelItemRenderer) obj).p.I();
    }

    @Override // defpackage.ajsl
    protected final boolean kB() {
        return eog.H(this.k);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ajsl ajslVar = this.l;
        if (ajslVar != null) {
            ajslVar.qZ(ajsaVar);
        }
    }
}
