package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
/* compiled from: PG */
/* renamed from: acuu  reason: default package */
/* loaded from: classes.dex */
public final class acuu {
    public Bundle a = null;

    public static Bundle a(acti actiVar) {
        InteractionLoggingScreen c;
        if (actiVar == null || (c = actiVar.c()) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("tracking_interaction_parent_csn", c.a);
        c.c();
        bundle.putInt("tracking_interaction_parent_ve", c.c().a);
        return bundle;
    }

    public static Bundle b(apzg apzgVar) {
        Bundle bundle = null;
        if (apzgVar != null && apzgVar.qn(atno.b)) {
            atnp atnpVar = (atnp) apzgVar.qm(atno.b);
            if ((atnpVar.b & 1) != 0) {
                bundle = new Bundle();
                bundle.putString("tracking_interaction_parent_csn", atnpVar.c);
                int i = atnpVar.d;
                if (i > 0) {
                    bundle.putInt("tracking_interaction_parent_ve", i);
                }
                if ((apzgVar.b & 1) != 0) {
                    bundle.putByteArray("tracking_interaction_click_tracking_params", apzgVar.c.I());
                }
            }
        }
        return bundle;
    }

    public static apzg c(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("tracking_interaction_parent_csn")) {
            return null;
        }
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopa createBuilder = atnp.a.createBuilder();
        String string = bundle.getString("tracking_interaction_parent_csn");
        if (string != null) {
            createBuilder.copyOnWrite();
            atnp atnpVar = (atnp) createBuilder.instance;
            atnpVar.b |= 1;
            atnpVar.c = string;
        }
        if (bundle.containsKey("tracking_interaction_parent_ve")) {
            int i = bundle.getInt("tracking_interaction_parent_ve");
            createBuilder.copyOnWrite();
            atnp atnpVar2 = (atnp) createBuilder.instance;
            atnpVar2.b |= 2;
            atnpVar2.d = i;
        }
        if (bundle.containsKey("tracking_interaction_click_tracking_params")) {
            byte[] byteArray = bundle.getByteArray("tracking_interaction_click_tracking_params");
            if (byteArray == null) {
                aopcVar.copyOnWrite();
                apzg apzgVar = (apzg) aopcVar.instance;
                apzgVar.b &= -2;
                apzgVar.c = apzg.a.c;
            } else {
                aoob x = aoob.x(byteArray);
                aopcVar.copyOnWrite();
                apzg apzgVar2 = (apzg) aopcVar.instance;
                apzgVar2.b |= 1;
                apzgVar2.c = x;
            }
        }
        aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }
}
