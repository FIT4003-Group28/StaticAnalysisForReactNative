package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;
/* loaded from: classes.dex */
public class r extends a<byte[]> implements c.d.d.g.a {
    private final int[] j;

    public r(c.d.d.g.c cVar, g0 g0Var, h0 h0Var) {
        super(cVar, g0Var, h0Var);
        SparseIntArray sparseIntArray = g0Var.f5252c;
        this.j = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.j[i] = sparseIntArray.keyAt(i);
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: a */
    public void b(byte[] bArr) {
        c.d.d.d.i.a(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: a  reason: collision with other method in class */
    public byte[] mo187a(int i) {
        return new byte[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public int c(byte[] bArr) {
        c.d.d.d.i.a(bArr);
        return bArr.length;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int d(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.j) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new a.b(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public int e(int i) {
        return i;
    }
}
