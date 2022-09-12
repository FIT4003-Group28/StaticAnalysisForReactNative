package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmll  reason: default package */
/* loaded from: classes5.dex */
public final class cmll implements cmkg {
    private final cmkg a;
    private boolean b;
    private final cltz c;

    public cmll(cmkg cmkgVar, cltz cltzVar) {
        this.a = cmkgVar;
        this.c = cltzVar;
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        return this.a.a(bArr, i, i2);
    }

    @Override // defpackage.cmkg
    public final void b(cmlo cmloVar) {
        cmmn.f(cmloVar);
        this.a.b(cmloVar);
    }

    @Override // defpackage.cmkg
    public final long c(cmkj cmkjVar) {
        this.b = true;
        return this.a.c(cmkjVar);
    }

    @Override // defpackage.cmkg
    public final Uri d() {
        Uri d = this.a.d();
        if (d == null) {
            return null;
        }
        return cltz.a(d);
    }

    @Override // defpackage.cmkg
    public final Map<String, List<String>> e() {
        return this.a.e();
    }

    @Override // defpackage.cmkg
    public final void f() {
        if (this.b) {
            this.b = false;
            this.a.f();
        }
    }
}
