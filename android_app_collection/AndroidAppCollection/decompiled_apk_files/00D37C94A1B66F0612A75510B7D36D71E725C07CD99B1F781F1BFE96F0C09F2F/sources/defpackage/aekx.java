package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: aekx  reason: default package */
/* loaded from: classes.dex */
public final class aekx extends aflg {
    private static final Pattern b = Pattern.compile("[0-9a-zA-Z_-]{11}\\.[\\d]+\\~[\\d]+");
    public final AtomicReference a;
    private final aeln c;
    private final afjp d;
    private final String e;
    private final axxl f;
    private boolean g;
    private volatile aelc h;
    private boolean i;
    private asy j;
    private int k;
    private long l;
    private long m;
    private boolean n;
    private String o;
    private long p;
    private long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aekx(axxl axxlVar, aeln aelnVar, asv asvVar, afjp afjpVar, aenf aenfVar, String str) {
        super(asvVar);
        afms.a(asvVar);
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        afms.a(afjpVar);
        this.d = afjpVar;
        atomicReference.set(aenfVar);
        this.m = -1L;
        this.c = aelnVar;
        this.e = str;
        this.f = axxlVar;
    }

    private final long c(asy asyVar) {
        if (this.g) {
            aeny.g("Upstream DataSource already opened.");
        }
        this.i = false;
        this.g = true;
        return super.h(asyVar);
    }

    private final asy d(asy asyVar, long j, long j2) {
        Uri uri = asyVar.a;
        if (this.i && this.n) {
            zgp b2 = zgp.b(uri);
            b2.j("headm");
            b2.g("sq", Long.toString(this.m));
            uri = b2.a();
            j2 = -1;
        }
        String str = asyVar.i;
        if ("oda".equals(asyVar.a.getAuthority())) {
            String queryParameter = asyVar.a.getQueryParameter("itag");
            if (queryParameter == null) {
                return asyVar;
            }
            try {
                String b3 = ovm.b(Integer.parseInt(queryParameter), asyVar.a.getQueryParameter("xtags"));
                aenf aenfVar = (aenf) this.a.get();
                if (aenfVar == null) {
                    aeny.g("Dummy authority received with null Representation cache (upstream).");
                    throw new IOException(new aene("Dummy authority received with null Representation cache (upstream)."));
                }
                avg a = aenfVar.a(b3);
                if (!aenfVar.i() || a == null) {
                    throw new IOException("Null_onesie_representation");
                }
                Uri parse = Uri.parse(((avd) a.b.get(0)).a);
                str = a.f;
                uri = parse;
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(asyVar.a.getQueryParameter("itag"));
                aeny.g(valueOf.length() != 0 ? "Unexpected NumberFormatException: ".concat(valueOf) : new String("Unexpected NumberFormatException: "));
                return asyVar;
            }
        }
        if (asyVar.a == uri && asyVar.g == j && asyVar.f == j && asyVar.h == j2) {
            return asyVar;
        }
        asx a2 = asyVar.a();
        a2.a = uri;
        a2.f = j;
        a2.g = j2;
        a2.h = str;
        return a2.a();
    }

    @Override // defpackage.aflg, defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3;
        if (this.i && this.h != null && this.j != null) {
            long j = this.q;
            if (j >= 0 || j == -1) {
                if (j == 0) {
                    return -1;
                }
                i3 = j != -1 ? (int) Math.min(i2, j) : i2;
                try {
                    int a = this.h.a(bArr, i, i3, this.e, this.k, this.l, this.m, this.o, this.p);
                    if (a == -1) {
                        return -1;
                    }
                    if (a != 0) {
                        long j2 = a;
                        this.p += j2;
                        long j3 = this.q;
                        if (j3 != -1) {
                            this.q = j3 - j2;
                        }
                        return a;
                    } else if ("onesievideobufferonly".equals(this.j.a.getAuthority())) {
                        throw new IOException("Giving up on OnesieVideoBuffer-only request");
                    } else {
                        this.h.g();
                        c(d(this.j, this.p, this.q));
                        bArr2 = bArr;
                        return super.g(bArr2, i, i3);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IOException(e);
                }
            }
        }
        bArr2 = bArr;
        i3 = i2;
        return super.g(bArr2, i, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0197, code lost:
        if (r14.get() != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024f A[Catch: NumberFormatException -> 0x025a, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x025a, blocks: (B:77:0x0246, B:80:0x024f), top: B:95:0x0246 }] */
    @Override // defpackage.aflg, defpackage.asv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.asy r17) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aekx.h(asy):long");
    }

    @Override // defpackage.aflg, defpackage.asv
    public final Uri i() {
        return this.i ? this.j.a : super.i();
    }

    @Override // defpackage.aflg, defpackage.asv
    public final void j() {
        if (this.g) {
            this.g = false;
            super.j();
        }
    }
}
