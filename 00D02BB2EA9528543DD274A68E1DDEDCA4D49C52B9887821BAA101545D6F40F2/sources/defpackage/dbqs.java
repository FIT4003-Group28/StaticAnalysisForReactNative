package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.BitSet;
/* compiled from: PG */
/* renamed from: dbqs  reason: default package */
/* loaded from: classes5.dex */
final class dbqs extends dbqn {
    private final char a;

    public dbqs(char c) {
        this.a = c;
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return c != this.a;
    }

    @Override // defpackage.dbrb
    public final dbrb j(dbrb dbrbVar) {
        return dbrbVar.b(this.a) ? dbqi.a : this;
    }

    @Override // defpackage.dbqn, defpackage.dbrb
    public final dbrb k() {
        return n(this.a);
    }

    @Override // defpackage.dbrb
    public final void l(BitSet bitSet) {
        bitSet.set(0, this.a);
        bitSet.set(this.a + 1, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
    }

    public final String toString() {
        String u = dbrb.u(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(u).length() + 21);
        sb.append("CharMatcher.isNot('");
        sb.append(u);
        sb.append("')");
        return sb.toString();
    }
}
