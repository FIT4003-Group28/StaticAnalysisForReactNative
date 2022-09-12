package defpackage;
/* compiled from: PG */
/* renamed from: ppa  reason: default package */
/* loaded from: classes7.dex */
final class ppa implements Runnable {
    final /* synthetic */ gdf a;
    final /* synthetic */ ppd b;

    public ppa(ppd ppdVar, gdf gdfVar) {
        this.b = ppdVar;
        this.a = gdfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c();
        this.a.dismiss();
    }
}
