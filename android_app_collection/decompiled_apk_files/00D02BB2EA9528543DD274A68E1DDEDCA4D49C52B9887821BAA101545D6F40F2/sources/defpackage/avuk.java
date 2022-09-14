package defpackage;

import android.content.DialogInterface;
import android.text.Spannable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: avuk  reason: default package */
/* loaded from: classes3.dex */
public class avuk {
    public final away a;
    public final avij b;
    public final avik c;
    private final cjqy d;
    private final avhz e;

    public avuk(cjqy cjqyVar, away awayVar, avij avijVar, avik avikVar, avhz avhzVar) {
        this.d = cjqyVar;
        this.a = awayVar;
        this.b = avijVar;
        this.c = avikVar;
        this.e = avhzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final dltm dltmVar, @dzsi avvo avvoVar) {
        avhz avhzVar = this.e;
        final avuj avujVar = new avuj(this, avvoVar);
        boolean z = dltmVar.r;
        int i = z ^ true ? R.string.OFFLINE_REMOVE_MAP_TITLE : R.string.OFFLINE_DELETE_MAP_TITLE;
        int i2 = true != z ? R.string.OFFLINE_MAPS_REMOVE_AREA_CONFIRM : R.string.OFFLINE_MAPS_DELETE_AREA_CONFIRM;
        bvsx bvsxVar = new bvsx(avhzVar.a.getResources());
        bvsu c = bvsxVar.c(i2);
        bvsv a = bvsxVar.a(dltmVar.a);
        a.i();
        c.a(a);
        Spannable c2 = c.c();
        cjtd a2 = cjtd.a(dtxx.aY);
        cjtd a3 = cjtd.a(dtxx.aZ);
        gcz a4 = avhzVar.b.a();
        a4.i(i);
        a4.e = c2;
        a4.e(R.string.CANCEL_BUTTON, a2, new gdd() { // from class: avhm
            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
            }
        });
        a4.h(R.string.YES_BUTTON, a3, new gdd(avujVar, dltmVar) { // from class: avhn
            private final dltm a;
            private final avhy b;

            {
                this.b = avujVar;
                this.a = dltmVar;
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [avvo, ggg] */
            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                avhy avhyVar = this.b;
                dltm dltmVar2 = this.a;
                if (dltmVar2.p) {
                    ((avuj) avhyVar).b.a.a();
                }
                avuj avujVar2 = (avuj) avhyVar;
                avujVar2.b.b.i(dltmVar2.b);
                ?? r3 = avujVar2.a;
                if (r3 != 0) {
                    gfq.l(r3);
                }
            }
        });
        a4.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cjtd b(dltm dltmVar, ddho ddhoVar) {
        cjtd a = cjtd.a(ddhoVar);
        if (dltmVar.p) {
            cjta c = cjtd.c(a);
            c.b = this.d.b();
            c.g(cjrx.a(ddcu.aA.a));
            return c.a();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(final dltm dltmVar) {
        if (!dltmVar.r) {
            this.b.n(dltmVar.b, new avif(this, dltmVar) { // from class: avui
                private final avuk a;
                private final dltm b;

                {
                    this.a = this;
                    this.b = dltmVar;
                }

                @Override // defpackage.avif
                public final void a() {
                    avuk avukVar = this.a;
                    avukVar.c.o(this.b);
                }
            });
        } else {
            this.c.o(dltmVar);
        }
    }
}
