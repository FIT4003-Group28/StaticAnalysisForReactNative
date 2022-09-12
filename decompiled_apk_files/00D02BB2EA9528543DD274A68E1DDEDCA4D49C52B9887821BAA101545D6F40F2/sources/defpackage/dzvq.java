package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzvq  reason: default package */
/* loaded from: classes6.dex */
final class dzvq implements Serializable {
    public static final dzvq a = new dzvq();

    private dzvq() {
    }

    private Object readResolve() {
        return a;
    }
}
