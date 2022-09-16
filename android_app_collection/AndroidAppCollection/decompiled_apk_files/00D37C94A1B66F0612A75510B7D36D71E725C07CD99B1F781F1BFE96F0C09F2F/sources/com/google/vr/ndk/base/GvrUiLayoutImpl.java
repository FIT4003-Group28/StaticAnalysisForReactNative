package com.google.vr.ndk.base;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.vr.vrcore.library.api.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class GvrUiLayoutImpl extends axgf {
    private final Runnable beginDimmingUiLayerRunnable;
    private final CloseButtonListenerWrapper closeButtonListener;
    private boolean daydreamModeEnabled;
    private final Runnable delayDimmingUiLayerAfterVisibleRunnable;
    private final axfc uiLayer;
    private ObjectAnimator uiLayerDimmingAnimation;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    class CloseButtonListenerWrapper implements Runnable {
        private Runnable activeCloseButtonListener;
        private final Context context;
        private final Runnable defaultCloseButtonListener;
        private boolean invokingCloseButton = false;
        private final Runnable passiveCloseButtonListener;

        public CloseButtonListenerWrapper(Context context, Runnable runnable, DaydreamUtilsWrapper daydreamUtilsWrapper) {
            this.context = context;
            this.passiveCloseButtonListener = runnable;
            Runnable createDefaultCloseButtonListener = GvrUiLayoutImpl.createDefaultCloseButtonListener(context, daydreamUtilsWrapper);
            this.defaultCloseButtonListener = createDefaultCloseButtonListener;
            this.activeCloseButtonListener = createDefaultCloseButtonListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.invokingCloseButton) {
                Log.w("GvrUiLayoutImpl", "GVR close behavior invoked recursively.");
                Activity k = axds.k(this.context);
                if (k == null) {
                    return;
                }
                k.finish();
                return;
            }
            this.invokingCloseButton = true;
            try {
                Runnable runnable = this.passiveCloseButtonListener;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = this.activeCloseButtonListener;
                if (runnable2 != null) {
                    runnable2.run();
                }
            } finally {
                this.invokingCloseButton = false;
            }
        }

        public void setClientCloseButtonListener(Runnable runnable) {
            if (runnable == null) {
                runnable = this.defaultCloseButtonListener;
            }
            this.activeCloseButtonListener = runnable;
        }
    }

    public GvrUiLayoutImpl(Context context, Runnable runnable) {
        this(context, runnable, new DaydreamUtilsWrapper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void beginDimmingUiLayer() {
        cancelDimmingUiLayer();
        axeu axeuVar = this.uiLayer.h;
        if (axeuVar == null || axeuVar.getVisibility() != 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.uiLayer.b, View.ALPHA, 1.0f, 0.2f);
            this.uiLayerDimmingAnimation = ofFloat;
            ofFloat.setDuration(500L);
            this.uiLayerDimmingAnimation.start();
            setDimmedUiTouchOverride();
            return;
        }
        getRoot().postDelayed(this.delayDimmingUiLayerAfterVisibleRunnable, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Runnable createDefaultCloseButtonListener(final Context context, DaydreamUtilsWrapper daydreamUtilsWrapper) {
        final Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        final Activity k = axds.k(context);
        if (k == null) {
            return new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    context.startActivity(intent);
                }
            };
        }
        if (daydreamUtilsWrapper.isDaydreamActivity(k)) {
            return new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    k.startActivity(intent);
                    k.finish();
                }
            };
        }
        return new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl.3
            @Override // java.lang.Runnable
            public void run() {
                k.onBackPressed();
            }
        };
    }

    private void delayDimmingUiLayer(long j) {
        cancelDimmingUiLayer();
        getRoot().postDelayed(this.beginDimmingUiLayerRunnable, j);
    }

    private void setDimmedUiTouchOverride() {
        this.uiLayer.k = new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                GvrUiLayoutImpl.this.lambda$setDimmedUiTouchOverride$0$GvrUiLayoutImpl();
            }
        };
    }

    public void cancelDimmingUiLayer() {
        getRoot().removeCallbacks(this.beginDimmingUiLayerRunnable);
        ObjectAnimator objectAnimator = this.uiLayerDimmingAnimation;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.uiLayerDimmingAnimation = null;
        }
        this.uiLayer.b.setAlpha(1.0f);
        this.uiLayer.k = null;
    }

    public void delayDimmingUiLayerAfterVisible() {
        delayDimmingUiLayer(2500L);
    }

    public ViewGroup getRoot() {
        return this.uiLayer.b;
    }

    @Override // defpackage.axgg
    public axgj getRootView() {
        return ObjectWrapper.a(this.uiLayer.b);
    }

    public void invokeCloseButtonListener() {
        this.closeButtonListener.run();
    }

    @Override // defpackage.axgg
    public boolean isEnabled() {
        return this.uiLayer.i;
    }

    public /* synthetic */ void lambda$setDimmedUiTouchOverride$0$GvrUiLayoutImpl() {
        delayDimmingUiLayer(5000L);
    }

    @Override // defpackage.axgg
    public void setCloseButtonListener(axgj axgjVar) {
        this.closeButtonListener.setClientCloseButtonListener(axgjVar != null ? (Runnable) ObjectWrapper.b(axgjVar, Runnable.class) : null);
    }

    public void setDaydreamModeEnabled(boolean z) {
        if (this.daydreamModeEnabled == z) {
            return;
        }
        this.daydreamModeEnabled = z;
        if (z) {
            this.uiLayer.d(0.35f);
            this.uiLayer.e(false);
            return;
        }
        this.uiLayer.d(1.0f);
    }

    @Override // defpackage.axgg
    public void setEnabled(boolean z) {
        axfc axfcVar = this.uiLayer;
        axfcVar.i = z;
        axeq.a(new axez(axfcVar, z));
    }

    @Override // defpackage.axgg
    public void setSettingsButtonEnabled(boolean z) {
        axfc axfcVar = this.uiLayer;
        axfcVar.j = z;
        axeq.a(new axez(axfcVar, z, 2));
    }

    @Override // defpackage.axgg
    public void setSettingsButtonListener(axgj axgjVar) {
        this.uiLayer.m = axgjVar != null ? (Runnable) ObjectWrapper.b(axgjVar, Runnable.class) : null;
    }

    @Override // defpackage.axgg
    public void setTransitionViewEnabled(boolean z) {
        axfc axfcVar = this.uiLayer;
        boolean z2 = false;
        if (z && !this.daydreamModeEnabled) {
            z2 = true;
        }
        axfcVar.e(z2);
    }

    @Override // defpackage.axgg
    public void setTransitionViewListener(axgj axgjVar) {
        axfc axfcVar = this.uiLayer;
        Runnable runnable = axgjVar != null ? (Runnable) ObjectWrapper.b(axgjVar, Runnable.class) : null;
        axfcVar.n = runnable;
        axeq.a(new axfa(axfcVar, runnable, 1));
    }

    @Override // defpackage.axgg
    public void setViewerName(String str) {
        axfc axfcVar = this.uiLayer;
        axfcVar.o = str;
        axeq.a(new axew(axfcVar, str));
    }

    public GvrUiLayoutImpl(Context context, Runnable runnable, DaydreamUtilsWrapper daydreamUtilsWrapper) {
        this.delayDimmingUiLayerAfterVisibleRunnable = new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GvrUiLayoutImpl.this.delayDimmingUiLayerAfterVisible();
            }
        };
        this.beginDimmingUiLayerRunnable = new Runnable() { // from class: com.google.vr.ndk.base.GvrUiLayoutImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                GvrUiLayoutImpl.this.beginDimmingUiLayer();
            }
        };
        this.daydreamModeEnabled = false;
        CloseButtonListenerWrapper closeButtonListenerWrapper = new CloseButtonListenerWrapper(context, runnable, daydreamUtilsWrapper);
        this.closeButtonListener = closeButtonListenerWrapper;
        axfc axfcVar = new axfc(context);
        this.uiLayer = axfcVar;
        axfcVar.l = closeButtonListenerWrapper;
        axeq.a(new axfa(axfcVar, closeButtonListenerWrapper));
    }
}
