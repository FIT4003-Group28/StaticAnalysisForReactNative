package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: rbx  reason: default package */
/* loaded from: classes4.dex */
public final class rbx implements Callable {
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public rbx(SharedPreferences sharedPreferences, String str, String str2) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.a.getString(this.b, this.c);
    }
}
