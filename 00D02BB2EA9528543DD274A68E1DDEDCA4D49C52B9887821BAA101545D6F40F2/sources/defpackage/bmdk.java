package defpackage;
/* compiled from: PG */
/* renamed from: bmdk  reason: default package */
/* loaded from: classes3.dex */
public class bmdk {
    private final cclp a;
    private final bhru b;

    public bmdk(cclp cclpVar, bhru bhruVar) {
        this.a = cclpVar;
        this.b = bhruVar;
    }

    public final boolean a(bwrs<ilo> bwrsVar) {
        this.a.a(bwrsVar);
        ilo c = bwrsVar.c();
        if (c != null) {
            djqg djqgVar = c.bf().i;
            if (djqgVar == null) {
                djqgVar = djqg.b;
            }
            dsrj<djqa> dsrjVar = djqgVar.a;
            if (!dsrjVar.isEmpty()) {
                int a = dpxo.a(dsrjVar.get(0).c);
                if (a == 0) {
                    a = 1;
                }
                if ((a == 5 || a == 3) && !this.b.f(this.a)) {
                    return true;
                }
            }
        }
        return false;
    }
}
