package defpackage;

import java.util.BitSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbql  reason: default package */
/* loaded from: classes5.dex */
public final class dbql extends dbqu {
    private final BitSet a;

    public dbql(BitSet bitSet, String str) {
        super(str);
        this.a = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return this.a.get(c);
    }

    @Override // defpackage.dbrb
    public final void l(BitSet bitSet) {
        bitSet.or(this.a);
    }
}
