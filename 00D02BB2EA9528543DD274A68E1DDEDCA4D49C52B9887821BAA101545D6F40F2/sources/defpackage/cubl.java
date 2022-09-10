package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubl  reason: default package */
/* loaded from: classes5.dex */
public final class cubl extends cubs {
    private final int a;

    public cubl(int i) {
        this.a = i;
    }

    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.SIZE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.SIZE == cuhqVar.b() && this.a == cuhqVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final int h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(27);
        sb.append("TextStyle{size=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
