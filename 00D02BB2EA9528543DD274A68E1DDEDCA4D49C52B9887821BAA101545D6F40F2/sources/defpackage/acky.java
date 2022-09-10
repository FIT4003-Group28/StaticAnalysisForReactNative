package defpackage;
/* compiled from: PG */
/* renamed from: acky  reason: default package */
/* loaded from: classes2.dex */
public class acky extends acvz implements bega {
    public final gga a;
    public final bwqv b;
    private bwrs<ilo> c;

    public acky(gga ggaVar, bwqv bwqvVar, dxio<afha> dxioVar, dxio<axwy> dxioVar2) {
        super(ggaVar, dxioVar, dxioVar2);
        this.c = bwrs.a(null);
        this.a = ggaVar;
        this.b = bwqvVar;
    }

    public Boolean a() {
        ilo c = this.c.c();
        if (c == null) {
            return true;
        }
        dgmq dgmqVar = c.h().ba;
        if (dgmqVar == null) {
            dgmqVar = dgmq.b;
        }
        for (dgmo dgmoVar : dgmqVar.a) {
            if (!dgmoVar.e) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        dgmq dgmqVar;
        this.c = bwrsVar;
        ilo c = bwrsVar.c();
        ackx ackxVar = new ackx(this, bwrsVar);
        if (c != null) {
            dgmqVar = c.h().ba;
            if (dgmqVar == null) {
                dgmqVar = dgmq.b;
            }
        } else {
            dgmqVar = dgmq.b;
        }
        e(dgmqVar, ackxVar);
    }

    @Override // defpackage.bega
    public void u() {
        this.c = bwrs.a(null);
        e(dgmq.b, ackw.a);
    }

    @Override // defpackage.bega
    public Boolean w() {
        ilo c = this.c.c();
        if (c == null || (c.h().d & 64) == 0) {
            return false;
        }
        return Boolean.valueOf(!a().booleanValue());
    }
}
