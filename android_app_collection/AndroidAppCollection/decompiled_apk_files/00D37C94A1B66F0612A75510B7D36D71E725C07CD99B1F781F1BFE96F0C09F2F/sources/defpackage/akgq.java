package defpackage;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akgq  reason: default package */
/* loaded from: classes.dex */
public final class akgq implements akhh {
    public acvg a;
    private final Map b;
    private byte[] c;
    private String d;
    private final String e;
    private akvm f;

    public akgq() {
        this.d = null;
        this.b = new HashMap();
        this.e = null;
    }

    public akgq(byte[] bArr, Map map, String str) {
        this.c = bArr;
        this.b = map;
        this.e = str;
    }

    @Override // defpackage.akgm
    public final void a(akvm akvmVar) {
        this.f = akvmVar;
    }

    @Override // defpackage.akhh
    public final int b() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x012c A[Catch: IndexOutOfBoundsException -> 0x01b2, JSONException -> 0x01dc, TryCatch #4 {IndexOutOfBoundsException -> 0x01b2, JSONException -> 0x01dc, blocks: (B:18:0x0058, B:20:0x0073, B:22:0x007d, B:26:0x0086, B:28:0x008c, B:29:0x0094, B:31:0x009a, B:36:0x00c0, B:37:0x00c6, B:39:0x00cc, B:41:0x00da, B:43:0x00e5, B:45:0x00f8, B:59:0x0126, B:61:0x012c, B:63:0x0132, B:65:0x0145, B:67:0x014d, B:69:0x0153, B:71:0x015d, B:73:0x0164, B:75:0x016a, B:77:0x0170, B:78:0x0179, B:80:0x017f, B:83:0x018f, B:50:0x0105, B:52:0x010b, B:53:0x0112, B:55:0x0118, B:42:0x00e1, B:85:0x01a7, B:86:0x01aa, B:34:0x00b1), top: B:106:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014d A[Catch: IndexOutOfBoundsException -> 0x01b2, JSONException -> 0x01dc, TryCatch #4 {IndexOutOfBoundsException -> 0x01b2, JSONException -> 0x01dc, blocks: (B:18:0x0058, B:20:0x0073, B:22:0x007d, B:26:0x0086, B:28:0x008c, B:29:0x0094, B:31:0x009a, B:36:0x00c0, B:37:0x00c6, B:39:0x00cc, B:41:0x00da, B:43:0x00e5, B:45:0x00f8, B:59:0x0126, B:61:0x012c, B:63:0x0132, B:65:0x0145, B:67:0x014d, B:69:0x0153, B:71:0x015d, B:73:0x0164, B:75:0x016a, B:77:0x0170, B:78:0x0179, B:80:0x017f, B:83:0x018f, B:50:0x0105, B:52:0x010b, B:53:0x0112, B:55:0x0118, B:42:0x00e1, B:85:0x01a7, B:86:0x01aa, B:34:0x00b1), top: B:106:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164 A[Catch: IndexOutOfBoundsException -> 0x01b2, JSONException -> 0x01dc, TryCatch #4 {IndexOutOfBoundsException -> 0x01b2, JSONException -> 0x01dc, blocks: (B:18:0x0058, B:20:0x0073, B:22:0x007d, B:26:0x0086, B:28:0x008c, B:29:0x0094, B:31:0x009a, B:36:0x00c0, B:37:0x00c6, B:39:0x00cc, B:41:0x00da, B:43:0x00e5, B:45:0x00f8, B:59:0x0126, B:61:0x012c, B:63:0x0132, B:65:0x0145, B:67:0x014d, B:69:0x0153, B:71:0x015d, B:73:0x0164, B:75:0x016a, B:77:0x0170, B:78:0x0179, B:80:0x017f, B:83:0x018f, B:50:0x0105, B:52:0x010b, B:53:0x0112, B:55:0x0118, B:42:0x00e1, B:85:0x01a7, B:86:0x01aa, B:34:0x00b1), top: B:106:0x0058 }] */
    @Override // defpackage.akhh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.akhe d() {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgq.d():akhe");
    }

    @Override // defpackage.akhh
    public final String e() {
        return this.e;
    }

    @Override // defpackage.akhh
    public final byte[] f() {
        byte[] bArr = this.c;
        if (bArr != null) {
            return bArr;
        }
        String str = this.d;
        if (str == null) {
            return null;
        }
        return str.getBytes(Charset.forName("UTF-8"));
    }

    @Override // defpackage.akgr
    public final void j(acvg acvgVar) {
        this.a = acvgVar;
    }

    @Override // defpackage.akgr
    public final acvg oj() {
        return this.a;
    }

    public akgq(byte[] bArr, String str) {
        this.c = bArr;
        this.b = new HashMap();
        this.e = str;
    }
}
