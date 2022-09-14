package defpackage;
/* compiled from: PG */
/* renamed from: dyhz  reason: default package */
/* loaded from: classes6.dex */
public enum dyhz {
    UNARY,
    CLIENT_STREAMING,
    SERVER_STREAMING,
    BIDI_STREAMING,
    UNKNOWN;

    public final boolean a() {
        return this == UNARY || this == SERVER_STREAMING;
    }
}
