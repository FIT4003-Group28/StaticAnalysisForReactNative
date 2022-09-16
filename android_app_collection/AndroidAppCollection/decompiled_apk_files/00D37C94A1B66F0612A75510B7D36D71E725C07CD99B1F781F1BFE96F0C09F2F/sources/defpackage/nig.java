package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import j$.util.Collection;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: nig  reason: default package */
/* loaded from: classes3.dex */
public final class nig implements afzf {
    public final azqb a;
    public final nif b;
    public final String c;
    public final aagi d;
    public ajsm e;
    private final yzj f;
    private final ajsf g;
    private final Activity h;

    public nig(azqb azqbVar, yzj yzjVar, ajsg ajsgVar, final akbn akbnVar, yni yniVar, aagi aagiVar, final nef nefVar, final Activity activity, final nif nifVar, String str) {
        this.a = azqbVar;
        this.f = yzjVar;
        this.h = activity;
        this.b = nifVar;
        this.c = str;
        this.d = aagiVar;
        final nie nieVar = new nie(this, yniVar);
        ajqw ajqwVar = new ajqw();
        ajqwVar.f(ateu.class, new ajry() { // from class: nia
            @Override // defpackage.ajry
            public final ajru b(ViewGroup viewGroup) {
                Activity activity2 = activity;
                akbn akbnVar2 = akbnVar;
                final nif nifVar2 = nifVar;
                return new mlh(activity2, akbnVar2, new akbi() { // from class: nic
                    @Override // defpackage.akbi
                    public final void oL(aopc aopcVar) {
                        nif.this.aK(false);
                    }
                });
            }
        });
        ajqwVar.f(aucd.class, new ajry() { // from class: nib
            @Override // defpackage.ajry
            public final ajru b(ViewGroup viewGroup) {
                nef nefVar2 = nef.this;
                nie nieVar2 = nieVar;
                Activity activity2 = (Activity) nefVar2.a.get();
                activity2.getClass();
                aafo aafoVar = (aafo) nefVar2.b.get();
                aafoVar.getClass();
                yni yniVar2 = (yni) nefVar2.c.get();
                yniVar2.getClass();
                ajxz ajxzVar = (ajxz) nefVar2.d.get();
                ajxzVar.getClass();
                viewGroup.getClass();
                return new nee(activity2, aafoVar, yniVar2, ajxzVar, nieVar2, viewGroup);
            }
        });
        ajqwVar.f(ajre.class, new ajry() { // from class: nhz
            @Override // defpackage.ajry
            public final ajru b(ViewGroup viewGroup) {
                return new ajrf(activity);
            }
        });
        this.g = ajsgVar.a(ajqwVar);
    }

    public final void d(String str, final int i) {
        Collection.EL.stream(this.e).filter(lws.p).map(meg.m).filter(new oll(str, 1)).findFirst().ifPresent(new Consumer() { // from class: nid
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                nig nigVar = nig.this;
                int i2 = i;
                aucd aucdVar = (aucd) obj;
                aopc aopcVar = (aopc) aucdVar.mo52toBuilder();
                aopcVar.copyOnWrite();
                aucd aucdVar2 = (aucd) aopcVar.instance;
                aucdVar2.e = i2 - 1;
                aucdVar2.b |= 16;
                nigVar.e.o(aucdVar, (aucd) aopcVar.mo39build());
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("Error adding video to playlist", cffVar);
        this.b.aK(true);
        zag.r(this.h, this.f.b(cffVar), 0);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        apbw apbwVar;
        for (asbd asbdVar : ((asbc) obj).c) {
            if (asbdVar.b == 88978004) {
                this.e = new ajsm();
                if (asbdVar.b == 88978004) {
                    apbwVar = (apbw) asbdVar.c;
                } else {
                    apbwVar = apbw.a;
                }
                ajsm ajsmVar = this.e;
                for (apbu apbuVar : apbwVar.c) {
                    if ((apbuVar.b & 4) != 0) {
                        ateu ateuVar = apbuVar.c;
                        if (ateuVar == null) {
                            ateuVar = ateu.a;
                        }
                        ajsmVar.add(ateuVar);
                    }
                }
                ajsmVar.add(new ajre());
                for (apbv apbvVar : apbwVar.b) {
                    if (apbvVar.b == 74079946) {
                        ajsmVar.add((aucd) apbvVar.c);
                    }
                }
                this.g.h(this.e);
                iqa iqaVar = (iqa) this.b;
                iqaVar.am = this.g;
                if (!iqaVar.an) {
                    return;
                }
                iqaVar.aJ();
                return;
            }
        }
        this.b.aK(true);
        zag.q(this.h, R.string.get_add_to_playlist_failed, 0);
    }
}
