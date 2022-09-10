package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cmkp  reason: default package */
/* loaded from: classes5.dex */
public final class cmkp implements cmkf {
    private final Context a;
    private final cmkf b;

    public cmkp(Context context, cmkf cmkfVar) {
        this.a = context.getApplicationContext();
        this.b = cmkfVar;
    }

    @Override // defpackage.cmkf
    /* renamed from: b */
    public final cmko a() {
        return new cmko(this.a, this.b.a());
    }
}
