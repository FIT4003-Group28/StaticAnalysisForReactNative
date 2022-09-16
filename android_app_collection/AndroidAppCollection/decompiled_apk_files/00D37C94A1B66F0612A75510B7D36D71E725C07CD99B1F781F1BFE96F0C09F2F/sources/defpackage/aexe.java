package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aexe  reason: default package */
/* loaded from: classes.dex */
public final class aexe implements asu {
    final /* synthetic */ aflf[] a;
    final /* synthetic */ afle b;
    final /* synthetic */ PlayerConfigModel c;
    final /* synthetic */ afbi d;
    final /* synthetic */ aenf e;
    private int f = 0;

    public aexe(aflf[] aflfVarArr, afle afleVar, PlayerConfigModel playerConfigModel, afbi afbiVar, aenf aenfVar) {
        this.a = aflfVarArr;
        this.b = afleVar;
        this.c = playerConfigModel;
        this.d = afbiVar;
        this.e = aenfVar;
    }

    @Override // defpackage.asu
    public final synchronized asv a() {
        int i = this.f;
        aflf[] aflfVarArr = this.a;
        if (i < aflfVarArr.length) {
            this.f = i + 1;
            return aflfVarArr[i].a;
        }
        afle afleVar = this.b;
        aflc a = afld.a(this.c);
        a.b = new aexa(this.d, 3);
        a.c = this.e;
        a.d = this.d.b.a();
        afbi afbiVar = this.d;
        a.h = afbiVar.K;
        a.a = afbiVar.a;
        a.g = ampq.i(afbiVar.l());
        return afleVar.a(a.a(), 5).a;
    }
}
