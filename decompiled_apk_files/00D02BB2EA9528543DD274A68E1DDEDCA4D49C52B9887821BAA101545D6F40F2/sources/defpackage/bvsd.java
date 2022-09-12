package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bvsd  reason: default package */
/* loaded from: classes4.dex */
final class bvsd {
    public final int a;
    public final Intent b;

    public bvsd(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof bvsd) {
            bvsd bvsdVar = (bvsd) obj;
            if (this.a == bvsdVar.a && this.b.filterEquals(bvsdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.filterHashCode() * 37) + this.a;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("capabilityId", this.a);
        b.b("intent", this.b);
        return b.toString();
    }
}
