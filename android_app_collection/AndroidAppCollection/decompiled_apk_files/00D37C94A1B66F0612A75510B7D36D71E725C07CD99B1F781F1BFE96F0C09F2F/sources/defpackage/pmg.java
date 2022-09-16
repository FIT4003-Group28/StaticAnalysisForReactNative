package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: pmg  reason: default package */
/* loaded from: classes4.dex */
final class pmg extends pls {
    private static final int a = Float.floatToIntBits(Float.NaN);

    private static void b(int i, ByteBuffer byteBuffer) {
        double d = i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == a) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.pls
    public final pkw a(pkw pkwVar) {
        int i = pkwVar.d;
        if (pxi.O(i)) {
            return i != 4 ? new pkw(pkwVar.b, pkwVar.c, 4) : pkw.a;
        }
        throw new pkx(pkwVar);
    }

    @Override // defpackage.pky
    public final void h(ByteBuffer byteBuffer) {
        ByteBuffer q;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.g.d;
        if (i2 == 536870912) {
            q = q((i / 3) * 4);
            while (position < limit) {
                b(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), q);
                position += 3;
            }
        } else if (i2 == 805306368) {
            q = q(i);
            while (position < limit) {
                b((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), q);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        q.flip();
    }
}
