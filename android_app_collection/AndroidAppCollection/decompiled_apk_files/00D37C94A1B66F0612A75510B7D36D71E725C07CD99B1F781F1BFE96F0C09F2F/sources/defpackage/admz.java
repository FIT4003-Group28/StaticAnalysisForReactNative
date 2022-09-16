package defpackage;
/* compiled from: PG */
/* renamed from: admz  reason: default package */
/* loaded from: classes.dex */
public final class admz {
    private adit a;

    public final adna a() {
        adit aditVar = this.a;
        if (aditVar == null) {
            throw new IllegalStateException("Missing required properties: hardwareDeviceId");
        }
        return new adna(aditVar);
    }

    public final void b(adit aditVar) {
        if (aditVar != null) {
            this.a = aditVar;
            return;
        }
        throw new NullPointerException("Null hardwareDeviceId");
    }
}
