package com.facebook.react.i0;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.i0.f;
import com.facebook.react.uimanager.b;
/* loaded from: classes.dex */
public class e<T extends View, U extends com.facebook.react.uimanager.b<T> & f<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public e(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c2;
        int i = 0;
        boolean z = true;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -979805852:
                if (str.equals("prompt")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 94842723:
                if (str.equals("color")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 100526016:
                if (str.equals("items")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1191572123:
                if (str.equals("selected")) {
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
            ((f) this.f5863a).setColor(t, obj == null ? null : Integer.valueOf(((Double) obj).intValue()));
        } else if (c2 == 1) {
            f fVar = (f) this.f5863a;
            if (obj != null) {
                z = ((Boolean) obj).booleanValue();
            }
            fVar.setEnabled(t, z);
        } else if (c2 == 2) {
            ((f) this.f5863a).setItems(t, (ReadableArray) obj);
        } else if (c2 == 3) {
            ((f) this.f5863a).setPrompt(t, obj == null ? "" : (String) obj);
        } else if (c2 != 4) {
            super.a(t, str, obj);
        } else {
            f fVar2 = (f) this.f5863a;
            if (obj != null) {
                i = ((Double) obj).intValue();
            }
            fVar2.setSelected(t, i);
        }
    }
}
