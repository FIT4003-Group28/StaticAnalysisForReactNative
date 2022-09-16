package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
/* compiled from: PG */
/* renamed from: gyq  reason: default package */
/* loaded from: classes3.dex */
public final class gyq {
    public final acti a;

    public gyq(acti actiVar) {
        this.a = actiVar;
    }

    public static apzg d(acti actiVar, apzg apzgVar, int i) {
        if (actiVar == null || actiVar.c() == null) {
            return apzgVar;
        }
        aopa createBuilder = atnp.a.createBuilder();
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b |= 2;
        atnpVar.d = i;
        InteractionLoggingScreen c = actiVar.c();
        if (c != null) {
            String str = c.a;
            createBuilder.copyOnWrite();
            atnp atnpVar2 = (atnp) createBuilder.instance;
            str.getClass();
            atnpVar2.b |= 1;
            atnpVar2.c = str;
        }
        aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
        aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
        aopcVar.copyOnWrite();
        apzg apzgVar2 = (apzg) aopcVar.instance;
        apzgVar2.b &= -2;
        apzgVar2.c = apzg.a.c;
        return (apzg) aopcVar.mo39build();
    }

    public static boolean e(View view, boolean z) {
        if (view.getVisibility() == 0) {
            if (z) {
                z = true;
            }
        }
        return view.getVisibility() != 0 && z;
    }

    public final gyo a(actj actjVar) {
        return new gyo(this, acuo.b(actjVar.II));
    }

    public final gyo b(acup acupVar) {
        return new gyo(this, acupVar);
    }

    public final gyp c(acup acupVar) {
        return new gyp(this, acupVar);
    }
}
