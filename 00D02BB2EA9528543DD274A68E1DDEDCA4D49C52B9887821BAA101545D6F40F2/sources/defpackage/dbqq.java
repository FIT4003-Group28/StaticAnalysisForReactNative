package defpackage;

import java.util.BitSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbqq  reason: default package */
/* loaded from: classes.dex */
public final class dbqq extends dbqn {
    private final char a;

    public dbqq(char c) {
        this.a = c;
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return c == this.a;
    }

    @Override // defpackage.dbrb
    public final String i(CharSequence charSequence, char c) {
        return charSequence.toString().replace(this.a, '.');
    }

    @Override // defpackage.dbrb
    public final dbrb j(dbrb dbrbVar) {
        return dbrbVar.b(this.a) ? dbrbVar : super.j(dbrbVar);
    }

    @Override // defpackage.dbqn, defpackage.dbrb
    public final dbrb k() {
        return new dbqs(this.a);
    }

    @Override // defpackage.dbrb
    public final void l(BitSet bitSet) {
        bitSet.set(this.a);
    }

    public final String toString() {
        String u = dbrb.u(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(u).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(u);
        sb.append("')");
        return sb.toString();
    }
}
