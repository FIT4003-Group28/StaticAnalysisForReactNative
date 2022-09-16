package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: uwy  reason: default package */
/* loaded from: classes4.dex */
public final class uwy {
    private final utb a;

    public uwy() {
    }

    public uwy(utb utbVar) {
        this.a = utbVar;
    }

    public static uwy a(Activity activity) {
        return new uwy(new utb(activity.getClass().getName()));
    }

    public final String b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uwy) && b().equals(((uwy) obj).b());
    }

    public final int hashCode() {
        return (b().hashCode() * 31) ^ 1231;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder("null".length() + 70 + String.valueOf(valueOf).length());
        sb.append("MeasurementKey{rawStringEventName=null, noPiiEventName=");
        sb.append(valueOf);
        sb.append(", isActivity=true}");
        return sb.toString();
    }
}
