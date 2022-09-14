package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqcr  reason: default package */
/* loaded from: classes4.dex */
public final class bqcr extends bqcw {
    private final dcdc<bqhj> a;
    private final bqgw b;
    private final cflx c;
    private final bqcv d;
    private final bqcv e;

    public bqcr(dcdc<bqhj> dcdcVar, @dzsi bqgw bqgwVar, @dzsi cflx cflxVar, bqcv bqcvVar, bqcv bqcvVar2) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            this.b = bqgwVar;
            this.c = cflxVar;
            if (bqcvVar != null) {
                this.d = bqcvVar;
                if (bqcvVar2 != null) {
                    this.e = bqcvVar2;
                    return;
                }
                throw new NullPointerException("Null endIntersection");
            }
            throw new NullPointerException("Null startIntersection");
        }
        throw new NullPointerException("Null polyline");
    }

    @Override // defpackage.bqcw
    public final dcdc<bqhj> a() {
        return this.a;
    }

    @Override // defpackage.bqcw
    @dzsi
    public final bqgw b() {
        return this.b;
    }

    @Override // defpackage.bqcw
    @dzsi
    public final cflx c() {
        return this.c;
    }

    @Override // defpackage.bqcw
    public final bqcv d() {
        return this.d;
    }

    @Override // defpackage.bqcw
    public final bqcv e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        bqgw bqgwVar;
        cflx cflxVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqcw) {
            bqcw bqcwVar = (bqcw) obj;
            if (dchl.m(this.a, bqcwVar.a()) && ((bqgwVar = this.b) != null ? bqgwVar.equals(bqcwVar.b()) : bqcwVar.b() == null) && ((cflxVar = this.c) != null ? cflxVar.equals(bqcwVar.c()) : bqcwVar.c() == null) && this.d.equals(bqcwVar.d()) && this.e.equals(bqcwVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        bqgw bqgwVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (bqgwVar == null ? 0 : bqgwVar.hashCode())) * 1000003;
        cflx cflxVar = this.c;
        if (cflxVar != null) {
            i = cflxVar.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_tooltipFrameBackground + length2 + length3 + length4 + String.valueOf(valueOf5).length());
        sb.append("RmrMultiRoadGraphSegment{polyline=");
        sb.append(valueOf);
        sb.append(", originalRoadModel=");
        sb.append(valueOf2);
        sb.append(", existingRoadSegment=");
        sb.append(valueOf3);
        sb.append(", startIntersection=");
        sb.append(valueOf4);
        sb.append(", endIntersection=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
