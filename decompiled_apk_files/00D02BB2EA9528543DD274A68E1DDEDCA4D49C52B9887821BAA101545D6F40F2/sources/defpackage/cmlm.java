package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmlm  reason: default package */
/* loaded from: classes5.dex */
public final class cmlm implements cmkg {
    public long a;
    private final cmkg b;

    public cmlm(cmkg cmkgVar) {
        cmmn.f(cmkgVar);
        this.b = cmkgVar;
        Collections.emptyMap();
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        int a = this.b.a(bArr, i, i2);
        if (a != -1) {
            this.a += a;
        }
        return a;
    }

    @Override // defpackage.cmkg
    public final void b(cmlo cmloVar) {
        cmmn.f(cmloVar);
        this.b.b(cmloVar);
    }

    @Override // defpackage.cmkg
    public final long c(cmkj cmkjVar) {
        Uri uri = cmkjVar.a;
        Collections.emptyMap();
        long c = this.b.c(cmkjVar);
        cmmn.f(d());
        e();
        return c;
    }

    @Override // defpackage.cmkg
    public final Uri d() {
        return this.b.d();
    }

    @Override // defpackage.cmkg
    public final Map<String, List<String>> e() {
        return this.b.e();
    }

    @Override // defpackage.cmkg
    public final void f() {
        this.b.f();
    }
}
