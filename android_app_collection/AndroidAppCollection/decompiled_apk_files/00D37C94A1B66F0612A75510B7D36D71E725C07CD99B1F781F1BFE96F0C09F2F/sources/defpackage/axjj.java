package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axjj  reason: default package */
/* loaded from: classes2.dex */
public final class axjj implements cvs {
    List a;
    List b = new ArrayList();
    cvx c;
    long d;

    public axjj(axjk axjkVar, axje axjeVar, Map map, long j) {
        this.d = j;
        this.a = axjeVar.d;
        for (int i = 0; i < ((int[]) map.values().iterator().next()).length; i++) {
            for (axjh axjhVar : this.a) {
                int[] iArr = (int[]) map.get(axjhVar);
                long j2 = 0;
                for (int i2 = 0; i2 < i; i2++) {
                    j2 += iArr[i2];
                }
                this.b.add(((List) axjkVar.c.get(axjhVar)).subList(axds.p(j2), axds.p(j2 + iArr[i])));
            }
        }
    }

    private static final boolean h(long j) {
        return j + 8 < 4294967296L;
    }

    @Override // defpackage.cvs
    public final long a() {
        throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
    }

    @Override // defpackage.cvs
    public final long b() {
        return this.d + 16;
    }

    @Override // defpackage.cvs
    public final cvx c() {
        return this.c;
    }

    @Override // defpackage.cvs
    public final String d() {
        return "mdat";
    }

    @Override // defpackage.cvs
    public final void e(WritableByteChannel writableByteChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        long b = b();
        if (h(b)) {
            hy.y(allocate, b);
        } else {
            hy.y(allocate, 1L);
        }
        allocate.put(cvq.b("mdat"));
        if (!h(b)) {
            allocate.putLong(b);
        } else {
            allocate.put(new byte[8]);
        }
        allocate.rewind();
        writableByteChannel.write(allocate);
        for (List<axjg> list : this.b) {
            for (axjg axjgVar : list) {
                axjgVar.b(writableByteChannel);
            }
        }
    }

    @Override // defpackage.cvs
    public final void f(axja axjaVar, ByteBuffer byteBuffer, long j, cvo cvoVar) {
    }

    @Override // defpackage.cvs
    public final void g(cvx cvxVar) {
        this.c = cvxVar;
    }
}
