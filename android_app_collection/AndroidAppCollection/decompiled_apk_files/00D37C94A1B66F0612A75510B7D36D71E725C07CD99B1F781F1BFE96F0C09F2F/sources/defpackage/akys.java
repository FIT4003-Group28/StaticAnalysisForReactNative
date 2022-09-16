package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akys  reason: default package */
/* loaded from: classes.dex */
public final class akys {
    public final Context a;
    public final snc b;
    public final Executor c;
    public final aadd d;
    public final akzg e;
    public final akzp f;
    public final albo g;
    public final akze h;
    public final albf i;
    public final alfz j;
    public final alak k;
    public final axnm l;
    public final alht m;

    public akys(Context context, snc sncVar, Executor executor, aadd aaddVar, akzg akzgVar, akzp akzpVar, albo alboVar, akze akzeVar, albf albfVar, alfz alfzVar, alak alakVar, axnm axnmVar, alht alhtVar) {
        this.a = context;
        this.b = sncVar;
        this.c = executor;
        this.d = aaddVar;
        this.e = akzgVar;
        this.f = akzpVar;
        this.g = alboVar;
        this.h = akzeVar;
        this.i = albfVar;
        this.j = alfzVar;
        this.k = alakVar;
        this.l = axnmVar;
        this.m = alhtVar;
    }

    public static Bitmap a(alcw alcwVar) {
        byte[] I = alcwVar.o.I();
        return BitmapFactory.decodeByteArray(I, 0, I.length, new BitmapFactory.Options());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List c(Context context) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 23 && (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1 || context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1)) {
            arrayList.add(avuj.UPLOAD_FEATURE_NO_STORAGE_PERMISSION);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(String str, aopa aopaVar) {
        boolean contains = akzg.e(str).contains(akyz.BACKGROUND_TASK);
        aopaVar.copyOnWrite();
        alcw alcwVar = (alcw) aopaVar.instance;
        alcw alcwVar2 = alcw.a;
        alcwVar.c |= 4096;
        alcwVar.T = contains;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(aopa aopaVar, avvf avvfVar) {
        if (avvfVar.j <= 0 || avvfVar.k <= 0) {
            return false;
        }
        aopaVar.copyOnWrite();
        alcw alcwVar = (alcw) aopaVar.instance;
        alcw alcwVar2 = alcw.a;
        alcwVar.b |= 33554432;
        alcwVar.x = true;
        return true;
    }

    public static void h(Bitmap bitmap, aopa aopaVar) {
        yuo yuoVar = new yuo();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, yuoVar);
        aoob w = aoob.w(yuoVar.a());
        aopaVar.copyOnWrite();
        alcw alcwVar = (alcw) aopaVar.instance;
        alcw alcwVar2 = alcw.a;
        alcwVar.b |= 4096;
        alcwVar.o = w;
    }

    public final ankt b(final afvm afvmVar) {
        ankt v = anlz.v(new aniq() { // from class: akyj
            @Override // defpackage.aniq
            public final ankt a() {
                akys akysVar = akys.this;
                afvm afvmVar2 = afvmVar;
                aqxo.q(!afvmVar2.z(), "Cannot fetch videos for a signed-out identity.");
                String d = afvmVar2.d();
                ArrayList arrayList = new ArrayList();
                for (alcw alcwVar : akysVar.f.c().values()) {
                    String str = alcwVar.e;
                    if (!str.isEmpty() && (!alcwVar.s || alcwVar.t)) {
                        if (str.equals(d)) {
                            aopa mo52toBuilder = alcwVar.mo52toBuilder();
                            boolean i = akysVar.g.i();
                            boolean h = akysVar.g.h();
                            if (i || h) {
                                if ((((alcw) mo52toBuilder.instance).c & 8) == 0) {
                                    alct alctVar = alct.a;
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar2 = (alcw) mo52toBuilder.instance;
                                    alctVar.getClass();
                                    alcwVar2.H = alctVar;
                                    alcwVar2.c |= 8;
                                }
                                aopa createBuilder = alct.a.createBuilder();
                                if (i) {
                                    avun avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_WIFI;
                                    createBuilder.copyOnWrite();
                                    alct alctVar2 = (alct) createBuilder.instance;
                                    alctVar2.d = avunVar.aB;
                                    alctVar2.b |= 2;
                                } else {
                                    avun avunVar2 = avun.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_NETWORK;
                                    createBuilder.copyOnWrite();
                                    alct alctVar3 = (alct) createBuilder.instance;
                                    alctVar3.d = avunVar2.aB;
                                    alctVar3.b |= 2;
                                }
                                mo52toBuilder.copyOnWrite();
                                alcw alcwVar3 = (alcw) mo52toBuilder.instance;
                                alct alctVar4 = (alct) createBuilder.mo39build();
                                alctVar4.getClass();
                                alcwVar3.H = alctVar4;
                                alcwVar3.c |= 8;
                            }
                            String valueOf = String.valueOf(((alcw) mo52toBuilder.instance).k);
                            if (valueOf.length() != 0) {
                                "Pending Upload frontendUploadId: ".concat(valueOf);
                            }
                            arrayList.add((alcw) mo52toBuilder.mo39build());
                        }
                    }
                }
                return anlz.q(arrayList);
            }
        }, this.c);
        anlz.A(v, new akyr(this, 2), this.c);
        return v;
    }

    public final void d(alal alalVar) {
        this.k.p(alalVar);
    }

    public final void e(alal alalVar) {
        this.k.q(alalVar);
    }
}
