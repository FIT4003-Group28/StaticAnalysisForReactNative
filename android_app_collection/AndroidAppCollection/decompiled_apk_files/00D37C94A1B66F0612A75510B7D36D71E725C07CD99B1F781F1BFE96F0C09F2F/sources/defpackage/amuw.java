package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amuw  reason: default package */
/* loaded from: classes.dex */
final class amuw implements Serializable {
    private static final long serialVersionUID = 0;
    final amup a;

    public amuw(amup amupVar) {
        this.a = amupVar;
    }

    Object readResolve() {
        return this.a.values();
    }
}
