package defpackage;

import android.util.SparseIntArray;
import java.nio.ByteBuffer;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alxy  reason: default package */
/* loaded from: classes.dex */
public final class alxy {
    public final boolean c;
    public int b = 0;
    public alxn a = alxo.l();
    private final List<alxo> d = dchl.a();
    @dzsi
    private ByteBuffer e = null;

    public alxy(boolean z) {
        this.c = z;
    }

    public final void a(int i) {
        this.a = alxo.l();
        this.d.clear();
        this.e = ByteBuffer.allocate(i);
        this.b = 0;
    }

    public final void b(int i) {
        alxn alxnVar = this.a;
        alxnVar.v = this.b;
        this.d.add(alxnVar.a());
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.put((byte) i);
        }
    }

    public final alxp c(long j, @dzsi SparseIntArray sparseIntArray) {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            return new alxp(j, (alxo[]) this.d.toArray(new alxo[0]), byteBuffer.array(), sparseIntArray, this.c);
        }
        return new alxp(j, null, null, sparseIntArray, this.c);
    }
}
