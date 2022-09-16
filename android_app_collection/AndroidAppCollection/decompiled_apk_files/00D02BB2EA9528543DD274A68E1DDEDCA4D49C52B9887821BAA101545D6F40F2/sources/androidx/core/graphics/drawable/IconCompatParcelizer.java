package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.IconCompat;
import java.nio.charset.Charset;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class IconCompatParcelizer {
    public static IconCompat read(bap bapVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = bapVar.w(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (bapVar.o(2)) {
            bArr = bapVar.k();
        }
        iconCompat.c = bArr;
        iconCompat.d = bapVar.y(iconCompat.d, 3);
        iconCompat.e = bapVar.w(iconCompat.e, 4);
        iconCompat.f = bapVar.w(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) bapVar.y(iconCompat.g, 6);
        iconCompat.j = bapVar.x(iconCompat.j, 7);
        iconCompat.k = bapVar.x(iconCompat.k, 8);
        iconCompat.i = PorterDuff.Mode.valueOf(iconCompat.j);
        switch (iconCompat.a) {
            case -1:
                parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.b = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.d;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.c;
                    iconCompat.b = bArr2;
                    iconCompat.a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr2.length;
                    break;
                }
                iconCompat.b = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                iconCompat.b = new String(iconCompat.c, Charset.forName("UTF-16"));
                if (iconCompat.a == 2 && iconCompat.k == null) {
                    iconCompat.k = ((String) iconCompat.b).split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.b = iconCompat.c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, bap bapVar) {
        iconCompat.j = iconCompat.i.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (i != -1) {
            bapVar.s(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            bapVar.p(2);
            bapVar.c(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            bapVar.u(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            bapVar.s(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            bapVar.s(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            bapVar.u(colorStateList, 6);
        }
        String str = iconCompat.j;
        if (str != null) {
            bapVar.t(str, 7);
        }
        String str2 = iconCompat.k;
        if (str2 != null) {
            bapVar.t(str2, 8);
        }
    }
}
