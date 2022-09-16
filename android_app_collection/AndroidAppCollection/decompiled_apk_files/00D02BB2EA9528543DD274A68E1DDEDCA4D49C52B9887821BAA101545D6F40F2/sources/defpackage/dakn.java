package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import java.util.List;
/* compiled from: PG */
/* renamed from: dakn  reason: default package */
/* loaded from: classes5.dex */
final class dakn extends dame {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final List<String> e;
    public final List<String> f;
    public final PendingIntent g;
    public final List<Intent> h;
    private final int i;

    public dakn(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, List<Intent> list3) {
        this.a = i;
        this.b = i2;
        this.i = i3;
        this.c = j;
        this.d = j2;
        this.e = list;
        this.f = list2;
        this.g = pendingIntent;
        this.h = list3;
    }

    @Override // defpackage.dame
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dame
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dame
    public final int c() {
        return this.i;
    }

    @Override // defpackage.dame
    public final long d() {
        return this.c;
    }

    @Override // defpackage.dame
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        PendingIntent pendingIntent;
        List<Intent> list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dame) {
            dame dameVar = (dame) obj;
            if (this.a == dameVar.a() && this.b == dameVar.b() && this.i == dameVar.c() && this.c == dameVar.d() && this.d == dameVar.e() && ((list = this.e) != null ? list.equals(dameVar.f()) : dameVar.f() == null) && ((list2 = this.f) != null ? list2.equals(dameVar.g()) : dameVar.g() == null) && ((pendingIntent = this.g) != null ? pendingIntent.equals(dameVar.h()) : dameVar.h() == null) && ((list3 = this.h) != null ? list3.equals(dameVar.i()) : dameVar.i() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dame
    public final List<String> f() {
        return this.e;
    }

    @Override // defpackage.dame
    public final List<String> g() {
        return this.f;
    }

    @Override // defpackage.dame
    @Deprecated
    public final PendingIntent h() {
        return this.g;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.i;
        long j = this.c;
        long j2 = this.d;
        int i4 = (((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List<String> list = this.e;
        int i5 = 0;
        int hashCode = (i4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.f;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.g;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Intent> list3 = this.h;
        if (list3 != null) {
            i5 = list3.hashCode();
        }
        return hashCode3 ^ i5;
    }

    @Override // defpackage.dame
    public final List<Intent> i() {
        return this.h;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.i;
        long j = this.c;
        long j2 = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
