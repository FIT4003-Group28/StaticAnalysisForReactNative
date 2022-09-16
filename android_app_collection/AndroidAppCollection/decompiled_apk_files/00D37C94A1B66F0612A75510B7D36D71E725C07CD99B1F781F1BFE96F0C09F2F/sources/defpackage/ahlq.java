package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahlq  reason: default package */
/* loaded from: classes.dex */
public final class ahlq implements ahjt {
    final /* synthetic */ ahlr a;
    final /* synthetic */ ahpl b;

    public ahlq(ahlr ahlrVar, ahpl ahplVar) {
        this.a = ahlrVar;
        this.b = ahplVar;
    }

    @Override // defpackage.ahjt
    public final void a() {
        ahlr ahlrVar = this.a;
        ahlrVar.e = true;
        ahlrVar.d();
        ahpl ahplVar = this.b;
        boolean z = this.a.e;
        ahpp ahppVar = ahplVar.a;
        ahpu ahpuVar = ahplVar.b;
        if (z) {
            ahpuVar.a(ahppVar.h);
        }
    }
}
