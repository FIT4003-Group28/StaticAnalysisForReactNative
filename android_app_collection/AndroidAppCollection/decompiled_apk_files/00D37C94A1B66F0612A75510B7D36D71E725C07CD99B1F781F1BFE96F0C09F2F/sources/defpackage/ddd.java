package defpackage;

import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: ddd  reason: default package */
/* loaded from: classes3.dex */
public final class ddd {
    private static ddd a;
    private final Configuration b;

    public ddd(Configuration configuration) {
        this.b = configuration;
        new agc(500);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized ddd a(Configuration configuration) {
        ddd dddVar;
        synchronized (ddd.class) {
            ddd dddVar2 = a;
            if (dddVar2 == null || !dddVar2.b.equals(configuration)) {
                a = new ddd(new Configuration(configuration));
            }
            dddVar = a;
        }
        return dddVar;
    }
}
