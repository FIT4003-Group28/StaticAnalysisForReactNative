package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dqe  reason: default package */
/* loaded from: classes3.dex */
public final class dqe extends dqs {
    private final Callable a;

    public dqe(Callable callable) {
        super("internal.appMetadata");
        this.a = callable;
    }

    @Override // defpackage.dqs
    public final dqz a(dpu dpuVar, List list) {
        try {
            return dqt.d(this.a.call());
        } catch (Exception unused) {
            return dqz.f;
        }
    }
}
