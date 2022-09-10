package defpackage;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clsp  reason: default package */
/* loaded from: classes5.dex */
public final class clsp extends clsc {
    private static final int e = Float.floatToIntBits(Float.NaN);

    private static void n(int i, ByteBuffer byteBuffer) {
        double d = i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == e) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.clrh
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.d;
        if (i3 == 536870912) {
            i = i((i2 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), i);
                position += 3;
            }
        } else if (i3 == 805306368) {
            i = i(i2);
            while (position < limit) {
                n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), i);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        i.flip();
    }

    @Override // defpackage.clsc
    public final clrf j(clrf clrfVar) {
        int i = clrfVar.d;
        if (cmny.O(i)) {
            return i != 4 ? new clrf(clrfVar.b, clrfVar.c, 4) : clrf.a;
        }
        throw new clrg(clrfVar);
    }
}
