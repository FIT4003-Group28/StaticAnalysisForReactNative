package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.google.android.gms.vision.label.internal.client.ImageLabelerOptions;
import com.google.android.gms.vision.label.internal.client.LabelOptions;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cdhb  reason: default package */
/* loaded from: classes4.dex */
public final class cdhb extends cdhf {
    private final ckcw a;
    private final cdha b;

    public cdhb(ckcw ckcwVar, cdha cdhaVar) {
        this.a = ckcwVar;
        this.b = cdhaVar;
    }

    @Override // defpackage.cdhf
    public final void b(cdhe cdheVar) {
        Bitmap bitmap = cdheVar.b;
        if (bitmap == null) {
            c(cdheVar);
        } else if (!Bitmap.Config.ARGB_8888.equals(bitmap.getConfig())) {
            bitmap.getConfig();
            c(cdheVar);
        } else {
            Application application = this.b.a;
            Locale.getDefault().getLanguage();
            Locale.ENGLISH.getLanguage();
            cpfz a = cpfy.a(application, new ImageLabelerOptions(1, -1, 0.5f, 1));
            try {
                if (a.c()) {
                    cpfg cpfgVar = new cpfg();
                    cpfe.b(bitmap, cpfgVar);
                    SparseArray<cpfx> b = a.b(cpfe.a(cpfgVar), new LabelOptions(this.b.b.b));
                    boolean z = false;
                    for (int i = 0; i < b.size(); i++) {
                        cpfx cpfxVar = b.get(i);
                        cdheVar.e.add(cpfxVar);
                        if (Float.compare(cpfxVar.b, this.b.b.c) >= 0 && this.b.b.d.contains(cpfxVar.a)) {
                            z = true;
                        }
                    }
                    if (z) {
                        cdheVar.b(cdhg.CLASSIFIER_ICA_LABELS_BLOCKLISTED);
                    }
                    c(cdheVar);
                    return;
                }
                ((ckcn) this.a.a(ckdz.aH)).a();
                c(cdheVar);
            } finally {
                a.a();
            }
        }
    }
}
