package defpackage;
/* compiled from: PG */
/* renamed from: crxr  reason: default package */
/* loaded from: classes5.dex */
public final class crxr extends Exception {
    public final crtx a;
    @dzsi
    public final dgpm b;
    @dzsi
    public final dgpw c;
    public final boolean d;

    @Deprecated
    public crxr(crtx crtxVar) {
        this(crtxVar, null, null);
    }

    public static boolean b(dgpm dgpmVar) {
        dgpm dgpmVar2 = dgpm.UNKNOWN_EXCEPTION;
        dgpw dgpwVar = dgpw.OK;
        int ordinal = dgpmVar.ordinal();
        if (ordinal != 16) {
            switch (ordinal) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    return true;
                default:
                    return false;
            }
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("Status", this.a);
        b.b("ClientException", this.b);
        b.b("ServerStatus", this.c);
        return b.toString();
    }

    public crxr(crtx crtxVar, @dzsi dgpm dgpmVar) {
        this(crtxVar, dgpmVar, null);
    }

    public crxr(crtx crtxVar, @dzsi dgpm dgpmVar, @dzsi dgpw dgpwVar) {
        this(crtxVar, dgpmVar, dgpwVar, false);
    }

    public crxr(crtx crtxVar, @dzsi dgpm dgpmVar, @dzsi dgpw dgpwVar, boolean z) {
        this.a = crtxVar;
        this.b = dgpmVar;
        this.c = dgpwVar;
        this.d = z;
    }

    public crxr(crtx crtxVar, @dzsi dgpw dgpwVar) {
        this(crtxVar, null, dgpwVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public crxr(defpackage.dgpm r4) {
        /*
            r3 = this;
            boolean r0 = b(r4)
            if (r0 == 0) goto L9
            crtx r0 = defpackage.crtx.TRANSIENT_ERROR
            goto Lb
        L9:
            crtx r0 = defpackage.crtx.FAILED
        Lb:
            r1 = 0
            r2 = 0
            r3.<init>(r0, r4, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crxr.<init>(dgpm):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public crxr(defpackage.dgpm r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = b(r3)
            if (r0 == 0) goto L9
            crtx r0 = defpackage.crtx.TRANSIENT_ERROR
            goto Lb
        L9:
            crtx r0 = defpackage.crtx.FAILED
        Lb:
            r1 = 0
            r2.<init>(r0, r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crxr.<init>(dgpm, boolean):void");
    }

    public final cruc a() {
        dgpw dgpwVar = this.c;
        if (dgpwVar != null && dgpwVar != dgpw.OK) {
            dgpw dgpwVar2 = this.c;
            crtx crtxVar = this.a;
            dgpm dgpmVar = dgpm.UNKNOWN_EXCEPTION;
            if (dgpwVar2.ordinal() == 34) {
                return cruc.PERMANENT_PS_DUPLICATE_PHOTO;
            }
            if (crtxVar == crtx.TRANSIENT_ERROR) {
                return cruc.TRANSIENT_SERVER_GENERIC_ERROR;
            }
            return cruc.PERMANENT_SERVER_GENERIC_ERROR;
        }
        dgpm dgpmVar2 = this.b;
        if (dgpmVar2 != null) {
            dgpw dgpwVar3 = dgpw.OK;
            switch (dgpmVar2.ordinal()) {
                case 0:
                    return cruc.PERMANENT_UNKNOWN;
                case 1:
                case 12:
                    return cruc.PERMANENT_AUTHENTICATION_FAILURE;
                case 2:
                    return cruc.PERMANENT_INVALID_ARGUMENTS;
                case 3:
                case 13:
                    return cruc.PERMANENT_FILE_ACCESS_EXCEPTION;
                case 4:
                case 5:
                case 8:
                case 9:
                case 10:
                    return cruc.TRANSIENT_CONNECTION_FAILURE;
                case 6:
                case 7:
                    return cruc.TRANSIENT_INVALID_SERVER_RESPONSE;
                case 11:
                    return cruc.RECOVERABLE_AUTHENTICATION_FAILURE;
                case 14:
                    return cruc.PERMANENT_REQUEST_INITIALIZATION_IO_EXCEPTION;
                case 15:
                    return cruc.RECOVERABLE_FILE_ACCESS_PERMISSION_EXCEPTION;
                case 16:
                    return cruc.TRANSIENT_TEMP_FILE_ACCESS_EXCEPTION;
                case 17:
                    return cruc.PERMANENT_REQUEST_EXPIRED;
                default:
                    return cruc.PERMANENT_CLIENT_GENERIC_ERROR;
            }
        }
        return cruc.PERMANENT_UNKNOWN;
    }
}
