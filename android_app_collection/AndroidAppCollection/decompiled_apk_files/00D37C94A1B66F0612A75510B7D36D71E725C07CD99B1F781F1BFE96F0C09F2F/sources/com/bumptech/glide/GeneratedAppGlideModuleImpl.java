package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.support.rastermill.FrameSequenceDrawable;
import android.text.format.Formatter;
import com.google.android.libraries.youtube.rendering.image.glide.GlideLoaderModule;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final GlideLoaderModule a = new GlideLoaderModule();

    public GeneratedAppGlideModuleImpl(Context context) {
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final /* bridge */ /* synthetic */ csj a() {
        return new csi(1);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final Set b() {
        return Collections.emptySet();
    }

    @Override // defpackage.csq, defpackage.csr
    public final void c(Context context, cfr cfrVar) {
        GlideLoaderModule glideLoaderModule = this.a;
        glideLoaderModule.a(context);
        ajot ajotVar = glideLoaderModule.a;
        apfc apfcVar = (apfc) ajotVar.b.get();
        ctm ctmVar = (ctm) new ctm().u(cpi.c);
        context.getClass();
        if (((ActivityManager) context.getSystemService("activity")).getLargeMemoryClass() < 256) {
            ctmVar = (ctm) ctmVar.t();
        }
        if (apfcVar.j) {
            if (apfcVar.r) {
                ctmVar = (ctm) ctmVar.s(ckb.b);
            }
            int i = apfcVar.k;
            cfrVar.g = new clz(context, i <= 0 ? 262144000 : i * 1048576);
        } else {
            ctmVar = (ctm) ctmVar.s(ckb.a);
            cfrVar.g = new clu();
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        boolean isLowRamDevice = activityManager.isLowRamDevice();
        if (isLowRamDevice && apfcVar.s) {
            ctmVar = (ctm) ctmVar.x(chm.PREFER_RGB_565);
        }
        cfm cfmVar = new cfm(ctmVar);
        hy.N(cfmVar);
        cfrVar.i = cfmVar;
        boolean z = apfcVar.u;
        cfu cfuVar = cfrVar.o;
        cfn cfnVar = new cfn();
        boolean z2 = true;
        if (z && Build.VERSION.SDK_INT >= 29) {
            cfuVar.a.put(cfnVar.getClass(), cfnVar);
        } else {
            cfuVar.a.remove(cfnVar.getClass());
        }
        cfrVar.l = apfcVar.v;
        cmd cmdVar = new cmd(context);
        float f = apfcVar.c;
        if (f > 0.0f && f <= 1.0f) {
            hy.O(f >= 0.0f && f <= 1.0f, "Size multiplier must be between 0 and 1");
            cmdVar.e = f;
        }
        float f2 = apfcVar.d;
        if (f2 > 0.0f && f2 <= 1.0f) {
            if (f2 < 0.0f || f2 > 1.0f) {
                z2 = false;
            }
            hy.O(z2, "Low memory max size multiplier must be between 0 and 1");
            cmdVar.f = f2;
        }
        float f3 = apfcVar.e;
        if (f3 > 0.0f) {
            cmdVar.c(f3);
        }
        float f4 = apfcVar.x;
        if (f4 > 0.0f) {
            cmdVar.b(f4);
        } else if (isLowRamDevice) {
            float f5 = apfcVar.w;
            if (f5 > 0.0f) {
                cmdVar.b(f5);
            }
        }
        cmf a = cmdVar.a();
        cfrVar.h = a;
        int i2 = apfcVar.g;
        if (i2 > 0) {
            cfrVar.n = new cmc(i2 * 1048576);
        }
        if (apfcVar.q) {
            cfrVar.c = new cll(0L);
        }
        ampq ampqVar = ajotVar.d;
        boolean z3 = apfcVar.j;
        int i3 = apfcVar.k;
        boolean z4 = apfcVar.i;
        int i4 = apfcVar.l;
        String formatFileSize = Formatter.formatFileSize(context, a.b);
        String formatFileSize2 = Formatter.formatFileSize(context, a.a);
        String formatFileSize3 = Formatter.formatFileSize(context, a.c);
        activityManager.getMemoryClass();
        int i5 = apfcVar.g;
        String.valueOf(formatFileSize).length();
        String.valueOf(formatFileSize2).length();
        String.valueOf(formatFileSize3).length();
    }

    @Override // defpackage.cst, defpackage.csu
    public final void d(Context context, cfk cfkVar, cgb cgbVar) {
        cgbVar.i(InputStream.class, FrameSequenceDrawable.class, new tij(cfkVar.a));
        cgbVar.i(ByteBuffer.class, FrameSequenceDrawable.class, new tii(cfkVar.a));
        GlideLoaderModule glideLoaderModule = this.a;
        glideLoaderModule.a(context);
        ajot ajotVar = glideLoaderModule.a;
        apfc apfcVar = (apfc) ajotVar.b.get();
        if (!apfcVar.i) {
            zep.b("Glide is configured incorrectly and should be using Cronet!");
        }
        cgbVar.n(cnf.class, InputStream.class, new chk(ajotVar.a));
        cgbVar.j(cnf.class, ByteBuffer.class, new chk(ajotVar.a, 1));
        if (apfcVar.A) {
            ajox ajoxVar = (ajox) ajotVar.c.get();
            cgbVar.j(cnf.class, InputStream.class, new ajou(ajoxVar));
            cgbVar.j(cnf.class, ByteBuffer.class, new ajou(ajoxVar, 1));
        }
        cgbVar.n(avhn.class, InputStream.class, new cog(3, (char[]) null));
        cgbVar.i(InputStream.class, byte[].class, new ajnn(cfkVar.d));
        cgbVar.i(ByteBuffer.class, byte[].class, new ajnm());
    }

    @Override // defpackage.csq
    public final boolean e() {
        return false;
    }
}
