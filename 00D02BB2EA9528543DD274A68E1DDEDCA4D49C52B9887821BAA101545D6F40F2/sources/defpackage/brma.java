package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brma  reason: default package */
/* loaded from: classes4.dex */
public final class brma {
    public static dhkd a(int i) {
        dhkc bZ = dhkd.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ.b;
        int i2 = dhkdVar.a | 2;
        dhkdVar.a = i2;
        dhkdVar.c = i;
        dhkdVar.a = i2 | 1;
        dhkdVar.b = i;
        return bZ.bK();
    }

    public static dvxt b(@dzsi Point point, @dzsi Resources resources) {
        dvxo bZ = dvxt.e.bZ();
        if (point != null) {
            dvxr bZ2 = dvxs.f.bZ();
            int max = Math.max(point.x, point.y);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dvxs dvxsVar = (dvxs) bZ2.b;
            dvxsVar.a |= 1;
            dvxsVar.b = max;
            if (resources != null) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.place_page_photo_height);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dvxs dvxsVar2 = (dvxs) bZ2.b;
                dvxsVar2.a |= 2;
                dvxsVar2.c = dimensionPixelSize;
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.place_page_photo_padding);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dvxs dvxsVar3 = (dvxs) bZ2.b;
                dvxsVar3.a |= 8;
                dvxsVar3.e = dimensionPixelSize2;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvxt dvxtVar = (dvxt) bZ.b;
            dvxs bK = bZ2.bK();
            bK.getClass();
            dvxtVar.b = bK;
            dvxtVar.a |= 1;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvxt dvxtVar2 = (dvxt) bZ.b;
        dvxtVar2.a |= 2;
        dvxtVar2.c = 3;
        dvxp bZ3 = dvxq.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvxq dvxqVar = (dvxq) bZ3.b;
        dvxqVar.a |= 1;
        dvxqVar.b = true;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvxt dvxtVar3 = (dvxt) bZ.b;
        dvxq bK2 = bZ3.bK();
        bK2.getClass();
        dvxtVar3.d = bK2;
        dvxtVar3.a |= 4;
        return bZ.bK();
    }
}
