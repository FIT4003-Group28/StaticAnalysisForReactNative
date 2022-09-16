package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* renamed from: afbt  reason: default package */
/* loaded from: classes.dex */
final class afbt extends afbp {
    final /* synthetic */ afbx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbt(afbx afbxVar, afbo afboVar) {
        super(afbxVar, afboVar);
        this.c = afbxVar;
    }

    @Override // defpackage.afbw
    public final int a() {
        return this.a.a;
    }

    @Override // defpackage.afbw
    public final void d() {
        this.a.a++;
    }

    @Override // defpackage.afbp, defpackage.afbw
    public final boolean e() {
        int i;
        int a = a();
        if (a > 1) {
            PlayerConfigModel playerConfigModel = (PlayerConfigModel) this.c.b.get();
            int i2 = Integer.MAX_VALUE;
            if ((playerConfigModel.c.b & 1) != 0 && (i = playerConfigModel.N().g) != -1) {
                i2 = i;
            }
            if (a >= i2) {
                return false;
            }
        }
        return true;
    }
}
