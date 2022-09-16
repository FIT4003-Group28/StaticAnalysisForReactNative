package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
/* compiled from: PG */
/* renamed from: adwi  reason: default package */
/* loaded from: classes.dex */
public final class adwi {
    public String a;
    public String b;
    public adwf c;
    public WatchNextResponseModel d;
    public adwh e;
    private Integer f;
    private Integer g;
    private Integer h;
    private aijx i;
    private aika j;
    private Integer k;
    private String l;

    public adwi() {
    }

    public adwi(adwj adwjVar) {
        this.f = Integer.valueOf(adwjVar.a);
        this.a = adwjVar.b;
        this.b = adwjVar.c;
        this.g = Integer.valueOf(adwjVar.d);
        this.h = Integer.valueOf(adwjVar.e);
        this.c = adwjVar.f;
        this.d = adwjVar.g;
        this.i = adwjVar.h;
        this.j = adwjVar.i;
        this.k = Integer.valueOf(adwjVar.j);
        this.e = adwjVar.k;
        this.l = adwjVar.l;
    }

    public final void b(String str) {
        if (str != null) {
            this.l = str;
            return;
        }
        throw new NullPointerException("Null currentVideoId");
    }

    public final void c(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.k = Integer.valueOf(i);
    }

    public final void e(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void f(aijx aijxVar) {
        if (aijxVar != null) {
            this.i = aijxVar;
            return;
        }
        throw new NullPointerException("Null sequencerStage");
    }

    public final void g(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void h(aika aikaVar) {
        if (aikaVar != null) {
            this.j = aikaVar;
            return;
        }
        throw new NullPointerException("Null videoStage");
    }

    public final adwj a() {
        Integer num = this.f;
        if (num == null || this.g == null || this.h == null || this.c == null || this.i == null || this.j == null || this.k == null || this.e == null || this.l == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" playbackState");
            }
            if (this.g == null) {
                sb.append(" totalVideosInQueue");
            }
            if (this.h == null) {
                sb.append(" currentVideoIndexInQueue");
            }
            if (this.c == null) {
                sb.append(" mdxAdState");
            }
            if (this.i == null) {
                sb.append(" sequencerStage");
            }
            if (this.j == null) {
                sb.append(" videoStage");
            }
            if (this.k == null) {
                sb.append(" mdxConnectionState");
            }
            if (this.e == null) {
                sb.append(" autonavState");
            }
            if (this.l == null) {
                sb.append(" currentVideoId");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adwj(num.intValue(), this.a, this.b, this.g.intValue(), this.h.intValue(), this.c, this.d, this.i, this.j, this.k.intValue(), this.e, this.l);
    }
}
