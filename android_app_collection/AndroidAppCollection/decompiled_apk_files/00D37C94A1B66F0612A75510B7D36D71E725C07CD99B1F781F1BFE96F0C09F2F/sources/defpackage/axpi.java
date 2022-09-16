package defpackage;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
/* compiled from: PG */
/* renamed from: axpi  reason: default package */
/* loaded from: classes2.dex */
public final class axpi implements axpj {
    public final BufferedInputStream a;
    public int b;
    public int c;
    public String d;
    public Map e;
    public Map f;
    public String g;
    final /* synthetic */ axpq h;
    public int i;
    public final axph j;
    private final OutputStream k;
    private axpe l;
    private final String m;
    private String n;

    public axpi(axpq axpqVar, axph axphVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.h = axpqVar;
        this.j = axphVar;
        this.a = new BufferedInputStream(inputStream, 8192);
        this.k = outputStream;
        this.m = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().toString();
        }
        this.f = new HashMap();
    }

    public final void a(String str, Map map) {
        if (str == null) {
            this.g = "";
            return;
        }
        this.g = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(61);
            if (indexOf >= 0) {
                map.put(axpq.j(nextToken.substring(0, indexOf)).trim(), axpq.j(nextToken.substring(indexOf + 1)));
            } else {
                map.put(axpq.j(nextToken).trim(), "");
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0264 A[Catch: all -> 0x0396, axpo -> 0x0399, IOException -> 0x03b4, SSLException -> 0x03e0, SocketTimeoutException -> 0x040d, SocketException -> 0x0410, TryCatch #6 {axpo -> 0x0399, blocks: (B:3:0x0009, B:4:0x0015, B:9:0x0024, B:10:0x002a, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:18:0x003a, B:20:0x0040, B:22:0x0044, B:29:0x0053, B:32:0x0058, B:24:0x0049, B:26:0x004d, B:33:0x0063, B:35:0x0069, B:36:0x0076, B:38:0x0081, B:40:0x008c, B:41:0x00a6, B:45:0x00b0, B:47:0x00bb, B:49:0x00c8, B:51:0x00d4, B:53:0x00ea, B:55:0x00f0, B:57:0x0104, B:59:0x010a, B:61:0x0114, B:63:0x011c, B:64:0x0137, B:65:0x013c, B:56:0x00f7, B:52:0x00e6, B:190:0x033d, B:191:0x0346, B:192:0x0347, B:193:0x0350, B:66:0x0141, B:68:0x0145, B:69:0x0155, B:144:0x0260, B:146:0x0264, B:149:0x028d, B:153:0x0298, B:188:0x030f, B:189:0x033c, B:73:0x0177, B:126:0x0232, B:142:0x025c, B:143:0x025f, B:196:0x0353, B:198:0x0365, B:200:0x036f, B:201:0x0372, B:199:0x036a, B:39:0x0089, B:202:0x0373, B:203:0x0382, B:204:0x0383, B:205:0x0392, B:208:0x0395), top: B:243:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x030f A[Catch: all -> 0x0396, axpo -> 0x0399, IOException -> 0x03b4, SSLException -> 0x03e0, SocketTimeoutException -> 0x040d, SocketException -> 0x0410, TRY_ENTER, TryCatch #6 {axpo -> 0x0399, blocks: (B:3:0x0009, B:4:0x0015, B:9:0x0024, B:10:0x002a, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:18:0x003a, B:20:0x0040, B:22:0x0044, B:29:0x0053, B:32:0x0058, B:24:0x0049, B:26:0x004d, B:33:0x0063, B:35:0x0069, B:36:0x0076, B:38:0x0081, B:40:0x008c, B:41:0x00a6, B:45:0x00b0, B:47:0x00bb, B:49:0x00c8, B:51:0x00d4, B:53:0x00ea, B:55:0x00f0, B:57:0x0104, B:59:0x010a, B:61:0x0114, B:63:0x011c, B:64:0x0137, B:65:0x013c, B:56:0x00f7, B:52:0x00e6, B:190:0x033d, B:191:0x0346, B:192:0x0347, B:193:0x0350, B:66:0x0141, B:68:0x0145, B:69:0x0155, B:144:0x0260, B:146:0x0264, B:149:0x028d, B:153:0x0298, B:188:0x030f, B:189:0x033c, B:73:0x0177, B:126:0x0232, B:142:0x025c, B:143:0x025f, B:196:0x0353, B:198:0x0365, B:200:0x036f, B:201:0x0372, B:199:0x036a, B:39:0x0089, B:202:0x0373, B:203:0x0382, B:204:0x0383, B:205:0x0392, B:208:0x0395), top: B:243:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axpi.b():void");
    }

    public final String c(ByteBuffer byteBuffer, int i, int i2) {
        axpg b;
        ByteBuffer duplicate;
        FileOutputStream fileOutputStream;
        if (i2 > 0) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    b = this.j.b();
                    duplicate = byteBuffer.duplicate();
                    fileOutputStream = new FileOutputStream(b.a());
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                FileChannel channel = fileOutputStream.getChannel();
                duplicate.position(i).limit(i + i2);
                channel.write(duplicate.slice());
                String a = b.a();
                axpq.l(fileOutputStream);
                return a;
            } catch (Exception e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                throw new Error(e);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                axpq.l(fileOutputStream2);
                throw th;
            }
        }
        return "";
    }
}
