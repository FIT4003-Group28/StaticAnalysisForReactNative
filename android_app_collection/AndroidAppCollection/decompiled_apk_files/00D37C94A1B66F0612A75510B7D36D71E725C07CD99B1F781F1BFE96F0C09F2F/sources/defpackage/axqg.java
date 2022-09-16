package defpackage;
/* compiled from: PG */
/* renamed from: axqg  reason: default package */
/* loaded from: classes2.dex */
public final class axqg implements axqf {
    public static final vdg a;
    public static final vdg b;
    public static final vdg c;

    static {
        vdl f = new vdl("com.google.android.libraries.notifications").f();
        a = f.d("PeriodicWipeoutFeature__enabled", true);
        b = f.b("PeriodicWipeoutFeature__max_threads_in_storage", 0L);
        c = f.b("PeriodicWipeoutFeature__notifications_storage_duration", 2419200000L);
    }

    @Override // defpackage.axqf
    public final long a() {
        return ((Long) b.get()).longValue();
    }

    @Override // defpackage.axqf
    public final long b() {
        return ((Long) c.get()).longValue();
    }

    @Override // defpackage.axqf
    public final boolean c() {
        return ((Boolean) a.get()).booleanValue();
    }
}
