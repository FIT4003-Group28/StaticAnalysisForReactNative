package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: codm  reason: default package */
/* loaded from: classes5.dex */
public final class codm implements Callable<String> {
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public codm(SharedPreferences sharedPreferences, String str, String str2) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() {
        return this.a.getString(this.b, this.c);
    }
}
