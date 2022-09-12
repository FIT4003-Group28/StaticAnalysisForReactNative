package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dbri  reason: default package */
/* loaded from: classes.dex */
public final class dbri extends dbrl<Object> implements Serializable {
    public static final dbri a = new dbri();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.dbrl
    protected final int a(Object obj) {
        return obj.hashCode();
    }

    @Override // defpackage.dbrl
    protected final boolean b(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
