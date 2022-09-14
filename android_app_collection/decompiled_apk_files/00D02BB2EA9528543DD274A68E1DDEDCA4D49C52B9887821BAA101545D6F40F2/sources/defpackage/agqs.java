package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: agqs  reason: default package */
/* loaded from: classes2.dex */
public final class agqs extends cqiw<agww> {
    public static final dcqe a = dcqe.c("agqs");
    public static final cqss b = ibm.x();
    public final boolean c;
    private final int d;

    public agqs(int i, boolean z) {
        super(Integer.valueOf(i), Boolean.valueOf(z));
        this.d = i;
        this.c = z;
    }

    public static cqfc e(final agww agwwVar, final Context context) {
        return new cqfc(agwwVar, context) { // from class: agqf
            private final agww a;
            private final Context b;

            {
                this.a = agwwVar;
                this.b = context;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                agww agwwVar2 = this.a;
                Context context2 = this.b;
                if (agwwVar2.j(null) != agwv.SAVE_COMPLETED) {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() < 3) {
                    bvoo.h("Unexpected child views: %d", Integer.valueOf(frameLayout.getChildCount()));
                    return;
                }
                final View childAt = frameLayout.getChildAt(0);
                View childAt2 = frameLayout.getChildAt(1);
                final ImageView imageView = (ImageView) frameLayout.getChildAt(2);
                childAt.animate().cancel();
                childAt.setScaleX(0.0f);
                childAt.setScaleY(0.0f);
                childAt.setAlpha(0.8f);
                childAt.setVisibility(0);
                childAt.animate().scaleX(1.8f).scaleY(1.8f).alpha(0.0f).setDuration(585L).setInterpolator(irf.a).withEndAction(new Runnable(childAt) { // from class: agqg
                    private final View a;

                    {
                        this.a = childAt;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        View view2 = this.a;
                        dcqe dcqeVar = agqs.a;
                        view2.setVisibility(8);
                    }
                }).start();
                childAt2.animate().cancel();
                childAt2.setScaleX(0.0f);
                childAt2.setScaleY(0.0f);
                childAt2.setVisibility(0);
                childAt2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(225L).setInterpolator(irf.c).start();
                imageView.animate().cancel();
                imageView.setRotation(0.0f);
                imageView.animate().rotation(25.0f).setDuration(450L).setInterpolator(agqh.a).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final int b2 = agqs.b.b(context2);
                final int b3 = agwwVar2.d().b(context2);
                final int i = cqta.f().a;
                final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                ofFloat.setDuration(225L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(imageView, argbEvaluator, b2, i, b3) { // from class: agqi
                    private final ImageView a;
                    private final ArgbEvaluator b;
                    private final int c;
                    private final int d;
                    private final int e;

                    {
                        this.a = imageView;
                        this.b = argbEvaluator;
                        this.c = b2;
                        this.d = i;
                        this.e = b3;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ImageView imageView2 = this.a;
                        ArgbEvaluator argbEvaluator2 = this.b;
                        int i2 = this.c;
                        int i3 = this.d;
                        int i4 = this.e;
                        Drawable drawable = imageView2.getDrawable();
                        if (!(drawable instanceof LayerDrawable) || ((LayerDrawable) drawable).getNumberOfLayers() != 3) {
                            bvoo.h("Unexpected icon drawable: %s", drawable);
                            return;
                        }
                        LayerDrawable layerDrawable = (LayerDrawable) drawable.mutate();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        Drawable mutate = layerDrawable.getDrawable(0).mutate();
                        Integer valueOf = Integer.valueOf(i2);
                        Integer valueOf2 = Integer.valueOf(i3);
                        mutate.setColorFilter(((Integer) argbEvaluator2.evaluate(floatValue, valueOf, valueOf2)).intValue(), PorterDuff.Mode.SRC_IN);
                        layerDrawable.getDrawable(1).mutate().setColorFilter(((Integer) argbEvaluator2.evaluate(floatValue, valueOf2, Integer.valueOf(i4))).intValue(), PorterDuff.Mode.SRC_IN);
                    }
                });
                ofFloat.start();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agww> a() {
        cqnf cd;
        cqmp[] cqmpVarArr = new cqmp[8];
        cqmpVarArr[0] = cqgr.cd(-2);
        cqmpVarArr[1] = cqgr.bp(-1);
        cqmpVarArr[2] = cqgr.L(false);
        cqmpVarArr[3] = cqgr.P(false);
        cqmpVarArr[4] = cqgr.cW(cqgr.q(agqe.a));
        cqmpVarArr[5] = iue.c(new cqlc(this) { // from class: agqj
            private final agqs a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((agww) cqkpVar).h(this.a.c);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr[6] = cqgr.V(agqk.a);
        cqmp[] cqmpVarArr2 = new cqmp[12];
        cqmpVarArr2[0] = cqgr.cd(-2);
        cqmpVarArr2[1] = cqgr.bp(-2);
        cqmpVarArr2[2] = cqgr.bw(17);
        cqmpVarArr2[3] = cqgr.dQ(cqrp.d(12.0d));
        cqmpVarArr2[4] = cqgr.dF(cqrp.d(12.0d));
        cqmpVarArr2[5] = cqgr.L(false);
        cqmpVarArr2[6] = cqgr.P(false);
        cqmpVarArr2[7] = cqgr.fE(agql.a);
        cqmpVarArr2[8] = cqgr.gs(cqgr.fI(8), cqgr.ch(cqrp.d(36.0d)), cqgr.bw(1), cqgr.w(agqm.a));
        cqmpVarArr2[9] = cqgr.gs(cqgr.aI(agqn.a), cqgr.ch(cqrp.d(36.0d)), cqgr.bw(1), cqgr.i(Float.valueOf(0.12f)), cqgr.w(agqo.a));
        cqmpVarArr2[10] = cqgr.gc(cqgr.ch(cqrp.d(36.0d)), cqgr.bw(1), cqgr.w(agqp.a), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eF(agqq.a));
        cqmp[] cqmpVarArr3 = new cqmp[10];
        int i = this.d;
        if (i != 0) {
            cd = cqgr.ce(cqrp.d(i));
        } else {
            cd = cqgr.cd(-2);
        }
        cqmpVarArr3[0] = cd;
        cqmpVarArr3[1] = cqgr.bp(-2);
        cqmpVarArr3[2] = cqgr.bV(cqrp.d(42.0d));
        cqmpVarArr3[3] = cqgr.bw(1);
        cqmpVarArr3[4] = cqgr.cB(2);
        cqmpVarArr3[5] = cqgr.ar(TextUtils.TruncateAt.END);
        cqmpVarArr3[6] = ibq.q();
        cqmpVarArr3[7] = cqgr.eU(ibm.o());
        cqmpVarArr3[8] = cqgr.eN(4);
        cqmpVarArr3[9] = cqgr.eM(agqr.a);
        cqmpVarArr2[11] = cqgr.gq(cqmpVarArr3);
        cqmpVarArr[7] = cqgr.fY(cqmpVarArr2);
        return cqgr.fY(cqmpVarArr);
    }
}
