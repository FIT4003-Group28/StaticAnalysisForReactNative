package defpackage;
/* compiled from: PG */
/* renamed from: boe  reason: default package */
/* loaded from: classes3.dex */
public final class boe implements bpe<blv> {
    public static final boe a = new boe();
    private static final bph b = bph.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private boe() {
    }

    @Override // defpackage.bpe
    public final /* bridge */ /* synthetic */ blv a(bpj bpjVar, float f) {
        bpjVar.f();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i = 3;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = true;
        while (bpjVar.h()) {
            switch (bpjVar.j(b)) {
                case 0:
                    str = bpjVar.l();
                    break;
                case 1:
                    str2 = bpjVar.l();
                    break;
                case 2:
                    d = bpjVar.n();
                    break;
                case 3:
                    int o = bpjVar.o();
                    if (o <= 2 && o >= 0) {
                        i = new int[]{1, 2, 3}[o];
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                    break;
                case 4:
                    i2 = bpjVar.o();
                    break;
                case 5:
                    d2 = bpjVar.n();
                    break;
                case 6:
                    d3 = bpjVar.n();
                    break;
                case 7:
                    i3 = bom.a(bpjVar);
                    break;
                case 8:
                    i4 = bom.a(bpjVar);
                    break;
                case 9:
                    d4 = bpjVar.n();
                    break;
                case 10:
                    z = bpjVar.m();
                    break;
                default:
                    bpjVar.k();
                    bpjVar.p();
                    break;
            }
        }
        bpjVar.g();
        return new blv(str, str2, d, i, i2, d2, d3, i3, i4, d4, z);
    }
}
