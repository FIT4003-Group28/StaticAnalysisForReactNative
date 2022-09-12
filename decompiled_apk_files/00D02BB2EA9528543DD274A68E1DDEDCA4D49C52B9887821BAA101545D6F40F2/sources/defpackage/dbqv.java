package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.BitSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbqv  reason: default package */
/* loaded from: classes5.dex */
public class dbqv extends dbrb {
    final dbrb b;

    public dbqv(dbrb dbrbVar) {
        dbsk.s(dbrbVar);
        this.b = dbrbVar;
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return !this.b.b(c);
    }

    @Override // defpackage.dbrb
    public final boolean f(CharSequence charSequence) {
        return this.b.g(charSequence);
    }

    @Override // defpackage.dbrb
    public final boolean g(CharSequence charSequence) {
        return this.b.f(charSequence);
    }

    @Override // defpackage.dbrb
    public final dbrb k() {
        return this.b;
    }

    @Override // defpackage.dbrb
    public final void l(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.b.l(bitSet2);
        bitSet2.flip(0, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        bitSet.or(bitSet2);
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
        sb.append(valueOf);
        sb.append(".negate()");
        return sb.toString();
    }
}
