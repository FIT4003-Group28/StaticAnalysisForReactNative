package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: znw  reason: default package */
/* loaded from: classes7.dex */
public class znw implements zbv {
    public final vno a;
    public final vmh b;
    public final zie c;
    public final boolean d;
    @dzsi
    public final amub e;
    @dzsi
    public final zbs f;
    @dzsi
    public final zjz g;
    @dzsi
    public final zqj h;
    @dzsi
    public final zla i;
    @dzsi
    public final zkz j;
    @dzsi
    public final znz k;
    private final zce l;
    private final vnu m;
    @dzsi
    private final bwob n;

    public znw(vno vnoVar, vmh vmhVar, zie zieVar, zce zceVar, boolean z, vnu vnuVar, @dzsi amub amubVar, @dzsi zbs zbsVar, @dzsi bwob bwobVar, @dzsi zqj zqjVar, @dzsi zjz zjzVar, @dzsi znz znzVar, @dzsi zla zlaVar, @dzsi zkz zkzVar) {
        this.a = vnoVar;
        this.b = vmhVar;
        this.c = zieVar;
        this.l = zceVar;
        this.d = z;
        this.m = vnuVar;
        this.e = amubVar;
        this.f = zbsVar;
        this.n = bwobVar;
        this.h = zqjVar;
        this.g = zjzVar;
        this.k = znzVar;
        this.i = zlaVar;
        this.j = zkzVar;
    }

    @Override // defpackage.zbv
    public Boolean a() {
        boolean z = true;
        if (!b().booleanValue() && !c().booleanValue() && !d().booleanValue() && !e().booleanValue() && !f().booleanValue() && !g().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbv
    public Boolean b() {
        return Boolean.valueOf(this.n != null);
    }

    @Override // defpackage.zbv
    public Boolean c() {
        return Boolean.valueOf(this.g != null);
    }

    @Override // defpackage.zbv
    public Boolean d() {
        return Boolean.valueOf(this.h != null);
    }

    @Override // defpackage.zbv
    public Boolean e() {
        return Boolean.valueOf(this.k != null);
    }

    @Override // defpackage.zbv
    public Boolean f() {
        return Boolean.valueOf(this.i != null);
    }

    @Override // defpackage.zbv
    public Boolean g() {
        return Boolean.valueOf(this.j != null);
    }

    @Override // defpackage.zbv
    @dzsi
    public bwob h() {
        return this.n;
    }

    @Override // defpackage.zbv
    @dzsi
    public zbz i() {
        return this.g;
    }

    @Override // defpackage.zbv
    @dzsi
    public zfm j() {
        return this.h;
    }

    @Override // defpackage.zbv
    @dzsi
    public amub n() {
        return this.e;
    }

    @Override // defpackage.zbv
    public zce o() {
        return this.l;
    }

    @Override // defpackage.zbv
    @dzsi
    /* renamed from: p */
    public znz k() {
        return this.k;
    }

    @Override // defpackage.zbv
    @dzsi
    /* renamed from: q */
    public zla l() {
        return this.i;
    }

    @Override // defpackage.zbv
    @dzsi
    /* renamed from: r */
    public zkz m() {
        return this.j;
    }

    public vnu s() {
        return this.m;
    }
}
