package defpackage;
/* compiled from: PG */
/* renamed from: aofo  reason: default package */
/* loaded from: classes2.dex */
public final class aofo extends aogb {
    public final int a;
    private final int b;
    private final int c;

    public aofo(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.a = i3;
    }

    @Override // defpackage.aogb
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aogb
    public final int b() {
        return this.c;
    }

    @Override // defpackage.aogb
    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aogb) {
            aogb aogbVar = (aogb) obj;
            if (this.b == aogbVar.a() && this.c == aogbVar.b() && this.a == aogbVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.a;
    }
}
