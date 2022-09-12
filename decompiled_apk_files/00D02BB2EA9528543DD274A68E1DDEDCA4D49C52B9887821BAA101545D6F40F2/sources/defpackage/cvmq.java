package defpackage;

import defpackage.dssj;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvmq  reason: default package */
/* loaded from: classes5.dex */
public final class cvmq<I extends dssj, O extends dssj> extends cvmr<I, O> {
    private final I a;
    private final O b;
    private final Throwable c;
    private final boolean d;

    public cvmq(@dzsi I i, @dzsi O o, @dzsi Throwable th, boolean z) {
        this.a = i;
        this.b = o;
        this.c = th;
        this.d = z;
    }

    @Override // defpackage.cvmr
    @dzsi
    public final I a() {
        return this.a;
    }

    @Override // defpackage.cvmr
    @dzsi
    public final O b() {
        return this.b;
    }

    @Override // defpackage.cvmr
    @dzsi
    public final Throwable c() {
        return this.c;
    }

    @Override // defpackage.cvmr
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvmr) {
            cvmr cvmrVar = (cvmr) obj;
            I i = this.a;
            if (i != null ? i.equals(cvmrVar.a()) : cvmrVar.a() == null) {
                O o = this.b;
                if (o != null ? o.equals(cvmrVar.b()) : cvmrVar.b() == null) {
                    Throwable th = this.c;
                    if (th != null ? th.equals(cvmrVar.c()) : cvmrVar.c() == null) {
                        if (this.d == cvmrVar.d()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        I i = this.a;
        int i2 = 0;
        int hashCode = ((i == null ? 0 : i.hashCode()) ^ 1000003) * 1000003;
        O o = this.b;
        int hashCode2 = (hashCode ^ (o == null ? 0 : o.hashCode())) * 1000003;
        Throwable th = this.c;
        if (th != null) {
            i2 = th.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ChimeRpc{request=");
        sb.append(valueOf);
        sb.append(", response=");
        sb.append(valueOf2);
        sb.append(", error=");
        sb.append(valueOf3);
        sb.append(", isRetryableError=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
