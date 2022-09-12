package defpackage;

import android.widget.RemoteViews;
/* compiled from: PG */
/* renamed from: bzjw  reason: default package */
/* loaded from: classes4.dex */
public final class bzjw extends bzkj {
    public final RemoteViews a;
    public final RemoteViews b;
    public final boolean c;
    public final boolean d;
    public final int e;
    private final dbsg<String> f;
    private final dbsg<String> g;
    private final dbsg<String> h;
    private final dbsg<Long> i;
    private final long j;
    private final int k;

    public bzjw(RemoteViews remoteViews, RemoteViews remoteViews2, boolean z, boolean z2, int i, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, dbsg<Long> dbsgVar4, long j, int i2) {
        this.a = remoteViews;
        this.b = remoteViews2;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = dbsgVar;
        this.g = dbsgVar2;
        this.h = dbsgVar3;
        this.i = dbsgVar4;
        this.j = j;
        this.k = i2;
    }

    @Override // defpackage.bzkj
    public final RemoteViews a() {
        return this.a;
    }

    @Override // defpackage.bzkj
    public final RemoteViews b() {
        return this.b;
    }

    @Override // defpackage.bzkj
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.bzkj
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.bzkj
    public final dbsg<String> e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzkj) {
            bzkj bzkjVar = (bzkj) obj;
            if (this.a.equals(bzkjVar.a()) && this.b.equals(bzkjVar.b()) && this.c == bzkjVar.c() && this.d == bzkjVar.d()) {
                int i = this.e;
                int k = bzkjVar.k();
                if (i == 0) {
                    throw null;
                }
                if (i == k && this.f.equals(bzkjVar.e()) && this.g.equals(bzkjVar.f()) && this.h.equals(bzkjVar.g()) && this.i.equals(bzkjVar.h()) && this.j == bzkjVar.i() && this.k == bzkjVar.j()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bzkj
    public final dbsg<String> f() {
        return this.g;
    }

    @Override // defpackage.bzkj
    public final dbsg<String> g() {
        return this.h;
    }

    @Override // defpackage.bzkj
    public final dbsg<Long> h() {
        return this.i;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        int i2 = (hashCode ^ i) * 1000003;
        int i3 = this.e;
        if (i3 != 0) {
            int hashCode2 = this.f.hashCode();
            int hashCode3 = this.g.hashCode();
            int hashCode4 = this.h.hashCode();
            int hashCode5 = this.i.hashCode();
            long j = this.j;
            return ((((((((((((i2 ^ i3) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.k;
        }
        throw null;
    }

    @Override // defpackage.bzkj
    public final long i() {
        return this.j;
    }

    @Override // defpackage.bzkj
    public final int j() {
        return this.k;
    }

    @Override // defpackage.bzkj
    public final int k() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        boolean z2 = this.d;
        int i = this.e;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "NO_UPCOMING_DEPARTURES" : "DOUBLE_CHIP" : "SINGLE_CHIP";
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        long j = this.j;
        int i2 = this.k;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 244 + length2 + str.length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("NotificationViewData{collapsedView=");
        sb.append(valueOf);
        sb.append(", expandedView=");
        sb.append(valueOf2);
        sb.append(", collapsedHasRealTimeData=");
        sb.append(z);
        sb.append(", collapsedHasAlert=");
        sb.append(z2);
        sb.append(", collapsedNotificationLayout=");
        sb.append(str);
        sb.append(", headerText=");
        sb.append(valueOf3);
        sb.append(", ei=");
        sb.append(valueOf4);
        sb.append(", ved=");
        sb.append(valueOf5);
        sb.append(", arrivalTimeSecs=");
        sb.append(valueOf6);
        sb.append(", staleAfterTimeSecs=");
        sb.append(j);
        sb.append(", smallIcon=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
