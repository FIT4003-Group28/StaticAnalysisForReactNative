package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: civ  reason: default package */
/* loaded from: classes4.dex */
public final class civ implements btw {
    public static final /* synthetic */ int b = 0;
    private final int c;
    private final btw d;

    public civ(int i, btw btwVar) {
        this.c = i;
        this.d = btwVar;
    }

    @Override // defpackage.btw
    public final void a(MessageDigest messageDigest) {
        this.d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // defpackage.btw
    public final boolean equals(Object obj) {
        if (obj instanceof civ) {
            civ civVar = (civ) obj;
            if (this.c == civVar.c && this.d.equals(civVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.btw
    public final int hashCode() {
        return cjp.l(this.d, this.c);
    }
}
