package defpackage;
/* compiled from: PG */
/* renamed from: ckfx  reason: default package */
/* loaded from: classes4.dex */
public enum ckfx {
    SUCCESS(0),
    NO_LOCATION(1),
    POOR_QUALITY_LOCATION(2),
    INVALID_NOTIFICATION_PAYLOAD(3),
    NOT_LOGGED_IN(4),
    SYSTEM_LOCATION_DISABLED(5),
    LOCATION_PERMISSION_REFUSED(6),
    SERVICE_NOT_LOGGED_IN(7),
    CLIENT_PARAMETER_DISABLED(8),
    UPLOAD_FAILED(9),
    CONNECTIVITY_DISABLED(10);
    
    public final int l;

    ckfx(int i) {
        this.l = i;
    }
}
