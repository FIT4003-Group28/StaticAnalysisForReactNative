package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.IconCompat;
import java.nio.charset.Charset;
/* compiled from: PG */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(bpe bpeVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.b = bpeVar.a(iconCompat.b, 1);
        byte[] bArr = iconCompat.d;
        if (bpeVar.s(2)) {
            int readInt = bpeVar.d.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                bArr = new byte[readInt];
                bpeVar.d.readByteArray(bArr);
            }
        }
        iconCompat.d = bArr;
        iconCompat.e = bpeVar.b(iconCompat.e, 3);
        iconCompat.f = bpeVar.a(iconCompat.f, 4);
        iconCompat.g = bpeVar.a(iconCompat.g, 5);
        iconCompat.h = (ColorStateList) bpeVar.b(iconCompat.h, 6);
        iconCompat.j = bpeVar.e(iconCompat.j, 7);
        iconCompat.k = bpeVar.e(iconCompat.k, 8);
        iconCompat.i = PorterDuff.Mode.valueOf(iconCompat.j);
        switch (iconCompat.b) {
            case -1:
                parcelable = iconCompat.e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.c = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.e;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.d;
                    iconCompat.c = bArr2;
                    iconCompat.b = 3;
                    iconCompat.f = 0;
                    iconCompat.g = bArr2.length;
                    break;
                }
                iconCompat.c = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                iconCompat.c = new String(iconCompat.d, Charset.forName("UTF-16"));
                if (iconCompat.b == 2 && iconCompat.k == null) {
                    iconCompat.k = ((String) iconCompat.c).split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.c = iconCompat.d;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, bpe bpeVar) {
        iconCompat.j = iconCompat.i.name();
        switch (iconCompat.b) {
            case -1:
                iconCompat.e = (Parcelable) iconCompat.c;
                break;
            case 1:
            case 5:
                iconCompat.e = (Parcelable) iconCompat.c;
                break;
            case 2:
                iconCompat.d = ((String) iconCompat.c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.d = (byte[]) iconCompat.c;
                break;
            case 4:
            case 6:
                iconCompat.d = iconCompat.c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.b;
        if (i != -1) {
            bpeVar.h(i, 1);
        }
        byte[] bArr = iconCompat.d;
        if (bArr != null) {
            bpeVar.p(2);
            bpeVar.d.writeInt(bArr.length);
            bpeVar.d.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.e;
        if (parcelable != null) {
            bpeVar.i(parcelable, 3);
        }
        int i2 = iconCompat.f;
        if (i2 != 0) {
            bpeVar.h(i2, 4);
        }
        int i3 = iconCompat.g;
        if (i3 != 0) {
            bpeVar.h(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            bpeVar.i(colorStateList, 6);
        }
        String str = iconCompat.j;
        if (str != null) {
            bpeVar.j(str, 7);
        }
        String str2 = iconCompat.k;
        if (str2 != null) {
            bpeVar.j(str2, 8);
        }
    }
}
