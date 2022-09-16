package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.account.identity.C$AutoValue_AccountIdentity;
/* compiled from: PG */
/* renamed from: wah  reason: default package */
/* loaded from: classes4.dex */
public final class wah implements afzf {
    final /* synthetic */ afvm a;
    final /* synthetic */ yiw b;

    public wah(afvm afvmVar, yiw yiwVar) {
        this.a = afvmVar;
        this.b = yiwVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.b.a(this.a, cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        for (aarw aarwVar : ((aase) obj).c()) {
            if (aarwVar.l()) {
                C$AutoValue_AccountIdentity c$AutoValue_AccountIdentity = (C$AutoValue_AccountIdentity) this.a;
                if (TextUtils.equals(c$AutoValue_AccountIdentity.c, aarwVar.j()) || (TextUtils.isEmpty(c$AutoValue_AccountIdentity.c) && TextUtils.isEmpty(aarwVar.j()))) {
                    this.b.b(this.a, aarwVar);
                    return;
                }
            }
        }
        this.b.a(this.a, null);
    }
}
