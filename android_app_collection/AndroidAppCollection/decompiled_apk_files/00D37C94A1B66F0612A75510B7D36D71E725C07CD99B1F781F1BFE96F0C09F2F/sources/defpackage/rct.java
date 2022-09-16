package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
/* compiled from: PG */
/* renamed from: rct  reason: default package */
/* loaded from: classes4.dex */
public final class rct {
    public final File a;
    public final SharedPreferences b;
    private final File c;
    private final int d;

    public rct(Context context, int i) {
        this.b = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        qnm.u(dir, false);
        this.c = dir;
        File dir2 = context.getDir("tmppccache", 0);
        qnm.u(dir2, true);
        this.a = dir2;
        this.d = i;
    }

    public static String b(dvb dvbVar) {
        return qyi.a(dvbVar.toByteString().I());
    }

    public final File a() {
        File file = new File(this.c, Integer.toString(this.d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String c() {
        int i = this.d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    public final String d() {
        int i = this.d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    public final dvb e(int i) {
        String string;
        if (i == 1) {
            string = this.b.getString(d(), null);
        } else {
            string = this.b.getString(c(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            dvb dvbVar = (dvb) aopi.parseFrom(dvb.a, aoob.x(qyi.b(string)));
            String str = dvbVar.c;
            File q = qnm.q(str, "pcam.jar", a());
            if (!q.exists()) {
                q = qnm.q(str, "pcam", a());
            }
            File q2 = qnm.q(str, "pcbc", a());
            if (q.exists()) {
                if (q2.exists()) {
                    return dvbVar;
                }
            }
        } catch (aopx unused) {
        }
        return null;
    }
}
