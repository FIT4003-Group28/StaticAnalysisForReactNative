package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: rbu  reason: default package */
/* loaded from: classes4.dex */
public final class rbu implements Callable {
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ String b;
    final /* synthetic */ Boolean c;

    public rbu(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return Boolean.valueOf(this.a.getBoolean(this.b, this.c.booleanValue()));
    }
}
