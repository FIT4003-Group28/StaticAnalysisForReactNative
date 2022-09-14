package defpackage;
/* compiled from: PG */
/* renamed from: ctxv  reason: default package */
/* loaded from: classes5.dex */
public final class ctxv extends ctyd {
    private final boolean a;
    private final long b;
    private final boolean c;
    private final boolean d;

    public ctxv(boolean z, long j, boolean z2, boolean z3) {
        this.a = z;
        this.b = j;
        this.c = z2;
        this.d = z3;
    }

    @Override // defpackage.ctyd
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.ctyd
    public final long b() {
        return this.b;
    }

    @Override // defpackage.ctyd
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.ctyd
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctyd) {
            ctyd ctydVar = (ctyd) obj;
            if (this.a == ctydVar.a() && this.b == ctydVar.b() && this.c == ctydVar.c() && this.d == ctydVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = true != this.a ? 1237 : 1231;
        long j = this.b;
        int i3 = (((((i2 ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return i3 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        long j = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        StringBuilder sb = new StringBuilder(134);
        sb.append("CustomWebViewLog{pageLoadedSuccess=");
        sb.append(z);
        sb.append(", pageLoadTimeMs=");
        sb.append(j);
        sb.append(", dismissedByNativeUi=");
        sb.append(z2);
        sb.append(", userDidCompleteAction=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
