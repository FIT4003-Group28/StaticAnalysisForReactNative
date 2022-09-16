package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: kdg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kdg implements ayqb {
    public final /* synthetic */ kdi a;
    private final /* synthetic */ int b;

    public /* synthetic */ kdg(kdi kdiVar, int i) {
        this.b = i;
        this.a = kdiVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.e = ((Boolean) obj).booleanValue();
        } else if (i == 1) {
            kdi kdiVar = this.a;
            kdiVar.c.set((Rect) obj);
            kdiVar.Y(2);
        } else {
            kdi kdiVar2 = this.a;
            kdiVar2.d = ((Boolean) obj).booleanValue();
            kdiVar2.Y(1);
        }
    }
}
