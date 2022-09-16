package defpackage;
/* compiled from: PG */
/* renamed from: bgqr  reason: default package */
/* loaded from: classes3.dex */
public class bgqr implements bega {
    private final dpwr a;
    private final dxio<akla> b;
    @dzsi
    private akle c = null;

    public bgqr(dpwr dpwrVar, dxio<akla> dxioVar) {
        this.a = dpwrVar;
        this.b = dxioVar;
    }

    @dzsi
    public akle a() {
        return this.c;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        akle akleVar;
        ilo c = bwrsVar.c();
        if (c != null) {
            for (dhxw dhxwVar : c.h().ag) {
                dpwr b = dpwr.b(dhxwVar.b);
                if (b == null) {
                    b = dpwr.UNKNOWN_MAJOR_EVENT_CARD_PLACEMENT;
                }
                if (b == this.a) {
                    akleVar = this.b.a().c(dhxwVar);
                    break;
                }
            }
        }
        akleVar = null;
        this.c = akleVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.c = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        akle akleVar = this.c;
        boolean z = false;
        if (akleVar != null && !akleVar.a().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
