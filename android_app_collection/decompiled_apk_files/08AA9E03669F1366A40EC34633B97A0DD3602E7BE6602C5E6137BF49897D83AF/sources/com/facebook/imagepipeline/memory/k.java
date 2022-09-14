package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;
/* compiled from: GenericByteArrayPool.java */
/* loaded from: classes.dex */
public class k extends a<byte[]> implements com.facebook.common.g.a {
    private final int[] g;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public int d(int i) {
        return i;
    }

    public k(com.facebook.common.g.c cVar, t tVar, u uVar) {
        super(cVar, tVar, uVar);
        SparseIntArray sparseIntArray = tVar.f2979c;
        this.g = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.g[i] = sparseIntArray.keyAt(i);
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: i */
    public byte[] b(int i) {
        return new byte[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: a */
    public void b(byte[] bArr) {
        com.facebook.common.d.i.a(bArr);
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
    public int c(byte[] bArr) {
        com.facebook.common.d.i.a(bArr);
        return bArr.length;
    }
}
