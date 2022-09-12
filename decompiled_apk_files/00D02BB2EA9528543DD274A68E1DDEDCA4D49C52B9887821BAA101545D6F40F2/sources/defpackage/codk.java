package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: codk  reason: default package */
/* loaded from: classes5.dex */
public final class codk implements Callable<Integer> {
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ String b;
    final /* synthetic */ Integer c;

    public codk(SharedPreferences sharedPreferences, String str, Integer num) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Integer call() {
        return Integer.valueOf(this.a.getInt(this.b, this.c.intValue()));
    }
}
