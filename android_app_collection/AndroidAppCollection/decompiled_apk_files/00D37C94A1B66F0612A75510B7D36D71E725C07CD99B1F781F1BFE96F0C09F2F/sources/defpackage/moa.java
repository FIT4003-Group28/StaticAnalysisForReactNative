package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: moa  reason: default package */
/* loaded from: classes3.dex */
public class moa extends mnu {
    protected final TextView h;
    public final dt i;
    public final ajxz j;
    public final int k;
    private final FrameLayout l;
    private final ImageView m;
    private final LinearLayout n;
    private final TextView o;
    private final TextView p;
    private final ImageView q;
    private final moh r;
    private final moh s;
    private final ImageView t;
    private final View u;
    private final TextView v;
    private final double x;
    private final aadd y;

    public moa(Context context, dt dtVar, ajyc ajycVar, ajmy ajmyVar, aafo aafoVar, gts gtsVar, ajxz ajxzVar, int i, double d, aadd aaddVar) {
        super(context, ajycVar, ajmyVar, aafoVar, gtsVar, i, R.id.reel_item_channel_avatar);
        this.i = dtVar;
        this.j = ajxzVar;
        this.k = i;
        this.y = aaddVar;
        this.l = (FrameLayout) this.f.findViewById(R.id.reel_item_portrait_container);
        this.u = this.f.findViewById(R.id.reel_item_watched_scrim);
        this.t = (ImageView) this.f.findViewById(R.id.reel_item_contextual_menu_anchor);
        this.v = (TextView) this.f.findViewById(R.id.reel_item_video_tag);
        ImageView imageView = (ImageView) this.f.findViewById(R.id.reel_item_channel_avatar);
        this.q = imageView;
        this.n = (LinearLayout) this.f.findViewById(R.id.headline_layout);
        this.o = (TextView) this.f.findViewById(R.id.reel_item_headline);
        this.h = (TextView) this.f.findViewById(R.id.reel_item_byline);
        this.p = (TextView) this.f.findViewById(R.id.reel_item_byline_below_thumbnail);
        ImageView imageView2 = (ImageView) this.f.findViewById(R.id.reel_item_video_thumbnail);
        this.m = imageView2;
        imageView2.setImageDrawable(new ColorDrawable(zhn.j(context, R.attr.ytIcon1).orElse(0)));
        this.x = d;
        this.r = new moh(context, imageView2, ajmyVar, null, d);
        this.s = imageView != null ? new moh(context, imageView, ajmyVar, this.g, d) : null;
    }

    @Override // defpackage.mnu, defpackage.ajsl
    protected /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        d(ajrsVar, (ReelItemRendererOuterClass$ReelItemRenderer) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mnu
    public void f(ajrs ajrsVar, final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        avhn avhnVar;
        avhn avhnVar2;
        super.d(ajrsVar, reelItemRendererOuterClass$ReelItemRenderer);
        int intValue = ((Integer) ajrsVar.d("margin", 0)).intValue();
        if (intValue <= 0) {
            intValue = this.a.getResources().getDimensionPixelSize(R.dimen.reel_portrait_item_padding_start);
        }
        h(intValue);
        int intValue2 = ((Integer) ajrsVar.d("width", -1)).intValue();
        if (intValue2 != -1) {
            ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
            double d = intValue2;
            double d2 = this.x;
            Double.isNaN(d);
            layoutParams.height = (int) (d / d2);
            this.l.getLayoutParams().width = intValue2;
        }
        TextView textView = this.v;
        if (textView != null) {
            int i = reelItemRendererOuterClass$ReelItemRenderer.b;
            if ((i & 512) != 0) {
                arag aragVar4 = reelItemRendererOuterClass$ReelItemRenderer.j;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
                textView.setText(ajgl.b(aragVar4));
            } else if ((i & 1024) == 0) {
                zag.o(textView, false);
            } else {
                arag aragVar5 = reelItemRendererOuterClass$ReelItemRenderer.k;
                if (aragVar5 == null) {
                    aragVar5 = arag.a;
                }
                textView.setText(ajgl.b(aragVar5));
            }
        }
        avhn avhnVar3 = null;
        if (this.q != null) {
            int intValue3 = ((Integer) ajrsVar.d("avatar_size", 0)).intValue();
            if (intValue3 <= 0) {
                intValue3 = this.a.getResources().getDimensionPixelSize(R.dimen.reel_portrait_avatar_size);
            }
            this.q.getLayoutParams().width = intValue3;
            this.q.getLayoutParams().height = intValue3;
            moh mohVar = this.s;
            if ((reelItemRendererOuterClass$ReelItemRenderer.b & 32) != 0) {
                avhnVar = reelItemRendererOuterClass$ReelItemRenderer.g;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
            } else {
                avhnVar = null;
            }
            mohVar.a(avhnVar, false);
            ajmy ajmyVar = this.c;
            ImageView imageView = this.q;
            if ((reelItemRendererOuterClass$ReelItemRenderer.b & 32) != 0) {
                avhnVar2 = reelItemRendererOuterClass$ReelItemRenderer.g;
                if (avhnVar2 == null) {
                    avhnVar2 = avhn.a;
                }
            } else {
                avhnVar2 = null;
            }
            ajmyVar.k(imageView, avhnVar2, this.g);
        }
        if (this.h != null) {
            int bO = awwc.bO(reelItemRendererOuterClass$ReelItemRenderer.r);
            if (bO == 0 || bO != 11) {
                TextView textView2 = this.h;
                if ((reelItemRendererOuterClass$ReelItemRenderer.b & 8) != 0) {
                    aragVar3 = reelItemRendererOuterClass$ReelItemRenderer.e;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                textView2.setText(ajgl.b(aragVar3));
                this.h.setContentDescription(moi.f(reelItemRendererOuterClass$ReelItemRenderer));
                zag.o(this.h, true);
            } else {
                zag.o(this.h, false);
            }
        }
        if (this.p != null) {
            int bO2 = awwc.bO(reelItemRendererOuterClass$ReelItemRenderer.r);
            if (bO2 == 0 || bO2 != 11) {
                zag.o(this.p, false);
            } else {
                TextView textView3 = this.p;
                if ((reelItemRendererOuterClass$ReelItemRenderer.b & 8) != 0) {
                    aragVar2 = reelItemRendererOuterClass$ReelItemRenderer.e;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                } else {
                    aragVar2 = null;
                }
                textView3.setText(ajgl.b(aragVar2));
                this.p.setContentDescription(moi.f(reelItemRendererOuterClass$ReelItemRenderer));
                zag.o(this.p, true);
            }
        }
        if (this.o != null) {
            int bO3 = awwc.bO(reelItemRendererOuterClass$ReelItemRenderer.r);
            if (bO3 != 0 && bO3 == 11) {
                this.o.setGravity(1);
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.setGravity(1);
                }
            }
            TextView textView4 = this.o;
            if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4) != 0) {
                aragVar = reelItemRendererOuterClass$ReelItemRenderer.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView4.setText(ajgl.b(aragVar));
            if (this.h == null) {
                this.o.setContentDescription(moi.f(reelItemRendererOuterClass$ReelItemRenderer));
            }
        }
        moh mohVar2 = this.r;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 16) != 0 && (avhnVar3 = reelItemRendererOuterClass$ReelItemRenderer.f) == null) {
            avhnVar3 = avhn.a;
        }
        mohVar2.a(avhnVar3, true);
        ates atesVar = reelItemRendererOuterClass$ReelItemRenderer.n;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) == 0) {
            zag.o(this.t, false);
            return;
        }
        zag.o(this.t, true);
        this.t.setOnClickListener(new View.OnClickListener() { // from class: mnz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                moa moaVar = moa.this;
                ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = reelItemRendererOuterClass$ReelItemRenderer;
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", reelItemRendererOuterClass$ReelItemRenderer2);
                dt dtVar = moaVar.i;
                ates atesVar2 = reelItemRendererOuterClass$ReelItemRenderer2.n;
                if (atesVar2 == null) {
                    atesVar2 = ates.a;
                }
                atep atepVar = atesVar2.c;
                if (atepVar == null) {
                    atepVar = atep.a;
                }
                akbc.c(dtVar, atepVar, moaVar.d, moaVar.j, hashMap);
            }
        });
    }

    @Override // defpackage.mnu
    public final boolean g(ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        boolean g = super.g(reelItemRendererOuterClass$ReelItemRenderer);
        View view = this.u;
        if (view != null) {
            if (g) {
                zag.o(view, true);
            } else {
                zag.o(view, false);
            }
        }
        return g;
    }

    protected void h(int i) {
        View view = this.f;
        view.setPaddingRelative(i, view.getPaddingTop(), this.f.getPaddingEnd(), this.f.getPaddingBottom());
    }

    @Override // defpackage.ajsl
    protected final boolean kB() {
        return eog.H(this.y);
    }

    @Override // defpackage.mnu, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.e(this.q);
        this.c.e(this.m);
    }
}
