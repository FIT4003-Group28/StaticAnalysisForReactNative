package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: cstf  reason: default package */
/* loaded from: classes5.dex */
public final class cstf {
    public static cstf a;
    private final Map<Integer, String> b;

    public cstf(Map<Integer, String> map) {
        this.b = map;
    }

    public static cstf a() {
        cstf cstfVar = a;
        if (cstfVar != null) {
            return cstfVar;
        }
        cstl.a("IntentHelper");
        throw new IllegalArgumentException("No instance available, please call initialize first.");
    }

    public final String b(int i) {
        return this.b.get(Integer.valueOf(i));
    }
}
