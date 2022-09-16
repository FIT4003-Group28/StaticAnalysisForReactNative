package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: plj  reason: default package */
/* loaded from: classes4.dex */
public final class plj extends Exception {
    public final Format a;

    public plj(String str, Format format) {
        super(str);
        this.a = format;
    }

    public plj(Throwable th, Format format) {
        super(th);
        this.a = format;
    }
}
