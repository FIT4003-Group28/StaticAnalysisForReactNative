package defpackage;
/* compiled from: PG */
/* renamed from: amim  reason: default package */
/* loaded from: classes.dex */
public final class amim {
    public final amki a;

    public amim(amki amkiVar) {
        this.a = amkiVar;
    }

    public final String a() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof amim) && this.a.b.equals(((amim) obj).a.b);
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }

    public final String toString() {
        return String.format("SyncKey[name=%s]", a());
    }
}
