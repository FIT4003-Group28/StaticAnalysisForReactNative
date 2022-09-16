package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: alx  reason: default package */
/* loaded from: classes.dex */
final class alx implements aly {
    private final Uri a;
    private final ClipDescription b;
    private final Uri c;

    public alx(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = uri;
        this.b = clipDescription;
        this.c = uri2;
    }

    @Override // defpackage.aly
    public final ClipDescription a() {
        return this.b;
    }

    @Override // defpackage.aly
    public final Uri b() {
        return this.a;
    }

    @Override // defpackage.aly
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.aly
    public final Object d() {
        return null;
    }

    @Override // defpackage.aly
    public final void e() {
    }
}
