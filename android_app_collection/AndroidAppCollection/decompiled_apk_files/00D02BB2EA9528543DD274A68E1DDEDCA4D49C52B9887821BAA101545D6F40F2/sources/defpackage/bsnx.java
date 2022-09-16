package defpackage;
/* compiled from: PG */
/* renamed from: bsnx  reason: default package */
/* loaded from: classes4.dex */
final class bsnx implements Runnable {
    final /* synthetic */ bsoi a;

    public bsnx(bsoi bsoiVar) {
        this.a = bsoiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bsoi bsoiVar = this.a;
        brwu i = bsoiVar.i(bsoiVar.A());
        if (i != null && !i.as().booleanValue()) {
            this.a.v.setAboveView(null);
        }
    }
}
