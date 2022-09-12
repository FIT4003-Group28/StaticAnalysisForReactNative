package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cdb  reason: default package */
/* loaded from: classes.dex */
final class cdb implements cda {
    public final InputStream a;

    public cdb(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.cda
    public final short a() {
        int read = this.a.read();
        if (read != -1) {
            return (short) read;
        }
        throw new ccz();
    }

    @Override // defpackage.cda
    public final int b() {
        return (a() << 8) | a();
    }

    @Override // defpackage.cda
    public final long c(long j) {
        if (j >= 0) {
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip > 0) {
                    j2 -= skip;
                } else if (this.a.read() == -1) {
                    break;
                } else {
                    j2--;
                }
            }
            return j - j2;
        }
        return 0L;
    }
}
