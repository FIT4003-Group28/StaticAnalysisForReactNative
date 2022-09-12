package defpackage;
/* compiled from: PG */
/* renamed from: box  reason: default package */
/* loaded from: classes3.dex */
public final class box implements bpe<bpw> {
    public static final box a = new box();

    private box() {
    }

    @Override // defpackage.bpe
    public final /* bridge */ /* synthetic */ bpw a(bpj bpjVar, float f) {
        int r = bpjVar.r();
        if (r == 1) {
            bpjVar.d();
        }
        float n = (float) bpjVar.n();
        float n2 = (float) bpjVar.n();
        while (bpjVar.h()) {
            bpjVar.p();
        }
        if (r == 1) {
            bpjVar.e();
        }
        return new bpw((n / 100.0f) * f, (n2 / 100.0f) * f);
    }
}
