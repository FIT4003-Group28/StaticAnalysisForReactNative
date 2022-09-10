package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uez  reason: default package */
/* loaded from: classes7.dex */
public final class uez extends uff {
    private final dcdc<amvh> a;
    private final Boolean b;
    private final boolean c;
    private final dbsg<Integer> d;

    public uez(dcdc<amvh> dcdcVar, Boolean bool, boolean z, dbsg<Integer> dbsgVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            this.b = bool;
            this.c = z;
            this.d = dbsgVar;
            return;
        }
        throw new NullPointerException("Null waypoints");
    }

    @Override // defpackage.uff
    public final dcdc<amvh> a() {
        return this.a;
    }

    @Override // defpackage.uff
    public final Boolean b() {
        return this.b;
    }

    @Override // defpackage.uff
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.uff
    public final dbsg<Integer> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uff) {
            uff uffVar = (uff) obj;
            if (dchl.m(this.a, uffVar.a()) && this.b.equals(uffVar.b()) && this.c == uffVar.c() && this.d.equals(uffVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceListItem + length2 + String.valueOf(valueOf3).length());
        sb.append("WaypointsState{waypoints=");
        sb.append(valueOf);
        sb.append(", canAddAdditionalWaypoints=");
        sb.append(valueOf2);
        sb.append(", isUserInitiated=");
        sb.append(z);
        sb.append(", firstEmptyWaypointIndex=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
