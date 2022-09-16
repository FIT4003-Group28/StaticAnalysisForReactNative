package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: cles  reason: default package */
/* loaded from: classes5.dex */
public abstract class cles {
    public abstract String a();

    public abstract Integer b();

    public abstract cleq c();

    public abstract long d();

    public abstract long e();

    public abstract Map<String, String> f();

    public final int g(String str) {
        String str2 = f().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final String h(String str) {
        String str2 = f().get(str);
        return str2 == null ? "" : str2;
    }
}
