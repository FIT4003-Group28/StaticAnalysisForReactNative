package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: mrs  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mrs implements ajry {
    public static final /* synthetic */ mrs a = new mrs();
    private final /* synthetic */ int b;

    private /* synthetic */ mrs() {
    }

    public mrs(int i) {
        this.b = i;
    }

    @Override // defpackage.ajry
    public final ajru b(ViewGroup viewGroup) {
        if (this.b == 0) {
            return new mrv(viewGroup);
        }
        return new hcb(viewGroup);
    }
}
