package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: agtp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agtp implements ampg {
    public final /* synthetic */ agtr a;
    public final /* synthetic */ aijp b;
    private final /* synthetic */ int c;

    public /* synthetic */ agtp(agtr agtrVar, aijp aijpVar) {
        this.a = agtrVar;
        this.b = aijpVar;
    }

    public /* synthetic */ agtp(agtr agtrVar, aijp aijpVar, int i) {
        this.c = i;
        this.a = agtrVar;
        this.b = aijpVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            return this.a.f((PlaybackStartDescriptor) obj, this.b);
        } else if (i == 1) {
            agtr agtrVar = this.a;
            aijp aijpVar = this.b;
            return agtrVar.c.b((PlaybackStartDescriptor) obj, aijpVar);
        } else if (i == 2) {
            agtr agtrVar2 = this.a;
            aimb aimbVar = (aimb) obj;
            return agtrVar2.b.i(aimbVar.a, aimbVar.c, aimbVar.d, this.b);
        } else {
            agtr agtrVar3 = this.a;
            aimb aimbVar2 = (aimb) obj;
            return agtrVar3.b.i(aimbVar2.a, aimbVar2.c, aimbVar2.d, this.b);
        }
    }
}
