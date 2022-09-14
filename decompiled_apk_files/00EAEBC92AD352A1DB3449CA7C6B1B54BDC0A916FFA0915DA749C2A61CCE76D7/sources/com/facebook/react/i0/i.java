package com.facebook.react.i0;

import android.view.View;
import com.BV.LinearGradient.LinearGradientManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.i0.j;
import com.facebook.react.uimanager.b;
/* loaded from: classes.dex */
public class i<T extends View, U extends com.facebook.react.uimanager.b<T> & j<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public i(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c2;
        boolean z = false;
        boolean z2 = true;
        int i = 1;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1354842768:
                if (str.equals(LinearGradientManager.PROP_COLORS)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -885150488:
                if (str.equals("progressBackgroundColor")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -416037467:
                if (str.equals("progressViewOffset")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -321826009:
                if (str.equals("refreshing")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3530753:
                if (str.equals("size")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            j jVar = (j) this.f5863a;
            if (obj != null) {
                z2 = ((Boolean) obj).booleanValue();
            }
            jVar.setEnabled(t, z2);
        } else if (c2 == 1) {
            ((j) this.f5863a).setColors(t, (ReadableArray) obj);
        } else if (c2 == 2) {
            ((j) this.f5863a).setProgressBackgroundColor(t, obj == null ? null : Integer.valueOf(((Double) obj).intValue()));
        } else if (c2 == 3) {
            j jVar2 = (j) this.f5863a;
            if (obj != null) {
                i = ((Double) obj).intValue();
            }
            jVar2.setSize(t, i);
        } else if (c2 == 4) {
            ((j) this.f5863a).setProgressViewOffset(t, obj == null ? 0.0f : ((Double) obj).floatValue());
        } else if (c2 != 5) {
            super.a(t, str, obj);
        } else {
            j jVar3 = (j) this.f5863a;
            if (obj != null) {
                z = ((Boolean) obj).booleanValue();
            }
            jVar3.setRefreshing(t, z);
        }
    }
}
