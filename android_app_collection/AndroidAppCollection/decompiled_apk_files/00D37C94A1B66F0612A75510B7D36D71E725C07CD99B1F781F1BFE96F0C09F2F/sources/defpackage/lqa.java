package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.List;
/* compiled from: PG */
/* renamed from: lqa  reason: default package */
/* loaded from: classes3.dex */
public final class lqa extends xo {
    public final atjg d;
    final /* synthetic */ lqb e;
    private final List f;
    private final ajmu g;

    public lqa(lqb lqbVar, List list, atjg atjgVar) {
        this.e = lqbVar;
        this.f = list;
        this.d = atjgVar;
        ajmt a = ajmu.a();
        a.b(2131232143);
        this.g = a.a();
    }

    public static final void w(lpz lpzVar, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        arag aragVar;
        lpzVar.u.setAlpha(1.0f);
        lpzVar.v.setAlpha(1.0f);
        lpzVar.w.setVisibility(8);
        TextView textView = lpzVar.v;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4) != 0) {
            aragVar = reelItemRendererOuterClass$ReelItemRenderer.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
    }

    public static final void x(lpz lpzVar, atjg atjgVar) {
        arag aragVar;
        lpzVar.u.setAlpha(0.5f);
        lpzVar.v.setAlpha(0.5f);
        lpzVar.w.setVisibility(0);
        TextView textView = lpzVar.v;
        if ((atjgVar.b & 4) != 0) {
            aragVar = atjgVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
    }

    @Override // defpackage.xo
    public final int b() {
        return this.f.size();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        return new lpz(LayoutInflater.from(this.e.a).inflate(R.layout.multi_reel_dismissal_item, (ViewGroup) null, false));
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        avhn avhnVar;
        arag aragVar;
        aule auleVar;
        aule auleVar2;
        boolean z;
        final lpz lpzVar = (lpz) yoVar;
        final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) this.f.get(i);
        this.e.d.oi().D(new acte(reelItemRendererOuterClass$ReelItemRenderer.p));
        apzg apzgVar = null;
        this.e.d.oi().u(new acte(reelItemRendererOuterClass$ReelItemRenderer.p), null);
        ajmy ajmyVar = this.e.b;
        ImageView imageView = lpzVar.u;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 32) != 0) {
            avhnVar = reelItemRendererOuterClass$ReelItemRenderer.g;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.k(imageView, avhnVar, this.g);
        YouTubeButton youTubeButton = lpzVar.w;
        atjg atjgVar = this.d;
        if ((atjgVar.b & 8) != 0) {
            aragVar = atjgVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        youTubeButton.setText(ajgl.b(aragVar));
        List list = this.e.h;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 2097152) != 0) {
            auleVar = reelItemRendererOuterClass$ReelItemRenderer.s;
            if (auleVar == null) {
                auleVar = aule.a;
            }
        } else {
            auleVar = null;
        }
        if (list.contains(auleVar)) {
            x(lpzVar, this.d);
        } else {
            w(lpzVar, reelItemRendererOuterClass$ReelItemRenderer);
        }
        View view = lpzVar.t;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 2097152) != 0) {
            auleVar2 = reelItemRendererOuterClass$ReelItemRenderer.s;
            if (auleVar2 == null) {
                auleVar2 = aule.a;
            }
        } else {
            auleVar2 = null;
        }
        view.setTag(auleVar2);
        lpzVar.t.setOnClickListener(new View.OnClickListener() { // from class: lpy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                lqa lqaVar = lqa.this;
                lpz lpzVar2 = lpzVar;
                ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = reelItemRendererOuterClass$ReelItemRenderer;
                atjg atjgVar2 = lqaVar.d;
                if ((reelItemRendererOuterClass$ReelItemRenderer2.b & 131072) != 0) {
                    lqaVar.e.d.oi().H(3, new acte(reelItemRendererOuterClass$ReelItemRenderer2.p), null);
                }
                if (lpzVar2.w.getVisibility() == 0) {
                    lqa.w(lpzVar2, reelItemRendererOuterClass$ReelItemRenderer2);
                    if (lqaVar.e.h.contains(lpzVar2.t.getTag())) {
                        lqaVar.e.h.remove(lpzVar2.t.getTag());
                    }
                    if (!lqaVar.e.f.containsKey(lpzVar2.t.getTag())) {
                        return;
                    }
                    lqaVar.e.f.remove(lpzVar2.t.getTag());
                    return;
                }
                lqa.x(lpzVar2, atjgVar2);
                lqaVar.e.h.add((aule) lpzVar2.t.getTag());
                lqaVar.e.f.put((aule) lpzVar2.t.getTag(), reelItemRendererOuterClass$ReelItemRenderer2.p.I());
            }
        });
        aovs aovsVar = reelItemRendererOuterClass$ReelItemRenderer.q;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        if ((aovsVar.b & 1) != 0) {
            TextView textView = lpzVar.v;
            aovs aovsVar2 = reelItemRendererOuterClass$ReelItemRenderer.q;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar = aovsVar2.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            textView.setContentDescription(aovrVar.c);
        }
        int bP = awwc.bP(reelItemRendererOuterClass$ReelItemRenderer.o);
        if (bP == 0 || bP != 2) {
            gts gtsVar = this.e.e;
            if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4096) != 0 && (apzgVar = reelItemRendererOuterClass$ReelItemRenderer.m) == null) {
                apzgVar = apzg.a;
            }
            if (!gtsVar.f(apzgVar)) {
                z = false;
                lpzVar.u.setEnabled(!z);
            }
        }
        z = true;
        lpzVar.u.setEnabled(!z);
    }
}
