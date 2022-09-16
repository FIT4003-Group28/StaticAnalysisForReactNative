package defpackage;

import io.grpc.Status;
import java.util.Collection;
import java.util.HashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayjh  reason: default package */
/* loaded from: classes2.dex */
public final class ayjh {
    final Object a = new Object();
    Collection b = new HashSet();
    Status c;
    final /* synthetic */ ayji d;

    public ayjh(ayji ayjiVar) {
        this.d = ayjiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Status status) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = status;
            boolean isEmpty = this.b.isEmpty();
            if (!isEmpty) {
                return;
            }
            this.d.y.j(status);
        }
    }
}
