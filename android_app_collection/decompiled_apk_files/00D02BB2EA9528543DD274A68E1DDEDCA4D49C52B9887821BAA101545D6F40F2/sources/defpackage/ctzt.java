package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctzt  reason: default package */
/* loaded from: classes5.dex */
public final class ctzt extends ctzz {
    static final ctzt a = new ctzt();

    private ctzt() {
    }

    @Override // defpackage.ctzc
    public final ctzd a() {
        return ctzd.NO_OP_ACTION;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "ActionPayload{noOpAction}";
    }
}
