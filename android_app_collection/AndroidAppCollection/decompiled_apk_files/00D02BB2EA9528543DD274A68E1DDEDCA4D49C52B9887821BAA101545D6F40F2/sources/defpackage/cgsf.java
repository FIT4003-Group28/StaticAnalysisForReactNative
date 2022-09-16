package defpackage;
/* compiled from: PG */
/* renamed from: cgsf  reason: default package */
/* loaded from: classes4.dex */
public enum cgsf {
    QUEUED,
    SENT,
    COMPLETED,
    SERVER_ERROR,
    CLIENT_ERROR,
    NOT_TRACKED;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this == COMPLETED || this == NOT_TRACKED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this == QUEUED || this == SERVER_ERROR;
    }

    public final boolean c() {
        return this == SERVER_ERROR || this == CLIENT_ERROR;
    }
}
