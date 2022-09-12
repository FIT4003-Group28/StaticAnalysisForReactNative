package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: codl  reason: default package */
/* loaded from: classes5.dex */
public final class codl implements Callable<Long> {
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ String b;
    final /* synthetic */ Long c;

    public codl(SharedPreferences sharedPreferences, String str, Long l) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Long call() {
        return Long.valueOf(this.a.getLong(this.b, this.c.longValue()));
    }
}
