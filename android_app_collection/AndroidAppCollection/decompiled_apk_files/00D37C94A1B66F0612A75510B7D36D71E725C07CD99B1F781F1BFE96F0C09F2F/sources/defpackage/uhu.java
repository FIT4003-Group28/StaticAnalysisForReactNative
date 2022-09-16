package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
/* compiled from: PG */
/* renamed from: uhu  reason: default package */
/* loaded from: classes4.dex */
public final class uhu {
    public boolean a;
    public Integer b;
    public Map c;
    public byte[] d;
    public Exception e;
    private byte[] f;

    public final uhv a() {
        if (this.a) {
            this.f = this.d;
        } else {
            try {
                Map b = b();
                byte[] bArr = this.d;
                if (b.containsKey(uhr.a)) {
                    List list = (List) b.get(uhr.a);
                    if (!list.isEmpty() && akzj.i((CharSequence) list.get(0), "gzip")) {
                        bArr = anek.c(new GZIPInputStream(new ByteArrayInputStream(bArr)));
                    }
                }
                this.f = bArr;
            } catch (IOException e) {
                this.e = e;
            }
        }
        Map map = this.c;
        if (map == null) {
            throw new IllegalStateException("Missing required properties: headers");
        }
        return new uhv(this.b, map, this.d, this.f, this.e);
    }

    public final Map b() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }
}
