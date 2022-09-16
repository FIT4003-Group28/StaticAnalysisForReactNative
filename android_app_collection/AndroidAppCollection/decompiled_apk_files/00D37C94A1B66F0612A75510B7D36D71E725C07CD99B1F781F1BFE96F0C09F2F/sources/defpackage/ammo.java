package defpackage;

import android.content.Intent;
import android.os.BadParcelableException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ammo  reason: default package */
/* loaded from: classes.dex */
public final class ammo {
    static final Map a;
    public static final /* synthetic */ int b = 0;

    static {
        Math.abs(new Random().nextInt());
        a = new HashMap();
    }

    public static ampg a(ampg ampgVar) {
        return new ammm(amna.c(), ampgVar);
    }

    public static aniq b(aniq aniqVar) {
        aniqVar.getClass();
        return new amml(amna.c(), aniqVar);
    }

    public static anir c(anir anirVar) {
        return new ammn(amna.c(), anirVar);
    }

    public static aniz d(final aniz anizVar) {
        final amlv c = amna.c();
        return new aniz() { // from class: ammh
            @Override // defpackage.aniz
            public final anjd a(anjb anjbVar, Object obj) {
                amlv amlvVar = amlv.this;
                aniz anizVar2 = anizVar;
                int i = ammo.b;
                amlv e = amna.e(amlvVar);
                try {
                    return anizVar2.a(anjbVar, obj);
                } finally {
                    amna.e(e);
                }
            }
        };
    }

    public static ankb e(ankb ankbVar) {
        return new ammj(amna.c(), ankbVar);
    }

    public static Runnable f(Runnable runnable) {
        return new ammi(amna.c(), runnable);
    }

    public static Callable g(Callable callable) {
        return new ammk(amna.c(), callable);
    }

    public static amlv h(Intent intent) {
        amlv amlvVar;
        try {
            if (!intent.hasExtra("tracing_intent_id")) {
                return null;
            }
            long longExtra = intent.getLongExtra("tracing_intent_id", -1L);
            Map map = a;
            synchronized (map) {
                amlvVar = (amlv) map.remove(Long.valueOf(longExtra));
            }
            return amlvVar;
        } catch (BadParcelableException unused) {
            return null;
        }
    }
}
