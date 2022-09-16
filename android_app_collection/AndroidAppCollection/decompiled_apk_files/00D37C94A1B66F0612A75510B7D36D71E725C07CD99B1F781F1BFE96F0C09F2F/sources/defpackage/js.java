package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: js  reason: default package */
/* loaded from: classes3.dex */
public final class js implements jr {
    final ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public js(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.jr
    public final jw a() {
        return new jw(new jv(this));
    }

    @Override // defpackage.jr
    public final void b(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.jr
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.jr
    public final void d(Uri uri) {
        this.d = uri;
    }
}
