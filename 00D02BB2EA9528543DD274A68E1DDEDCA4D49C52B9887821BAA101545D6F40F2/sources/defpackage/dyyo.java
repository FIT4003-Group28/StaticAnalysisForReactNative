package defpackage;

import defpackage.dssj;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: dyyo  reason: default package */
/* loaded from: classes6.dex */
public final class dyyo<T extends dssj> implements dyia<T> {
    private static final ThreadLocal<Reference<byte[]>> b = new ThreadLocal<>();
    public final dssr<T> a;
    private final T c;

    public dyyo(T t) {
        this.c = t;
        this.a = (dssr<T>) t.bY();
    }

    @Override // defpackage.dyia
    public final /* bridge */ /* synthetic */ Object a() {
        return this.c;
    }

    @Override // defpackage.dyhy
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        byte[] bArr;
        if (inputStream instanceof dyyn) {
            dyyn dyynVar = (dyyn) inputStream;
            if (dyynVar.b == this.a) {
                try {
                    dssj dssjVar = dyynVar.a;
                    if (dssjVar != null) {
                        return dssjVar;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            dspj dspjVar = null;
            if (inputStream instanceof dygt) {
                int available = inputStream.available();
                if (available > 0 && available <= 4194304) {
                    ThreadLocal<Reference<byte[]>> threadLocal = b;
                    Reference<byte[]> reference = threadLocal.get();
                    if (reference == null || (bArr = reference.get()) == null || bArr.length < available) {
                        bArr = new byte[available];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = available;
                    while (i > 0) {
                        int read = inputStream.read(bArr, available - i, i);
                        if (read == -1) {
                            break;
                        }
                        i -= read;
                    }
                    if (i != 0) {
                        StringBuilder sb = new StringBuilder(43);
                        sb.append("size inaccurate: ");
                        sb.append(available);
                        sb.append(" != ");
                        sb.append(available - i);
                        throw new RuntimeException(sb.toString());
                    }
                    dspjVar = dspj.O(bArr, available);
                } else if (available == 0) {
                    return this.c;
                }
            }
            if (dspjVar == null) {
                dspjVar = dspj.I(inputStream);
            }
            int i2 = dspjVar.c;
            dspjVar.c = Integer.MAX_VALUE;
            try {
                T n = this.a.n(dspjVar, dyyq.a);
                try {
                    dspjVar.b(0);
                    return n;
                } catch (dsrm e) {
                    throw e;
                }
            } catch (dsrm e2) {
                throw dyjb.l.g("Invalid protobuf byte sequence").f(e2).j();
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
