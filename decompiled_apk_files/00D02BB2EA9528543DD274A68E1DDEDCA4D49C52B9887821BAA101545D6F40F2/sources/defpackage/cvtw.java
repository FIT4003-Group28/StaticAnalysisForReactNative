package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: cvtw  reason: default package */
/* loaded from: classes5.dex */
final class cvtw<T extends dssj> extends cvty<T> {
    private final T a;
    private final Throwable b;
    private final boolean c;

    public cvtw(@dzsi T t, @dzsi Throwable th, boolean z) {
        this.a = t;
        this.b = th;
        this.c = z;
    }

    @Override // defpackage.cvty
    @dzsi
    public final T a() {
        return this.a;
    }

    @Override // defpackage.cvty
    @dzsi
    public final Throwable b() {
        return this.b;
    }

    @Override // defpackage.cvty
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvty) {
            cvty cvtyVar = (cvty) obj;
            T t = this.a;
            if (t != null ? t.equals(cvtyVar.a()) : cvtyVar.a() == null) {
                Throwable th = this.b;
                if (th != null ? th.equals(cvtyVar.b()) : cvtyVar.b() == null) {
                    if (this.c == cvtyVar.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        T t = this.a;
        int i = 0;
        int hashCode = ((t == null ? 0 : t.hashCode()) ^ 1000003) * 1000003;
        Throwable th = this.b;
        if (th != null) {
            i = th.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59 + String.valueOf(valueOf2).length());
        sb.append("ChimeRpcResponse{response=");
        sb.append(valueOf);
        sb.append(", error=");
        sb.append(valueOf2);
        sb.append(", isRetryableError=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
