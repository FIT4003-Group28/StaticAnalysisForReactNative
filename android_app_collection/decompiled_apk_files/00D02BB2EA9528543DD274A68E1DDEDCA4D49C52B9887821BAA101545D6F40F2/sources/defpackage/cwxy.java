package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cwxy  reason: default package */
/* loaded from: classes5.dex */
final class cwxy extends cwyi {
    public final String a;
    public final Activity b;

    public cwxy(@dzsi String str, @dzsi Activity activity) {
        this.a = str;
        this.b = activity;
    }

    @Override // defpackage.cwyi
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cwyi
    @dzsi
    public final Activity b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwyi) {
            cwyi cwyiVar = (cwyi) obj;
            String str = this.a;
            if (str != null ? str.equals(cwyiVar.a()) : cwyiVar.a() == null) {
                Activity activity = this.b;
                if (activity != null ? activity.equals(cwyiVar.b()) : cwyiVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        Activity activity = this.b;
        if (activity != null) {
            i = activity.hashCode();
        }
        return hashCode ^ i;
    }
}
