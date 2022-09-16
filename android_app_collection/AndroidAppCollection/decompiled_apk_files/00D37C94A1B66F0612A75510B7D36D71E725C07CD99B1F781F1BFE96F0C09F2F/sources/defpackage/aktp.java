package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: aktp  reason: default package */
/* loaded from: classes.dex */
public final class aktp {
    private final Context d;
    private final int e;
    private final int f;
    private final int g;
    private final long h;
    private final int i;
    private final String j;
    private final String k;
    private final String l;
    private final int m;
    private int o;
    private int p;
    private final yrj q;
    private boolean r;
    public boolean a = true;
    private int n = 0;
    public int b = 1;
    public int c = 2;

    public aktp(Context context, yrj yrjVar) {
        SystemClock.elapsedRealtime();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        SystemClock.elapsedRealtime();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        SystemClock.elapsedRealtime();
        int i = Build.VERSION.SDK_INT;
        String str = Build.VERSION.INCREMENTAL;
        String str2 = Build.FINGERPRINT;
        SystemClock.elapsedRealtime();
        String property = System.getProperty("os.arch");
        SystemClock.elapsedRealtime();
        this.m = zfm.a(context);
        SystemClock.elapsedRealtime();
        this.d = context;
        this.e = displayMetrics.densityDpi;
        this.f = displayMetrics.heightPixels;
        this.g = displayMetrics.widthPixels;
        this.h = j / 1024;
        this.i = i;
        this.j = str;
        this.k = str2;
        this.l = property;
        this.q = yrjVar;
    }

    private final void e() {
        try {
            this.r = uul.c(this.d);
        } catch (Throwable unused) {
        }
    }

    public final void a(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        int intExtra2 = intent.getIntExtra("plugged", -1);
        if (intExtra != 5 && intExtra != 2) {
            this.b = 2;
        } else if (intExtra2 == 1) {
            this.b = 4;
        } else if (intExtra2 == 2) {
            this.b = 3;
        } else if (intExtra2 == 4) {
            this.b = 5;
        } else {
            this.b = 1;
        }
        int ax = awwc.ax(intent.getIntExtra("health", 1));
        this.c = ax;
        if (ax == 0) {
            this.c = 2;
        }
    }

    public final boolean b() {
        e();
        return this.r;
    }

    public final void c(aopa aopaVar) {
        NetworkInfo d = this.q.d();
        if (d == null) {
            this.o = 0;
            this.p = NetworkInfo.State.DISCONNECTED.ordinal();
        } else {
            this.o = d.getType();
            this.p = d.getState().ordinal();
        }
        this.n = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay().getRotation();
        e();
        avek avekVar = ((aven) aopaVar.instance).e;
        if (avekVar == null) {
            avekVar = avek.a;
        }
        aopa mo52toBuilder = avekVar.mo52toBuilder();
        boolean z = this.a;
        mo52toBuilder.copyOnWrite();
        avek avekVar2 = (avek) mo52toBuilder.instance;
        avekVar2.b |= 1;
        avekVar2.c = z;
        int i = this.n;
        mo52toBuilder.copyOnWrite();
        avek avekVar3 = (avek) mo52toBuilder.instance;
        avekVar3.b |= 2;
        avekVar3.d = i;
        int i2 = this.o;
        mo52toBuilder.copyOnWrite();
        avek avekVar4 = (avek) mo52toBuilder.instance;
        avekVar4.b |= 4;
        avekVar4.e = i2;
        int i3 = this.p;
        mo52toBuilder.copyOnWrite();
        avek avekVar5 = (avek) mo52toBuilder.instance;
        avekVar5.b |= 8;
        avekVar5.f = i3;
        int i4 = this.b;
        mo52toBuilder.copyOnWrite();
        avek avekVar6 = (avek) mo52toBuilder.instance;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        avekVar6.g = i5;
        avekVar6.b |= 16;
        boolean z2 = this.r;
        mo52toBuilder.copyOnWrite();
        avek avekVar7 = (avek) mo52toBuilder.instance;
        avekVar7.b |= 32;
        avekVar7.h = z2;
        aopaVar.copyOnWrite();
        aven avenVar = (aven) aopaVar.instance;
        avek avekVar8 = (avek) mo52toBuilder.mo39build();
        avekVar8.getClass();
        avenVar.e = avekVar8;
        avenVar.b |= 4;
    }

    public final void d(aopa aopaVar) {
        avel avelVar = ((aven) aopaVar.instance).d;
        if (avelVar == null) {
            avelVar = avel.a;
        }
        aopa mo52toBuilder = avelVar.mo52toBuilder();
        int i = this.e;
        mo52toBuilder.copyOnWrite();
        avel avelVar2 = (avel) mo52toBuilder.instance;
        avelVar2.b |= 1;
        avelVar2.c = i;
        int i2 = this.f;
        mo52toBuilder.copyOnWrite();
        avel avelVar3 = (avel) mo52toBuilder.instance;
        avelVar3.b |= 2;
        avelVar3.d = i2;
        int i3 = this.g;
        mo52toBuilder.copyOnWrite();
        avel avelVar4 = (avel) mo52toBuilder.instance;
        avelVar4.b |= 4;
        avelVar4.e = i3;
        long j = this.h;
        mo52toBuilder.copyOnWrite();
        avel avelVar5 = (avel) mo52toBuilder.instance;
        avelVar5.b |= 8;
        avelVar5.f = j;
        int i4 = this.i;
        mo52toBuilder.copyOnWrite();
        avel avelVar6 = (avel) mo52toBuilder.instance;
        avelVar6.b |= 16;
        avelVar6.g = i4;
        String str = this.j;
        mo52toBuilder.copyOnWrite();
        avel avelVar7 = (avel) mo52toBuilder.instance;
        str.getClass();
        avelVar7.b |= 32;
        avelVar7.h = str;
        String str2 = this.k;
        mo52toBuilder.copyOnWrite();
        avel avelVar8 = (avel) mo52toBuilder.instance;
        str2.getClass();
        avelVar8.b |= 512;
        avelVar8.k = str2;
        String str3 = this.l;
        mo52toBuilder.copyOnWrite();
        avel avelVar9 = (avel) mo52toBuilder.instance;
        str3.getClass();
        avelVar9.b |= 64;
        avelVar9.i = str3;
        int i5 = this.m;
        mo52toBuilder.copyOnWrite();
        avel avelVar10 = (avel) mo52toBuilder.instance;
        avelVar10.b |= 128;
        avelVar10.j = i5;
        aopaVar.copyOnWrite();
        aven avenVar = (aven) aopaVar.instance;
        avel avelVar11 = (avel) mo52toBuilder.mo39build();
        avelVar11.getClass();
        avenVar.d = avelVar11;
        avenVar.b |= 2;
    }
}
