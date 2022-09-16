package defpackage;
/* compiled from: PG */
/* renamed from: trr  reason: default package */
/* loaded from: classes7.dex */
final class trr extends tsc {
    public final jjn a;
    public final jkc b;
    public final dbsg<Integer> c;
    public final int d;
    public final dbsg<Integer> e;

    public trr(jjn jjnVar, jkc jkcVar, dbsg<Integer> dbsgVar, int i, dbsg<Integer> dbsgVar2) {
        if (jjnVar != null) {
            this.a = jjnVar;
            if (jkcVar != null) {
                this.b = jkcVar;
                this.c = dbsgVar;
                this.d = i;
                this.e = dbsgVar2;
                return;
            }
            throw new NullPointerException("Null expandingStateTransition");
        }
        throw new NullPointerException("Null expandingState");
    }

    @Override // defpackage.tsc
    public final jjn a() {
        return this.a;
    }

    @Override // defpackage.tsc
    public final jkc b() {
        return this.b;
    }

    @Override // defpackage.tsc
    public final dbsg<Integer> c() {
        return this.c;
    }

    @Override // defpackage.tsc
    public final int d() {
        return this.d;
    }

    @Override // defpackage.tsc
    public final dbsg<Integer> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tsc) {
            tsc tscVar = (tsc) obj;
            if (this.a.equals(tscVar.a()) && this.b.equals(tscVar.b()) && this.c.equals(tscVar.c()) && this.d == tscVar.d() && this.e.equals(tscVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 162 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ResultListPeekingCalculation{expandingState=");
        sb.append(valueOf);
        sb.append(", expandingStateTransition=");
        sb.append(valueOf2);
        sb.append(", sliderExpandedPeekingHeightPx=");
        sb.append(valueOf3);
        sb.append(", hiddenHeightPx=");
        sb.append(i);
        sb.append(", expectedNumVisibleTripCards=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
