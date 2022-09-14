package com.facebook.react.i0;

import android.view.View;
import com.facebook.react.i0.d;
import com.facebook.react.uimanager.b;
/* loaded from: classes.dex */
public class c<T extends View, U extends com.facebook.react.uimanager.b<T> & d<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public c(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c2;
        switch (str.hashCode()) {
            case -2082382380:
                if (str.equals("statusBarBackgroundColor")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1233873500:
                if (str.equals("drawerBackgroundColor")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -764307226:
                if (str.equals("keyboardDismissMode")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 268251989:
                if (str.equals("drawerWidth")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 695891258:
                if (str.equals("drawerPosition")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1857208703:
                if (str.equals("drawerLockMode")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            ((d) this.f5863a).setKeyboardDismissMode(t, (String) obj);
            return;
        }
        Integer num = null;
        Integer num2 = null;
        Float f2 = null;
        if (c2 == 1) {
            d dVar = (d) this.f5863a;
            if (obj != null) {
                num = Integer.valueOf(((Double) obj).intValue());
            }
            dVar.setDrawerBackgroundColor(t, num);
        } else if (c2 == 2) {
            ((d) this.f5863a).setDrawerPosition(t, (String) obj);
        } else if (c2 == 3) {
            d dVar2 = (d) this.f5863a;
            if (obj != null) {
                f2 = Float.valueOf(((Double) obj).floatValue());
            }
            dVar2.setDrawerWidth(t, f2);
        } else if (c2 == 4) {
            ((d) this.f5863a).setDrawerLockMode(t, (String) obj);
        } else if (c2 != 5) {
            super.a(t, str, obj);
        } else {
            d dVar3 = (d) this.f5863a;
            if (obj != null) {
                num2 = Integer.valueOf(((Double) obj).intValue());
            }
            dVar3.setStatusBarBackgroundColor(t, num2);
        }
    }
}
