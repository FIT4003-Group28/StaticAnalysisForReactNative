package defpackage;

import android.app.Application;
import android.net.Uri;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: PG */
/* renamed from: bdmf  reason: default package */
/* loaded from: classes3.dex */
public final class bdmf implements bduq {
    private static final ThreadLocal<SimpleDateFormat> f = new bdmd();
    private final Application a;
    private final cqat b;
    private final bdkj c;
    private final bcpe d;
    private final boolean e;

    public bdmf(boolean z, Application application, cqat cqatVar, bdkj bdkjVar, bcpe bcpeVar) {
        this.e = z;
        this.a = application;
        this.b = cqatVar;
        this.c = bdkjVar;
        this.d = bcpeVar;
    }

    private final String d() {
        return f.get().format(new Date(this.b.b()));
    }

    private final String e() {
        String d = d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 8);
        sb.append("IMG_");
        sb.append(d);
        sb.append(".jpg");
        String sb2 = sb.toString();
        return this.e ? String.valueOf(sb2).concat(".nomedia") : sb2;
    }

    private final String f() {
        String d = d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 8);
        sb.append("VID_");
        sb.append(d);
        sb.append(".mp4");
        String sb2 = sb.toString();
        return this.e ? String.valueOf(sb2).concat(".nomedia") : sb2;
    }

    @Override // defpackage.bduq
    @dzsi
    public final Uri a() {
        bvrj.UI_THREAD.d();
        File a = this.c.a(e());
        if (a == null) {
            return null;
        }
        return ja.a(this.a, this.a.getPackageName(), a);
    }

    @Override // defpackage.bduq
    @dzsi
    public final String b() {
        bvrj.UI_THREAD.d();
        File b = this.c.b(f());
        if (b == null) {
            return null;
        }
        return b.getAbsolutePath();
    }

    @Override // defpackage.bduq
    @dzsi
    public final Uri c(Uri uri) {
        char c;
        File a;
        bvrj.UI_THREAD.d();
        String type = this.a.getContentResolver().getType(uri);
        boolean z = type != null && type.toLowerCase().startsWith("video/");
        String scheme = uri.getScheme();
        int hashCode = scheme.hashCode();
        if (hashCode != 3143036) {
            if (hashCode == 951530617 && scheme.equals("content")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (scheme.equals("file")) {
                c = 0;
            }
            c = 65535;
        }
        String str = null;
        if (c == 0) {
            str = uri.getLastPathSegment();
        } else if (c != 1) {
            return null;
        } else {
            Uri a2 = this.d.a(uri);
            if (a2 != null) {
                str = a2.getLastPathSegment();
            }
        }
        if (str == null) {
            str = z ? f() : e();
        }
        dbsk.s(str);
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            name = name.substring(0, lastIndexOf);
        }
        dbsk.s(str);
        String name2 = new File(str).getName();
        int lastIndexOf2 = name2.lastIndexOf(46);
        String substring = lastIndexOf2 == -1 ? "" : name2.substring(lastIndexOf2 + 1);
        if (!name.endsWith("_edited")) {
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 8 + String.valueOf(substring).length());
            sb.append(name);
            sb.append("_edited");
            sb.append(".");
            sb.append(substring);
            str = sb.toString();
        }
        if (z) {
            a = this.c.b(str);
        } else {
            a = this.c.a(str);
        }
        return a == null ? uri : Uri.fromFile(a);
    }
}
