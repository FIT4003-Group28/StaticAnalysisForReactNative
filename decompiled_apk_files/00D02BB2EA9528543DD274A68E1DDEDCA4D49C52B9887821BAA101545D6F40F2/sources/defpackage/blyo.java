package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blyo  reason: default package */
/* loaded from: classes3.dex */
public final class blyo implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ blvu b;
    final /* synthetic */ blyv c;

    public blyo(blyv blyvVar, String str, blvu blvuVar) {
        this.c = blyvVar;
        this.a = str;
        this.b = blvuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.a;
        if (str != null) {
            this.c.d.b(str, this.b.c);
        } else {
            int i = blyv.v;
        }
    }
}
