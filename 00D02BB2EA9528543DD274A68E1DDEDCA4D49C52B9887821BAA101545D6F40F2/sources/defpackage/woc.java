package defpackage;
/* renamed from: woc  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class woc implements cqlc {
    static final cqlc a = new woc();

    private woc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        wpu wpuVar = (wpu) cqkpVar;
        int i = wof.a;
        boolean z = false;
        if (wpuVar.o().booleanValue() && wpuVar.f().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
