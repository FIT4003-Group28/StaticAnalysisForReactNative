package defpackage;
/* renamed from: boby  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class boby implements cqlc {
    static final cqlc a = new boby();

    private boby() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        boqj boqjVar = (boqj) cqkpVar;
        boolean z = true;
        if (((Boolean) bocu.a.a(boqjVar)).booleanValue() && !((Boolean) bocv.a.a(boqjVar)).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
