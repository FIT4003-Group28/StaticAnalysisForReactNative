package defpackage;
/* compiled from: PG */
/* renamed from: bdqp  reason: default package */
/* loaded from: classes3.dex */
public final class bdqp {
    public static final dcqe a = dcqe.c("bdqp");
    public final btvo b;
    public final dxio<cclq> c;
    public final bbtk d;
    public final bhhf e;
    public final dxio<chht> f;
    public final bdqo g;

    public bdqp(btvo btvoVar, dxio<cclq> dxioVar, bbtk bbtkVar, bhhf bhhfVar, dxio<chht> dxioVar2, bdqo bdqoVar) {
        this.b = btvoVar;
        this.c = dxioVar;
        this.f = dxioVar2;
        this.d = bbtkVar;
        this.e = bhhfVar;
        this.g = bdqoVar;
    }

    public static chhs a(chht chhtVar, dwyd dwydVar) {
        dhpj dhpjVar;
        dwyd dwydVar2 = dwyd.UNKNOWN_ENTRY_POINT;
        int ordinal = dwydVar.ordinal();
        if (ordinal == 19 || ordinal == 20) {
            dhpjVar = dhpj.TODO_LIST;
        } else {
            dhpjVar = dhpj.UNKNOWN_CONTRIBUTION_SOURCE;
        }
        return chhtVar.a(dhpjVar);
    }
}
