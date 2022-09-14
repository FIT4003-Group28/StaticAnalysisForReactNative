package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uhf  reason: default package */
/* loaded from: classes7.dex */
public final class uhf extends uhv {
    public final boolean a;
    public final boolean b;
    public final amvh c;
    public final int d;
    public final int e;

    public uhf(boolean z, boolean z2, amvh amvhVar, int i, int i2) {
        this.a = z;
        this.b = z2;
        if (amvhVar != null) {
            this.c = amvhVar;
            this.d = i;
            this.e = i2;
            return;
        }
        throw new NullPointerException("Null waypoint");
    }

    @Override // defpackage.uhv
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.uhv
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.uhv
    public final amvh c() {
        return this.c;
    }

    @Override // defpackage.uhv
    public final int d() {
        return this.d;
    }

    @Override // defpackage.uhv
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uhv) {
            uhv uhvVar = (uhv) obj;
            if (this.a == uhvVar.a() && this.b == uhvVar.b() && this.c.equals(uhvVar.c()) && this.d == uhvVar.d() && this.e == uhvVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return ((((((i2 ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        int i = this.d;
        int i2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_windowMinWidthMajor);
        sb.append("WaypointUiState{isFirstWaypoint=");
        sb.append(z);
        sb.append(", isLastWaypoint=");
        sb.append(z2);
        sb.append(", waypoint=");
        sb.append(valueOf);
        sb.append(", waypointIndex=");
        sb.append(i);
        sb.append(", indexInRoute=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
