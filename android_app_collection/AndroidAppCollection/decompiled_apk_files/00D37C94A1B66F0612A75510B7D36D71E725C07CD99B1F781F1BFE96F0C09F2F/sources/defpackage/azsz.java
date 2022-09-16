package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azsz  reason: default package */
/* loaded from: classes2.dex */
final class azsz implements Serializable {
    public static final azsz a = new azsz();
    private static final long serialVersionUID = 0;

    private azsz() {
    }

    private final Object readResolve() {
        return aztb.c;
    }
}
