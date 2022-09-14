package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atmn  reason: default package */
/* loaded from: classes2.dex */
public final class atmn implements Runnable {
    final /* synthetic */ amuo a;
    final /* synthetic */ atmr b;

    public atmn(atmr atmrVar, amuo amuoVar) {
        this.b = atmrVar;
        this.a = amuoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.t(this.a);
    }
}
