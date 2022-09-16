package defpackage;
/* compiled from: PG */
/* renamed from: axqa  reason: default package */
/* loaded from: classes2.dex */
public final class axqa implements axpz {
    public static final vdg a;
    public static final vdg b;
    public static final vdg c;

    static {
        vdl f = new vdl("com.google.android.libraries.notifications").f();
        a = f.d("ChimeBroadcastReceiverFeature__enable_broadcast_receiver_timeout", false);
        b = f.d("ChimeBroadcastReceiverFeature__enable_check_process_start_for_timeout", false);
        c = f.b("ChimeBroadcastReceiverFeature__process_start_threshold_ms", 5000L);
    }

    @Override // defpackage.axpz
    public final long a() {
        return ((Long) c.get()).longValue();
    }

    @Override // defpackage.axpz
    public final boolean b() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.axpz
    public final boolean c() {
        return ((Boolean) b.get()).booleanValue();
    }
}
