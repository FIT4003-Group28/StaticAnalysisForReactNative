package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: daky  reason: default package */
/* loaded from: classes5.dex */
public final class daky extends Enum<daky> implements dakr {
    public static final daky a;
    public static final AtomicReference<daks> b;
    private static final /* synthetic */ daky[] c;

    static {
        daky dakyVar = new daky();
        a = dakyVar;
        c = new daky[]{dakyVar};
        b = new AtomicReference<>(null);
    }

    private daky() {
    }

    public static daky[] values() {
        return (daky[]) c.clone();
    }

    @Override // defpackage.dakr
    public final daks a() {
        return b.get();
    }
}
