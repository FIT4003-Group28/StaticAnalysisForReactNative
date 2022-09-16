package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: yjs  reason: default package */
/* loaded from: classes4.dex */
public final class yjs {
    private int a = 0;
    private final azqb b;
    private final yjr c;

    public yjs(azqb azqbVar, yjr yjrVar) {
        this.b = azqbVar;
        this.c = yjrVar;
    }

    final synchronized String a(String str) {
        StringBuilder sb;
        String valueOf = String.valueOf(this.a);
        this.a = (this.a + 1) % 100000;
        sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(":");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void b(String str) {
        ((bqo) this.b.get()).d(str);
    }

    public final void c(String str) {
        ((bqo) this.b.get()).e(str);
    }

    public final void d(String str, long j, long j2, boolean z, int i, boolean z2, Bundle bundle, yjn yjnVar) {
        bql bqlVar = new bql(this.c.b(), j, TimeUnit.SECONDS, j2, TimeUnit.SECONDS);
        yln.c(bqlVar, i, z2, bundle, yjnVar, this.c);
        bqlVar.c(str);
        bqo bqoVar = (bqo) this.b.get();
        int i2 = 1;
        if (true != z) {
            i2 = 2;
        }
        bqoVar.f(str, i2, bqlVar.b());
    }

    public final void e(String str, long j, boolean z, int i, Bundle bundle, yjn yjnVar, boolean z2) {
        int i2;
        String str2;
        bqg bqgVar = new bqg(this.c.b());
        yln.c(bqgVar, i, false, bundle, yjnVar, this.c);
        bqgVar.e(j, TimeUnit.SECONDS);
        if (z2) {
            str2 = a(str);
            i2 = 4;
        } else {
            i2 = true != z ? 2 : 1;
            str2 = str;
        }
        bqgVar.c(str);
        ((bqo) this.b.get()).g(str2, i2, bqgVar.b());
    }
}
