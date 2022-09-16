package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: gtn  reason: default package */
/* loaded from: classes3.dex */
public enum gtn {
    PUSH,
    POP;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Optional a(int i) {
        if (i < 0 || i >= values().length) {
            return Optional.empty();
        }
        return Optional.of(values()[i]);
    }
}
