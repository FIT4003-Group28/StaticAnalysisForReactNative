package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* renamed from: afbv  reason: default package */
/* loaded from: classes.dex */
final class afbv extends afbp {
    final /* synthetic */ afbx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbv(afbx afbxVar, afbo afboVar) {
        super(afbxVar, afboVar);
        this.c = afbxVar;
    }

    @Override // defpackage.afbw
    public final int a() {
        return this.a.b;
    }

    @Override // defpackage.afbw
    public final void d() {
        this.a.b++;
    }

    @Override // defpackage.afbp, defpackage.afbw
    public final boolean e() {
        int a = a();
        if (a > 1) {
            PlayerConfigModel playerConfigModel = (PlayerConfigModel) this.c.b.get();
            if (a >= ((playerConfigModel.c.b & 1) != 0 ? playerConfigModel.N().f : 10)) {
                return false;
            }
        }
        return true;
    }
}
