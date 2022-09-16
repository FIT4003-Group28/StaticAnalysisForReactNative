package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: vsn  reason: default package */
/* loaded from: classes4.dex */
public final class vsn {
    protected final DataInputStream a;
    protected final long b;
    protected long c;
    protected vsn d;
    protected vsn e;
    protected boolean f;

    private vsn(DataInputStream dataInputStream, long j, vsn vsnVar) {
        this.c = 0L;
        this.d = null;
        this.e = null;
        boolean z = false;
        this.f = false;
        aqxo.p(j >= 0 ? true : z);
        this.a = dataInputStream;
        this.b = j;
        this.d = vsnVar;
    }

    public final int a() {
        h(4L);
        int readInt = this.a.readInt();
        i(4L);
        return readInt;
    }

    public final long b() {
        return this.b - this.c;
    }

    public final long c() {
        aqxo.y(this.e == null);
        aqxo.y(!this.f);
        long j = this.c;
        for (vsn vsnVar = this.d; vsnVar != null; vsnVar = vsnVar.d) {
            j += vsnVar.c;
        }
        return j;
    }

    public final long d() {
        return a() & 4294967295L;
    }

    public final long e() {
        h(8L);
        long readLong = this.a.readLong();
        if (readLong < 0) {
            throw new vsz("Uint64 values larger than int64 are not supported.");
        }
        i(8L);
        return readLong;
    }

    public final vsn f(long j) {
        boolean z = true;
        aqxo.y(!this.f);
        aqxo.y(this.e == null);
        if (j < 0) {
            z = false;
        }
        aqxo.p(z);
        if (j > b()) {
            throw new vsz("Cannot create a reader with a readLimit that exceeds its parent.");
        }
        vsn vsnVar = new vsn(this.a, j, this);
        this.e = vsnVar;
        return vsnVar;
    }

    public final String g() {
        h(4L);
        byte[] bArr = new byte[4];
        long read = this.a.read(bArr);
        i(read);
        if (read == 4) {
            return new String(bArr, 0, 4, amoz.b);
        }
        throw new vsz("Did not consumed the expected number of bytes");
    }

    public final void h(long j) {
        aqxo.y(this.e == null);
        aqxo.y(!this.f);
        if (j <= b()) {
            return;
        }
        throw new vsz("Attempt to read past the end of the box.");
    }

    public final void i(long j) {
        this.c += j;
    }

    public final void j(vsn vsnVar) {
        vsnVar.getClass();
        boolean z = false;
        aqxo.p(this.e == vsnVar);
        if (vsnVar.d == this) {
            z = true;
        }
        aqxo.p(z);
        aqxo.y(!vsnVar.f);
        this.c += this.e.c;
        vsnVar.d = null;
        vsnVar.f = true;
        this.e = null;
    }

    public final void k(long j) {
        h(j);
        anek.b(this.a, j);
        i(j);
    }

    public final byte[] l(int i) {
        long j = i;
        h(j);
        byte[] bArr = new byte[i];
        anek.a(this.a, bArr);
        i(j);
        return bArr;
    }

    public final void m() {
        h(2L);
        this.a.readShort();
        i(2L);
    }

    public vsn(InputStream inputStream, long j) {
        this(new DataInputStream(inputStream), j, null);
    }
}
