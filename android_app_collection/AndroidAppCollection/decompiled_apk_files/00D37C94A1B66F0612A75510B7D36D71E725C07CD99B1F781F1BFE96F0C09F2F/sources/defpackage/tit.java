package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: tit  reason: default package */
/* loaded from: classes4.dex */
public final class tit {
    public final Uri a;

    public tit(Uri uri) {
        this.a = uri;
    }

    public final String a() {
        return this.a.getPath();
    }

    public final tit b(String str) {
        return new tit(this.a.buildUpon().encodedPath(str).build());
    }

    public final String toString() {
        return this.a.toString();
    }
}
