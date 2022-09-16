package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: aegu  reason: default package */
/* loaded from: classes.dex */
public final class aegu {
    public final FormatStreamModel[] a;
    public final FormatStreamModel[] b;
    public final FormatStreamModel c;
    public final VideoQuality[] d;
    public final aalv[] e;
    public final aegx f;
    public final int g;
    public final boolean h;
    private final aegs i;

    static {
        new aegu(new FormatStreamModel[0], new FormatStreamModel[0], new FormatStreamModel(aqzx.b, null, 0L), new VideoQuality[0], new aalv[0], aegx.a, new aegs(aegx.a, aegs.a, false, ""), Integer.MAX_VALUE, false);
    }

    public aegu(FormatStreamModel[] formatStreamModelArr, FormatStreamModel[] formatStreamModelArr2, FormatStreamModel formatStreamModel, VideoQuality[] videoQualityArr, aalv[] aalvVarArr, aegx aegxVar, aegs aegsVar, int i, boolean z) {
        this.a = (FormatStreamModel[]) afms.a(formatStreamModelArr);
        this.b = (FormatStreamModel[]) afms.a(formatStreamModelArr2);
        this.c = formatStreamModel;
        this.d = (VideoQuality[]) afms.a(videoQualityArr);
        this.e = (aalv[]) afms.a(aalvVarArr);
        afms.a(aegxVar);
        this.f = aegxVar;
        afms.a(aegsVar);
        this.i = aegsVar;
        this.g = i;
        this.h = z;
    }

    public final int a() {
        return this.i.h;
    }

    public final aegx b() {
        return this.i.e;
    }

    public final String c() {
        return this.i.g;
    }

    public final String d() {
        aegs aegsVar = this.i;
        String str = "none";
        if (aegsVar.h != -1) {
            long j = aegsVar.j;
            if (j != -1) {
                long round = Math.round(Math.pow(1.6d, Math.round(Math.log(j / 1000) / Math.log(1.6d))));
                int i = this.i.i;
                if (i != -2) {
                    str = String.valueOf(i);
                }
                int a = a();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
                sb.append("dt.");
                sb.append(round);
                sb.append(";lmq.");
                sb.append(a);
                sb.append(";dir.");
                sb.append(str);
                return sb.toString();
            }
        }
        return str;
    }

    public final boolean e() {
        FormatStreamModel formatStreamModel = this.c;
        return formatStreamModel != null && formatStreamModel.F();
    }

    public final boolean f() {
        return this.c != null && (aank.z().contains(Integer.valueOf(this.c.e())) || aank.e().contains(Integer.valueOf(this.c.e())));
    }

    public final FormatStreamModel[] g() {
        List b = this.f.b(Arrays.asList(this.a));
        return (FormatStreamModel[]) b.toArray(new FormatStreamModel[b.size()]);
    }
}
