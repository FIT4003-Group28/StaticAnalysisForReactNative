package defpackage;
/* renamed from: bocd  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bocd implements cqlc {
    static final cqlc a = new bocd();

    private bocd() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        boqj boqjVar = (boqj) cqkpVar;
        int i = bodo.c;
        boolean z = false;
        if (boqjVar.k().booleanValue() && !((Boolean) bocv.a.a(boqjVar)).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
