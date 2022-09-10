package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cecd  reason: default package */
/* loaded from: classes4.dex */
public class cecd implements cebw {
    private final dcdc<CharSequence> a;
    private final dcdc<CharSequence> b;

    public cecd(List<dreq> list) {
        this.a = dcbg.b(list).o(cebz.a).s(ceca.a).z();
        this.b = dcbg.b(list).o(cecb.a).s(cecc.a).z();
    }

    public static Boolean c(btvo btvoVar) {
        return false;
    }

    @Override // defpackage.cebw
    public dcdc<CharSequence> a() {
        return this.a;
    }

    @Override // defpackage.cebw
    public dcdc<CharSequence> b() {
        return this.b;
    }
}
