package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1566a = aVar.a(iconCompat.f1566a, 1);
        iconCompat.f1568c = aVar.a(iconCompat.f1568c, 2);
        iconCompat.f1569d = aVar.a((androidx.versionedparcelable.a) iconCompat.f1569d, 3);
        iconCompat.f1570e = aVar.a(iconCompat.f1570e, 4);
        iconCompat.f1571f = aVar.a(iconCompat.f1571f, 5);
        iconCompat.f1572g = (ColorStateList) aVar.a((androidx.versionedparcelable.a) iconCompat.f1572g, 6);
        iconCompat.i = aVar.a(iconCompat.i, 7);
        iconCompat.j = aVar.a(iconCompat.j, 8);
        iconCompat.e();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.a(true, true);
        iconCompat.a(aVar.c());
        int i = iconCompat.f1566a;
        if (-1 != i) {
            aVar.b(i, 1);
        }
        byte[] bArr = iconCompat.f1568c;
        if (bArr != null) {
            aVar.b(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1569d;
        if (parcelable != null) {
            aVar.b(parcelable, 3);
        }
        int i2 = iconCompat.f1570e;
        if (i2 != 0) {
            aVar.b(i2, 4);
        }
        int i3 = iconCompat.f1571f;
        if (i3 != 0) {
            aVar.b(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f1572g;
        if (colorStateList != null) {
            aVar.b(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.b(str, 7);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.b(str2, 8);
        }
    }
}
