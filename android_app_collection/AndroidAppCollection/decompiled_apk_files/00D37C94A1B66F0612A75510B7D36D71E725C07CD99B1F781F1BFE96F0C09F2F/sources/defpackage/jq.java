package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
/* compiled from: PG */
/* renamed from: jq  reason: default package */
/* loaded from: classes3.dex */
public final class jq implements jr {
    private final ContentInfo.Builder a;

    public jq(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.jr
    public final jw a() {
        return new jw(new jt(this.a.build()));
    }

    @Override // defpackage.jr
    public final void b(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.jr
    public final void c(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.jr
    public final void d(Uri uri) {
        this.a.setLinkUri(uri);
    }
}
