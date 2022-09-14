package com.facebook.react.i0;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.i0.p;
import com.facebook.react.uimanager.b;
/* loaded from: classes.dex */
public class o<T extends View, U extends com.facebook.react.uimanager.b<T> & p<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public o(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c2;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        switch (str.hashCode()) {
            case -1851617609:
                if (str.equals("presentationStyle")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1850124175:
                if (str.equals("supportedOrientations")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1726194350:
                if (str.equals("transparent")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1618432855:
                if (str.equals("identifier")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -795203165:
                if (str.equals("animated")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1195991583:
                if (str.equals("hardwareAccelerated")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 2031205598:
                if (str.equals("animationType")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                ((p) this.f5863a).setAnimationType(t, (String) obj);
                return;
            case 1:
                ((p) this.f5863a).setPresentationStyle(t, (String) obj);
                return;
            case 2:
                p pVar = (p) this.f5863a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                pVar.setTransparent(t, z);
                return;
            case 3:
                p pVar2 = (p) this.f5863a;
                if (obj != null) {
                    z4 = ((Boolean) obj).booleanValue();
                }
                pVar2.setStatusBarTranslucent(t, z4);
                return;
            case 4:
                p pVar3 = (p) this.f5863a;
                if (obj != null) {
                    z3 = ((Boolean) obj).booleanValue();
                }
                pVar3.setHardwareAccelerated(t, z3);
                return;
            case 5:
                p pVar4 = (p) this.f5863a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                pVar4.setAnimated(t, z2);
                return;
            case 6:
                ((p) this.f5863a).setSupportedOrientations(t, (ReadableArray) obj);
                return;
            case 7:
                p pVar5 = (p) this.f5863a;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                pVar5.setIdentifier(t, i);
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
