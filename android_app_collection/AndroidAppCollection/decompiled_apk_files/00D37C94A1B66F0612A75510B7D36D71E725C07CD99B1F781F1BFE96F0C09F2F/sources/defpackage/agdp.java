package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: agdp  reason: default package */
/* loaded from: classes.dex */
public final class agdp implements ageb {
    private final Context a;
    private final int b;
    private final agcp c;

    public agdp(Context context, int i, agcp agcpVar) {
        this.a = context;
        this.b = i;
        this.c = agcpVar;
    }

    @Override // defpackage.ageb
    public final void a(apgq apgqVar, acti actiVar, aged agedVar, fi fiVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        arag aragVar5;
        apgm apgmVar = apgqVar.e;
        if (apgmVar == null) {
            apgmVar = apgm.a;
        }
        fiVar.g(true);
        arag aragVar6 = null;
        if ((apgmVar.b & 8) != 0) {
            aragVar = apgmVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        fiVar.k(ajgl.b(aragVar));
        if ((apgmVar.b & 16) != 0) {
            aragVar2 = apgmVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        fiVar.j(ajgl.b(aragVar2));
        if ((apgmVar.b & 64) != 0) {
            aragVar3 = apgmVar.i;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        fiVar.i(ajgl.b(aragVar3));
        if ((apgmVar.b & 32) != 0) {
            aragVar4 = apgmVar.h;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        fiVar.t(ajgl.b(aragVar4));
        fiVar.r(this.b);
        fiVar.z = ake.d(this.a, R.color.small_icon_background);
        fh fhVar = new fh();
        if ((apgmVar.b & 16) != 0) {
            aragVar5 = apgmVar.g;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
        } else {
            aragVar5 = null;
        }
        fhVar.c(ajgl.b(aragVar5));
        if ((apgmVar.b & 8) != 0 && (aragVar6 = apgmVar.f) == null) {
            aragVar6 = arag.a;
        }
        fhVar.d(ajgl.b(aragVar6));
        fiVar.s(fhVar);
        apgm apgmVar2 = apgqVar.e;
        if (apgmVar2 == null) {
            apgmVar2 = apgm.a;
        }
        int i = true != apgmVar2.o ? 0 : 4;
        if (apgmVar2.n && this.c.c("com.google.android.libraries.youtube.notification.pref.notification_sound_enabled", true)) {
            i |= 1;
        }
        if (apgmVar2.p && apgqVar.n.size() == 0) {
            i |= 2;
        }
        fiVar.l(i);
        int i2 = apgmVar.e;
        fiVar.k = i2;
        if (i2 == -1) {
            fiVar.w = true;
        }
        if ((apgmVar.b & 32768) != 0) {
            fiVar.x = apgmVar.r;
        }
        if (apgqVar.n.size() > 0) {
            Object[] array = apgqVar.n.toArray();
            int length = array.length;
            long[] jArr = new long[length];
            for (int i3 = 0; i3 < length; i3++) {
                Object obj = array[i3];
                obj.getClass();
                jArr[i3] = ((Number) obj).longValue();
            }
            fiVar.v(jArr);
        }
        if ((apgqVar.b & 32768) != 0) {
            Bundle bundle = new Bundle();
            asvv asvvVar = apgqVar.u;
            if (asvvVar == null) {
                asvvVar = asvv.b;
            }
            if (asvvVar != null) {
                bundle.putByteArray("logging_directive", asvvVar.toByteArray());
            }
            InteractionLoggingScreen interactionLoggingScreen = ((acsx) actiVar).i;
            if (interactionLoggingScreen != null) {
                bundle.putBundle("interaction_screen_bundle_extra", ahfe.e(interactionLoggingScreen));
            }
            fiVar.y = bundle;
        }
    }
}
