package com.facebook.react.i0;

import android.view.View;
import com.facebook.react.i0.l;
import com.facebook.react.uimanager.b;
/* loaded from: classes.dex */
public class k<T extends View, U extends com.facebook.react.uimanager.b<T> & l<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public k(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c2;
        boolean z = true;
        boolean z2 = false;
        switch (str.hashCode()) {
            case -1742453971:
                if (str.equals("thumbColor")) {
                    c2 = 2;
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
            case -287374307:
                if (str.equals("trackTintColor")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 3551:
                if (str.equals("on")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 111972721:
                if (str.equals("value")) {
                    c2 = 5;
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
            case 1084662482:
                if (str.equals("trackColorForFalse")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 2113632767:
                if (str.equals("trackColorForTrue")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        Integer num = null;
        switch (c2) {
            case 0:
                l lVar = (l) this.f5863a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                lVar.setDisabled(t, z2);
                return;
            case 1:
                l lVar2 = (l) this.f5863a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                lVar2.setEnabled(t, z);
                return;
            case 2:
                l lVar3 = (l) this.f5863a;
                if (obj != null) {
                    num = Integer.valueOf(((Double) obj).intValue());
                }
                lVar3.setThumbColor(t, num);
                return;
            case 3:
                l lVar4 = (l) this.f5863a;
                if (obj != null) {
                    num = Integer.valueOf(((Double) obj).intValue());
                }
                lVar4.setTrackColorForFalse(t, num);
                return;
            case 4:
                l lVar5 = (l) this.f5863a;
                if (obj != null) {
                    num = Integer.valueOf(((Double) obj).intValue());
                }
                lVar5.setTrackColorForTrue(t, num);
                return;
            case 5:
                l lVar6 = (l) this.f5863a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                lVar6.setValue(t, z2);
                return;
            case 6:
                l lVar7 = (l) this.f5863a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                lVar7.setOn(t, z2);
                return;
            case 7:
                l lVar8 = (l) this.f5863a;
                if (obj != null) {
                    num = Integer.valueOf(((Double) obj).intValue());
                }
                lVar8.setThumbTintColor(t, num);
                return;
            case '\b':
                l lVar9 = (l) this.f5863a;
                if (obj != null) {
                    num = Integer.valueOf(((Double) obj).intValue());
                }
                lVar9.setTrackTintColor(t, num);
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
