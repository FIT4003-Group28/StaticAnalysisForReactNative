package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;
/* loaded from: classes.dex */
public abstract class v extends a<u> {
    private final int[] j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(c.d.d.g.c cVar, g0 g0Var, h0 h0Var) {
        super(cVar, g0Var, h0Var);
        SparseIntArray sparseIntArray = g0Var.f5252c;
        this.j = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.j;
            if (i >= iArr.length) {
                a();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: a */
    public abstract u mo187a(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: a */
    public void b(u uVar) {
        c.d.d.d.i.a(uVar);
        uVar.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public int c(u uVar) {
        c.d.d.d.i.a(uVar);
        return uVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean d(u uVar) {
        c.d.d.d.i.a(uVar);
        return !uVar.isClosed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.j[0];
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

    @Override // com.facebook.imagepipeline.memory.a
    protected int e(int i) {
        return i;
    }
}
