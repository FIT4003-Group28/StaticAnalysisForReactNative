package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmln  reason: default package */
/* loaded from: classes5.dex */
public final class cmln implements cmkg {
    private final cmkg a;
    private boolean b;
    private long c;
    private final cmlu d;

    public cmln(cmkg cmkgVar, cmlu cmluVar) {
        this.a = cmkgVar;
        this.d = cmluVar;
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        if (this.c == 0) {
            return -1;
        }
        int a = this.a.a(bArr, i, i2);
        if (a > 0) {
            cmlu cmluVar = this.d;
            cmkj cmkjVar = cmluVar.a;
            if (cmkjVar != null) {
                int i3 = 0;
                while (i3 < a) {
                    try {
                        if (cmluVar.d == cmluVar.b) {
                            cmluVar.c();
                            cmluVar.b(cmkjVar);
                        }
                        int min = (int) Math.min(a - i3, cmluVar.b - cmluVar.d);
                        OutputStream outputStream = cmluVar.c;
                        int i4 = cmny.a;
                        outputStream.write(bArr, i + i3, min);
                        i3 += min;
                        long j = min;
                        cmluVar.d += j;
                        cmluVar.e += j;
                    } catch (IOException e) {
                        throw new cmlt(e);
                    }
                }
            }
            long j2 = this.c;
            if (j2 != -1) {
                this.c = j2 - a;
            }
        }
        return a;
    }

    @Override // defpackage.cmkg
    public final void b(cmlo cmloVar) {
        cmmn.f(cmloVar);
        this.a.b(cmloVar);
    }

    @Override // defpackage.cmkg
    public final long c(cmkj cmkjVar) {
        cmkj cmkjVar2 = cmkjVar;
        long c = this.a.c(cmkjVar2);
        this.c = c;
        if (c == 0) {
            return 0L;
        }
        long j = cmkjVar2.g;
        if (j == -1 && c != -1 && j != c) {
            Uri uri = cmkjVar2.a;
            long j2 = cmkjVar2.b;
            int i = cmkjVar2.c;
            byte[] bArr = cmkjVar2.d;
            cmkjVar2 = new cmkj(uri, j2, 1, cmkjVar2.e, cmkjVar2.f, c, cmkjVar2.h, cmkjVar2.i);
        }
        this.b = true;
        cmlu cmluVar = this.d;
        cmmn.f(cmkjVar2.h);
        if (cmkjVar2.g != -1 || !cmkjVar2.b(2)) {
            cmluVar.a = cmkjVar2;
            cmluVar.b = true != cmkjVar2.b(4) ? Long.MAX_VALUE : 2097152L;
            cmluVar.e = 0L;
            try {
                cmluVar.b(cmkjVar2);
            } catch (IOException e) {
                throw new cmlt(e);
            }
        } else {
            cmluVar.a = null;
        }
        return this.c;
    }

    @Override // defpackage.cmkg
    public final Uri d() {
        return this.a.d();
    }

    @Override // defpackage.cmkg
    public final Map<String, List<String>> e() {
        return this.a.e();
    }

    @Override // defpackage.cmkg
    public final void f() {
        try {
            this.a.f();
            if (!this.b) {
                return;
            }
            this.b = false;
            this.d.a();
        } catch (Throwable th) {
            if (this.b) {
                this.b = false;
                this.d.a();
            }
            throw th;
        }
    }
}
