package defpackage;
/* compiled from: PG */
/* renamed from: nez  reason: default package */
/* loaded from: classes3.dex */
public abstract class nez implements ajru, odj {
    public ajrs j;
    public Object k;
    public odl l;

    protected abstract void d();

    protected abstract void e();

    @Override // defpackage.ajru
    public final void oK(ajrs ajrsVar, Object obj) {
        this.j = ajrsVar;
        this.k = obj;
        this.l = (odl) ajrsVar.c("sectionController");
        d();
        this.l.e.add(this);
    }

    public void oT() {
    }

    public void oU() {
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.l.e.remove(this);
        e();
        this.j = null;
        this.k = null;
        this.l = null;
    }
}
