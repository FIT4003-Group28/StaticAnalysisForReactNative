package com.google.vr.ndk.base;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.CardboardDevice$ScreenAlignmentMarker;
import com.google.vr.sdk.proto.Display$DisplayParams;
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class AbstractDaydreamTouchListener {
    private float borderSizeMeters;
    private double[] currentMarkerBestDists;
    private DisplayMetrics displayMetrics;
    private boolean lastMotionEventInHeadset;
    private int[] markerBestTouch;
    private float[][] markersInPixels;
    private int mostTouchesSeen;
    private float rotation;
    private int[] touchBestMarker;
    private boolean useRotationalAlignmentCorrection;
    private float xMetersPerPixel;
    private float yMetersPerPixel;
    private final String logTag = getClass().getSimpleName();
    private int angleSamplesReceived = 0;
    private float[] pixelTranslation = new float[2];
    private boolean enabled = true;
    private float[] lastTranslation = new float[2];
    private float[] translation = new float[2];
    private final float[] displayCutoutTranslation = new float[2];

    private void logPhoneAlignment(MotionEvent motionEvent, float f, float f2) {
        int pointerCount = motionEvent.getPointerCount();
        anfj a = anfu.a();
        aopa createBuilder = anfl.a.createBuilder();
        for (int i = 0; i < pointerCount; i++) {
            aopa createBuilder2 = anft.a.createBuilder();
            float x = motionEvent.getX(i);
            createBuilder2.copyOnWrite();
            anft anftVar = (anft) createBuilder2.instance;
            anftVar.b = 1 | anftVar.b;
            anftVar.c = x + 0.0f;
            float y = motionEvent.getY(i);
            createBuilder2.copyOnWrite();
            anft anftVar2 = (anft) createBuilder2.instance;
            anftVar2.b = 2 | anftVar2.b;
            anftVar2.d = y + 0.0f;
            anft anftVar3 = (anft) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            anfl anflVar = (anfl) createBuilder.instance;
            anftVar3.getClass();
            aopu aopuVar = anflVar.c;
            if (!aopuVar.c()) {
                anflVar.c = aopi.mutableCopy(aopuVar);
            }
            anflVar.c.add(anftVar3);
        }
        aopa createBuilder3 = anft.a.createBuilder();
        float f3 = this.pixelTranslation[0];
        createBuilder3.copyOnWrite();
        anft anftVar4 = (anft) createBuilder3.instance;
        anftVar4.b |= 1;
        anftVar4.c = f3;
        float f4 = this.pixelTranslation[1];
        createBuilder3.copyOnWrite();
        anft anftVar5 = (anft) createBuilder3.instance;
        anftVar5.b |= 2;
        anftVar5.d = f4;
        anft anftVar6 = (anft) createBuilder3.mo39build();
        createBuilder.copyOnWrite();
        anfl anflVar2 = (anfl) createBuilder.instance;
        anftVar6.getClass();
        anflVar2.d = anftVar6;
        anflVar2.b |= 1;
        if (pointerCount == 2 && this.markersInPixels.length == 2) {
            double degrees = Math.toDegrees(getRotationRadians(motionEvent));
            createBuilder.copyOnWrite();
            anfl anflVar3 = (anfl) createBuilder.instance;
            anflVar3.b |= 2;
            anflVar3.e = (float) degrees;
            StringBuilder sb = new StringBuilder(58);
            sb.append("Phone angle in headset (degrees): ");
            sb.append(degrees);
            float x2 = motionEvent.getX(0);
            float y2 = motionEvent.getY(0);
            StringBuilder sb2 = new StringBuilder(49);
            sb2.append("  Touch point 1: ");
            sb2.append(x2 + 0.0f);
            sb2.append(", ");
            sb2.append(y2 + 0.0f);
            float x3 = motionEvent.getX(1);
            float y3 = motionEvent.getY(1);
            StringBuilder sb3 = new StringBuilder(49);
            sb3.append("  Touch point 2: ");
            sb3.append(x3 + 0.0f);
            sb3.append(", ");
            sb3.append(y3 + 0.0f);
        }
        a.copyOnWrite();
        ((anfu) a.instance).e((anfl) createBuilder.mo39build());
        logEvent(anfk.SDK_PHONE_ALIGNMENT, a);
    }

    private void resetTrackingState() {
        this.lastMotionEventInHeadset = false;
        float[] fArr = this.pixelTranslation;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        this.rotation = 0.0f;
        this.mostTouchesSeen = 0;
    }

    public void getTranslationInScreenSpace(float[] fArr) {
        if (fArr.length >= 2) {
            DisplayMetrics displayMetrics = this.displayMetrics;
            if (displayMetrics == null) {
                Log.e(this.logTag, "displayMetrics must be set before calling getTranslationInScreenSpace.");
                return;
            }
            fArr[0] = this.pixelTranslation[0] / displayMetrics.widthPixels;
            fArr[1] = this.pixelTranslation[1] / this.displayMetrics.heightPixels;
            float f = fArr[0];
            fArr[0] = f + f;
            fArr[1] = fArr[1] * (-2.0f);
            return;
        }
        throw new IllegalArgumentException("Translation array too small");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean handleTouch(MotionEvent motionEvent, float f, float f2) {
        if (!processMotionEvent(motionEvent, 0.0f, 0.0f)) {
            return false;
        }
        getTranslationInScreenSpace(this.translation);
        float[] fArr = this.translation;
        float f3 = fArr[0];
        float[] fArr2 = this.lastTranslation;
        if (f3 != fArr2[0] || fArr[1] != fArr2[1]) {
            fArr2[0] = f3;
            fArr2[1] = fArr[1];
            setLensOffset(fArr[0], fArr[1], this.rotation);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void initWithDisplayParams(DisplayMetrics displayMetrics, Display$DisplayParams display$DisplayParams, axdr axdrVar) {
        this.displayMetrics = displayMetrics;
        this.borderSizeMeters = axds.e(display$DisplayParams);
        this.xMetersPerPixel = axds.f(this.displayMetrics.xdpi);
        this.yMetersPerPixel = axds.f(this.displayMetrics.ydpi);
        if (axdrVar != null) {
            int b = axdrVar.b();
            int i = displayMetrics.widthPixels;
            int c = axdrVar.c();
            int d = axdrVar.d();
            int i2 = displayMetrics.heightPixels;
            int a = axdrVar.a();
            this.displayCutoutTranslation[0] = (((i - c) + b) / 2) - (displayMetrics.widthPixels / 2);
            this.displayCutoutTranslation[1] = (((i2 - a) + d) / 2) - (displayMetrics.heightPixels / 2);
        } else {
            float[] fArr = this.displayCutoutTranslation;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
        resetTrackingState();
    }

    protected abstract boolean isDaydreamImageAlignmentEnabled();

    protected abstract void logEvent(anfk anfkVar, anfj anfjVar);

    public boolean processMotionEvent(MotionEvent motionEvent, float f, float f2) {
        if (!viewerNeedsTouchProcessing()) {
            this.lastMotionEventInHeadset = false;
            return false;
        } else if (!isDaydreamImageAlignmentEnabled()) {
            return true;
        } else {
            int pointerCount = motionEvent.getPointerCount();
            if (pointerCount > this.mostTouchesSeen) {
                this.touchBestMarker = new int[pointerCount];
                this.mostTouchesSeen = pointerCount;
            }
            for (int i = 0; i < this.markersInPixels.length; i++) {
                this.markerBestTouch[i] = -1;
                this.currentMarkerBestDists[i] = 2.25E-4d;
            }
            for (int i2 = 0; i2 < pointerCount; i2++) {
                this.touchBestMarker[i2] = -1;
                double d = 2.25E-4d;
                int i3 = 0;
                while (true) {
                    float[][] fArr = this.markersInPixels;
                    if (i3 < fArr.length) {
                        float x = (fArr[i3][0] - (motionEvent.getX(i2) + 0.0f)) * this.xMetersPerPixel;
                        float y = (this.markersInPixels[i3][1] - (motionEvent.getY(i2) + 0.0f)) * this.yMetersPerPixel;
                        double d2 = (x * x) + (y * y);
                        if (d2 < d) {
                            this.touchBestMarker[i2] = i3;
                            d = d2;
                        }
                        double[] dArr = this.currentMarkerBestDists;
                        if (d2 < dArr[i3]) {
                            dArr[i3] = d2;
                            this.markerBestTouch[i3] = i2;
                        }
                        i3++;
                    }
                }
            }
            int i4 = 0;
            int i5 = 0;
            float f3 = 0.0f;
            float f4 = 0.0f;
            while (true) {
                int[] iArr = this.markerBestTouch;
                if (i4 >= iArr.length) {
                    break;
                }
                int i6 = iArr[i4];
                if (i6 != -1) {
                    if (this.touchBestMarker[i6] != i4) {
                        iArr[i4] = -1;
                    } else {
                        i5++;
                        f3 += (motionEvent.getX(i6) + 0.0f) - this.markersInPixels[i4][0];
                        f4 += (motionEvent.getY(this.markerBestTouch[i4]) + 0.0f) - this.markersInPixels[i4][1];
                    }
                }
                i4++;
            }
            if (i5 > 0) {
                this.lastMotionEventInHeadset = true;
                float[] fArr2 = this.pixelTranslation;
                float f5 = i5;
                fArr2[0] = f3 / f5;
                fArr2[1] = f4 / f5;
                float f6 = fArr2[0];
                float[] fArr3 = this.displayCutoutTranslation;
                fArr2[0] = f6 + fArr3[0];
                fArr2[1] = fArr2[1] + fArr3[1];
            } else {
                this.lastMotionEventInHeadset = false;
                float[] fArr4 = this.pixelTranslation;
                fArr4[0] = 0.0f;
                fArr4[1] = 0.0f;
            }
            if (i5 == 2 && this.useRotationalAlignmentCorrection) {
                this.rotation = getRotationRadians(motionEvent);
            } else {
                this.rotation = 0.0f;
            }
            if (pointerCount > 0) {
                int i7 = this.angleSamplesReceived + 1;
                this.angleSamplesReceived = i7;
                if (i7 == 200) {
                    logPhoneAlignment(motionEvent, 0.0f, 0.0f);
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setDeviceParams(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        if (cardboardDevice$DeviceParams == null || cardboardDevice$DeviceParams.getDaydreamInternal().getAlignmentMarkersCount() == 0) {
            Log.e(this.logTag, "Null deviceParams or no alignment markers found.");
            this.markersInPixels = null;
        } else if (this.displayMetrics == null) {
            Log.e(this.logTag, "displayMetrics must be set before calling setDeviceParams.");
        } else {
            CardboardDevice$ScreenAlignmentMarker[] cardboardDevice$ScreenAlignmentMarkerArr = (CardboardDevice$ScreenAlignmentMarker[]) cardboardDevice$DeviceParams.getDaydreamInternal().getAlignmentMarkersList().toArray(new CardboardDevice$ScreenAlignmentMarker[0]);
            int length = cardboardDevice$ScreenAlignmentMarkerArr.length;
            this.markersInPixels = new float[length];
            this.currentMarkerBestDists = new double[length];
            this.markerBestTouch = new int[length];
            for (int i = 0; i < cardboardDevice$ScreenAlignmentMarkerArr.length; i++) {
                CardboardDevice$ScreenAlignmentMarker cardboardDevice$ScreenAlignmentMarker = cardboardDevice$ScreenAlignmentMarkerArr[i];
                float[] fArr = new float[2];
                this.markersInPixels[i] = fArr;
                fArr[0] = (this.displayMetrics.widthPixels / 2) + (cardboardDevice$ScreenAlignmentMarker.getHorizontal() / this.xMetersPerPixel);
                this.markersInPixels[i][1] = this.displayMetrics.heightPixels - (((cardboardDevice$ScreenAlignmentMarker.getVertical() + cardboardDevice$DeviceParams.getTrayToLensDistance()) - this.borderSizeMeters) / this.yMetersPerPixel);
            }
            this.useRotationalAlignmentCorrection = cardboardDevice$DeviceParams.getDaydreamInternal().getUseRotationalAlignmentCorrection();
        }
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
        if (!z) {
            resetTrackingState();
        }
    }

    protected abstract void setLensOffset(float f, float f2, float f3);

    public boolean viewerNeedsTouchProcessing() {
        float[][] fArr;
        return this.enabled && (fArr = this.markersInPixels) != null && fArr.length > 0;
    }

    public float getRotationRadians(MotionEvent motionEvent) {
        float[] fArr;
        float[][] fArr2 = this.markersInPixels;
        if (fArr2 == null || fArr2.length != 2) {
            Log.e(this.logTag, "No touch markers or the wrong number of touch markers.");
            return 0.0f;
        }
        double atan2 = Math.atan2(motionEvent.getY(0) - motionEvent.getY(1), motionEvent.getX(0) - motionEvent.getX(1));
        float[][] fArr3 = this.markersInPixels;
        float f = fArr3[0][0];
        float[] fArr4 = fArr3[1];
        float atan22 = (float) (atan2 - Math.atan2(fArr[1] - fArr4[1], f - fArr4[0]));
        if (atan22 > 1.5707963267948966d) {
            atan22 -= 3.1415927f;
        }
        return ((double) atan22) < -1.5707963267948966d ? atan22 + 3.1415927f : atan22;
    }
}
