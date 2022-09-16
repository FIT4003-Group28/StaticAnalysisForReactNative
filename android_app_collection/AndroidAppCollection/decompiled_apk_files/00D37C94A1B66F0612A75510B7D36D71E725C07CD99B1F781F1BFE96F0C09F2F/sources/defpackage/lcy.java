package defpackage;

import android.view.View;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: lcy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lcy implements zdt {
    public final /* synthetic */ lda a;
    private final /* synthetic */ int b;

    public /* synthetic */ lcy(lda ldaVar) {
        this.a = ldaVar;
    }

    public /* synthetic */ lcy(lda ldaVar, int i) {
        this.b = i;
        this.a = ldaVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        String displayName;
        auro auroVar;
        int i = this.b;
        if (i == 0) {
            lda ldaVar = this.a;
            if (((Boolean) obj).booleanValue()) {
                return;
            }
            ldaVar.h.g(ldaVar.e.getRootView());
            akfp a = akfq.a();
            a.b = ldaVar.e.getResources().getString(R.string.select_voice_language_promo);
            a.a = ldaVar.f;
            a.g(0.6f);
            ldaVar.h.c(a.a());
            ylx.n(ldaVar.a, ldaVar.g.x.e(), lcz.f, lcz.g);
        } else if (i != 1) {
            lda ldaVar2 = this.a;
            String valueOf = String.valueOf(((Throwable) obj).getLocalizedMessage());
            if (valueOf.length() != 0) {
                "Error when creating the voice button: ".concat(valueOf);
            }
            ldaVar2.e.setVisibility(8);
        } else {
            final lda ldaVar3 = this.a;
            ldj ldjVar = (ldj) obj;
            ldaVar3.i = ldjVar.b;
            aurq aurqVar = ldaVar3.i;
            String str = ldjVar.a;
            Iterator it = aurqVar.e.iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    for (aurp aurpVar : ((aurw) it.next()).c) {
                        if (aurpVar.b == 64166933) {
                            auroVar = (auro) aurpVar.c;
                        } else {
                            auroVar = auro.a;
                        }
                        if (akzj.i(auroVar.e, str)) {
                            displayName = auroVar.c;
                            break loop0;
                        }
                    }
                } else {
                    List h = amqf.b('-').h(str);
                    displayName = new Locale((String) h.get(0), akzj.h((String) h.get(1))).getDisplayName();
                    break;
                }
            }
            ldaVar3.d.setText(displayName);
            ldaVar3.e.setVisibility(0);
            ldaVar3.e.setOnClickListener(new View.OnClickListener() { // from class: lcx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lda ldaVar4 = lda.this;
                    lec lecVar = ldaVar4.g;
                    lecVar.l();
                    lecVar.c.h();
                    ldi aG = ldi.aG(ldaVar4.i, ldaVar4.b);
                    ldaVar4.b.H(3, new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_VOZ_PLATE_ENTRY_POINT), null);
                    ex l = ldaVar4.c.l();
                    l.r(aG, "VOICE_LANGUAGE_SELECTOR_FRAGMENT");
                    l.a();
                }
            });
            ldaVar3.b.n(new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_VOZ_PLATE_ENTRY_POINT));
            ylx.n(ldaVar3.a, ldaVar3.g.x.c(), lcz.a, new lcy(ldaVar3));
        }
    }
}
