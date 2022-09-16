package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: djw  reason: default package */
/* loaded from: classes3.dex */
public final class djw extends cyp {
    public djy a;
    private final String[] e = {"binder"};
    public final BitSet d = new BitSet(1);

    public static /* bridge */ /* synthetic */ void c(djw djwVar, cyv cyvVar, djy djyVar) {
        super.w(cyvVar, djyVar);
        djwVar.a = djyVar;
        djwVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (djy) cyrVar;
    }

    @Override // defpackage.cyp
    /* renamed from: d */
    public final void s(boolean z) {
        this.a.c = z;
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ void t(CharSequence charSequence) {
        super.t(charSequence);
        this.a.e = charSequence;
    }
}
