package defpackage;
/* compiled from: PG */
/* renamed from: adsb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adsb implements Runnable {
    public final /* synthetic */ adsg a;

    @Override // java.lang.Runnable
    public final void run() {
        adsg adsgVar = this.a;
        if (adsgVar.C) {
            adsgVar.x.setVisibility(0);
            adsgVar.C = false;
        }
    }
}
