package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aolu  reason: default package */
/* loaded from: classes.dex */
public final class aolu {
    public static int a(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int e(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int f(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int g(int i) {
        if (i != 51) {
            if (i == 52) {
                return 53;
            }
            switch (i) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 9;
                case 9:
                    return 10;
                case 10:
                    return 11;
                case 11:
                    return 12;
                case 12:
                    return 13;
                case 13:
                    return 14;
                case 14:
                    return 15;
                case 15:
                    return 16;
                case 16:
                    return 17;
                case 17:
                    return 18;
                case 18:
                    return 19;
                case 19:
                    return 20;
                case 20:
                    return 21;
                case 21:
                    return 22;
                case 22:
                    return 23;
                case 23:
                    return 24;
                case 24:
                    return 25;
                case 25:
                    return 26;
                case 26:
                    return 27;
                case 27:
                    return 28;
                case 28:
                    return 29;
                case 29:
                    return 30;
                case 30:
                    return 31;
                case 31:
                    return 32;
                case 32:
                    return 33;
                case 33:
                    return 34;
                case 34:
                    return 35;
                case 35:
                    return 36;
                case 36:
                    return 37;
                case 37:
                    return 38;
                case 38:
                    return 39;
                case 39:
                    return 40;
                case 40:
                    return 41;
                case 41:
                    return 42;
                case 42:
                    return 43;
                default:
                    return 0;
            }
        }
        return 52;
    }

    public static int h(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static int i(arha arhaVar) {
        int i;
        int i2;
        if (arhaVar == null || (i2 = arhaVar.e) <= 0) {
            if (arhaVar != null && (i = arhaVar.d) != 0) {
                return i;
            }
            return 3;
        }
        return i2;
    }

    public static int j(avwm avwmVar) {
        int i;
        if (avwmVar == null || (i = avwmVar.d) == 0) {
            return 3;
        }
        return i;
    }

    public static arha k(auuf auufVar) {
        auuh auuhVar = auufVar.r;
        if (auuhVar == null) {
            auuhVar = auuh.a;
        }
        if ((auuhVar.b & 4) != 0) {
            auuh auuhVar2 = auufVar.r;
            if (auuhVar2 == null) {
                auuhVar2 = auuh.a;
            }
            arha arhaVar = auuhVar2.e;
            return arhaVar == null ? arha.a : arhaVar;
        }
        return null;
    }

    public static avwm l(auuf auufVar) {
        auuh auuhVar = auufVar.r;
        if (auuhVar == null) {
            auuhVar = auuh.a;
        }
        if ((auuhVar.b & 8) != 0) {
            auuh auuhVar2 = auufVar.r;
            if (auuhVar2 == null) {
                auuhVar2 = auuh.a;
            }
            avwm avwmVar = auuhVar2.f;
            return avwmVar == null ? avwm.a : avwmVar;
        }
        return null;
    }

    public static amuk m(atep atepVar, Object obj, lmm lmmVar, aakn aaknVar) {
        amuf amufVar = new amuf();
        for (aten atenVar : atepVar.c) {
            amufVar.j(z(atenVar, obj, lmmVar, aaknVar));
        }
        return amufVar.g();
    }

    public static boolean n(atep atepVar, Object obj, lmm lmmVar, aakn aaknVar) {
        for (aten atenVar : atepVar.c) {
            if (!z(atenVar, obj, lmmVar, aaknVar).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static int o(aten atenVar) {
        int i = atenVar.b;
        if ((i & 16) != 0) {
            atej atejVar = atenVar.g;
            if (atejVar == null) {
                atejVar = atej.a;
            }
            int L = almu.L(atejVar.g);
            if (L != 0) {
                return L;
            }
            return 1;
        } else if ((i & 32) == 0) {
            return 1;
        } else {
            atek atekVar = atenVar.h;
            if (atekVar == null) {
                atekVar = atek.a;
            }
            int L2 = almu.L(atekVar.g);
            if (L2 != 0) {
                return L2;
            }
            return 1;
        }
    }

    public static Object p(ampq ampqVar, Object obj) {
        return ampqVar.h() ? ((ajws) ampqVar.c()).a(obj) : obj;
    }

    public static final Class[] q(ajwl ajwlVar, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ajwlVar.p(((aabk) obj).b());
                return null;
            } else if (i == 1) {
                ajwlVar.p(((aawi) obj).b());
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{aabk.class, aawi.class};
    }

    public static final Class[] r(ajxl ajxlVar, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ajxlVar.k = true;
                ajxlVar.J(ajxlVar.j.b((ajwz) obj));
                return null;
            } else if (i == 1) {
                ajxlVar.k = false;
                ajxlVar.J(ajxlVar.j.b((ajxd) obj));
                return null;
            } else if (i == 2) {
                ajxlVar.k = false;
                ajxlVar.J(ajxlVar.j.b((ajxe) obj));
                return null;
            } else if (i == 3) {
                ajxlVar.F((ajxp) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ajwz.class, ajxd.class, ajxe.class, ajxp.class};
    }

    public static void s(awny awnyVar, ImageView imageView, Context context, tcu tcuVar) {
        int B;
        if (!awnyVar.c.isEmpty() || (awnyVar.b & 2) == 0) {
            int b = tbz.b(context, awnyVar);
            if (b <= 0) {
                ampq b2 = tck.b(awnyVar);
                if (!b2.h()) {
                    return;
                }
                imageView.setImageDrawable(tck.a(context, (byte[]) b2.c()));
                return;
            }
            int B2 = awwc.B(awnyVar.f);
            if ((B2 == 0 || B2 != 5) && ((B = awwc.B(awnyVar.f)) == 0 || B != 4)) {
                imageView.setImageDrawable(gw.f(context.getResources(), b, null));
                return;
            }
            tfl tflVar = new tfl(null, null, tcuVar, awnyVar);
            FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(FrameSequence.decodeStream(context.getResources().openRawResource(b)));
            tflVar.b(frameSequenceDrawable);
            imageView.setImageDrawable(frameSequenceDrawable);
            tflVar.c();
            return;
        }
        imageView.setImageBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8));
    }

    public static void t(aodt aodtVar, ImageView imageView, Context context) {
        if (!(imageView instanceof ajlb)) {
            return;
        }
        ajlb ajlbVar = (ajlb) imageView;
        if (aodtVar.aa() != 0 || aodtVar.aC() == null) {
            int c = tbz.c(context, aodtVar);
            if (c > 0) {
                ajlbVar.c(gw.f(context.getResources(), c, null), aodtVar);
                return;
            }
            ampq c2 = tck.c(aodtVar);
            if (!c2.h()) {
                return;
            }
            ajlbVar.c(tck.a(context, (byte[]) c2.c()), aodtVar);
            return;
        }
        ajlbVar.b(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8), aodtVar);
    }

    public static avhn u(awny awnyVar) {
        aopc aopcVar = (aopc) avhn.a.createBuilder();
        if (awnyVar == null) {
            return (avhn) aopcVar.mo39build();
        }
        for (awoa awoaVar : awnyVar.c) {
            if (awoaVar.c == 1) {
                aopa createBuilder = avhm.a.createBuilder();
                String str = "";
                String str2 = true != (awoaVar.c == 1 ? (String) awoaVar.d : str).startsWith("//") ? str : "https:";
                if (awoaVar.c == 1) {
                    str = (String) awoaVar.d;
                }
                String valueOf = String.valueOf(str);
                String concat = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                createBuilder.copyOnWrite();
                avhm avhmVar = (avhm) createBuilder.instance;
                concat.getClass();
                avhmVar.b = 1 | avhmVar.b;
                avhmVar.c = concat;
                int i = awoaVar.e;
                createBuilder.copyOnWrite();
                avhm avhmVar2 = (avhm) createBuilder.instance;
                avhmVar2.b |= 2;
                avhmVar2.d = i;
                int i2 = awoaVar.f;
                createBuilder.copyOnWrite();
                avhm avhmVar3 = (avhm) createBuilder.instance;
                avhmVar3.b |= 4;
                avhmVar3.e = i2;
                aopcVar.cw(createBuilder);
            }
        }
        return (avhn) aopcVar.mo39build();
    }

    public static ImageView.ScaleType v(int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 2) {
                return ImageView.ScaleType.FIT_CENTER;
            }
            return i2 != 3 ? i2 != 4 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_CROP;
        }
        throw null;
    }

    public static tdu w(boolean z, axnm axnmVar, axnm axnmVar2, axnm axnmVar3, axnm axnmVar4) {
        return z ? new tgz((aolu) axnmVar.get(), (thu) axnmVar2.get(), (Executor) axnmVar3.get(), (ajiy) axnmVar4.get(), null, null, null, null) : tdu.a;
    }

    public static final long x() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    private static void y(amuf amufVar, aten atenVar) {
        if (atenVar != null) {
            amufVar.h(atenVar);
        }
    }

    private static amuk z(aten atenVar, Object obj, lmm lmmVar, aakn aaknVar) {
        amuf amufVar = new amuf();
        if (o(atenVar) == 1) {
            apzg e = abgc.e(atenVar);
            if (e == null || !e.qn(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
                apzg e2 = abgc.e(atenVar);
                if (e2 == null || !e2.qn(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)) {
                    apzg e3 = abgc.e(atenVar);
                    if (e3 == null || !e3.qn(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint)) {
                        y(amufVar, atenVar);
                    }
                } else if (aaknVar != null) {
                    y(amufVar, aaknVar.b(atenVar, obj));
                }
            } else if (aaknVar != null) {
                amufVar.j(aaknVar.a(atenVar, obj));
            }
        } else if (lmmVar != null) {
            int o = o(atenVar) - 1;
            if (o == 1) {
                if (lmmVar.a.e() != null) {
                    y(amufVar, atenVar);
                }
            } else {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Unknown menu visibility condition: ");
                sb.append(o);
                zep.l(sb.toString());
            }
        }
        return amufVar.g();
    }
}
