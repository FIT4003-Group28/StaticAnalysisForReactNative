package defpackage;
/* compiled from: PG */
/* renamed from: ajzp  reason: default package */
/* loaded from: classes2.dex */
public abstract class ajzp {
    private final boolean f(String str) {
        return b().getOrDefault(str, false).booleanValue();
    }

    public abstract ajzo a();

    public abstract dcdn<String, Boolean> b();

    public final boolean c() {
        return f("android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    public final boolean d() {
        return f("android.permission.ACCESS_FINE_LOCATION");
    }

    public final boolean e() {
        return f("android.permission.ACTIVITY_RECOGNITION");
    }
}
