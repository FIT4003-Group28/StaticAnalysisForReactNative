package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: boa  reason: default package */
/* loaded from: classes3.dex */
public final class boa {
    public static bme a(bpj bpjVar, bis bisVar) {
        return b(bpjVar, bisVar, true);
    }

    public static bme b(bpj bpjVar, bis bisVar, boolean z) {
        return new bme(boo.a(bpjVar, bisVar, z ? bps.g() : 1.0f, bof.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmg c(bpj bpjVar, bis bisVar) {
        return new bmg(h(bpjVar, bisVar, bol.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmi d(bpj bpjVar, bis bisVar) {
        return new bmi(boo.a(bpjVar, bisVar, bps.g(), bot.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmk e(bpj bpjVar, bis bisVar) {
        return new bmk(boo.a(bpjVar, bisVar, bps.g(), boy.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmd f(bpj bpjVar, bis bisVar) {
        return new bmd(h(bpjVar, bisVar, boc.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmf g(bpj bpjVar, bis bisVar, int i) {
        return new bmf(h(bpjVar, bisVar, new boi(i)));
    }

    public static <T> List<bpt<T>> h(bpj bpjVar, bis bisVar, bpe<T> bpeVar) {
        return boo.a(bpjVar, bisVar, 1.0f, bpeVar);
    }
}
