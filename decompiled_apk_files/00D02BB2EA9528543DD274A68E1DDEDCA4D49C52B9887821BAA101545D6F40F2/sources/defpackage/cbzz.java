package defpackage;

import android.icu.text.UnicodeSet;
/* compiled from: PG */
/* renamed from: cbzz  reason: default package */
/* loaded from: classes4.dex */
class cbzz extends cbzf {
    private static final UnicodeSet a = new UnicodeSet("[:whitespace:]").freeze();
    private static final UnicodeSet b = new UnicodeSet("[#﹟＃]").freeze();
    private static final UnicodeSet c = new UnicodeSet("[[:^nt=none:]]").freeze();
    private final UnicodeSet d;

    /* JADX INFO: Access modifiers changed from: protected */
    public cbzz(UnicodeSet unicodeSet) {
        this.d = new UnicodeSet("[[:L:][:M:][:^nt=none:]+_-]").addAll(unicodeSet).freeze();
    }

    @Override // defpackage.cbzf
    protected final boolean b(int i) {
        return c.contains(i);
    }

    @Override // defpackage.cbzj
    public final boolean c(int i) {
        return this.d.contains(i);
    }

    @Override // defpackage.cbzj
    public final boolean d(int i) {
        return b.contains(i);
    }

    @Override // defpackage.cbzj
    public final boolean e(int i) {
        return a.contains(i);
    }
}
