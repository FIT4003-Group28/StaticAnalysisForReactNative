package defpackage;

import android.os.Parcel;
import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ayco  reason: default package */
/* loaded from: classes2.dex */
final class ayco extends aycr {
    public final boolean a;
    private Status h;
    private ayat i;

    public ayco(aycl ayclVar, axyb axybVar, int i, boolean z) {
        super(ayclVar, axybVar, i);
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aymn, ayeq] */
    @Override // defpackage.aycr
    protected final void a(Status status) {
        this.g.a(status, ayep.PROCESSED, new ayat());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aymn, ayeq] */
    @Override // defpackage.aycr
    protected final void b() {
        this.f.b(this.i);
        this.f.l(this.h);
        l(aycp.CLOSED);
        this.g.a(this.h, ayep.PROCESSED, this.i);
        n();
    }

    @Override // defpackage.aycr
    public final void c(int i, Parcel parcel) {
        this.h = azqn.i(i, parcel);
        this.i = azqj.r(parcel, this.c);
    }

    @Override // defpackage.aycr
    public final boolean d() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aymn, ayeq] */
    @Override // defpackage.aycr
    public final void e(Parcel parcel) {
        ayat r = azqj.r(parcel, this.c);
        this.f.a();
        this.g.c(r);
    }
}
