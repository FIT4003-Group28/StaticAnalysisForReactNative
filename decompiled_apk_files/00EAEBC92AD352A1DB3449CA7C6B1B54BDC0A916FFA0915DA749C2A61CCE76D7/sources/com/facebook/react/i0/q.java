package com.facebook.react.i0;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.i0.r;
import com.facebook.react.uimanager.b;
/* loaded from: classes.dex */
public class q<T extends View, U extends com.facebook.react.uimanager.b<T> & r<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public q(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c2;
        boolean z = false;
        boolean z2 = true;
        switch (str.hashCode()) {
            case -1900655011:
                if (str.equals("maximumTrackTintColor")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1736983259:
                if (str.equals("thumbImage")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1609594047:
                if (str.equals("enabled")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1021497397:
                if (str.equals("minimumTrackTintColor")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -981448432:
                if (str.equals("maximumTrackImage")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 3540684:
                if (str.equals("step")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 111972721:
                if (str.equals("value")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 718061361:
                if (str.equals("maximumValue")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1139400400:
                if (str.equals("trackImage")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 1192487427:
                if (str.equals("minimumValue")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1333596542:
                if (str.equals("minimumTrackImage")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        double d2 = 0.0d;
        Integer num = null;
        switch (c2) {
            case 0:
                r rVar = (r) this.f5863a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rVar.setDisabled(t, z);
                return;
            case 1:
                r rVar2 = (r) this.f5863a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rVar2.setEnabled(t, z2);
                return;
            case 2:
                ((r) this.f5863a).setMaximumTrackImage(t, (ReadableMap) obj);
                return;
            case 3:
                r rVar3 = (r) this.f5863a;
                if (obj != null) {
                    num = Integer.valueOf(((Double) obj).intValue());
                }
                rVar3.setMaximumTrackTintColor(t, num);
                return;
            case 4:
                ((r) this.f5863a).setMaximumValue(t, obj == null ? 1.0d : ((Double) obj).doubleValue());
                return;
            case 5:
                ((r) this.f5863a).setMinimumTrackImage(t, (ReadableMap) obj);
                return;
            case 6:
                r rVar4 = (r) this.f5863a;
                if (obj != null) {
                    num = Integer.valueOf(((Double) obj).intValue());
                }
                rVar4.setMinimumTrackTintColor(t, num);
                return;
            case 7:
                r rVar5 = (r) this.f5863a;
                if (obj != null) {
                    d2 = ((Double) obj).doubleValue();
                }
                rVar5.setMinimumValue(t, d2);
                return;
            case '\b':
                r rVar6 = (r) this.f5863a;
                if (obj != null) {
                    d2 = ((Double) obj).doubleValue();
                }
                rVar6.setStep(t, d2);
                return;
            case '\t':
                ((r) this.f5863a).setTestID(t, obj == null ? "" : (String) obj);
                return;
            case '\n':
                ((r) this.f5863a).setThumbImage(t, (ReadableMap) obj);
                return;
            case 11:
                r rVar7 = (r) this.f5863a;
                if (obj != null) {
                    num = Integer.valueOf(((Double) obj).intValue());
                }
                rVar7.setThumbTintColor(t, num);
                return;
            case '\f':
                ((r) this.f5863a).setTrackImage(t, (ReadableMap) obj);
                return;
            case '\r':
                r rVar8 = (r) this.f5863a;
                if (obj != null) {
                    d2 = ((Double) obj).doubleValue();
                }
                rVar8.setValue(t, d2);
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
