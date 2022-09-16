package defpackage;

import android.net.Uri;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.AutoValue_ShortsCreationSelectedTrack;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
/* compiled from: PG */
/* renamed from: hfo  reason: default package */
/* loaded from: classes3.dex */
public final class hfo {
    public String a;
    public apzg b;
    public avhn c;
    public auup d;
    public String e;
    public Uri f;
    public ampq g;
    public ampq h;
    private String i;
    private Long j;
    private Boolean k;

    public hfo(ShortsCreationSelectedTrack shortsCreationSelectedTrack) {
        this.g = amon.a;
        this.h = amon.a;
        AutoValue_ShortsCreationSelectedTrack autoValue_ShortsCreationSelectedTrack = (AutoValue_ShortsCreationSelectedTrack) shortsCreationSelectedTrack;
        this.i = autoValue_ShortsCreationSelectedTrack.a;
        this.j = Long.valueOf(autoValue_ShortsCreationSelectedTrack.b);
        this.k = Boolean.valueOf(autoValue_ShortsCreationSelectedTrack.c);
        this.a = autoValue_ShortsCreationSelectedTrack.d;
        this.b = autoValue_ShortsCreationSelectedTrack.e;
        this.c = autoValue_ShortsCreationSelectedTrack.f;
        this.d = autoValue_ShortsCreationSelectedTrack.g;
        this.e = autoValue_ShortsCreationSelectedTrack.h;
        this.f = autoValue_ShortsCreationSelectedTrack.i;
        this.g = autoValue_ShortsCreationSelectedTrack.j;
        this.h = autoValue_ShortsCreationSelectedTrack.k;
    }

    public hfo(byte[] bArr) {
        this.g = amon.a;
        this.h = amon.a;
    }

    public final void b(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    public final void c(long j) {
        this.j = Long.valueOf(j);
    }

    public final void d(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null videoId");
    }

    public hfo() {
    }

    public final ShortsCreationSelectedTrack a() {
        Long l;
        String str = this.i;
        if (str == null || (l = this.j) == null || this.k == null) {
            StringBuilder sb = new StringBuilder();
            if (this.i == null) {
                sb.append(" videoId");
            }
            if (this.j == null) {
                sb.append(" startTimeMs");
            }
            if (this.k == null) {
                sb.append(" isSameVideo");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_ShortsCreationSelectedTrack(str, l.longValue(), this.k.booleanValue(), this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
