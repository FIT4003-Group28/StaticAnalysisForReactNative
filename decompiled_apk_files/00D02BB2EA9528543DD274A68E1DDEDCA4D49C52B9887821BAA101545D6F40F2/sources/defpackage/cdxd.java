package defpackage;
/* compiled from: PG */
/* renamed from: cdxd  reason: default package */
/* loaded from: classes4.dex */
abstract class cdxd {
    static {
        new cduj(new cduo(cdwq.b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cdxd e(cdxe cdxeVar) {
        cdxeVar.getClass();
        return new cduk(cdxeVar);
    }

    public abstract cdwx a();

    public abstract cdxc b();

    public abstract cdxe c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long d() {
        int hashCode;
        cdxc cdxcVar = cdxc.MEDIA;
        int ordinal = b().ordinal();
        if (ordinal == 0) {
            hashCode = c().c().hashCode();
        } else if (ordinal != 1) {
            return 0L;
        } else {
            hashCode = a().hashCode();
        }
        return hashCode;
    }
}
