package com.google.vr.ndk.base;

import android.content.Context;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.vrcore.logging.api.VREventParcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class SdkDaydreamTouchListener extends AbstractDaydreamTouchListener implements View.OnTouchListener {
    private final GvrApi gvrApi;
    private final GvrLayoutImpl gvrLayout;
    private final boolean isDaydreamImageAlignmentEnabled;
    private final axfg vrParamsProvider;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    class FinishInitializationTask extends AsyncTask {
        public Display display;

        private FinishInitializationTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Display$DisplayParams display$DisplayParams) {
            SdkDaydreamTouchListener.this.init(axds.h(this.display, display$DisplayParams), display$DisplayParams, axds.b(this.display));
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Display$DisplayParams doInBackground(Void... voidArr) {
            return SdkDaydreamTouchListener.this.vrParamsProvider.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class RefreshViewerProfileTask extends AsyncTask {
        private RefreshViewerProfileTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
            SdkDaydreamTouchListener.this.setDeviceParams(cardboardDevice$DeviceParams);
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public CardboardDevice$DeviceParams doInBackground(Void... voidArr) {
            return SdkDaydreamTouchListener.this.vrParamsProvider.b();
        }
    }

    public SdkDaydreamTouchListener(GvrLayoutImpl gvrLayoutImpl) {
        this.gvrLayout = gvrLayoutImpl;
        GvrApi gvrApi = gvrLayoutImpl.getGvrApi();
        this.gvrApi = gvrApi;
        anfp a = anfp.a(gvrApi.getSdkConfigurationParams().daydreamImageAlignment_);
        this.isDaydreamImageAlignmentEnabled = (a == null ? anfp.UNKNOWN_ALIGNMENT : a) != anfp.DISABLED && !gvrApi.getSdkConfigurationParams().touchOverlayEnabled_;
        Context context = gvrLayoutImpl.getContext();
        this.vrParamsProvider = awwd.d(context);
        FinishInitializationTask finishInitializationTask = new FinishInitializationTask();
        finishInitializationTask.display = axds.i(context);
        finishInitializationTask.execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void init(DisplayMetrics displayMetrics, Display$DisplayParams display$DisplayParams, axdr axdrVar) {
        initWithDisplayParams(displayMetrics, display$DisplayParams, axdrVar);
        refreshViewerProfile();
    }

    @Override // com.google.vr.ndk.base.AbstractDaydreamTouchListener
    protected boolean isDaydreamImageAlignmentEnabled() {
        return this.isDaydreamImageAlignmentEnabled;
    }

    @Override // com.google.vr.ndk.base.AbstractDaydreamTouchListener
    protected void logEvent(anfk anfkVar, anfj anfjVar) {
        if (this.gvrLayout.getVrCoreSdkClient() == null || this.gvrLayout.getVrCoreSdkClient().getLoggingService() == null) {
            Log.w("SdkDaydreamTouchListener", "Unable to log alignment event; logging service not available.");
            return;
        }
        try {
            this.gvrLayout.getVrCoreSdkClient().getLoggingService().a(new VREventParcelable(anfk.SDK_PHONE_ALIGNMENT, anfjVar));
        } catch (RemoteException unused) {
            Log.w("SdkDaydreamTouchListener", "Unable to log alignment event");
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return handleTouch(motionEvent, 0.0f, 0.0f);
    }

    public void refreshViewerProfile() {
        new RefreshViewerProfileTask().execute(new Void[0]);
    }

    @Override // com.google.vr.ndk.base.AbstractDaydreamTouchListener
    protected void setLensOffset(float f, float f2, float f3) {
        this.gvrApi.setLensOffset(f, f2, 0.0f);
    }

    public void shutdown() {
        this.vrParamsProvider.f();
    }
}
