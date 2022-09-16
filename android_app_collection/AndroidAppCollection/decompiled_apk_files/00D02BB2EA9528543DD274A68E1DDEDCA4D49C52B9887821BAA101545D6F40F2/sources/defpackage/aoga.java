package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoga  reason: default package */
/* loaded from: classes2.dex */
public final class aoga extends aoha {
    private final aogb a;
    private final long b;

    public aoga(aogb aogbVar, long j) {
        this.a = aogbVar;
        this.b = j;
    }

    @Override // defpackage.aoha
    public final aogb a() {
        return this.a;
    }

    @Override // defpackage.aoha
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoha) {
            aoha aohaVar = (aoha) obj;
            if (this.a.equals(aohaVar.a()) && this.b == aohaVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
