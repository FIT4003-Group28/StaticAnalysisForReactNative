package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: abmf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abmf implements azqb {
    public final /* synthetic */ ViewGroup.MarginLayoutParams a;
    private final /* synthetic */ int b;

    public /* synthetic */ abmf(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        this.b = i;
        this.a = marginLayoutParams;
    }

    @Override // defpackage.azqb
    public final Object get() {
        int i = this.b;
        if (i != 0 && i != 1 && i != 2 && i == 3) {
            return this.a;
        }
        return this.a;
    }
}
