package defpackage;
/* renamed from: caox  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class caox implements cqlc {
    static final cqlc a = new caox();

    private caox() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cagb cagbVar = (cagb) cqkpVar;
        int i = carm.a;
        boolean z = true;
        if (cagbVar.O().booleanValue() && !cqjv.v(cagbVar.R()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
