package defpackage;

import android.graphics.Matrix;
/* compiled from: PG */
/* renamed from: bvlh  reason: default package */
/* loaded from: classes.dex */
final class bvlh extends ThreadLocal<Matrix> {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Matrix initialValue() {
        return new Matrix();
    }
}
