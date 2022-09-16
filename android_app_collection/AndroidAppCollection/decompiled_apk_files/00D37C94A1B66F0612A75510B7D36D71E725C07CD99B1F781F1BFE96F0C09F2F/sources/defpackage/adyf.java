package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: adyf  reason: default package */
/* loaded from: classes.dex */
public final class adyf {
    public static attu a(aadd aaddVar) {
        arhd a = aaddVar.a();
        if (a != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            attv attvVar = atdyVar.d;
            if (attvVar == null) {
                attvVar = attv.a;
            }
            if ((attvVar.b & 128) == 0) {
                return null;
            }
            atdy atdyVar2 = a.i;
            if (atdyVar2 == null) {
                atdyVar2 = atdy.a;
            }
            attv attvVar2 = atdyVar2.d;
            if (attvVar2 == null) {
                attvVar2 = attv.a;
            }
            attu attuVar = attvVar2.h;
            return attuVar == null ? attu.a : attuVar;
        }
        return null;
    }

    public static atts b(aacz aaczVar) {
        apyy b = aaczVar.b();
        if (b != null) {
            atfw atfwVar = b.k;
            if (atfwVar == null) {
                atfwVar = atfw.a;
            }
            if ((atfwVar.b & 1073741824) == 0) {
                return null;
            }
            atfw atfwVar2 = b.k;
            if (atfwVar2 == null) {
                atfwVar2 = atfw.a;
            }
            atts attsVar = atfwVar2.s;
            return attsVar == null ? atts.b : attsVar;
        }
        return null;
    }

    public static ati c(String str, adxw adxwVar, Executor executor, aepf aepfVar, atts attsVar, axxm axxmVar) {
        int i;
        int i2;
        int i3 = (attsVar == null || (i2 = attsVar.k) <= 0) ? 8000 : i2;
        int i4 = (attsVar == null || (i = attsVar.l) <= 0) ? 8000 : i;
        boolean z = true;
        if (attsVar != null && !attsVar.j) {
            z = false;
        }
        CronetEngine a = adxwVar.a(z);
        if (a != null) {
            atp b = aeas.b(a, executor, ati.a, i3, i4, false, ((Boolean) axxmVar.a.a.V(axxk.i).B().ax(false)).booleanValue());
            if (aepfVar != null) {
                b.b(aepfVar);
            }
            return b;
        }
        asz aszVar = new asz();
        aszVar.b = str;
        aszVar.c = i3;
        aszVar.d = i4;
        return aszVar.a();
    }

    public static void d(yqh yqhVar, yqv yqvVar, adwb adwbVar) {
        yqz yqzVar;
        yqz yqzVar2;
        yqz yqzVar3;
        ylr.b();
        yrb yrbVar = null;
        try {
            try {
                yrbVar = yqhVar.a(yqvVar);
                adwbVar.i(yrbVar);
                if (yrbVar == null || (yqzVar3 = yrbVar.d) == null) {
                    return;
                }
                try {
                    yqzVar3.f();
                } catch (IOException unused) {
                }
            } catch (IOException e) {
                adwbVar.a(e);
                if (yrbVar == null || (yqzVar2 = yrbVar.d) == null) {
                    return;
                }
                try {
                    yqzVar2.f();
                } catch (IOException unused2) {
                }
            }
        } catch (Throwable th) {
            if (yrbVar != null && (yqzVar = yrbVar.d) != null) {
                try {
                    yqzVar.f();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ String e(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "BLUETOOTH" : "CAST" : "DIAL" : "CLOUD";
    }
}
