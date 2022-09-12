package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqu  reason: default package */
/* loaded from: classes2.dex */
public class aqu extends aqx {
    public final Object i = new Object();
    Executor j;
    aqn k;
    Collection<aqt> l;
    arh m;

    public final void k(aqn aqnVar, Collection<aqt> collection) {
        if (aqnVar != null) {
            synchronized (this.i) {
                Executor executor = this.j;
                if (executor != null) {
                    executor.execute(new aqr(this, this.m, aqnVar, collection));
                } else {
                    this.k = aqnVar;
                    this.l = new ArrayList(collection);
                }
            }
            return;
        }
        throw new NullPointerException("groupRoute must not be null");
    }
}
