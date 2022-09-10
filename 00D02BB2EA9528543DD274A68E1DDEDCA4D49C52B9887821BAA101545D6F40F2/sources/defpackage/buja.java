package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: buja  reason: default package */
/* loaded from: classes4.dex */
final class buja implements Runnable {
    final /* synthetic */ bujd a;

    public buja(bujd bujdVar) {
        this.a = bujdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer byteBuffer;
        dssr dssrVar;
        try {
            buiz buizVar = this.a.c;
            int i = 0;
            if (buizVar.a.isEmpty()) {
                byteBuffer = ByteBuffer.allocateDirect(0);
            } else if (buizVar.a.size() == 1) {
                byteBuffer = buizVar.a.get(0);
                if (byteBuffer.hasRemaining()) {
                    byteBuffer.flip();
                }
                byteBuffer.position(0);
            } else {
                for (ByteBuffer byteBuffer2 : buizVar.a) {
                    byteBuffer2.flip();
                    i += byteBuffer2.remaining();
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
                for (ByteBuffer byteBuffer3 : buizVar.a) {
                    allocateDirect.put(byteBuffer3);
                }
                allocateDirect.flip();
                byteBuffer = allocateDirect;
            }
            buje bujeVar = this.a.b;
            bujeVar.b.b.a(byteBuffer.position());
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            dsqa a = dsqa.a();
            int ordinal = bujeVar.a.ordinal();
            if (ordinal == 0) {
                dssrVar = (dssr) dmxv.b.cu(7);
            } else if (ordinal != 1) {
                throw null;
            } else {
                dssrVar = (dssr) dmxf.g.cu(7);
            }
            if (bujeVar.a.equals(bujf.PAINT)) {
                a.e(dmwz.c);
                a.e(dmxz.c);
            } else {
                bujeVar.a.equals(bujf.GET_PARAMETERS);
            }
            bujeVar.b.b.c(byteBuffer.position());
            bujeVar.b.c.f();
            this.a.a.j((dssj) dssrVar.i(bArr, a));
            this.a.d.b();
        } catch (Exception e) {
            int i2 = bujg.f;
            this.a.a.k(e);
        }
    }
}
