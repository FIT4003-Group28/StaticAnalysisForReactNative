package defpackage;
/* compiled from: PG */
/* renamed from: ayaw  reason: default package */
/* loaded from: classes2.dex */
public enum ayaw {
    UNARY,
    CLIENT_STREAMING,
    SERVER_STREAMING,
    BIDI_STREAMING,
    UNKNOWN;

    public final boolean a() {
        return this == UNARY || this == SERVER_STREAMING;
    }
}
