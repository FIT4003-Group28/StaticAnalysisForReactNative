package defpackage;
/* compiled from: PG */
/* renamed from: ddid  reason: default package */
/* loaded from: classes5.dex */
public enum ddid implements dsrb {
    UNDEFINED_REASON(0),
    UNKNOWN_REASON(1),
    NO_FALLBACK_GH_CAR_USED(2),
    GH_NOT_INSTALLED(3),
    GH_MIN_VERSION_INVALID(4),
    GH_STARTUP_SERVICE_NOT_FOUND(5),
    CLIENT_BIND_PERMISSION_INVALID(6),
    GH_STARTUP_SERVICE_NULL_BINDING(7),
    GH_STARTUP_SERVICE_REMOTE_EXCEPTION(8),
    GH_STARTUP_SERVICE_SECURITY_EXCEPTION(9),
    GH_MIGRATION_DISABLED(10),
    CLIENT_TRANSITIONAL_TOKEN_DISABLED(11),
    GH_STARTUP_SERVICE_ILLEGAL_STATE_EXCEPTION(12),
    GH_STARTUP_SERVICE_NULL_CAR_SERVICE(13);
    
    public final int o;

    ddid(int i) {
        this.o = i;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
