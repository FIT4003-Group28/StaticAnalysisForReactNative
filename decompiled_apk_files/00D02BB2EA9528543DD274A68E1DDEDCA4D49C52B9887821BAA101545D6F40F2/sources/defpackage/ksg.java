package defpackage;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ksg  reason: default package */
/* loaded from: classes7.dex */
public final class ksg extends ksv {
    private final Intent a;
    private final long b;
    private final dbsg<kpt> c;

    public ksg(Intent intent, long j, dbsg<kpt> dbsgVar) {
        this.a = intent;
        this.b = j;
        this.c = dbsgVar;
    }

    @Override // defpackage.ksv
    public final Intent a() {
        return this.a;
    }

    @Override // defpackage.ksv
    public final long b() {
        return this.b;
    }

    @Override // defpackage.ksv
    public final dbsg<kpt> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksv) {
            ksv ksvVar = (ksv) obj;
            if (this.a.equals(ksvVar.a()) && this.b == ksvVar.b() && this.c.equals(ksvVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(valueOf2).length());
        sb.append("IntentDetails{intent=");
        sb.append(valueOf);
        sb.append(", timestampMs=");
        sb.append(j);
        sb.append(", droppedReason=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
