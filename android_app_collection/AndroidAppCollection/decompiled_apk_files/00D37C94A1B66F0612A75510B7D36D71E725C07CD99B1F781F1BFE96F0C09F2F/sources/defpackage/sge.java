package defpackage;

import android.graphics.Paint;
/* compiled from: PG */
/* renamed from: sge  reason: default package */
/* loaded from: classes4.dex */
final class sge implements sgh {
    private final /* synthetic */ int a;

    public sge() {
    }

    public sge(int i) {
        this.a = i;
    }

    @Override // defpackage.sgh
    public final void a(Paint paint) {
        if (this.a == 0) {
            paint.setStyle(Paint.Style.STROKE);
        } else {
            paint.setStyle(Paint.Style.FILL);
        }
    }
}
