package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.apps.youtube.app.offline.ui.UploadArrowView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: imp  reason: default package */
/* loaded from: classes3.dex */
public final class imp implements ilz {
    public final azpb a;
    public final aynx b;
    public final aynx c;
    public final aynx d;
    public final aynx e;
    aypg f;
    public final Context g;
    public final aagi h;
    public final imo i;
    public final UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer j;
    private final azpb k;
    private final azpb l;
    private final aynx m;
    private final ayor n;

    public imp(ayor ayorVar, Context context, aagi aagiVar, final ilv ilvVar, ilu iluVar, final aacz aaczVar, imo imoVar, UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer) {
        avuw avuwVar;
        String str;
        avux avuxVar;
        azpb ax = azpa.as(false).ax();
        this.k = ax;
        azpb ax2 = azpa.as(false).ax();
        this.l = ax2;
        this.a = azpa.as(ily.ALLOW_VISIBLE).ax();
        this.n = ayorVar;
        this.g = context;
        this.h = aagiVar;
        imoVar.getClass();
        this.i = imoVar;
        this.j = uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
        int i = uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.d;
        if (i == 7) {
            str = ((avux) uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.e).b;
        } else {
            if (i == 8) {
                avuwVar = (avuw) uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.e;
            } else {
                avuwVar = avuw.a;
            }
            str = avuwVar.b;
        }
        this.c = h(ilvVar.a, str).af(ilt.p).i(aynq.LATEST).M(false);
        this.e = ilvVar.b.i(aynq.LATEST).M(false);
        this.d = ax.O(new ayqe() { // from class: ima
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                ilv ilvVar2 = ilv.this;
                if (!((Boolean) obj).booleanValue()) {
                    return ilvVar2.c.V(ilt.i).i(aynq.LATEST);
                }
                return aynx.B(true);
            }
        }).M(false);
        if (uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.b == 6) {
            avuxVar = (avux) uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.c;
        } else {
            avuxVar = avux.a;
        }
        this.m = h(iluVar.a, avuxVar.b).af(ilt.q).i(aynq.LATEST);
        g();
        this.b = ax2.O(new ayqe() { // from class: imc
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                imp impVar = imp.this;
                aacz aaczVar2 = aaczVar;
                if (!((Boolean) obj).booleanValue()) {
                    return aynx.B(imm.a());
                }
                avve avveVar = aaczVar2.b().s;
                if (avveVar == null) {
                    avveVar = avve.a;
                }
                if (!avveVar.h) {
                    return impVar.h.c().i(akyu.a).Y(ayrb.b(amon.a)).i(aynq.LATEST).C(ilt.o).C(ilt.n).n().O(new imb(impVar, 1)).n();
                }
                aynx C = impVar.h.c().h(akyu.a, true).i(aynq.LATEST).u(ikb.h).C(ilt.m).C(ilt.j);
                int i2 = impVar.j.d;
                if (i2 == 5) {
                    C = aynx.sn(C, impVar.e, impVar.d, img.a);
                } else if (i2 == 7) {
                    C = aynx.sn(C, impVar.c, impVar.e, img.c);
                } else if (i2 == 8) {
                    C = aynx.g(C, impVar.e, impVar.c, impVar.d, ojc.b);
                }
                return C.O(new imb(impVar)).n();
            }
        }).aj().c().h(new ayob() { // from class: ime
            @Override // defpackage.ayob
            public final bamd a(aynx aynxVar) {
                return aynx.e(aynxVar, imp.this.a, eho.g);
            }
        }).I().G(ayorVar);
    }

    public static iml d(imj imjVar) {
        if (imjVar instanceof imm) {
            return iml.a(0, 0);
        }
        if (imjVar instanceof imn) {
            imn imnVar = (imn) imjVar;
            int i = imnVar.d;
            return iml.a(i, imnVar.c + i + imnVar.b);
        } else if (imjVar instanceof imk) {
            imk imkVar = (imk) imjVar;
            int i2 = imkVar.c;
            return iml.a(i2, imkVar.a + i2 + imkVar.b);
        } else if (imjVar instanceof iml) {
            return (iml) imjVar;
        } else {
            String valueOf = String.valueOf(imjVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("unrecognized arrow state type: ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        }
    }

    private static ayoi h(ayoi ayoiVar, String str) {
        return ayoiVar.V(new fcr(str, 2));
    }

    @Override // defpackage.ilz
    public final void a(boolean z) {
        this.k.c(Boolean.valueOf(z));
    }

    @Override // defpackage.ilz
    public final void b(boolean z) {
        if (!z) {
            aypg aypgVar = this.f;
            if (aypgVar != null) {
                azof.f((AtomicReference) aypgVar);
            }
            this.f = null;
            g();
        } else if (this.f == null) {
            this.f = this.b.Z(new ayqb() { // from class: imf
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    imp impVar = imp.this;
                    imj imjVar = (imj) obj;
                    if (imjVar instanceof imm) {
                        impVar.g();
                    } else if (imjVar instanceof imn) {
                        Object a = impVar.i.a();
                        float f = ((imn) imjVar).a;
                        UploadArrowView uploadArrowView = (UploadArrowView) a;
                        uploadArrowView.setVisibility(0);
                        ((jqd) a).l(f);
                        zag.o(uploadArrowView.f, false);
                        LottieAnimationView lottieAnimationView = uploadArrowView.i;
                        if (lottieAnimationView == null) {
                            return;
                        }
                        lottieAnimationView.setVisibility(0);
                        if (lottieAnimationView.o()) {
                            return;
                        }
                        lottieAnimationView.e();
                    } else if (imjVar instanceof imk) {
                        Object a2 = impVar.i.a();
                        UploadArrowView uploadArrowView2 = (UploadArrowView) a2;
                        uploadArrowView2.setVisibility(0);
                        ((jqd) a2).k();
                        int i = uploadArrowView2.l;
                        int d = zhn.d(uploadArrowView2.getContext(), R.attr.ytCallToAction);
                        uploadArrowView2.a(i);
                        TintableImageView tintableImageView = uploadArrowView2.f;
                        if (tintableImageView == null) {
                            return;
                        }
                        tintableImageView.a(ColorStateList.valueOf(d));
                    } else if (!(imjVar instanceof iml)) {
                    } else {
                        Object a3 = impVar.i.a();
                        UploadArrowView uploadArrowView3 = (UploadArrowView) a3;
                        uploadArrowView3.setVisibility(0);
                        ((jqd) a3).k();
                        uploadArrowView3.a(uploadArrowView3.m);
                    }
                }
            });
        }
        this.l.c(Boolean.valueOf(z));
    }

    @Override // defpackage.ilz
    public final void c(ily ilyVar) {
        ilyVar.getClass();
        this.a.c(ilyVar);
    }

    public final aynx e(imj imjVar) {
        avut avutVar;
        if (!(imjVar instanceof imk)) {
            if (imjVar instanceof iml) {
                aynx r = aynx.r();
                int i = this.j.d;
                if (i == 5) {
                    r = this.k;
                } else if (i == 8) {
                    r = aynx.e(this.c, this.k, eho.h);
                } else if (i == 7) {
                    r = this.c;
                }
                return r.u(ikb.j).al().C(ilt.s);
            }
            return aynx.r();
        }
        int i2 = this.j.b;
        if (i2 != 3) {
            if (i2 != 6) {
                return aynx.r();
            }
            return this.m.u(ikb.i).al().C(ilt.r);
        }
        aynx B = aynx.B(imm.a());
        UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer = this.j;
        if (uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.b == 3) {
            avutVar = (avut) uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.c;
        } else {
            avutVar = avut.a;
        }
        float f = avutVar.b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ayor ayorVar = this.n;
        ayrd.b(timeUnit, "unit is null");
        ayvf ayvfVar = new ayvf(B, Math.max(0L, f * 1000.0f), timeUnit, ayorVar);
        azqc.j();
        return ayvfVar;
    }

    public final String f(imj imjVar) {
        try {
            final ilt iltVar = ilt.l;
            final imb imbVar = new imb(this, 5);
            final imb imbVar2 = new imb(this, 3);
            final imb imbVar3 = new imb(this, 4);
            return (String) new ayqe() { // from class: imd
                @Override // defpackage.ayqe
                public final Object a(Object obj) {
                    ayqe ayqeVar = ayqe.this;
                    ayqe ayqeVar2 = imbVar;
                    ayqe ayqeVar3 = imbVar2;
                    ayqe ayqeVar4 = imbVar3;
                    imj imjVar2 = (imj) obj;
                    if (imjVar2 instanceof imm) {
                        return ayqeVar.a((imm) imjVar2);
                    }
                    if (imjVar2 instanceof imn) {
                        return ayqeVar2.a((imn) imjVar2);
                    }
                    if (imjVar2 instanceof imk) {
                        return ayqeVar3.a((imk) imjVar2);
                    }
                    if (imjVar2 instanceof iml) {
                        return ayqeVar4.a((iml) imjVar2);
                    }
                    String valueOf = String.valueOf(imjVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                    sb.append("unrecognized arrow state type: ");
                    sb.append(valueOf);
                    throw new AssertionError(sb.toString());
                }
            }.a(imjVar);
        } catch (MissingFormatArgumentException unused) {
            return "";
        }
    }

    public final void g() {
        if (this.i.b()) {
            Object a = this.i.a();
            ((UploadArrowView) a).setVisibility(8);
            ((jqd) a).k();
        }
    }
}
