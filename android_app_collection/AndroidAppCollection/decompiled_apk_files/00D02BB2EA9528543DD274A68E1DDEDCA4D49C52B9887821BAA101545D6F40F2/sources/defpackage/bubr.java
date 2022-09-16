package defpackage;

import defpackage.dssj;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: bubr  reason: default package */
/* loaded from: classes4.dex */
final class bubr<S extends dssj> implements dyia<S> {
    private static final dsqa a = dsqa.c();
    private final ckcw b;
    private final dyia<S> c;
    private final dssr<S> d;

    public bubr(ckcw ckcwVar, dyia<S> dyiaVar, dssr<S> dssrVar) {
        this.b = ckcwVar;
        this.c = dyiaVar;
        this.d = dssrVar;
    }

    @Override // defpackage.dyia
    public final /* bridge */ /* synthetic */ Object a() {
        return this.c.a();
    }

    @Override // defpackage.dyhy
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        S k;
        ckcv e = this.b.e();
        bubq bubqVar = new bubq();
        byte[] bArr = new byte[1024];
        int i = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read < 0) {
                    k = this.d.k(bubqVar.toByteArray(), 0, i, a);
                    break;
                }
                bubqVar.write(bArr, 0, read);
                i += read;
                if (i >= 262144) {
                    k = this.d.g(new bubs(new ByteArrayInputStream(bubqVar.toByteArray(), 0, i), inputStream), a);
                    break;
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        S s = k;
        if (s instanceof dwbc) {
            e.a((ckcr) this.b.a(ckeq.t));
        }
        return s;
    }
}
