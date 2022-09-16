package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Set;
/* compiled from: PG */
/* renamed from: akve  reason: default package */
/* loaded from: classes.dex */
public final class akve implements azqb {
    private final /* synthetic */ int a;

    public akve() {
    }

    public akve(int i) {
        this.a = i;
    }

    public static final Set a() {
        Set set = whp.b;
        if (set != null) {
            return set;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.a == 0) {
            return ThreadLocalRandom.current();
        }
        return a();
    }
}
