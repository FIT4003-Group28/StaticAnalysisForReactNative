package defpackage;
/* compiled from: PG */
/* renamed from: cubb  reason: default package */
/* loaded from: classes5.dex */
final class cubb extends cubd {
    private final int a;

    public cubb(int i) {
        this.a = i;
    }

    @Override // defpackage.cuhl
    public final cuhn a() {
        return cuhn.INDENTATION;
    }

    @Override // defpackage.cubd, defpackage.cuhl
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhl) {
            cuhl cuhlVar = (cuhl) obj;
            if (cuhn.INDENTATION == cuhlVar.a() && this.a == cuhlVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("LineStyle{indentation=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
