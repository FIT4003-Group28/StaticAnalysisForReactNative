package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
/* compiled from: PG */
/* renamed from: alw  reason: default package */
/* loaded from: classes.dex */
final class alw implements aly {
    final InputContentInfo a;

    public alw(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    public alw(Object obj) {
        this.a = (InputContentInfo) obj;
    }

    @Override // defpackage.aly
    public final ClipDescription a() {
        return this.a.getDescription();
    }

    @Override // defpackage.aly
    public final Uri b() {
        return this.a.getContentUri();
    }

    @Override // defpackage.aly
    public final Uri c() {
        return this.a.getLinkUri();
    }

    @Override // defpackage.aly
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.aly
    public final void e() {
        this.a.requestPermission();
    }
}
