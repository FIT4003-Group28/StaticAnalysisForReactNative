package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: rby  reason: default package */
/* loaded from: classes4.dex */
public final class rby implements Callable {
    final /* synthetic */ Context a;

    public rby(Context context) {
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.a.getSharedPreferences("google_sdk_flags", 0);
    }
}
