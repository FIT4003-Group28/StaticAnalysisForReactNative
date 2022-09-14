package com.facebook.react.i0;

import android.view.View;
import com.facebook.react.i0.h;
import com.facebook.react.uimanager.b;
/* loaded from: classes.dex */
public class g<T extends View, U extends com.facebook.react.uimanager.b<T> & h<T>> extends com.facebook.react.uimanager.a<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public g(com.facebook.react.uimanager.b bVar) {
        super(bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c2;
        boolean z = false;
        boolean z2 = true;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals("progress")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -877170387:
                if (str.equals("testID")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -676876213:
                if (str.equals("typeAttr")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 94842723:
                if (str.equals("color")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 633138363:
                if (str.equals("indeterminate")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1118509918:
                if (str.equals("animating")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1804741442:
                if (str.equals("styleAttr")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        String str2 = null;
        Integer num = null;
        String str3 = null;
        switch (c2) {
            case 0:
                h hVar = (h) this.f5863a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                hVar.setStyleAttr(t, str2);
                return;
            case 1:
                h hVar2 = (h) this.f5863a;
                if (obj != null) {
                    str3 = (String) obj;
                }
                hVar2.setTypeAttr(t, str3);
                return;
            case 2:
                h hVar3 = (h) this.f5863a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                hVar3.setIndeterminate(t, z);
                return;
            case 3:
                ((h) this.f5863a).setProgress(t, obj == null ? 0.0d : ((Double) obj).doubleValue());
                return;
            case 4:
                h hVar4 = (h) this.f5863a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                hVar4.setAnimating(t, z2);
                return;
            case 5:
                h hVar5 = (h) this.f5863a;
                if (obj != null) {
                    num = Integer.valueOf(((Double) obj).intValue());
                }
                hVar5.setColor(t, num);
                return;
            case 6:
                ((h) this.f5863a).setTestID(t, obj == null ? "" : (String) obj);
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
