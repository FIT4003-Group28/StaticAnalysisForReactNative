package defpackage;

import android.graphics.Color;
/* compiled from: PG */
/* renamed from: boc  reason: default package */
/* loaded from: classes3.dex */
public final class boc implements bpe<Integer> {
    public static final boc a = new boc();

    private boc() {
    }

    @Override // defpackage.bpe
    public final /* bridge */ /* synthetic */ Integer a(bpj bpjVar, float f) {
        int r = bpjVar.r();
        if (r == 1) {
            bpjVar.d();
        }
        double n = bpjVar.n();
        double n2 = bpjVar.n();
        double n3 = bpjVar.n();
        double n4 = bpjVar.n();
        if (r == 1) {
            bpjVar.e();
        }
        if (n <= 1.0d && n2 <= 1.0d && n3 <= 1.0d && n4 <= 1.0d) {
            n *= 255.0d;
            n2 *= 255.0d;
            n3 *= 255.0d;
            n4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) n4, (int) n, (int) n2, (int) n3));
    }
}
