package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amuq  reason: default package */
/* loaded from: classes.dex */
final class amuq implements Serializable {
    private static final long serialVersionUID = 0;
    final amup a;

    public amuq(amup amupVar) {
        this.a = amupVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}
