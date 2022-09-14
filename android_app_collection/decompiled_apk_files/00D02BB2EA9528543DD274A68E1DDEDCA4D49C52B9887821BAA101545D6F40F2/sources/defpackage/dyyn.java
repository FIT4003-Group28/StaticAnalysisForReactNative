package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: dyyn  reason: default package */
/* loaded from: classes6.dex */
public final class dyyn extends InputStream implements dyfv, dygt {
    @dzsi
    public dssj a;
    public final dssr<?> b;
    @dzsi
    private ByteArrayInputStream c;

    public dyyn(dssj dssjVar, dssr<?> dssrVar) {
        this.a = dssjVar;
        this.b = dssrVar;
    }

    @Override // defpackage.dyfv
    public final int a(OutputStream outputStream) {
        dssj dssjVar = this.a;
        if (dssjVar != null) {
            int cb = dssjVar.cb();
            this.a.bT(outputStream);
            this.a = null;
            return cb;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        long d = dyyq.d(byteArrayInputStream, outputStream);
        this.c = null;
        return (int) d;
    }

    @Override // java.io.InputStream
    public final int available() {
        dssj dssjVar = this.a;
        if (dssjVar != null) {
            return dssjVar.cb();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        return byteArrayInputStream.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        dssj dssjVar = this.a;
        if (dssjVar != null) {
            this.c = new ByteArrayInputStream(dssjVar.bS());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        dssj dssjVar = this.a;
        if (dssjVar != null) {
            int cb = dssjVar.cb();
            if (cb == 0) {
                this.a = null;
                this.c = null;
                return -1;
            } else if (i2 >= cb) {
                dspp E = dspp.E(bArr, i, cb);
                this.a.Pv(E);
                E.an();
                this.a = null;
                this.c = null;
                return cb;
            } else {
                this.c = new ByteArrayInputStream(this.a.bS());
                this.a = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
