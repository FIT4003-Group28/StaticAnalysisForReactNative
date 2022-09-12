package defpackage;

import android.widget.RemoteViews;
/* compiled from: PG */
/* renamed from: bzkb  reason: default package */
/* loaded from: classes4.dex */
final class bzkb extends bzky {
    private final RemoteViews a;
    private final boolean b;
    private final boolean c;
    private final dbsg<String> d;
    private final dbsg<String> e;

    public bzkb(RemoteViews remoteViews, boolean z, boolean z2, dbsg<String> dbsgVar, dbsg<String> dbsgVar2) {
        this.a = remoteViews;
        this.b = z;
        this.c = z2;
        this.d = dbsgVar;
        this.e = dbsgVar2;
    }

    @Override // defpackage.bzky
    public final RemoteViews a() {
        return this.a;
    }

    @Override // defpackage.bzky
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bzky
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.bzky
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // defpackage.bzky
    public final dbsg<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzky) {
            bzky bzkyVar = (bzky) obj;
            if (this.a.equals(bzkyVar.a()) && this.b == bzkyVar.b() && this.c == bzkyVar.c() && this.d.equals(bzkyVar.d()) && this.e.equals(bzkyVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 79 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RemoteViewsData{remoteViews=");
        sb.append(valueOf);
        sb.append(", hasRealTimeData=");
        sb.append(z);
        sb.append(", hasAlert=");
        sb.append(z2);
        sb.append(", ei=");
        sb.append(valueOf2);
        sb.append(", ved=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
