package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amus  reason: default package */
/* loaded from: classes.dex */
final class amus implements Serializable {
    private static final long serialVersionUID = 0;
    final amup a;

    public amus(amup amupVar) {
        this.a = amupVar;
    }

    Object readResolve() {
        return this.a.keySet();
    }
}
