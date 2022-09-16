package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: PG */
/* renamed from: aykb  reason: default package */
/* loaded from: classes2.dex */
public final class aykb implements ayha {
    public final aymk e;
    public boolean f;
    public int g;
    public long i;
    public aydn j;
    private final ayka k;
    public int a = -1;
    public axyr b = axyp.a;
    public final ayjz c = new ayjz(this);
    public final ByteBuffer d = ByteBuffer.allocate(5);
    public int h = -1;

    public aykb(ayka aykaVar, aymk aymkVar) {
        this.k = aykaVar;
        this.e = aymkVar;
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        aymu aymuVar = (aymu) inputStream;
        aoqu aoquVar = aymuVar.a;
        if (aoquVar != null) {
            int serializedSize = aoquVar.getSerializedSize();
            aymuVar.a.writeTo(outputStream);
            aymuVar.a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = aymuVar.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int a = (int) aymw.a(byteArrayInputStream, outputStream);
        aymuVar.c = null;
        return a;
    }

    public final void b(boolean z, boolean z2) {
        aydn aydnVar = this.j;
        this.j = null;
        this.k.w(aydnVar, z, z2);
        this.g = 0;
    }

    public final void c(ayjy ayjyVar, boolean z) {
        int i = 0;
        for (aydn aydnVar : ayjyVar.a) {
            i += aydnVar.a();
        }
        this.d.clear();
        this.d.put(z ? (byte) 1 : (byte) 0).putInt(i);
        aydn p = banl.p(5);
        p.c(this.d.array(), 0, this.d.position());
        if (i == 0) {
            this.j = p;
            return;
        }
        this.k.w(p, false, false);
        this.g = 1;
        List list = ayjyVar.a;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            this.k.w((aydn) list.get(i2), false, false);
        }
        this.j = (aydn) list.get(list.size() - 1);
        this.i = i;
    }

    public final void d(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            aydn aydnVar = this.j;
            if (aydnVar != null && aydnVar.b() == 0) {
                b(false, false);
            }
            if (this.j == null) {
                this.j = banl.p(i2);
            }
            int min = Math.min(i2, this.j.b());
            this.j.c(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }
}
