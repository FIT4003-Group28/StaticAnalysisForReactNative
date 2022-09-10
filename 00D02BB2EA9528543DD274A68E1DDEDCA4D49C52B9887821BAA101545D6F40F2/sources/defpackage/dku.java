package defpackage;

import android.app.Application;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.zip.ZipInputStream;
/* compiled from: PG */
/* renamed from: dku  reason: default package */
/* loaded from: classes6.dex */
public final class dku {
    public static final dbtm a = dbtm.a('/');
    public final Application b;
    public final cvin c;
    public final Executor d;

    public dku(Application application, cvin cvinVar, Executor executor) {
        this.b = application;
        this.c = cvinVar;
        this.d = executor;
    }

    public static void a(File file, String str, final LottieAnimationView lottieAnimationView, @dzsi ImageView.ScaleType scaleType, k kVar) {
        if (!((o) kVar).a.a(j.CREATED)) {
            return;
        }
        bvrj.UI_THREAD.d();
        File file2 = new File(file.getParentFile(), str);
        dbsk.l(file.renameTo(file2));
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file2));
            bjw<bis> h = bja.h(zipInputStream, file2.getAbsolutePath());
            bis bisVar = h.a;
            if (bisVar != null) {
                dkp dkpVar = new dkp(scaleType, lottieAnimationView);
                if (lottieAnimationView.f != null) {
                    dkpVar.a();
                }
                lottieAnimationView.e.add(dkpVar);
                final bis bisVar2 = bisVar;
                lottieAnimationView.post(new Runnable(lottieAnimationView, bisVar2) { // from class: dkq
                    private final LottieAnimationView a;
                    private final bis b;

                    {
                        this.a = lottieAnimationView;
                        this.b = bisVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        LottieAnimationView lottieAnimationView2 = this.a;
                        bis bisVar3 = this.b;
                        dbtm dbtmVar = dku.a;
                        lottieAnimationView2.setComposition(bisVar3);
                    }
                });
                zipInputStream.close();
                return;
            }
            throw new IOException(h.b);
        } catch (IOException unused) {
        }
    }
}
