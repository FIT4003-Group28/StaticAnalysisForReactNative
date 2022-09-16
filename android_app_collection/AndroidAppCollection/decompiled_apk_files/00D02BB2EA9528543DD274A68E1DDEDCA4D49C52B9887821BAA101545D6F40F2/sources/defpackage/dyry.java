package defpackage;

import java.util.Collection;
import java.util.HashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyry  reason: default package */
/* loaded from: classes6.dex */
public final class dyry {
    final Object a = new Object();
    Collection<dyls> b = new HashSet();
    dyjb c;
    final /* synthetic */ dyrz d;

    public dyry(dyrz dyrzVar) {
        this.d = dyrzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(dyjb dyjbVar) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = dyjbVar;
            boolean isEmpty = this.b.isEmpty();
            if (!isEmpty) {
                return;
            }
            this.d.y.e(dyjbVar);
        }
    }
}
