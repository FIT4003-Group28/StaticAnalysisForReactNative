package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.widget.EditText;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: zqv  reason: default package */
/* loaded from: classes4.dex */
public final class zqv {
    public final zqy a;
    public final zpa b;
    private final zpg c;

    public zqv(zpa zpaVar, zpg zpgVar) {
        zqy zqyVar = new zqy(zpaVar);
        this.b = zpaVar;
        this.c = zpgVar;
        this.a = zqyVar;
    }

    public static final Rect h(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getHitRect(rect);
        return rect;
    }

    public static final Rect i(EditText editText) {
        Rect rect = new Rect();
        editText.getHitRect(rect);
        return rect;
    }

    public final void a(axbm axbmVar) {
        this.b.b(axbmVar);
    }

    public final void b(axbl axblVar) {
        this.b.b((axbm) axblVar.mo39build());
    }

    public final void c(zph zphVar) {
        zpg zpgVar = this.c;
        synchronized (zpgVar.d) {
            zpgVar.b.add(zphVar);
        }
    }

    public final void d(zph zphVar) {
        zpg zpgVar = this.c;
        synchronized (zpgVar.d) {
            zpgVar.b.remove(zphVar);
        }
    }

    public final void e(boolean z, zqx zqxVar) {
        f(z, amon.a, zqxVar);
    }

    public final void f(boolean z, ampq ampqVar, zqx zqxVar) {
        zpg zpgVar = this.c;
        synchronized (zpgVar.d) {
            zpgVar.a.add(zqxVar);
        }
        if (ampqVar.h()) {
            zpg zpgVar2 = this.c;
            String str = (String) ampqVar.c();
            synchronized (zpgVar2.d) {
                zpgVar2.c = ampq.j(str);
            }
        }
        zpa zpaVar = this.b;
        axap a = axaq.a();
        a.copyOnWrite();
        axaq.c((axaq) a.instance, z);
        axao a2 = axat.a();
        a2.copyOnWrite();
        axat.g((axat) a2.instance, (axaq) a.mo39build());
        zpaVar.a.add((axat) a2.mo39build());
        zoz zozVar = zpaVar.c;
        if (zozVar != null) {
            zozVar.b();
        }
    }

    public final void g(String str) {
        byte[] bArr;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            yuo yuoVar = new yuo();
            anek.g(fileInputStream, yuoVar);
            bArr = yuoVar.toByteArray();
        } catch (IOException e) {
            zep.d("Error reading video effects state file", e);
            bArr = null;
        }
        if (bArr != null) {
            try {
                axbw d = axbw.d(bArr, aoos.b());
                zpa zpaVar = this.b;
                axao a = axat.a();
                a.copyOnWrite();
                axat.f((axat) a.instance, d);
                zpaVar.a.add((axat) a.mo39build());
            } catch (aopx e2) {
                zep.d("Unable to parse video effect state event", e2);
            }
        }
    }

    public final zpk j(ampq ampqVar) {
        final zpk[] zpkVarArr = new zpk[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        f(false, ampqVar, new zqx() { // from class: zqt
            @Override // defpackage.zqx
            public final void a(File file, axbw axbwVar) {
                zpk[] zpkVarArr2 = zpkVarArr;
                CountDownLatch countDownLatch2 = countDownLatch;
                zpkVarArr2[0] = zpk.c(ampq.i(axbwVar), ampq.i(file));
                countDownLatch2.countDown();
            }
        });
        try {
            countDownLatch.await(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            afus.c(2, 9, "Failure to block on getting video effects state", e);
        }
        zpk zpkVar = zpkVarArr[0];
        return zpkVar == null ? zpk.d() : zpkVar;
    }

    public final void k(aopa aopaVar) {
        zpa zpaVar = this.b;
        axao a = axat.a();
        a.copyOnWrite();
        axat.j((axat) a.instance, (axaj) aopaVar.mo39build());
        a.toString();
        zpaVar.a.add((axat) a.mo39build());
    }
}
