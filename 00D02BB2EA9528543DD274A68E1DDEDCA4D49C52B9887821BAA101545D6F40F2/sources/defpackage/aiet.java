package defpackage;
/* compiled from: PG */
/* renamed from: aiet  reason: default package */
/* loaded from: classes2.dex */
final class aiet extends akvn<aktd> {
    final /* synthetic */ aiey a;

    public aiet(aiey aieyVar) {
        this.a = aieyVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        aktd aktdVar = (aktd) obj;
        Runnable runnable = this.a.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
