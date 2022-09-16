package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: vgd  reason: default package */
/* loaded from: classes4.dex */
public final class vgd implements ver {
    private final Context a;

    public vgd(Context context) {
        this.a = context;
    }

    @Override // defpackage.ver
    public final void a() {
        this.a.registerComponentCallbacks(new vgc());
    }
}
