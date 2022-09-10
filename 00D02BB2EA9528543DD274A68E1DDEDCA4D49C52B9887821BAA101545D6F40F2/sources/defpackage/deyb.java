package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: deyb  reason: default package */
/* loaded from: classes6.dex */
final class deyb extends deye<dylu> {
    public final boolean a;
    @dzsi
    private dyjb k;
    @dzsi
    private dyhw l;

    public deyb(dexw dexwVar, dyel dyelVar, int i, boolean z) {
        super(dexwVar, dyelVar, i);
        this.a = z;
    }

    @Override // defpackage.deye
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.deye
    public final void b(int i, Parcel parcel) {
        this.k = dezb.b(i, parcel);
        this.l = deyn.b(parcel, this.c);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [dylu, L extends dyvl] */
    @Override // defpackage.deye
    protected final void c() {
        this.f.f();
        this.f.m();
        h(deyc.CLOSED);
        this.g.e(this.k, dylt.PROCESSED, this.l);
        g();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dylu, L extends dyvl] */
    @Override // defpackage.deye
    protected final void d(dyjb dyjbVar) {
        deyc deycVar = deyc.UNINITIALIZED;
        int ordinal = this.j.ordinal();
        this.g.e(dyjbVar, ((ordinal == 0 || ordinal == 1) && !this.i && this.h == null) ? dylt.DROPPED : dylt.PROCESSED, deyn.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [dylu, L extends dyvl] */
    @Override // defpackage.deye
    public final void e(Parcel parcel) {
        dyhw b = deyn.b(parcel, this.c);
        this.f.c();
        this.g.b(b);
    }
}
