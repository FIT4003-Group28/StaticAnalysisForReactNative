package defpackage;

import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.io.File;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dkt  reason: default package */
/* loaded from: classes6.dex */
final class dkt implements cvib {
    final /* synthetic */ String a;
    final /* synthetic */ LottieAnimationView b;
    final /* synthetic */ ImageView.ScaleType c;
    final /* synthetic */ k d;
    final /* synthetic */ dku e;

    public dkt(dku dkuVar, String str, LottieAnimationView lottieAnimationView, ImageView.ScaleType scaleType, k kVar) {
        this.e = dkuVar;
        this.a = str;
        this.b = lottieAnimationView;
        this.c = scaleType;
        this.d = kVar;
    }

    @Override // defpackage.cvib
    public final void a(File file, cvia cviaVar) {
        dbtm dbtmVar = dku.a;
    }

    @Override // defpackage.cvib
    public final void b(final File file) {
        Executor executor = this.e.d;
        final String str = this.a;
        final LottieAnimationView lottieAnimationView = this.b;
        final ImageView.ScaleType scaleType = this.c;
        final k kVar = this.d;
        executor.execute(new Runnable(file, str, lottieAnimationView, scaleType, kVar) { // from class: dks
            private final File a;
            private final String b;
            private final LottieAnimationView c;
            private final ImageView.ScaleType d;
            private final k e;

            {
                this.a = file;
                this.b = str;
                this.c = lottieAnimationView;
                this.d = scaleType;
                this.e = kVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dku.a(this.a, this.b, this.c, this.d, this.e);
            }
        });
    }
}
