package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: aikr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aikr implements ampg {
    public final /* synthetic */ aiku a;
    public final /* synthetic */ aijp b;
    private final /* synthetic */ int c;

    public /* synthetic */ aikr(aiku aikuVar, aijp aijpVar) {
        this.a = aikuVar;
        this.b = aijpVar;
    }

    public /* synthetic */ aikr(aiku aikuVar, aijp aijpVar, int i) {
        this.c = i;
        this.a = aikuVar;
        this.b = aijpVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            aiku aikuVar = this.a;
            aimb aimbVar = (aimb) obj;
            return aikuVar.a.i(aimbVar.a, aimbVar.c, aimbVar.d, this.b);
        } else if (i == 1) {
            aiku aikuVar2 = this.a;
            aijp aijpVar = this.b;
            return aikuVar2.b.b((PlaybackStartDescriptor) obj, aijpVar);
        } else if (i == 2) {
            aiku aikuVar3 = this.a;
            aimb aimbVar2 = (aimb) obj;
            return aikuVar3.a.i(aimbVar2.a, aimbVar2.c, aimbVar2.d, this.b);
        } else {
            aiku aikuVar4 = this.a;
            aimb aimbVar3 = (aimb) obj;
            return aikuVar4.a.i(aimbVar3.a, aimbVar3.c, aimbVar3.d, this.b);
        }
    }
}
