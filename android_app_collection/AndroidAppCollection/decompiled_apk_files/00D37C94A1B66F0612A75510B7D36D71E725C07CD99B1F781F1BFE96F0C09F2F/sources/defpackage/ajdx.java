package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* compiled from: PG */
/* renamed from: ajdx  reason: default package */
/* loaded from: classes.dex */
public final class ajdx {
    public String a;
    public byte[] b;
    public asaa c;
    public VideoStreamingData d;
    public arzt e;
    public aoob f;
    public atzm g;
    public Boolean h;
    public String i;

    public final void a(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null currentVideoId");
    }

    public final void b(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void c(byte[] bArr) {
        if (bArr != null) {
            this.b = bArr;
            return;
        }
        throw new NullPointerException("Null trackingParams");
    }
}
