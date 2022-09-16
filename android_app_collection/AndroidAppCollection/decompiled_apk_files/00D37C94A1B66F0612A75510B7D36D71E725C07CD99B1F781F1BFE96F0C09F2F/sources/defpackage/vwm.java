package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
/* compiled from: PG */
/* renamed from: vwm  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vwm implements afvy {
    public final /* synthetic */ afvx a;
    private final /* synthetic */ int b;

    public /* synthetic */ vwm(afvx afvxVar, int i) {
        this.b = i;
        this.a = afvxVar;
    }

    @Override // defpackage.afvy
    public final afvx a(afvm afvmVar) {
        if (this.b == 0) {
            afvx afvxVar = this.a;
            aqxo.y(afvmVar instanceof AccountIdentity);
            return afvxVar;
        }
        afvx afvxVar2 = this.a;
        aqxo.y(afvmVar instanceof AccountIdentity);
        return afvxVar2;
    }
}
