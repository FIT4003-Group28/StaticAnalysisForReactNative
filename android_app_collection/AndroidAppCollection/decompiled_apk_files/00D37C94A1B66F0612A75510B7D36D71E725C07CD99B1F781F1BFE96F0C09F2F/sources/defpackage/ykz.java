package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: ykz  reason: default package */
/* loaded from: classes4.dex */
public final class ykz {
    public final List a = new CopyOnWriteArrayList();

    public final Runnable a(Runnable runnable) {
        if (!this.a.isEmpty()) {
            for (ylo yloVar : this.a) {
                runnable = yloVar.a(runnable);
            }
        }
        return runnable;
    }
}
