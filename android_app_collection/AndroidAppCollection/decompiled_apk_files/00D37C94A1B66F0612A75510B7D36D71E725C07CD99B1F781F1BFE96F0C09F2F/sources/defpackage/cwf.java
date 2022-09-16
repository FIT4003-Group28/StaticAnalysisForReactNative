package defpackage;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cwf  reason: default package */
/* loaded from: classes3.dex */
public final class cwf extends axix {
    public String a;
    public String b;
    private long c;
    private long d;
    private long e;
    private boolean f;
    private long g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        Collections.unmodifiableMap(hashMap);
    }

    public cwf() {
        super("hdlr");
        this.b = null;
        this.f = true;
    }

    @Override // defpackage.axiv
    protected final long h() {
        int i;
        if (this.f) {
            i = hx.i(this.b) + 25;
        } else {
            i = hx.i(this.b) + 24;
        }
        return i;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.g = hy.I(byteBuffer);
        this.a = hy.K(byteBuffer);
        this.c = hy.I(byteBuffer);
        this.d = hy.I(byteBuffer);
        this.e = hy.I(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.f = false;
            return;
        }
        String M = hy.M(byteBuffer, byteBuffer.remaining());
        this.b = M;
        if (!M.endsWith("\u0000")) {
            this.f = false;
            return;
        }
        String str = this.b;
        this.b = str.substring(0, str.length() - 1);
        this.f = true;
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hy.y(byteBuffer, this.g);
        byteBuffer.put(cvq.b(this.a));
        hy.y(byteBuffer, this.c);
        hy.y(byteBuffer, this.d);
        hy.y(byteBuffer, this.e);
        String str = this.b;
        if (str != null) {
            byteBuffer.put(hx.k(str));
        }
        if (this.f) {
            byteBuffer.put((byte) 0);
        }
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length());
        sb.append("HandlerBox[handlerType=");
        sb.append(str);
        sb.append(";name=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
