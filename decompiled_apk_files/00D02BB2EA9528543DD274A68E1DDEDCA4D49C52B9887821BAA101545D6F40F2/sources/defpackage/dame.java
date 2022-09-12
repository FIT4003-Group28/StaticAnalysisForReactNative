package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: dame  reason: default package */
/* loaded from: classes5.dex */
public abstract class dame {
    public static dame j(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2) {
        return new dakn(i, i2, i3, j, j2, list, list2, null, null);
    }

    public static dame k(Bundle bundle) {
        return new dakn(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract long d();

    public abstract long e();

    public abstract List<String> f();

    public abstract List<String> g();

    @Deprecated
    public abstract PendingIntent h();

    public abstract List<Intent> i();
}
