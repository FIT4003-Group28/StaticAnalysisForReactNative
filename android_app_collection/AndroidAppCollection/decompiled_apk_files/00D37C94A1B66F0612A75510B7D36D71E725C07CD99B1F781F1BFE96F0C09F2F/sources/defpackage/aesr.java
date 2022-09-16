package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
/* compiled from: PG */
/* renamed from: aesr  reason: default package */
/* loaded from: classes.dex */
public class aesr {
    public static final VideoQuality[] a = aegq.a;
    public static final aalv[] b = aegq.b;
    public static final aegx c = null;
    private final FormatStreamModel d;
    private final FormatStreamModel e;
    private final FormatStreamModel f;
    private final VideoQuality[] g;
    private final aalv[] h;
    private final aegx i;
    private final int j;
    private final long k;
    private final int l;
    private final aesq m;

    public aesr(FormatStreamModel formatStreamModel, FormatStreamModel formatStreamModel2, FormatStreamModel formatStreamModel3, VideoQuality[] videoQualityArr, aalv[] aalvVarArr, int i) {
        this(null, formatStreamModel2, null, videoQualityArr, aalvVarArr, c, 0, -1L, 0, null);
    }

    public int a() {
        return this.l;
    }

    public int b() {
        return this.j;
    }

    public long c() {
        return this.k;
    }

    public FormatStreamModel d() {
        return this.f;
    }

    public FormatStreamModel e() {
        return this.e;
    }

    public FormatStreamModel f() {
        return this.d;
    }

    public aegx g() {
        return this.i;
    }

    public aesq h() {
        return this.m;
    }

    public boolean i() {
        return this.h.length > 1;
    }

    public boolean j() {
        return this.g.length > 1;
    }

    public aalv[] k() {
        return this.h;
    }

    public VideoQuality[] l() {
        return this.g;
    }

    public String toString() {
        FormatStreamModel formatStreamModel = this.d;
        int i = 0;
        int e = formatStreamModel == null ? 0 : formatStreamModel.e();
        FormatStreamModel formatStreamModel2 = this.e;
        int e2 = formatStreamModel2 == null ? 0 : formatStreamModel2.e();
        FormatStreamModel formatStreamModel3 = this.f;
        if (formatStreamModel3 != null) {
            i = formatStreamModel3.e();
        }
        String p = agpr.p(this.j);
        long j = this.k;
        int i2 = this.l;
        StringBuilder sb = new StringBuilder(String.valueOf(p).length() + 147);
        sb.append("currentVideoFormat=");
        sb.append(e);
        sb.append(" currentAudioFormat=");
        sb.append(e2);
        sb.append(" bestVideoFormat=");
        sb.append(i);
        sb.append(" trigger=");
        sb.append(p);
        sb.append(" estimate=");
        sb.append(j);
        sb.append(" source=");
        sb.append(i2);
        return sb.toString();
    }

    public aesr(FormatStreamModel formatStreamModel, FormatStreamModel formatStreamModel2, FormatStreamModel formatStreamModel3, VideoQuality[] videoQualityArr, aalv[] aalvVarArr, aegx aegxVar, int i) {
        this(null, null, null, videoQualityArr, aalvVarArr, aegxVar, 0, -1L, 0, null);
    }

    public aesr(FormatStreamModel formatStreamModel, FormatStreamModel formatStreamModel2, FormatStreamModel formatStreamModel3, VideoQuality[] videoQualityArr, aalv[] aalvVarArr, aegx aegxVar, int i, long j, int i2, aesq aesqVar) {
        this.d = formatStreamModel;
        this.e = formatStreamModel2;
        this.f = formatStreamModel3;
        this.g = (VideoQuality[]) afms.a(videoQualityArr);
        this.h = (aalv[]) afms.a(aalvVarArr);
        this.i = aegxVar;
        this.j = i;
        this.k = j;
        this.l = i2;
        this.m = aesqVar;
    }
}
