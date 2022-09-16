package defpackage;

import android.widget.RelativeLayout;
/* compiled from: PG */
/* renamed from: nkr  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nkr implements ayqb {
    public final /* synthetic */ RelativeLayout a;
    private final /* synthetic */ int b;

    public /* synthetic */ nkr(RelativeLayout relativeLayout, int i) {
        this.b = i;
        this.a = relativeLayout;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.setTranslationY(((Integer) obj).intValue());
        } else {
            this.a.setTranslationY(((Integer) obj).intValue());
        }
    }
}
