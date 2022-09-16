package defpackage;

import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: albk  reason: default package */
/* loaded from: classes.dex */
public final class albk extends albi {
    private final albj b;
    private final Set c;

    public albk(albu... albuVarArr) {
        super(4);
        this.b = new albj(this);
        this.c = amvn.q(albuVarArr);
    }

    @Override // defpackage.albi
    protected final void e() {
        for (albu albuVar : this.c) {
            albuVar.b(this.b);
        }
    }

    @Override // defpackage.albi
    public final boolean equals(Object obj) {
        if (!(obj instanceof albk)) {
            return false;
        }
        return this.c.equals(((albk) obj).c);
    }

    @Override // defpackage.albi
    protected final void f() {
        for (albu albuVar : this.c) {
            albuVar.d(this.b);
        }
    }

    @Override // defpackage.albu
    public final albv g() {
        for (albu albuVar : this.c) {
            albv g = albuVar.g();
            if (!g.b) {
                return g;
            }
        }
        return albv.a;
    }

    @Override // defpackage.albi
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c});
    }
}
