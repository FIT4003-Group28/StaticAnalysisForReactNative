package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aztm  reason: default package */
/* loaded from: classes2.dex */
public final class aztm implements aztg {
    public final CharSequence a;
    public final azsg b;

    public aztm(CharSequence charSequence, azsg azsgVar) {
        this.a = charSequence;
        this.b = azsgVar;
    }

    @Override // defpackage.aztg
    public final Iterator a() {
        return new aztl(this);
    }
}
