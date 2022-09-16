package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: amde  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class amde implements ampg {
    public final /* synthetic */ AtomicReference a;
    private final /* synthetic */ int b;

    public /* synthetic */ amde(AtomicReference atomicReference, int i) {
        this.b = i;
        this.a = atomicReference;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            Void r2 = (Void) obj;
            return this.a.get();
        }
        Void r22 = (Void) obj;
        return (List) this.a.get();
    }
}
