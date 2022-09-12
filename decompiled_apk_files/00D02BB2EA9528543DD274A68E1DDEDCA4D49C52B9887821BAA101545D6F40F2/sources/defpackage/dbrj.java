package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dbrj  reason: default package */
/* loaded from: classes.dex */
public final class dbrj extends dbrl<Object> implements Serializable {
    public static final dbrj a = new dbrj();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.dbrl
    protected final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    @Override // defpackage.dbrl
    protected final boolean b(Object obj, Object obj2) {
        return false;
    }
}
