package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: aimc  reason: default package */
/* loaded from: classes.dex */
public final class aimc {
    private final Pair a;

    public aimc(ankt anktVar, ampq ampqVar) {
        this.a = Pair.create(anktVar, ampqVar);
    }

    public final ampq a() {
        return (ampq) this.a.second;
    }

    public final ankt b() {
        return (ankt) this.a.first;
    }
}
