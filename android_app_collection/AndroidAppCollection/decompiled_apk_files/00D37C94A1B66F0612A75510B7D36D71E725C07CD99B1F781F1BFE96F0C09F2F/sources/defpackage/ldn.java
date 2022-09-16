package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ldn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ldn implements zdt {
    public final /* synthetic */ VoiceSearchActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldn(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    public /* synthetic */ ldn(VoiceSearchActivity voiceSearchActivity, int i) {
        this.b = i;
        this.a = voiceSearchActivity;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        String displayName;
        auro auroVar;
        int i = this.b;
        if (i == 0) {
            VoiceSearchActivity voiceSearchActivity = this.a;
            if (((Boolean) obj).booleanValue()) {
                return;
            }
            voiceSearchActivity.z.g(voiceSearchActivity.O.getRootView());
            akfp a = akfq.a();
            a.b = voiceSearchActivity.getString(R.string.select_voice_language_promo);
            a.a = voiceSearchActivity.P;
            a.g(0.6f);
            voiceSearchActivity.z.c(a.a());
            ylx.n(voiceSearchActivity, voiceSearchActivity.ac.e(), lcz.e, lcz.c);
        } else if (i == 1) {
            VoiceSearchActivity voiceSearchActivity2 = this.a;
            ldj ldjVar = (ldj) obj;
            voiceSearchActivity2.Y = ldjVar.b;
            aurq aurqVar = voiceSearchActivity2.Y;
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
            voiceSearchActivity2.K.setText(displayName);
            voiceSearchActivity2.O.setVisibility(0);
            voiceSearchActivity2.O.setOnClickListener(new ldm(voiceSearchActivity2, 2));
            voiceSearchActivity2.p.n(new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_VOZ_PLATE_ENTRY_POINT));
            ylx.n(voiceSearchActivity2, voiceSearchActivity2.ac.c(), lcz.d, new ldn(voiceSearchActivity2));
        } else if (i == 2) {
            this.a.o((String) obj);
        } else if (i == 3) {
            Throwable th = (Throwable) obj;
            this.a.o("");
        } else {
            VoiceSearchActivity voiceSearchActivity3 = this.a;
            String valueOf = String.valueOf(((Throwable) obj).getLocalizedMessage());
            if (valueOf.length() != 0) {
                "Error when creating the voice button: ".concat(valueOf);
            }
            voiceSearchActivity3.O.setVisibility(8);
        }
    }
}
