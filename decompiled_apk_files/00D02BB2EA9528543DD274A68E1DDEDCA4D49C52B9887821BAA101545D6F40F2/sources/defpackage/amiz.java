package defpackage;
/* compiled from: PG */
/* renamed from: amiz  reason: default package */
/* loaded from: classes2.dex */
final class amiz implements akvu, alsm {
    private final dmpn a;
    @dzsi
    private volatile amkh b;
    @dzsi
    private volatile cjqm c;

    public amiz(dmpn dmpnVar) {
        this.a = dmpnVar;
    }

    @Override // defpackage.alsm
    public final dbsg<amkh> G() {
        return dbsg.j(this.b);
    }

    @Override // defpackage.alsm
    public final void H(@dzsi amkh amkhVar) {
        this.b = amkhVar;
    }

    @Override // defpackage.alsm
    public final void I(cjqm cjqmVar) {
        this.c = cjqmVar;
    }

    @Override // defpackage.aktp
    public final dbsg<cjqm> g() {
        return dbsg.j(this.c);
    }

    @Override // defpackage.akvu
    public final /* bridge */ /* synthetic */ dmpn k() {
        return this.a;
    }
}
