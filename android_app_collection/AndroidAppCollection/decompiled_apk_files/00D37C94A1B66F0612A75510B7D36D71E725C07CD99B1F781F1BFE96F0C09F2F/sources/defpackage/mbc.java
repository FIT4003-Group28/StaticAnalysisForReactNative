package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CompactSuggestedVideoRendererOuterClass;
import com.google.protos.youtube.api.innertube.SuggestedVideoRendererOuterClass;
import com.google.protos.youtube.api.innertube.SuggestedVideosHeaderRendererOuterClass;
/* compiled from: PG */
/* renamed from: mbc  reason: default package */
/* loaded from: classes3.dex */
public final class mbc implements wkg {
    public final may a;
    private final ajsa b;
    private avcm c;
    private boolean d;
    private View e;
    private ViewGroup f;
    private ViewGroup g;

    public mbc(may mayVar, mba mbaVar, mba mbaVar2, mba mbaVar3, byte[] bArr) {
        this.a = mayVar;
        ajqw ajqwVar = new ajqw();
        this.b = ajqwVar;
        ajqwVar.f(avcn.class, mbaVar);
        ajqwVar.f(avcl.class, mbaVar2);
        ajqwVar.f(aqev.class, mbaVar3);
    }

    private final View b(Object obj, ajrs ajrsVar, ViewGroup viewGroup) {
        ajru h = akel.h(this.b, obj, viewGroup);
        if (h == null) {
            return null;
        }
        View a = h.a();
        akel.n(a, h, this.b.c(obj));
        h.oK(ajrsVar, obj);
        return a;
    }

    private final void c(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = viewGroup.getChildAt(childCount);
            viewGroup.removeView(childAt);
            this.b.b(childAt);
        }
    }

    private final void g(View view) {
        if (view != null) {
            zag.g(view, R.id.suggested_videos_companion_card_stub, R.id.suggested_videos_companion_card).setVisibility(8);
        }
        j();
        c(this.f);
        c(this.g);
    }

    private final void j() {
        View view = this.e;
        if (view != null) {
            zag.o(view, this.d);
        }
    }

    @Override // defpackage.wke
    public final void a() {
        j();
    }

    @Override // defpackage.wke
    public final void d(View view, ajrs ajrsVar) {
        apzg apzgVar;
        apzg apzgVar2;
        apzg apzgVar3;
        View g = zag.g(view, R.id.suggested_videos_companion_card_stub, R.id.suggested_videos_companion_card);
        this.e = g;
        this.f = (ViewGroup) g.findViewById(R.id.header);
        this.g = (ViewGroup) this.e.findViewById(R.id.videos);
        g(view);
        aunb aunbVar = this.c.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        avcn avcnVar = (avcn) ajjh.l(aunbVar, SuggestedVideosHeaderRendererOuterClass.suggestedVideosHeaderRenderer);
        apzg apzgVar4 = null;
        if (avcnVar != null) {
            View b = b(avcnVar, ajrsVar, this.f);
            this.f.addView(b);
            may mayVar = this.a;
            byte[] I = avcnVar.i.I();
            if ((avcnVar.b & 16) != 0) {
                apzgVar3 = avcnVar.g;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
            } else {
                apzgVar3 = null;
            }
            mayVar.a(avcnVar, b, I, apzgVar3);
        }
        ajrs ajrsVar2 = new ajrs();
        int i = 0;
        while (i < this.c.d.size()) {
            ajrsVar2.i(ajrsVar);
            ajrsVar2.f("isLastVideo", Boolean.valueOf(i == this.c.d.size() + (-1)));
            avcl avclVar = (avcl) ajjh.l((aunb) this.c.d.get(i), SuggestedVideoRendererOuterClass.suggestedVideoRenderer);
            if (avclVar != null) {
                View b2 = b(avclVar, ajrsVar2, this.g);
                this.g.addView(b2);
                may mayVar2 = this.a;
                byte[] I2 = avclVar.k.I();
                if ((avclVar.b & 64) != 0) {
                    apzgVar2 = avclVar.i;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                } else {
                    apzgVar2 = null;
                }
                mayVar2.a(avclVar, b2, I2, apzgVar2);
            }
            aqev aqevVar = (aqev) ajjh.l((aunb) this.c.d.get(i), CompactSuggestedVideoRendererOuterClass.compactSuggestedVideoRenderer);
            if (aqevVar != null) {
                View b3 = b(aqevVar, ajrsVar2, this.g);
                this.g.addView(b3);
                may mayVar3 = this.a;
                byte[] I3 = aqevVar.j.I();
                if ((aqevVar.b & 32) != 0) {
                    apzgVar = aqevVar.h;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                } else {
                    apzgVar = null;
                }
                mayVar3.a(aqevVar, b3, I3, apzgVar);
            }
            i++;
        }
        may mayVar4 = this.a;
        avcm avcmVar = this.c;
        View view2 = this.e;
        byte[] I4 = avcmVar.f.I();
        avcm avcmVar2 = this.c;
        if ((avcmVar2.b & 2) != 0 && (apzgVar4 = avcmVar2.e) == null) {
            apzgVar4 = apzg.a;
        }
        mayVar4.a(avcmVar, view2, I4, apzgVar4);
    }

    @Override // defpackage.wke
    public final void e(View view) {
        may mayVar = this.a;
        mayVar.a.clear();
        mayVar.b.clear();
        this.c = null;
        this.d = false;
        g(view);
        this.e = null;
        this.f = null;
        this.g = null;
    }

    @Override // defpackage.wke
    public final void f() {
        this.d = true;
        j();
    }

    @Override // defpackage.wke
    public final void h(wxo wxoVar) {
    }

    @Override // defpackage.wkg
    public final boolean i(String str, aqfd aqfdVar, asit asitVar) {
        avcm avcmVar;
        if ((aqfdVar.b & 128) != 0) {
            avcmVar = aqfdVar.j;
            if (avcmVar == null) {
                avcmVar = avcm.a;
            }
        } else {
            avcmVar = null;
        }
        this.c = avcmVar;
        return avcmVar != null;
    }
}
