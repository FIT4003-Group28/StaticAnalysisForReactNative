package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;
/* compiled from: PG */
/* renamed from: btv  reason: default package */
/* loaded from: classes.dex */
public final class btv {
    public static ImageHeaderParser$ImageType a(List<btn> list, InputStream inputStream, bxl bxlVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new cdz(inputStream, bxlVar);
        }
        inputStream.mark(5242880);
        return b(list, new bto(inputStream));
    }

    public static ImageHeaderParser$ImageType b(List<btn> list, btu btuVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser$ImageType a = btuVar.a(list.get(i));
            if (a != ImageHeaderParser$ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static int c(List<btn> list, InputStream inputStream, bxl bxlVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new cdz(inputStream, bxlVar);
        }
        inputStream.mark(5242880);
        return d(list, new btr(inputStream, bxlVar));
    }

    public static int d(List<btn> list, btt bttVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = bttVar.a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }
}
