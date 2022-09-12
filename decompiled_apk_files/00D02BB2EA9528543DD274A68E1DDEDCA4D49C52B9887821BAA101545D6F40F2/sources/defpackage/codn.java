package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: codn  reason: default package */
/* loaded from: classes5.dex */
public final class codn implements Callable<SharedPreferences> {
    final /* synthetic */ Context a;

    public codn(Context context) {
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ SharedPreferences call() {
        return this.a.getSharedPreferences("google_sdk_flags", 0);
    }
}
