package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aekc  reason: default package */
/* loaded from: classes.dex */
public final class aekc extends ass implements ati {
    private final ati b;
    private final boolean c;
    private volatile boolean d;
    private ByteBuffer e;
    private aekb f;
    private final afjz g;

    public aekc(ati atiVar, afjz afjzVar) {
        super(true);
        this.b = atiVar;
        this.g = afjzVar;
        this.c = atiVar instanceof atp;
    }

    @Override // defpackage.ass, defpackage.asv
    public final Map a() {
        return this.b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
        if (r0.i == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
        if (r0.e.b() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
        throw new defpackage.aeka(4, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
        r0.f = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
        throw new defpackage.aeka(r3, r0.b);
     */
    @Override // defpackage.ast
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aekc.g(byte[], int, int):int");
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        if (!this.c) {
            e(asyVar);
            long h = this.b.h(asyVar);
            f(asyVar);
            this.d = true;
            return h;
        }
        Uri uri = asyVar.a;
        if (uri == null || !TextUtils.equals(uri.getPath(), "/videoplayback")) {
            return this.b.h(asyVar);
        }
        zgp b = zgp.b(asyVar.a);
        b.g("ump", "1");
        if (asyVar.g != 0 || asyVar.h != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(asyVar.g);
            sb.append("-");
            long j = asyVar.h;
            if (j != -1) {
                sb.append((asyVar.g + j) - 1);
            }
            b.g("range", sb.toString());
        }
        asx a = asyVar.a();
        a.a = b.a();
        a.f = 0L;
        a.b = asyVar.b + asyVar.g;
        a.g = -1L;
        asy a2 = a.a();
        e(asyVar);
        long h2 = this.b.h(a2);
        try {
            if (aehx.c(a())) {
                ByteBuffer byteBuffer = this.e;
                if (byteBuffer != null) {
                    byteBuffer.clear();
                } else {
                    this.e = ByteBuffer.allocateDirect(32768);
                }
                this.f = new aekb((atp) this.b, a2, this.e, this.g);
            }
        } catch (aeht unused) {
        }
        f(asyVar);
        this.d = true;
        return h2;
    }

    @Override // defpackage.asv
    public final Uri i() {
        return this.b.i();
    }

    @Override // defpackage.asv
    public final void j() {
        this.f = null;
        this.b.j();
        if (this.d) {
            d();
            this.d = false;
        }
    }

    @Override // defpackage.ati
    public final int k() {
        return this.b.k();
    }

    @Override // defpackage.ati
    public final void l() {
        this.b.l();
    }

    @Override // defpackage.ati
    public final void m(String str, String str2) {
        this.b.m(str, str2);
    }
}
