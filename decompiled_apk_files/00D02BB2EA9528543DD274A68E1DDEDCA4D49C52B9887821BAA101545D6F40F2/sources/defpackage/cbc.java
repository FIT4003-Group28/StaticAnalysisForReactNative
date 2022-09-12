package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cbc  reason: default package */
/* loaded from: classes.dex */
public final class cbc implements caq<Integer, InputStream> {
    private final Resources a;

    public cbc(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.caq
    public final cap<Integer, InputStream> a(caz cazVar) {
        return new cbe(this.a, cazVar.g(Uri.class, InputStream.class));
    }

    @Override // defpackage.caq
    public final void b() {
    }
}
