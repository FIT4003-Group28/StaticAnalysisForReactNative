package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Property;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* compiled from: PG */
/* renamed from: cwql  reason: default package */
/* loaded from: classes5.dex */
public final class cwql extends ry implements cwim {
    public static final String ad = "cwql";
    private static final Property<View, Float> am = new cwqb(Float.class);
    private static final Property<View, Integer> an = new cwqc(Integer.class);
    public boolean ae;
    public SparseArray<Parcelable> af;
    public cwqp ag;
    public ExpandableDialogView ah;
    public cwqh ai;
    public final cwin aj = new cwin(this);
    public cwgw ak;
    private cwpt al;

    public static final void aK(cwqp cwqpVar, View view) {
        czhz.b();
        cwph cwphVar = (cwph) cwqpVar;
        aL((ViewGroup) view.findViewById(R.id.og_container_footer), cwphVar.c);
        aL((ViewGroup) view.findViewById(R.id.og_header_container), cwphVar.a);
        aL((ViewGroup) view.findViewById(R.id.og_container_content_view), cwphVar.b);
        view.setVisibility(0);
    }

    private static void aL(ViewGroup viewGroup, cwqi cwqiVar) {
        viewGroup.removeAllViews();
        viewGroup.addView(cwqiVar.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }

    @Override // defpackage.ex, defpackage.fd
    public final void Qe() {
        super.Qe();
        cwpt cwptVar = this.al;
        cwptVar.c.getViewTreeObserver().removeOnScrollChangedListener(cwptVar.a);
        View view = cwptVar.c;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(cwptVar.b);
        this.al = null;
    }

    @Override // defpackage.cwim
    public final boolean a() {
        return this.ai != null;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        TypedArray obtainStyledAttributes = I().getTheme().obtainStyledAttributes(new int[]{R.attr.ogPopoverStyle});
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, 2132017755);
            obtainStyledAttributes.recycle();
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
            Bundle bundle2 = this.o;
            if (bundle2 != null && bundle2.getBoolean("accountMenuFlavorsStyle", false)) {
                contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, 2132017737);
            }
            Bundle bundle3 = this.o;
            if (bundle3 != null && bundle3.getBoolean("dialogCenteredStyle", false)) {
                contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, 2132017748);
            }
            final View inflate = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.og_dialog, viewGroup, false);
            ExpandableDialogView expandableDialogView = (ExpandableDialogView) inflate.findViewById(R.id.og_dialog_view);
            dbsk.s(expandableDialogView);
            this.ah = expandableDialogView;
            cwin cwinVar = this.aj;
            Runnable runnable = new Runnable(this, inflate) { // from class: cwpv
                private final cwql a;
                private final View b;

                {
                    this.a = this;
                    this.b = inflate;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cwql cwqlVar = this.a;
                    View view = this.b;
                    dbsk.m(cwqlVar.ai != null, "configuration can't be null after initialization.");
                    cwqlVar.ai.a().a(view);
                    cwqlVar.ah.setIsExperimental(cwqlVar.ai.d());
                    cwla c = cwqlVar.ai.c();
                    c.b(view.findViewById(R.id.og_container_header), 93522);
                    c.b(view.findViewById(R.id.og_header_close_button), 93521);
                }
            };
            czhz.b();
            cwinVar.a.add(runnable);
            if (cwinVar.b.a()) {
                cwinVar.a();
            }
            Dialog dialog = this.d;
            Window window = dialog != null ? dialog.getWindow() : null;
            ExpandableDialogView expandableDialogView2 = this.ah;
            expandableDialogView2.i = window;
            expandableDialogView2.setDismissRunnable(new Runnable(this) { // from class: cwpw
                private final cwql a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f();
                }
            });
            cwqp cwqpVar = this.ag;
            if (cwqpVar != null) {
                aK(cwqpVar, this.ah);
            } else if (bundle != null) {
                this.af = bundle.getSparseParcelableArray("viewHierarchyState");
            }
            return inflate;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        czhz.b();
        View view2 = this.P;
        dbsk.t(view2, "tagWithLifecycleOwner() is only allowed when fragment.getView() is not null");
        view2.getRootView().setTag(R.id.og_fragment_lifecycle_tag, x());
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 1280);
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 512);
        view.findViewById(R.id.og_header_close_button).setOnClickListener(new View.OnClickListener(this) { // from class: cwpx
            private final cwql a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                cwql cwqlVar = this.a;
                cwqh cwqhVar = cwqlVar.ai;
                if (cwqhVar != null) {
                    cwqhVar.c().d(csgw.a(), view3);
                }
                cwqlVar.f();
            }
        });
        view.setOnClickListener(new View.OnClickListener(this) { // from class: cwpy
            private final cwql a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.a.f();
            }
        });
        cwpt cwptVar = new cwpt(this.ah, cwpt.d, view.findViewById(R.id.og_container_scroll_view));
        this.al = cwptVar;
        cwptVar.b();
        if (bundle == null) {
            ExpandableDialogView expandableDialogView = this.ah;
            expandableDialogView.getClass();
            expandableDialogView.setAlpha(0.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(expandableDialogView, (Property<ExpandableDialogView, Float>) am, 0.0f, 1.0f);
            ofFloat.setDuration(83L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(expandableDialogView, PropertyValuesHolder.ofFloat(View.SCALE_X, 0.8f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.8f, 1.0f));
            ofPropertyValuesHolder.setDuration(200L);
            ofPropertyValuesHolder.setInterpolator(new aop());
            expandableDialogView.getViewTreeObserver().addOnPreDrawListener(new cwpz(expandableDialogView));
            Dialog dialog = this.d;
            if (dialog != null && dialog.getWindow() != null) {
                int c = akm.c(I(), R.color.google_scrim);
                ObjectAnimator ofObject = ObjectAnimator.ofObject(this.d.getWindow().getDecorView(), (Property<View, V>) an, (TypeEvaluator) new czuo(), (Object[]) new Integer[]{Integer.valueOf(kc.f(c, 0)), Integer.valueOf(c)});
                ofObject.setInterpolator(new LinearInterpolator());
                ofObject.setDuration(200L);
                ofObject.start();
            }
            ofFloat.start();
            ofPropertyValuesHolder.start();
        }
    }

    @Override // defpackage.ex, defpackage.ajyl
    public final void f() {
        Dialog dialog = this.d;
        if (dialog == null || dialog.getWindow() == null) {
            aJ();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d.getWindow().getDecorView(), am, 1.0f, 0.0f);
        ofFloat.setDuration(83L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new cwqa(this));
        ofFloat.start();
    }

    @Override // defpackage.ex, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        d(2, 2132017753);
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ExpandableDialogView expandableDialogView = this.ah;
        if (expandableDialogView != null) {
            expandableDialogView.onConfigurationChanged(configuration);
        }
    }

    @Override // defpackage.ry, defpackage.ex
    public final Dialog q(Bundle bundle) {
        Dialog q = super.q(bundle);
        cwqp cwqpVar = this.ag;
        if (cwqpVar != null) {
            q.setTitle(((cwph) cwqpVar).d);
        }
        return q;
    }

    @Override // defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        this.ae = true;
        cwgw cwgwVar = this.ak;
        if (cwgwVar != null) {
            cwgwVar.a();
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        if (this.ah != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.af = sparseArray;
            this.ah.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("viewHierarchyState", this.af);
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public final void u() {
        super.u();
        this.ae = false;
        cwgw cwgwVar = this.ak;
        if (cwgwVar != null) {
            cwgwVar.b.a().k(cwgwVar.c.b);
            if (!cwgwVar.b.g().a()) {
                return;
            }
            cwgwVar.b.g().b().c(cwgwVar.a);
        }
    }

    public final void aJ() {
        if (!S()) {
            return;
        }
        if (!D()) {
            super.f();
        } else {
            super.g();
        }
        cwqh cwqhVar = this.ai;
        if (cwqhVar == null) {
            return;
        }
        cwqhVar.b().a();
    }
}
