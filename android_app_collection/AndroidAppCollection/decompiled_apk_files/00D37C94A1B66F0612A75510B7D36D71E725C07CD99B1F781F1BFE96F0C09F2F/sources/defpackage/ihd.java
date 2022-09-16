package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ihd  reason: default package */
/* loaded from: classes3.dex */
public final class ihd implements alax {
    final /* synthetic */ ihl a;

    public ihd(ihl ihlVar) {
        this.a = ihlVar;
    }

    @Override // defpackage.alax
    public final void a(final String str, String str2, final augw augwVar) {
        this.a.b.execute(new Runnable() { // from class: igz
            @Override // java.lang.Runnable
            public final void run() {
                ihd ihdVar = ihd.this;
                String str3 = str;
                augw augwVar2 = augwVar;
                ggq ggqVar = (ggq) ihdVar.a.e.get(str3);
                if (ggqVar != null) {
                    ggqVar.g = augwVar2.b;
                    ihdVar.a.k(str3);
                }
            }
        });
    }

    @Override // defpackage.alax
    public final void b(final String str, String str2, final avhj avhjVar) {
        this.a.b.execute(new Runnable() { // from class: iha
            @Override // java.lang.Runnable
            public final void run() {
                ImageView imageView;
                ihd ihdVar = ihd.this;
                String str3 = str;
                avhj avhjVar2 = avhjVar;
                ihl ihlVar = ihdVar.a;
                if (!ihlVar.h) {
                    avhn avhnVar = avhjVar2.b;
                    if (avhnVar == null) {
                        avhnVar = avhn.a;
                    }
                    View findViewWithTag = ihlVar.f.findViewWithTag(str3);
                    if (findViewWithTag == null || (imageView = (ImageView) findViewWithTag.findViewById(R.id.reel_upload_thumbnail)) == null) {
                        return;
                    }
                    new ajnj(new ajmq(ihlVar.c), new yyj(), imageView, true).k(avhnVar);
                }
            }
        });
    }

    @Override // defpackage.alax
    public final void c(final String str, String str2, final avtl avtlVar) {
        this.a.b.execute(new Runnable() { // from class: ihb
            @Override // java.lang.Runnable
            public final void run() {
                ihd ihdVar = ihd.this;
                String str3 = str;
                avtl avtlVar2 = avtlVar;
                if (((ggq) ihdVar.a.e.get(str3)) == null || (avtlVar2.b & 1) == 0) {
                    return;
                }
                ates atesVar = avtlVar2.c;
                if (atesVar == null) {
                    atesVar = ates.a;
                }
                if ((atesVar.b & 1) == 0) {
                    return;
                }
                ates atesVar2 = avtlVar2.c;
                if (atesVar2 == null) {
                    atesVar2 = ates.a;
                }
                if (atesVar2.c != null) {
                    return;
                }
                atep atepVar = atep.a;
            }
        });
    }

    @Override // defpackage.alax
    public final void d(final String str, String str2, final avvd avvdVar) {
        this.a.b.execute(new Runnable() { // from class: ihc
            @Override // java.lang.Runnable
            public final void run() {
                ihd ihdVar = ihd.this;
                String str3 = str;
                avvd avvdVar2 = avvdVar;
                ggq ggqVar = (ggq) ihdVar.a.e.get(str3);
                if (avvdVar2 == null || ggqVar == null) {
                    return;
                }
                int ai = awwc.ai(avvdVar2.c);
                if (ai == 0) {
                    ai = 1;
                }
                ggqVar.i = ai;
                int ai2 = awwc.ai(avvdVar2.c);
                if (ai2 == 0 || ai2 != 3) {
                    return;
                }
                ihdVar.a.l(ggqVar);
            }
        });
    }

    @Override // defpackage.alax
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.alax
    public final /* synthetic */ void f(String str, Exception exc) {
    }

    @Override // defpackage.alax
    public final /* synthetic */ void g() {
    }
}
