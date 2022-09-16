package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: ntg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ntg implements ayqb {
    public final /* synthetic */ nth a;
    private final /* synthetic */ int b;

    public /* synthetic */ ntg(nth nthVar, int i) {
        this.b = i;
        this.a = nthVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.c = ((Integer) obj).intValue();
            return;
        }
        this.a.d = (Rect) obj;
    }
}
