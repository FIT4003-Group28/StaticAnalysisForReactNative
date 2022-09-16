package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: akya  reason: default package */
/* loaded from: classes.dex */
public final class akya {
    public Uri a;
    public ampq b;
    public ampq c;

    public akya() {
    }

    public akya(byte[] bArr) {
        this.b = amon.a;
        this.c = amon.a;
    }

    public final akyb a() {
        Uri uri = this.a;
        if (uri == null) {
            throw new IllegalStateException("Missing required properties: uri");
        }
        return new akyb(uri, this.b, this.c);
    }
}
