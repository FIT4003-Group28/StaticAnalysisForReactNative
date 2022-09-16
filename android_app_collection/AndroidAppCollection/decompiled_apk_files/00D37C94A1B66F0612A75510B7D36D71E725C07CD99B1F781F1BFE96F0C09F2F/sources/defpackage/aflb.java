package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aflb  reason: default package */
/* loaded from: classes.dex */
public final class aflb implements afjm {
    final /* synthetic */ afle a;
    final /* synthetic */ amqo b;
    final /* synthetic */ amqo c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;

    public aflb(afle afleVar, amqo amqoVar, amqo amqoVar2, boolean z, int i) {
        this.a = afleVar;
        this.b = amqoVar;
        this.c = amqoVar2;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.asu
    public final asv a() {
        return b(afjp.m);
    }

    @Override // defpackage.afjm
    public final asv b(afjp afjpVar) {
        afle afleVar = this.a;
        aflc a = afld.a((PlayerConfigModel) this.b.get());
        a.b = this.c;
        a.e = this.d;
        a.f = afjpVar;
        return afleVar.a(a.a(), this.e).a;
    }

    @Override // defpackage.afjm
    public final asv c(afjp afjpVar, String str, ampq ampqVar) {
        afle afleVar = this.a;
        aflc a = afld.a((PlayerConfigModel) this.b.get());
        a.b = this.c;
        a.e = this.d;
        a.f = afjpVar;
        a.a = str;
        a.g = ampqVar;
        return afleVar.a(a.a(), this.e).a;
    }
}
