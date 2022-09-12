package com.google.geo.ar.arlo.api.exception;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ArloStatusException extends Exception {
    private final drtc a;

    public ArloStatusException(String str, int i) {
        super(str);
        this.a = (drtc) dbsc.a(drtc.b(i), drtc.UNKNOWN);
    }

    public int getCanonicalCodeInt() {
        return this.a.s;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String e = dbsj.e(super.getMessage());
        String name = this.a.name();
        StringBuilder sb = new StringBuilder(e.length() + 17 + String.valueOf(name).length());
        sb.append(e);
        sb.append(" {canonicalCode=");
        sb.append(name);
        sb.append("}");
        return sb.toString();
    }

    public ArloStatusException(Throwable th, drtc drtcVar) {
        super(th);
        this.a = drtcVar;
    }
}
