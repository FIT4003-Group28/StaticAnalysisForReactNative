package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: alry  reason: default package */
/* loaded from: classes.dex */
public final class alry {
    protected final Set a = new HashSet();

    public final synchronized void a(Object obj) {
        for (alrx alrxVar : this.a) {
            alrxVar.i(obj);
        }
    }
}
