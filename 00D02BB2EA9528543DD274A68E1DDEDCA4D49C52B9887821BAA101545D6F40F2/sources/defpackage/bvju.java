package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: bvju  reason: default package */
/* loaded from: classes.dex */
public final class bvju {
    private final afec a;
    private final Context b;
    private final dbuv<String, SharedPreferences> c = dbuo.a().d(new bvjt());

    public bvju(afec afecVar, Context context) {
        this.a = afecVar;
        this.b = context;
    }

    public final SharedPreferences a(String str) {
        if (!this.a.a()) {
            return this.b.getSharedPreferences(str, 0);
        }
        try {
            return this.c.f(str);
        } catch (ExecutionException e) {
            throw new RuntimeException("Exception fetching in-memory SharedPreferences object", e);
        }
    }
}
