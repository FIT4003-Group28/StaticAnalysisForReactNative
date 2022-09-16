package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: aidv  reason: default package */
/* loaded from: classes.dex */
final class aidv implements Runnable {
    final /* synthetic */ aidx a;

    public aidv(aidx aidxVar) {
        this.a = aidxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ylr.b();
        aidx aidxVar = this.a;
        aynx h = aidxVar.j.G().a.h(aiwv.l(1));
        final aidw aidwVar = this.a.h;
        aidwVar.getClass();
        aidxVar.k = h.aa(new ayqb() { // from class: aidt
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aidw.this.a((ahhw) obj);
            }
        }, aiax.k);
        aidq aidqVar = aids.a;
        if (this.a.l != null) {
            aidqVar = new aidu(this);
        }
        aidx aidxVar2 = this.a;
        aids aidsVar = aidxVar2.c;
        aijl d = PlaybackStartDescriptor.d();
        d.a = aidxVar2.d;
        d.f = aidxVar2.f;
        d.e = aidxVar2.g;
        PlaybackStartDescriptor a = d.a();
        aidx aidxVar3 = this.a;
        aijt a2 = aiju.a();
        int i = aidxVar3.e;
        if (i > 0) {
            a2.a = 7;
            a2.b(i);
        } else {
            a2.a = 8;
        }
        aidsVar.a(a, a2.a(), aidqVar);
    }
}
