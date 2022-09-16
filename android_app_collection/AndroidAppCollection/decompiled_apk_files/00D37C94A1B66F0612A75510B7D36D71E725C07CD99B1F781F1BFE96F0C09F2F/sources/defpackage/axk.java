package defpackage;

import android.content.Context;
/* compiled from: PG */
@Deprecated
/* renamed from: axk  reason: default package */
/* loaded from: classes2.dex */
public final class axk implements asu {
    private final Context a;
    private final asu b;

    public axk(Context context, String str) {
        asz aszVar = new asz();
        aszVar.b = str;
        this.a = context.getApplicationContext();
        this.b = aszVar;
    }

    @Override // defpackage.asu
    public final /* bridge */ /* synthetic */ asv a() {
        return new axj(this.a, ((asz) this.b).a());
    }
}
