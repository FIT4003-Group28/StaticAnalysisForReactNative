package defpackage;
/* compiled from: PG */
/* renamed from: axqp  reason: default package */
/* loaded from: classes2.dex */
public final class axqp implements axqo {
    public static final vdg a;
    public static final vdg b;

    static {
        vdl f = new vdl("com.google.android.libraries.notifications").f();
        try {
            a = f.e("SyncFeature__disable_fetch_latest_threads_by_reason", (uik) aopi.parseFrom(uik.b, new byte[0]), vdh.g);
            try {
                f.e("SyncFeature__disable_fetch_threads_by_id_by_reason", (uik) aopi.parseFrom(uik.b, new byte[0]), vdh.g);
                try {
                    b = f.e("SyncFeature__disable_fetch_updated_threads_by_reason", (uik) aopi.parseFrom(uik.b, new byte[0]), vdh.g);
                } catch (aopx unused) {
                    throw new AssertionError("Could not parse proto flag \"SyncFeature__disable_fetch_updated_threads_by_reason\"");
                }
            } catch (aopx unused2) {
                throw new AssertionError("Could not parse proto flag \"SyncFeature__disable_fetch_threads_by_id_by_reason\"");
            }
        } catch (aopx unused3) {
            throw new AssertionError("Could not parse proto flag \"SyncFeature__disable_fetch_latest_threads_by_reason\"");
        }
    }

    @Override // defpackage.axqo
    public final uik a() {
        return (uik) a.get();
    }

    @Override // defpackage.axqo
    public final uik b() {
        return (uik) b.get();
    }
}
