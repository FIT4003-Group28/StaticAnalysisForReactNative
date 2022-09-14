package com.facebook.react.i0;

import android.view.View;
import com.facebook.react.i0.n;
import com.facebook.react.uimanager.b;
/* loaded from: classes.dex */
public class m<T extends View, U extends com.facebook.react.uimanager.b<T> & n<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public m(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c2;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        switch (str.hashCode()) {
            case -1151046732:
                if (str.equals("scrollEnabled")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -764307226:
                if (str.equals("keyboardDismissMode")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1097821469:
                if (str.equals("pageMargin")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1233251315:
                if (str.equals("initialPage")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1919780198:
                if (str.equals("peekEnabled")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            n nVar = (n) this.f5863a;
            if (obj != null) {
                i = ((Double) obj).intValue();
            }
            nVar.setInitialPage(t, i);
        } else if (c2 == 1) {
            n nVar2 = (n) this.f5863a;
            if (obj != null) {
                i2 = ((Double) obj).intValue();
            }
            nVar2.setPageMargin(t, i2);
        } else if (c2 == 2) {
            n nVar3 = (n) this.f5863a;
            if (obj != null) {
                z2 = ((Boolean) obj).booleanValue();
            }
            nVar3.setPeekEnabled(t, z2);
        } else if (c2 == 3) {
            ((n) this.f5863a).setKeyboardDismissMode(t, (String) obj);
        } else if (c2 != 4) {
            super.a(t, str, obj);
        } else {
            n nVar4 = (n) this.f5863a;
            if (obj != null) {
                z = ((Boolean) obj).booleanValue();
            }
            nVar4.setScrollEnabled(t, z);
        }
    }
}
