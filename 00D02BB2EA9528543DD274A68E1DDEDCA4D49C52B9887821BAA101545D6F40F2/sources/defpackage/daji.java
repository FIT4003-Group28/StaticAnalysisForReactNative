package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daji  reason: default package */
/* loaded from: classes5.dex */
public final class daji implements Runnable {
    final /* synthetic */ dajk a;

    public daji(dajk dajkVar) {
        this.a = dajkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.b.a();
        } catch (Exception unused) {
        }
    }
}
