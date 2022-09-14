package defpackage;

import android.util.SparseIntArray;
import java.nio.ByteBuffer;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alxr  reason: default package */
/* loaded from: classes.dex */
public final class alxr {
    public int b = 0;
    public alxn a = alxo.l();
    private final List<alxo> c = dchl.a();
    @dzsi
    private ByteBuffer d = null;

    public final void a(int i) {
        this.a = alxo.l();
        this.c.clear();
        this.d = ByteBuffer.allocate(i);
        this.b = 0;
    }

    public final void b(int i) {
        alxn alxnVar = this.a;
        alxnVar.v = this.b;
        this.c.add(alxnVar.a());
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.put((byte) i);
        }
    }

    public final alxp c(long j, @dzsi SparseIntArray sparseIntArray) {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            return new alxp(j, (alxo[]) this.c.toArray(new alxo[0]), byteBuffer.array(), sparseIntArray);
        }
        return new alxp(j, null, null, sparseIntArray);
    }
}
