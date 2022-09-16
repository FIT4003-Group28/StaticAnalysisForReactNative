package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: len  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class len implements zdt {
    public final /* synthetic */ VoiceSearchHalfPlateV0Activity a;
    private final /* synthetic */ int b;

    public /* synthetic */ len(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity) {
        this.a = voiceSearchHalfPlateV0Activity;
    }

    public /* synthetic */ len(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity, int i) {
        this.b = i;
        this.a = voiceSearchHalfPlateV0Activity;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        String displayName;
        auro auroVar;
        int i = this.b;
        if (i == 0) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
            String valueOf = String.valueOf(((Throwable) obj).getLocalizedMessage());
            if (valueOf.length() != 0) {
                "Error when creating the voice button: ".concat(valueOf);
            }
            voiceSearchHalfPlateV0Activity.M.setVisibility(8);
        } else if (i == 1) {
            Throwable th = (Throwable) obj;
            this.a.o("");
        } else if (i == 2) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
            ldj ldjVar = (ldj) obj;
            voiceSearchHalfPlateV0Activity2.W = ldjVar.b;
            aurq aurqVar = voiceSearchHalfPlateV0Activity2.W;
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
            voiceSearchHalfPlateV0Activity2.I.setText(displayName);
            voiceSearchHalfPlateV0Activity2.M.setVisibility(0);
            voiceSearchHalfPlateV0Activity2.M.setOnClickListener(new lep(voiceSearchHalfPlateV0Activity2, 4));
            voiceSearchHalfPlateV0Activity2.p.n(new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_VOZ_PLATE_ENTRY_POINT));
            ylx.n(voiceSearchHalfPlateV0Activity2, voiceSearchHalfPlateV0Activity2.Z.c(), lcz.h, new len(voiceSearchHalfPlateV0Activity2, 3));
        } else {
            if (i == 3) {
                VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity3 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                voiceSearchHalfPlateV0Activity3.z.g(voiceSearchHalfPlateV0Activity3.M.getRootView());
                akfp a = akfq.a();
                a.b = voiceSearchHalfPlateV0Activity3.getString(R.string.select_voice_language_promo);
                a.a = voiceSearchHalfPlateV0Activity3.N;
                a.g(0.6f);
                voiceSearchHalfPlateV0Activity3.z.c(a.a());
                ylx.n(voiceSearchHalfPlateV0Activity3, voiceSearchHalfPlateV0Activity3.Z.e(), lcz.i, lcz.j);
                return;
            }
            this.a.o((String) obj);
        }
    }
}
