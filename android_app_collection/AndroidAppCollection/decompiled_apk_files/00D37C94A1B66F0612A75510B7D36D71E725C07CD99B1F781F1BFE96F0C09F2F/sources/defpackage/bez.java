package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bez  reason: default package */
/* loaded from: classes2.dex */
public final class bez implements Runnable {
    final /* synthetic */ bfl a;

    public bez(bfl bflVar) {
        this.a = bflVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bfl bflVar = this.a;
        bflVar.nc(true);
        bflVar.o.requestLayout();
        bflVar.o.getViewTreeObserver().addOnGlobalLayoutListener(new bey(bflVar));
    }
}
