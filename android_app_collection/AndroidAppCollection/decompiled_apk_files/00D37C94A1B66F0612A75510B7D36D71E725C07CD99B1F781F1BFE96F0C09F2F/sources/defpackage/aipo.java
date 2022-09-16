package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aipo  reason: default package */
/* loaded from: classes.dex */
public final class aipo implements asv {
    public final pwx a;
    private final aya b;

    public aipo(asv asvVar, pwx pwxVar) {
        this.b = new aya(asvVar, pwxVar, 0);
        this.a = pwxVar;
    }

    private final void c() {
        new aipm(this).start();
    }

    @Override // defpackage.asv
    public final /* synthetic */ Map a() {
        return Collections.emptyMap();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        this.b.b(atkVar);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        return this.b.g(bArr, i, i2);
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        this.a.a(0);
        return this.b.h(asyVar);
    }

    @Override // defpackage.asv
    public final Uri i() {
        return this.b.i();
    }

    @Override // defpackage.asv
    public final void j() {
        try {
            this.b.j();
        } finally {
            c();
        }
    }
}
