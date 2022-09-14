package defpackage;
/* compiled from: PG */
/* renamed from: bbhz  reason: default package */
/* loaded from: classes3.dex */
class bbhz implements bbhs {
    @dzsi
    private final String a;

    public bbhz(@dzsi String str) {
        this.a = str;
    }

    @Override // defpackage.bbhs
    public jic a() {
        ckqc ckqcVar;
        String str = this.a;
        if (dsna.e(dbsj.e(str))) {
            ckqcVar = ckqc.FIFE;
        } else {
            ckqcVar = ckqc.FULLY_QUALIFIED;
        }
        return new jic(str, ckqcVar, 0);
    }
}
