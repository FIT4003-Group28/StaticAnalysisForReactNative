package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: lcq  reason: default package */
/* loaded from: classes7.dex */
final class lcq implements dbsl<Rect> {
    final /* synthetic */ boolean a;
    final /* synthetic */ float b;

    public lcq(boolean z, float f) {
        this.a = z;
        this.b = f;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(@dzsi Rect rect) {
        Rect rect2 = rect;
        if (rect2 == null) {
            return false;
        }
        return this.a ? this.b <= ((float) rect2.right) : ((float) rect2.left) <= this.b;
    }
}
