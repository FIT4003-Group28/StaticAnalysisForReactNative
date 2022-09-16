package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
/* compiled from: PG */
/* renamed from: ajhm  reason: default package */
/* loaded from: classes.dex */
public final class ajhm {
    public static final aoos a;
    private static final Field b = c();

    static {
        aoos c = aoos.c();
        c.e(awmx.b);
        a = c;
    }

    public static byte[] a(aqtb aqtbVar) {
        InputStream m = ((aoob) aqtbVar.qm(awlk.a)).m();
        Field field = b;
        byte[] bArr = null;
        if (field != null && (m instanceof ByteArrayInputStream)) {
            try {
                bArr = (byte[]) field.get(m);
            } catch (IllegalAccessException unused) {
            }
        }
        return bArr != null ? bArr : ((aoob) aqtbVar.qm(awlk.a)).I();
    }

    public static void b(aopc aopcVar, awnn awnnVar) {
        byte[] byteArray = awnnVar.toByteArray();
        try {
            byte[] bArr = new byte[aool.ac(172660663) + aool.H(byteArray)];
            aool ak = aool.ak(bArr);
            int length = byteArray.length;
            ((aooj) ak).B(172660663, 2);
            ((aooj) ak).G(byteArray, length);
            aopc aopcVar2 = (aopc) aopcVar.mo38mergeFrom(bArr, aoos.b());
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to compose Element extension", e);
        }
    }

    private static Field c() {
        try {
            Field declaredField = ByteArrayInputStream.class.getDeclaredField("buf");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}
