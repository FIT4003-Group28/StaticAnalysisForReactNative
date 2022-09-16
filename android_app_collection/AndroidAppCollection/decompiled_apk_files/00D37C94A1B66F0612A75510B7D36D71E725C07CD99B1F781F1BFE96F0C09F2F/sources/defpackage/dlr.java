package defpackage;

import android.text.TextUtils;
import java.util.BitSet;
/* compiled from: PG */
/* renamed from: dlr  reason: default package */
/* loaded from: classes3.dex */
public final class dlr extends cyp {
    public dls a;
    private final String[] e = {"text"};
    public final BitSet d = new BitSet(1);

    public static /* bridge */ /* synthetic */ void d(dlr dlrVar, cyv cyvVar, dls dlsVar) {
        super.w(cyvVar, dlsVar);
        dlrVar.a = dlsVar;
        dlrVar.d.clear();
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (dls) cyrVar;
    }

    @Override // defpackage.cyp
    /* renamed from: c */
    public final dls a() {
        o(1, this.d, this.e);
        return this.a;
    }

    public final void e(int i) {
        this.a.S = i;
    }

    public final void f(TextUtils.TruncateAt truncateAt) {
        this.a.e = truncateAt;
    }
}
