package defpackage;
/* compiled from: PG */
/* renamed from: bmtg  reason: default package */
/* loaded from: classes3.dex */
public final class bmtg extends bmtr {
    private final double a;
    private final bmtq b;

    public bmtg(double d, bmtq bmtqVar) {
        this.a = d;
        if (bmtqVar != null) {
            this.b = bmtqVar;
            return;
        }
        throw new NullPointerException("Null align");
    }

    @Override // defpackage.bmtr
    public final double a() {
        return this.a;
    }

    @Override // defpackage.bmtr
    public final bmtq b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmtr) {
            bmtr bmtrVar = (bmtr) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(bmtrVar.a()) && this.b.equals(bmtrVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("RectilinearPathSlot{fraction=");
        sb.append(d);
        sb.append(", align=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
