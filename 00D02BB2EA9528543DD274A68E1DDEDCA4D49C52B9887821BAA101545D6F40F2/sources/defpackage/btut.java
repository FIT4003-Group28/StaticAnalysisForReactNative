package defpackage;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;
/* compiled from: PG */
/* renamed from: btut  reason: default package */
/* loaded from: classes.dex */
public final class btut {
    public static final /* synthetic */ int a = 0;
    private static final dsqa b = dsqa.c();

    @dzsi
    public static <S extends dssj> S a(ByteBuffer byteBuffer, dssr<S> dssrVar) {
        byte[] bArr;
        dsqa dsqaVar = b;
        int i = byteBuffer.getInt();
        if (i < 0) {
            int abs = Math.abs(i);
            byte[] bArr2 = new byte[abs];
            byteBuffer.get(bArr2);
            bArr = deea.a(bArr2, 0, abs);
        } else {
            byte[] bArr3 = new byte[i];
            byteBuffer.get(bArr3);
            bArr = bArr3;
        }
        return dssrVar.i(bArr, dsqaVar);
    }

    public static int b(ByteBuffer byteBuffer, btuj btujVar) {
        btujVar.a(byteBuffer.position());
        int c = c(byteBuffer);
        long position = byteBuffer.position() - btujVar.d;
        btujVar.f = position;
        btujVar.a.a += position;
        btujVar.c.e();
        return c;
    }

    public static int c(ByteBuffer byteBuffer) {
        return (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8);
    }

    public static String d(List<ahnc> list) {
        String str = "";
        for (ahnc ahncVar : list) {
            String encodeToString = Base64.encodeToString(ahncVar.a().bS(), 11);
            if (!str.isEmpty()) {
                str = String.valueOf(str).concat(" ");
            }
            String valueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(encodeToString).length());
            sb.append(valueOf);
            sb.append("w ");
            sb.append(encodeToString);
            str = sb.toString();
        }
        return str;
    }

    public static void e(DataOutputStream dataOutputStream, btus btusVar, btuj btujVar) {
        btujVar.a(dataOutputStream.size());
        dataOutputStream.writeShort(24);
        dataOutputStream.writeLong(-1L);
        dataOutputStream.writeUTF(bvom.a(Locale.getDefault()));
        dataOutputStream.writeUTF(btusVar.a);
        dataOutputStream.writeUTF(btusVar.b);
        dataOutputStream.writeUTF(btusVar.c.a());
        int size = dataOutputStream.size() - ((int) btujVar.d);
        btujVar.e = size;
        btujVar.a.b += size;
        btujVar.c.e();
        btujVar.b.g(btujVar.e);
    }

    public static void f(dssj dssjVar, dunt duntVar, DataOutputStream dataOutputStream, btuj btujVar) {
        btujVar.a(dataOutputStream.size());
        String valueOf = String.valueOf(duntVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("writeRequest ");
        sb.append(valueOf);
        sb.toString();
        dataOutputStream.writeShort(duntVar.hp);
        byte[] bS = dssjVar.bS();
        int length = bS.length;
        if (length > 250) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bS);
                gZIPOutputStream.close();
                if (byteArrayOutputStream.size() < length) {
                    dataOutputStream.writeInt(-byteArrayOutputStream.size());
                    byteArrayOutputStream.writeTo(dataOutputStream);
                    bttr bttrVar = bttr.MESSAGELITE_COMPRESSED;
                    String valueOf2 = String.valueOf(duntVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 13);
                    sb2.append("writeRequest ");
                    sb2.append(valueOf2);
                    sb2.toString();
                    btujVar.b(dataOutputStream.size(), bttrVar.f);
                }
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
                throw th;
            }
        }
        dataOutputStream.writeInt(length);
        dataOutputStream.write(bS);
        bttr bttrVar2 = bttr.MESSAGELITE_COMPRESSED;
        String valueOf22 = String.valueOf(duntVar);
        StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 13);
        sb22.append("writeRequest ");
        sb22.append(valueOf22);
        sb22.toString();
        btujVar.b(dataOutputStream.size(), bttrVar2.f);
    }
}
