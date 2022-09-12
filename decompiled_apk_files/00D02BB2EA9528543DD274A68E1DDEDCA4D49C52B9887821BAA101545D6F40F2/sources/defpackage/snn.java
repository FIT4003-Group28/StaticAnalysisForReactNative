package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: snn  reason: default package */
/* loaded from: classes7.dex */
public final class snn extends sqw {
    public final dcdc<dpte> a;
    public final dcdc<dnui> b;
    public final long c;

    public snn(@dzsi dcdc<dpte> dcdcVar, @dzsi dcdc<dnui> dcdcVar2, long j) {
        this.a = dcdcVar;
        this.b = dcdcVar2;
        this.c = j;
    }

    @Override // defpackage.sqw
    @dzsi
    public final dcdc<dpte> a() {
        return this.a;
    }

    @Override // defpackage.sqw
    @dzsi
    public final dcdc<dnui> b() {
        return this.b;
    }

    @Override // defpackage.sqw
    public final long c() {
        return this.c;
    }

    @Override // defpackage.sqw
    public final sqv d() {
        return new snm(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sqw) {
            sqw sqwVar = (sqw) obj;
            dcdc<dpte> dcdcVar = this.a;
            if (dcdcVar != null ? dchl.m(dcdcVar, sqwVar.a()) : sqwVar.a() == null) {
                dcdc<dnui> dcdcVar2 = this.b;
                if (dcdcVar2 != null ? dchl.m(dcdcVar2, sqwVar.b()) : sqwVar.b() == null) {
                    if (this.c == sqwVar.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dcdc<dpte> dcdcVar = this.a;
        int i = 0;
        int hashCode = ((dcdcVar == null ? 0 : dcdcVar.hashCode()) ^ 1000003) * 1000003;
        dcdc<dnui> dcdcVar2 = this.b;
        if (dcdcVar2 != null) {
            i = dcdcVar2.hashCode();
        }
        long j = this.c;
        return ((hashCode ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        long j = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_toolbarStyle + String.valueOf(valueOf2).length());
        sb.append("SuggestedDestinations{recentHistory=");
        sb.append(valueOf);
        sb.append(", predictedDestination=");
        sb.append(valueOf2);
        sb.append(", predictedDestinationUpdatedSec=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
