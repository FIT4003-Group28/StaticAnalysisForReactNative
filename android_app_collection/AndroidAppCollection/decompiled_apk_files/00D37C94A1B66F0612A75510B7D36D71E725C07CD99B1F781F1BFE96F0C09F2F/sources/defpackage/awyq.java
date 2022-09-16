package defpackage;
/* compiled from: PG */
/* renamed from: awyq  reason: default package */
/* loaded from: classes2.dex */
public enum awyq {
    BAD_URL(false),
    CANCELED(false),
    REQUEST_BODY_READ_ERROR(false),
    CONNECTION_ERROR(true),
    SERVER_ERROR(true),
    UNKNOWN(false);
    
    public final boolean g;

    awyq(boolean z) {
        this.g = z;
    }
}
