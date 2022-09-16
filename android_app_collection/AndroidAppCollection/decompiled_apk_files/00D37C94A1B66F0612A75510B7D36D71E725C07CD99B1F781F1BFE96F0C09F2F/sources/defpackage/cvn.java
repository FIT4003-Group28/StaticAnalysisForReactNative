package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: cvn  reason: default package */
/* loaded from: classes3.dex */
public abstract class cvn implements cvo {
    private static final Logger b = Logger.getLogger(cvn.class.getName());
    final ThreadLocal a = new cvm();

    @Override // defpackage.cvo
    public final cvs a(axja axjaVar, cvx cvxVar) {
        int a;
        long c;
        long b2 = axjaVar.b();
        ((ByteBuffer) this.a.get()).rewind().limit(8);
        do {
            a = axjaVar.a((ByteBuffer) this.a.get());
            if (a == 8) {
                ((ByteBuffer) this.a.get()).rewind();
                long I = hy.I((ByteBuffer) this.a.get());
                byte[] bArr = null;
                if (I >= 8 || I <= 1) {
                    String K = hy.K((ByteBuffer) this.a.get());
                    if (I == 1) {
                        ((ByteBuffer) this.a.get()).limit(16);
                        axjaVar.a((ByteBuffer) this.a.get());
                        ((ByteBuffer) this.a.get()).position(8);
                        c = hy.J((ByteBuffer) this.a.get()) - 16;
                    } else {
                        c = I == 0 ? axjaVar.c() - axjaVar.b() : I - 8;
                    }
                    if ("uuid".equals(K)) {
                        ((ByteBuffer) this.a.get()).limit(((ByteBuffer) this.a.get()).limit() + 16);
                        axjaVar.a((ByteBuffer) this.a.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.a.get()).position() - 16; position < ((ByteBuffer) this.a.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.a.get()).position() - 16)] = ((ByteBuffer) this.a.get()).get(position);
                        }
                        c -= 16;
                    }
                    long j = c;
                    if (cvxVar instanceof cvs) {
                        ((cvs) cvxVar).d();
                    }
                    cvs b3 = b(K, bArr);
                    b3.g(cvxVar);
                    ((ByteBuffer) this.a.get()).rewind();
                    b3.f(axjaVar, (ByteBuffer) this.a.get(), j, this);
                    return b3;
                }
                Logger logger = b;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder(80);
                sb.append("Plausibility check failed: size < 8 (size = ");
                sb.append(I);
                sb.append("). Stop parsing!");
                logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                return null;
            }
        } while (a >= 0);
        axjaVar.f(b2);
        throw new EOFException();
    }

    public abstract cvs b(String str, byte[] bArr);
}
