package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: ajna  reason: default package */
/* loaded from: classes.dex */
public final class ajna {
    public static void a(ajmz ajmzVar) {
        afus.c(2, 16, String.format("%s (%s)", ajmzVar.getClass().getSimpleName(), ajmzVar.a), ajmzVar);
    }

    public static void c(Map map, tcs tcsVar) {
        ampq b = b(tcsVar);
        if (b.h()) {
            map.put("com.google.android.libraries.youtube.logging.interaction_logger", b.c());
        }
    }

    public static void d(aopc aopcVar, tcs tcsVar, View view) {
        asjj asjjVar;
        apzh apzhVar = ((apzg) aopcVar.instance).e;
        if (apzhVar == null) {
            apzhVar = apzh.a;
        }
        aopc aopcVar2 = (aopc) apzhVar.mo52toBuilder();
        tfi tfiVar = tcsVar.c;
        if (view != null && tfiVar != null) {
            float f = view.getResources().getDisplayMetrics().density;
            if (f != 0.0f) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                aopa createBuilder = asjb.a.createBuilder();
                float f2 = tfiVar.a;
                createBuilder.copyOnWrite();
                asjb asjbVar = (asjb) createBuilder.instance;
                asjbVar.c |= 1;
                asjbVar.d = (int) (f2 / f);
                float f3 = tfiVar.b;
                createBuilder.copyOnWrite();
                asjb asjbVar2 = (asjb) createBuilder.instance;
                asjbVar2.c |= 2;
                asjbVar2.e = (int) (f3 / f);
                int measuredWidth = view.getMeasuredWidth();
                createBuilder.copyOnWrite();
                asjb asjbVar3 = (asjb) createBuilder.instance;
                asjbVar3.c |= 4;
                asjbVar3.f = (int) (measuredWidth / f);
                int measuredHeight = view.getMeasuredHeight();
                createBuilder.copyOnWrite();
                asjb asjbVar4 = (asjb) createBuilder.instance;
                asjbVar4.c |= 8;
                asjbVar4.g = (int) (measuredHeight / f);
                int i = iArr[0];
                createBuilder.copyOnWrite();
                asjb asjbVar5 = (asjb) createBuilder.instance;
                asjbVar5.c |= 256;
                asjbVar5.l = (int) (i / f);
                int i2 = iArr[1];
                createBuilder.copyOnWrite();
                asjb asjbVar6 = (asjb) createBuilder.instance;
                asjbVar6.c |= 512;
                asjbVar6.m = (int) (i2 / f);
                int i3 = view.getResources().getConfiguration().orientation;
                if (i3 == 1) {
                    createBuilder.copyOnWrite();
                    asjb asjbVar7 = (asjb) createBuilder.instance;
                    asjbVar7.n = 1;
                    asjbVar7.c |= 2048;
                } else if (i3 == 2) {
                    createBuilder.copyOnWrite();
                    asjb asjbVar8 = (asjb) createBuilder.instance;
                    asjbVar8.n = 5;
                    asjbVar8.c |= 2048;
                } else if (i3 == 3) {
                    createBuilder.copyOnWrite();
                    asjb asjbVar9 = (asjb) createBuilder.instance;
                    asjbVar9.n = 6;
                    asjbVar9.c |= 2048;
                } else {
                    createBuilder.copyOnWrite();
                    asjb asjbVar10 = (asjb) createBuilder.instance;
                    asjbVar10.n = 0;
                    asjbVar10.c |= 2048;
                }
                while (view != null && !(view instanceof dci)) {
                    view = (ViewGroup) view.getParent();
                }
                if (view instanceof dci) {
                    int[] iArr2 = new int[2];
                    view.getLocationOnScreen(iArr2);
                    int measuredWidth2 = view.getMeasuredWidth();
                    createBuilder.copyOnWrite();
                    asjb asjbVar11 = (asjb) createBuilder.instance;
                    asjbVar11.c |= 64;
                    asjbVar11.j = (int) (measuredWidth2 / f);
                    int measuredHeight2 = view.getMeasuredHeight();
                    createBuilder.copyOnWrite();
                    asjb asjbVar12 = (asjb) createBuilder.instance;
                    asjbVar12.c |= 128;
                    asjbVar12.k = (int) (measuredHeight2 / f);
                    int i4 = iArr[0];
                    int i5 = iArr2[0];
                    createBuilder.copyOnWrite();
                    asjb asjbVar13 = (asjb) createBuilder.instance;
                    asjbVar13.c |= 16;
                    asjbVar13.h = (int) ((i4 - i5) / f);
                    int i6 = iArr[1];
                    int i7 = iArr2[1];
                    createBuilder.copyOnWrite();
                    asjb asjbVar14 = (asjb) createBuilder.instance;
                    asjbVar14.c |= 32;
                    asjbVar14.i = (int) ((i6 - i7) / f);
                }
                aopcVar2.e(asjb.b, (asjb) createBuilder.mo39build());
            }
        }
        Object obj = tcsVar.d;
        if ((obj instanceof ajjf) && (asjjVar = ((ajjf) obj).b) != null) {
            aopcVar2.e(askh.a, asjjVar);
        }
        apzh apzhVar2 = (apzh) aopcVar2.mo39build();
        aopcVar.copyOnWrite();
        apzg apzgVar = (apzg) aopcVar.instance;
        apzhVar2.getClass();
        apzgVar.e = apzhVar2;
        apzgVar.b |= 2;
    }

    public static ImageView.ScaleType e(int i) {
        return i != 2 ? i != 3 ? i != 4 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.CENTER_INSIDE;
    }

    public static void f(ajmy ajmyVar, tfl tflVar, avhm avhmVar, int i, int i2, teb tebVar, tda tdaVar, Executor executor) {
        if (tflVar != null || avhmVar == null) {
            return;
        }
        try {
            executor.execute(new ajkz(ajmyVar, avhmVar, i, i2));
        } catch (RejectedExecutionException e) {
            tebVar.a(28, "Image preload rejected", tdaVar, e);
        }
    }

    public static ajfz g(Object obj) {
        String str;
        String str2;
        boolean z = false;
        byte[] bArr = new byte[0];
        ajfy ajfyVar = ajfy.UNKNOWN;
        if (obj instanceof atof) {
            atof atofVar = (atof) obj;
            str2 = atofVar.e;
            if ((atofVar.b & 4) != 0) {
                bArr = atofVar.f.I();
            }
            ajfyVar = ajfy.NEXT;
        } else if (obj instanceof atoh) {
            atoh atohVar = (atoh) obj;
            str2 = atohVar.c;
            if ((atohVar.b & 2) != 0) {
                bArr = atohVar.d.I();
            }
            ajfyVar = ajfy.NEXT_RADIO;
        } else if (obj instanceof augq) {
            augq augqVar = (augq) obj;
            str2 = augqVar.c;
            if ((augqVar.b & 2) != 0) {
                bArr = augqVar.d.I();
            }
            ajfyVar = ajfy.PREVIOUS;
        } else if (obj instanceof aumx) {
            aumx aumxVar = (aumx) obj;
            str2 = aumxVar.d;
            if ((aumxVar.c & 16) != 0) {
                bArr = aumxVar.f.I();
            }
            ajfyVar = ajfy.RELOAD;
            z = aumxVar.e;
        } else if (obj instanceof avia) {
            avia aviaVar = (avia) obj;
            str2 = aviaVar.d;
            if ((aviaVar.b & 4) != 0) {
                bArr = aviaVar.e.I();
            }
            ajfyVar = ajfy.TIMED;
        } else if (obj instanceof aoxj) {
            aoxj aoxjVar = (aoxj) obj;
            str2 = aoxjVar.d;
            if ((aoxjVar.b & 4) != 0) {
                bArr = aoxjVar.c.I();
            }
            ajfyVar = ajfy.ADDITIONAL_ACCOUNT;
        } else if (obj instanceof askw) {
            askw askwVar = (askw) obj;
            str2 = askwVar.e;
            if ((askwVar.b & 64) != 0) {
                bArr = askwVar.f.I();
            }
            ajfyVar = ajfy.INVALIDATION;
        } else {
            if (obj instanceof attr) {
                attr attrVar = (attr) obj;
                str = attrVar.c;
                if ((attrVar.b & 2) != 0) {
                    bArr = attrVar.d.I();
                }
            } else if (obj instanceof aubu) {
                aubu aubuVar = (aubu) obj;
                str = aubuVar.c;
                if ((aubuVar.b & 2) != 0) {
                    bArr = aubuVar.d.I();
                }
            } else if (!(obj instanceof assq)) {
                return null;
            } else {
                assq assqVar = (assq) obj;
                str = assqVar.d;
                if ((assqVar.b & 4) != 0) {
                    bArr = assqVar.e.I();
                }
            }
            str2 = str;
        }
        ajgb ajgbVar = new ajgb();
        obj.getClass();
        ajgbVar.d = obj;
        ajgbVar.b = bArr;
        ajfyVar.getClass();
        ajgbVar.c = ajfyVar;
        ajgbVar.a = str2;
        ajgbVar.e = z;
        String str3 = ajgbVar.c == null ? " type" : "";
        if (ajgbVar.d == null) {
            str3 = str3.concat(" continuation");
        }
        if (!str3.isEmpty()) {
            String valueOf = String.valueOf(str3);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ajgc(ajgbVar.a, ajgbVar.b, ajgbVar.c, ajgbVar.d, ajgbVar.e);
    }

    public static Object h(ajfz ajfzVar, Class cls) {
        if (ajfzVar instanceof ajgc) {
            ajgc ajgcVar = (ajgc) ajfzVar;
            if (!cls.isAssignableFrom(ajgcVar.c.getClass())) {
                return null;
            }
            return ajgcVar.c;
        }
        return null;
    }

    public static PlayerResponseModel i(ajff ajffVar) {
        return ajffVar.p().c;
    }

    public static PlaybackStartDescriptor j(ajff ajffVar) {
        return ajffVar.p().a;
    }

    public static aijp k(ajff ajffVar) {
        return ajffVar.p().b;
    }

    public static int[] l() {
        return new int[]{16777217, 16777216, 1, 16711681, 16776961, 65281, 65536, 256, 16711936};
    }

    public static ampq b(tcs tcsVar) {
        tdq tdqVar = tcsVar.f;
        tdz tdzVar = tcsVar.h;
        acti actiVar = null;
        tee teeVar = tdzVar == null ? null : tdzVar.d;
        if (tdqVar instanceof ajjk) {
            actiVar = ((ajjk) tdqVar).a;
        } else if (teeVar instanceof acuq) {
            actiVar = ((acuq) teeVar).a;
        }
        return ampq.i(actiVar);
    }
}
