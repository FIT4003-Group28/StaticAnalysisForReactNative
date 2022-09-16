package defpackage;

import android.opengl.EGLContext;
import org.webrtc.EglBase10Impl;
import org.webrtc.Logging;
/* compiled from: PG */
/* renamed from: bamk  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class bamk {
    static {
        Object obj = bams.b;
    }

    public static int a(int[] iArr) {
        for (int i = 0; i < iArr.length - 1; i++) {
            if (iArr[i] == 12352) {
                int i2 = iArr[i + 1];
                if (i2 == 4) {
                    return 2;
                }
                return i2 != 64 ? 1 : 3;
            }
        }
        return 1;
    }

    public static baml b() {
        return new baml();
    }

    public static bamp c(EGLContext eGLContext, int[] iArr) {
        return new bamr(eGLContext, iArr);
    }

    public static bams d(bamm bammVar, int[] iArr) {
        if (bammVar == null) {
            int i = bamr.a;
            boolean z = bamr.a >= 18;
            StringBuilder sb = new StringBuilder(49);
            sb.append("SDK version: ");
            sb.append(i);
            sb.append(". isEGL14Supported: ");
            sb.append(z);
            Logging.a("EglBase14Impl", sb.toString());
            if (bamr.a < 18) {
                return new EglBase10Impl(null, iArr);
            }
            return new bamr(null, iArr);
        } else if (bammVar instanceof bamq) {
            return new bamr(((bamq) bammVar).a, iArr);
        } else {
            if (bammVar instanceof bamn) {
                return new EglBase10Impl(((bamn) bammVar).a(), iArr);
            }
            throw new IllegalArgumentException("Unrecognized Context");
        }
    }
}
