package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: cum  reason: default package */
/* loaded from: classes3.dex */
public final class cum implements chy {
    public static final /* synthetic */ int b = 0;
    private final int c;
    private final chy d;

    public cum(int i, chy chyVar) {
        this.c = i;
        this.d = chyVar;
    }

    @Override // defpackage.chy
    public final void a(MessageDigest messageDigest) {
        this.d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // defpackage.chy
    public final boolean equals(Object obj) {
        if (obj instanceof cum) {
            cum cumVar = (cum) obj;
            if (this.c == cumVar.c && this.d.equals(cumVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.chy
    public final int hashCode() {
        return cvd.e(this.d, this.c);
    }
}
