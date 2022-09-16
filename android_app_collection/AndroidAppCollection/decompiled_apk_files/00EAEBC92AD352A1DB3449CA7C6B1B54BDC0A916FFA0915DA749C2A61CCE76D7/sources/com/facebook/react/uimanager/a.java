package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.b;
/* loaded from: classes.dex */
public abstract class a<T extends View, U extends b<T>> implements y0<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final U f5863a;

    public a(U u) {
        this.f5863a = u;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c2;
        int i = 0;
        boolean z = false;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals("translateX")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case -731417480:
                if (str.equals("zIndex")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case -101663499:
                if (str.equals("accessibilityHint")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -101359900:
                if (str.equals("accessibilityRole")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -80891667:
                if (str.equals("renderToHardwareTextureAndroid")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 36255470:
                if (str.equals("accessibilityLiveRegion")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 746986311:
                if (str.equals("importantForAccessibility")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 1052666732:
                if (str.equals("transform")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 1146842694:
                if (str.equals("accessibilityLabel")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1153872867:
                if (str.equals("accessibilityState")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1505602511:
                if (str.equals("accessibilityActions")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 2045685618:
                if (str.equals("nativeID")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        float f2 = 1.0f;
        float f3 = 0.0f;
        float f4 = Float.NaN;
        switch (c2) {
            case 0:
                this.f5863a.setAccessibilityActions(t, (ReadableArray) obj);
                return;
            case 1:
                this.f5863a.setAccessibilityHint(t, (String) obj);
                return;
            case 2:
                this.f5863a.setAccessibilityLabel(t, (String) obj);
                return;
            case 3:
                this.f5863a.setAccessibilityLiveRegion(t, (String) obj);
                return;
            case 4:
                this.f5863a.setAccessibilityRole(t, (String) obj);
                return;
            case 5:
                this.f5863a.setViewState(t, (ReadableMap) obj);
                return;
            case 6:
                U u = this.f5863a;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                u.setBackgroundColor(t, i);
                return;
            case 7:
                U u2 = this.f5863a;
                if (obj != null) {
                    f4 = ((Double) obj).floatValue();
                }
                u2.setBorderRadius(t, f4);
                return;
            case '\b':
                U u3 = this.f5863a;
                if (obj != null) {
                    f4 = ((Double) obj).floatValue();
                }
                u3.setBorderBottomLeftRadius(t, f4);
                return;
            case '\t':
                U u4 = this.f5863a;
                if (obj != null) {
                    f4 = ((Double) obj).floatValue();
                }
                u4.setBorderBottomRightRadius(t, f4);
                return;
            case '\n':
                U u5 = this.f5863a;
                if (obj != null) {
                    f4 = ((Double) obj).floatValue();
                }
                u5.setBorderTopLeftRadius(t, f4);
                return;
            case 11:
                U u6 = this.f5863a;
                if (obj != null) {
                    f4 = ((Double) obj).floatValue();
                }
                u6.setBorderTopRightRadius(t, f4);
                return;
            case '\f':
                U u7 = this.f5863a;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u7.setElevation(t, f3);
                return;
            case '\r':
                this.f5863a.setImportantForAccessibility(t, (String) obj);
                return;
            case 14:
                this.f5863a.setNativeId(t, (String) obj);
                return;
            case 15:
                U u8 = this.f5863a;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u8.setOpacity(t, f2);
                return;
            case 16:
                U u9 = this.f5863a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                u9.setRenderToHardwareTexture(t, z);
                return;
            case 17:
                U u10 = this.f5863a;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u10.setRotation(t, f3);
                return;
            case 18:
                U u11 = this.f5863a;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u11.setScaleX(t, f2);
                return;
            case 19:
                U u12 = this.f5863a;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u12.setScaleY(t, f2);
                return;
            case 20:
                this.f5863a.setTestId(t, (String) obj);
                return;
            case 21:
                this.f5863a.setTransform(t, (ReadableArray) obj);
                return;
            case 22:
                U u13 = this.f5863a;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u13.setTranslateX(t, f3);
                return;
            case 23:
                U u14 = this.f5863a;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u14.setTranslateY(t, f3);
                return;
            case 24:
                U u15 = this.f5863a;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u15.setZIndex(t, f3);
                return;
            default:
                return;
        }
    }
}
