package defpackage;
/* compiled from: PG */
/* renamed from: ckmo  reason: default package */
/* loaded from: classes4.dex */
public enum ckmo {
    OK(drtc.OK),
    CANCELLED(drtc.CANCELLED),
    UNKNOWN(drtc.UNKNOWN),
    INVALID_ARGUMENT(drtc.INVALID_ARGUMENT),
    DEADLINE_EXCEEDED(drtc.DEADLINE_EXCEEDED),
    NOT_FOUND(drtc.NOT_FOUND),
    ALREADY_EXISTS(drtc.ALREADY_EXISTS),
    PERMISSION_DENIED(drtc.PERMISSION_DENIED),
    UNAUTHENTICATED(drtc.UNAUTHENTICATED),
    RESOURCE_EXHAUSTED(drtc.RESOURCE_EXHAUSTED),
    FAILED_PRECONDITION(drtc.FAILED_PRECONDITION),
    ABORTED(drtc.ABORTED),
    OUT_OF_RANGE(drtc.OUT_OF_RANGE),
    UNIMPLEMENTED(drtc.UNIMPLEMENTED),
    INTERNAL(drtc.INTERNAL),
    UNAVAILABLE(drtc.UNAVAILABLE),
    DATA_LOSS(drtc.DATA_LOSS);
    
    final drtc r;

    ckmo(drtc drtcVar) {
        this.r = drtcVar;
    }
}
