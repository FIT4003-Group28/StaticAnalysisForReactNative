package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: ggs  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ggs {
    public static apzg a(apzg apzgVar) {
        if (apzgVar == null) {
            return null;
        }
        if (apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
            return apzgVar;
        }
        if (apzgVar.qn(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)) {
            for (apzg apzgVar2 : ((CommandExecutorCommandOuterClass$CommandExecutorCommand) apzgVar.qm(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b) {
                if (apzgVar2.qn(WatchEndpointOuterClass.watchEndpoint)) {
                    return apzgVar2;
                }
            }
        }
        return null;
    }

    public static boolean b(ggt ggtVar) {
        return ggtVar.l() == 5;
    }

    public static boolean c(ggt ggtVar) {
        return ggtVar.l() == 4;
    }

    public static boolean d(ggt ggtVar, ggt ggtVar2) {
        apzg b;
        if (ggtVar2 == null) {
            return false;
        }
        apzg c = ggtVar.c() != null ? ggtVar.c() : ggtVar.b();
        if (ggtVar2.c() != null) {
            b = ggtVar2.c();
        } else {
            b = ggtVar2.b();
        }
        apzg a = a(c);
        apzg a2 = a(b);
        if (a == null || a2 == null) {
            return TextUtils.equals(ggtVar.f(), ggtVar2.f());
        }
        return aijn.d(a, a2);
    }

    public static void e(ggt ggtVar) {
        if (!ggtVar.j()) {
            ggtVar.i();
        }
    }

    public static boolean f(float f, float f2) {
        return Math.abs(f - f2) < 0.005f;
    }

    public static boolean g(float f, float f2) {
        return !f(f, f2) && f < f2;
    }

    public static boolean h(float f) {
        return !f(f, 1.777f) && f > 1.777f;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static final String j(Object obj) {
        if (obj instanceof apoj) {
            return ((apoj) obj).k;
        }
        if (obj instanceof aqdr) {
            return ((aqdr) obj).l;
        }
        if (obj instanceof arff) {
            arff arffVar = (arff) obj;
            if ((arffVar.b & 262144) == 0) {
                return null;
            }
            return arffVar.c;
        } else if (obj instanceof asqu) {
            return ((asqu) obj).c;
        } else {
            if (obj instanceof asqg) {
                return ((asqg) obj).g;
            }
            if (obj instanceof asqc) {
                return ((asqc) obj).e;
            }
            if (obj instanceof asrs) {
                return ((asrs) obj).i;
            }
            if (obj instanceof atep) {
                return ((atep) obj).g;
            }
            if (obj instanceof atxk) {
                return ((atxk) obj).d;
            }
            if (obj instanceof atxh) {
                return ((atxh) obj).d;
            }
            if (obj instanceof avaq) {
                return ((avaq) obj).s;
            }
            if (obj instanceof avfo) {
                return ((avfo) obj).l;
            }
            if (obj instanceof apos) {
                return ((apos) obj).t;
            }
            if (obj instanceof avjf) {
                return ((avjf) obj).d;
            }
            if (obj instanceof atjf) {
                atjf atjfVar = (atjf) obj;
                if ((atjfVar.b & 4096) != 0) {
                    return atjfVar.j;
                }
            }
            return null;
        }
    }
}
