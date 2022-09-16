package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: hoi  reason: default package */
/* loaded from: classes3.dex */
public final class hoi implements View.OnClickListener, zua, hpy {
    private final ayor A;
    public final hpu a;
    public final hwq b;
    public final hos c;
    public final Handler d;
    public dt e;
    public acti f;
    public View g;
    public View h;
    public View i;
    public View j;
    public LinearLayout k;
    public View l;
    public View m;
    public View n;
    public ViewGroup o;
    public View p;
    public View q;
    public ampq r;
    public hof s;
    public RecordingInfo t;
    public boolean u;
    public float v;
    public boolean w;
    public boolean x;
    private final hnw y;
    private final ayor z;

    public hoi(hpu hpuVar, hwq hwqVar, hos hosVar, Handler handler, ayor ayorVar, ayor ayorVar2, hnw hnwVar) {
        this.a = hpuVar;
        this.b = hwqVar;
        this.c = hosVar;
        this.d = handler;
        this.z = ayorVar;
        this.A = ayorVar2;
        this.y = hnwVar;
    }

    public static final void d(View view, int i) {
        if (view instanceof EditorButtonView) {
            ((EditorButtonView) view).a(i);
        } else if (!(view instanceof ImageButton)) {
        } else {
            ((ImageButton) view).setImageDrawable(view.getContext().getDrawable(i));
        }
    }

    @Override // defpackage.hpy
    public final float a() {
        if (this.u) {
            return -this.v;
        }
        return 0.0f;
    }

    @Override // defpackage.hpy
    public final float b() {
        if (this.u) {
            return 0.0f;
        }
        return -this.v;
    }

    @Override // defpackage.hpy
    public final View c() {
        return this.g;
    }

    @Override // defpackage.hpy
    public final void e() {
    }

    @Override // defpackage.hpy
    public final void f() {
    }

    @Override // defpackage.zua
    public final void g() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hry hryVar;
        View view2;
        if (view == this.h) {
            this.f.H(3, new acte(actj.MOBILE_BACK_BUTTON), null);
            this.y.aE(this.t);
        } else if (view == this.i) {
            this.f.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_TRIM_BUTTON), null);
            hnu hnuVar = (hnu) this.s;
            if (!hnuVar.br().L()) {
                hqs.j(hnuVar.mJ(), R.string.reel_video_not_support_trim);
                return;
            }
            hom homVar = hnuVar.am;
            if (!homVar.d) {
                zag.o(homVar.b, true);
                hqb.d(homVar);
                homVar.d = true;
                homVar.g.n(new acte(actj.REEL_CONFIRM_EDIT_BUTTON));
            }
            hnuVar.aY();
        } else if (view == this.j) {
            hof hofVar = this.s;
            hnu hnuVar2 = (hnu) hofVar;
            if (hnuVar2.c) {
                hnuVar2.al.g(hnuVar2.bl());
                hnuVar2.aY();
                return;
            }
            boolean bl = hnuVar2.bl();
            Context rb = ((dp) hofVar).rb();
            if (rb != null && zdg.e(rb) && (view2 = hnuVar2.ah.j) != null) {
                zdg.c(rb, view2, rb.getResources().getText(true != bl ? R.string.accessibility_audio_muted : R.string.accessibility_audio_unmuted));
            }
            hnuVar2.d();
        } else if (view == this.m) {
            hnu hnuVar3 = (hnu) this.s;
            hnuVar3.onClick(hnuVar3.ah.m);
            hnk hnkVar = hnuVar3.an;
            if (!hnkVar.d) {
                ChooseFilterView chooseFilterView = hnkVar.b;
                if (!chooseFilterView.f) {
                    chooseFilterView.k();
                }
                hqb.d(hnkVar);
                hnkVar.d = true;
                hnkVar.g.n(new acte(actj.UPLOAD_VIDEO_EDITING_CONFIRM_FILTER_BUTTON));
            }
            hnuVar3.aY();
        } else if (view == this.n) {
            hof hofVar2 = this.s;
            hnu hnuVar4 = (hnu) hofVar2;
            hnuVar4.aY();
            dp dpVar = (dp) hofVar2;
            eo eoVar = dpVar.z;
            if (eoVar == null || eoVar.f("draw_fragment") == null) {
                hryVar = new hry();
                hryVar.ae(new Bundle());
            } else {
                hryVar = (hry) dpVar.z.f("draw_fragment");
            }
            hryVar.a = new hnr(hnuVar4);
            ex l = hnuVar4.mJ().getSupportFragmentManager().l();
            l.q(R.id.reel_edit_ui_container, hryVar, "draw_fragment");
            l.a();
        } else {
            View view3 = this.p;
            if (view != view3) {
                return;
            }
            view3.setClickable(false);
            View view4 = this.p;
            if (view4 instanceof EditorButtonView) {
                ((EditorButtonView) view4).b.setImageDrawable(null);
            } else if (view4 instanceof ImageButton) {
                ((ImageButton) view4).setImageDrawable(null);
            }
            this.q.setVisibility(0);
            if (this.r.h() && !((aypg) this.r.c()).e()) {
                ((aypg) this.r.c()).qr();
            }
            final ReelItemEditModel f = ((hnu) this.s).d.f();
            this.r = ampq.j(ayos.A(new Callable() { // from class: hoe
                /* JADX WARN: Removed duplicated region for block: B:108:0x0348  */
                /* JADX WARN: Removed duplicated region for block: B:109:0x034c  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x035a  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x035c  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x037b  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
                /* JADX WARN: Type inference failed for: r5v0, types: [hos] */
                /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r5v7 */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 895
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.hoe.call():java.lang.Object");
                }
            }).K(this.A).G(this.z).S(new ayqb() { // from class: hoc
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    final hoi hoiVar = hoi.this;
                    ReelItemEditModel reelItemEditModel = f;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    boolean z = reelItemEditModel.d().f;
                    hoiVar.q.setVisibility(8);
                    if (booleanValue) {
                        View view5 = hoiVar.p;
                        if (view5 instanceof EditorButtonView) {
                            ((EditorButtonView) view5).c(view5.getContext().getString(R.string.reel_video_editor_succeed_save_media));
                        }
                        hoi.d(hoiVar.p, 2131232420);
                        hqs.j(hoiVar.e, R.string.reel_video_editor_succeed_save_media);
                        hoiVar.d.postDelayed(new Runnable() { // from class: hod
                            @Override // java.lang.Runnable
                            public final void run() {
                                hoi hoiVar2 = hoi.this;
                                hoiVar2.p.setClickable(true);
                                hoi.d(hoiVar2.p, 2131232531);
                                View view6 = hoiVar2.p;
                                if (view6 instanceof EditorButtonView) {
                                    ((EditorButtonView) view6).c(view6.getContext().getString(R.string.reel_edit_save_video_button_text));
                                }
                            }
                        }, 2000L);
                        return;
                    }
                    hoiVar.p.setClickable(true);
                    hoi.d(hoiVar.p, 2131232531);
                    hqs.j(hoiVar.e, true != z ? R.string.reel_video_editor_fail_save_video : R.string.reel_video_editor_fail_save_photo);
                }
            }));
        }
    }
}
