package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: axtv  reason: default package */
/* loaded from: classes3.dex */
public final class axtv {
    private static final dcqe b = dcqe.c("axtv");
    public final Activity a;
    private final bwqv c;
    private final cqkj d;

    public axtv(Activity activity, bwqv bwqvVar, cqkj cqkjVar) {
        this.a = activity;
        this.c = bwqvVar;
        this.d = cqkjVar;
    }

    public static Bundle a(bwqv bwqvVar, dndp dndpVar, axuc axucVar) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("aliasSettingPrompt", dndpVar.bS());
        bwqvVar.c(bundle, "aliasFlowData", axucVar);
        return bundle;
    }

    @dzsi
    public static final dndp d(Bundle bundle) {
        return (dndp) bvrs.b(bundle.getByteArray("aliasSettingPrompt"), (dssr) dndp.f.cu(7));
    }

    @dzsi
    public final axuc b(Bundle bundle) {
        try {
            return (axuc) this.c.d(axuc.class, bundle, "aliasFlowData");
        } catch (IOException unused) {
            bvoo.h("Failed to extract AfterEnableSearchHistoryCallbackData data", new Object[0]);
            return null;
        }
    }

    public final Dialog c(axvc axvcVar) {
        cqkf c = this.d.c(new axun(), null);
        c.e(axvcVar);
        gdf gdfVar = new gdf(c.c().getContext(), false);
        Window window = gdfVar.getWindow();
        dbsk.s(window);
        window.requestFeature(1);
        gdfVar.setContentView(c.c());
        return gdfVar;
    }
}
