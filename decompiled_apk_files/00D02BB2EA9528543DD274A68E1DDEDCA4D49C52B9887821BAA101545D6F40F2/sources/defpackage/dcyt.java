package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: dcyt  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcyt extends dcyp {
    @Override // defpackage.dcyp, defpackage.dcza
    public final dcyz b(int i) {
        return c(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
    }

    @Override // defpackage.dcyp
    public final dczb d(int i) {
        dbsk.a(true);
        return new dcyr(this, i);
    }

    @Override // defpackage.dcza
    public final dczb f() {
        return d(32);
    }
}
