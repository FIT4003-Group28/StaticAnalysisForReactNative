package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;
/* compiled from: NativeMemoryChunkPool.java */
/* loaded from: classes.dex */
public class l extends a<NativeMemoryChunk> {
    private final int[] g;

    @Override // com.facebook.imagepipeline.memory.a
    protected int d(int i) {
        return i;
    }

    public l(com.facebook.common.g.c cVar, t tVar, u uVar) {
        super(cVar, tVar, uVar);
        SparseIntArray sparseIntArray = tVar.f2979c;
        this.g = new int[sparseIntArray.size()];
        for (int i = 0; i < this.g.length; i++) {
            this.g[i] = sparseIntArray.keyAt(i);
        }
        a();
    }

    public int d() {
        return this.g[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: i */
    public NativeMemoryChunk b(int i) {
        return new NativeMemoryChunk(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: a */
    public void b(NativeMemoryChunk nativeMemoryChunk) {
        com.facebook.common.d.i.a(nativeMemoryChunk);
        nativeMemoryChunk.close();
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int c(int i) {
        int[] iArr;
        if (i <= 0) {
            throw new a.b(Integer.valueOf(i));
        }
        for (int i2 : this.g) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public int c(NativeMemoryChunk nativeMemoryChunk) {
        com.facebook.common.d.i.a(nativeMemoryChunk);
        return nativeMemoryChunk.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean d(NativeMemoryChunk nativeMemoryChunk) {
        com.facebook.common.d.i.a(nativeMemoryChunk);
        return !nativeMemoryChunk.a();
    }
}
