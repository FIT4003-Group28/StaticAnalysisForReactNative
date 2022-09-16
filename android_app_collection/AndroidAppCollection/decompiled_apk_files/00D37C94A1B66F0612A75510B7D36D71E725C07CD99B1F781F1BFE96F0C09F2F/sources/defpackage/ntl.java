package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: ntl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ntl implements ayqb {
    public final /* synthetic */ ntn a;
    private final /* synthetic */ int b;

    public /* synthetic */ ntl(ntn ntnVar, int i) {
        this.b = i;
        this.a = ntnVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.b = ((Integer) obj).intValue();
            return;
        }
        this.a.c = (Rect) obj;
    }
}
