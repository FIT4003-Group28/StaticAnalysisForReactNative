package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: tgz  reason: default package */
/* loaded from: classes4.dex */
public final class tgz implements tdu {
    public static final AtomicBoolean b = new AtomicBoolean(true);
    public final tcn c;
    public final thu d;
    public final Executor e;
    public String f;
    public final ajiy g;
    public final aolu h;

    public tgz(aolu aoluVar, thu thuVar, Executor executor, ajiy ajiyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.h = aoluVar;
        this.d = thuVar;
        this.g = ajiyVar;
        this.c = new thd(thuVar, executor, ajiyVar);
        this.e = executor;
    }

    @Override // defpackage.tdu
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.tdu
    public final tcm b() {
        if (TextUtils.isEmpty(this.f)) {
            d();
        }
        return new tgy(this);
    }

    @Override // defpackage.tdu
    public final tfd c(final int i) {
        if (TextUtils.isEmpty(this.f)) {
            d();
        }
        return new tfd() { // from class: tgx
            @Override // defpackage.tfd
            public final tff a() {
                tgz tgzVar = tgz.this;
                int i2 = i;
                String str = tgzVar.f;
                thu thuVar = tgzVar.d;
                Executor executor = tgzVar.e;
                ajiy ajiyVar = tgzVar.g;
                thm thmVar = thm.b;
                return new thj(str, i2, thuVar, executor, ajiyVar);
            }
        };
    }

    @Override // defpackage.tdu
    public final void d() {
        String b2 = this.d.b();
        this.f = b2;
        this.d.d(b2);
    }
}
