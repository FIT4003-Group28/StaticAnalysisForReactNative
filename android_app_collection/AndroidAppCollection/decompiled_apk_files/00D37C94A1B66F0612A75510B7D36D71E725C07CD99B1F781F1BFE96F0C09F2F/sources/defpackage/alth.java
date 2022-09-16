package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: alth  reason: default package */
/* loaded from: classes.dex */
public final class alth extends Enum implements altc {
    public static final alth a;
    private static final AtomicReference b;
    private static final /* synthetic */ alth[] c;

    static {
        alth althVar = new alth();
        a = althVar;
        c = new alth[]{althVar};
        b = new AtomicReference(null);
    }

    private alth() {
    }

    public static alth[] values() {
        return (alth[]) c.clone();
    }

    @Override // defpackage.altc
    public final altd a() {
        return (altd) b.get();
    }
}
