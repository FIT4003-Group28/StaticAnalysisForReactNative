package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lwf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lwf implements ayqb {
    public final /* synthetic */ View a;
    private final /* synthetic */ int b;

    public /* synthetic */ lwf(View view) {
        this.a = view;
    }

    public /* synthetic */ lwf(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            zag.o(this.a, !((Boolean) obj).booleanValue());
        } else if (i == 1) {
            this.a.setAlpha(((Float) obj).floatValue());
        } else if (i == 2) {
            zag.o(this.a, !((Boolean) obj).booleanValue());
        } else if (i == 3) {
            this.a.setContentDescription((CharSequence) obj);
        } else {
            nni.b(new yye(this.a), ((Float) obj).floatValue());
        }
    }
}
