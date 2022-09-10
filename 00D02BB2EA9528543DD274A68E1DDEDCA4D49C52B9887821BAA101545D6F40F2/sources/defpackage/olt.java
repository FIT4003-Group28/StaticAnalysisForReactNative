package defpackage;
/* renamed from: olt  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class olt implements cqlc {
    static final cqlc a = new olt();

    private olt() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cqjb<oxq, Integer> cqjbVar = onf.a;
        boolean z = true;
        if (((oxr) cqkpVar).b().intValue() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
