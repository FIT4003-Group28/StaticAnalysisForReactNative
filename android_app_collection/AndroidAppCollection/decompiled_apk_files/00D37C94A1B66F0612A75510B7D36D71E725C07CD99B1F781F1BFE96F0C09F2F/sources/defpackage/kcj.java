package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import j$.util.Optional;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: kcj  reason: default package */
/* loaded from: classes3.dex */
public final class kcj {
    public final Vibrator a;
    public final Optional b;
    public final boolean c;
    public final Handler d;
    public final int e;
    public final Runnable f;

    public kcj(Context context, Handler handler, aacz aaczVar) {
        this.a = (Vibrator) context.getSystemService("vibrator");
        this.d = handler;
        asxj asxjVar = aaczVar.b().e;
        this.c = (asxjVar == null ? asxj.a : asxjVar).cM;
        asxj asxjVar2 = aaczVar.b().e;
        this.e = (asxjVar2 == null ? asxj.a : asxjVar2).bK;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = Optional.of(VibrationEffect.createOneShot(25L, PrivateKeyType.INVALID));
        } else {
            this.b = Optional.empty();
        }
        this.f = new Runnable() { // from class: kci
            @Override // java.lang.Runnable
            public final void run() {
                kcj kcjVar = kcj.this;
                try {
                    if (!kcjVar.b.isPresent() || Build.VERSION.SDK_INT <= 26) {
                        kcjVar.a.vibrate(25L);
                    } else {
                        kcjVar.a.vibrate((VibrationEffect) kcjVar.b.get());
                    }
                } catch (RuntimeException e) {
                    zep.d("Failed to easy seek haptics vibrate.", e);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.d.removeCallbacks(this.f);
    }
}
