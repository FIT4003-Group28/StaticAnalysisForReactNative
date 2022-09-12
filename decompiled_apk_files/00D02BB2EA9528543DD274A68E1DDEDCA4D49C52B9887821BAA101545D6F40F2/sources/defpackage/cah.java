package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
/* compiled from: PG */
/* renamed from: cah  reason: default package */
/* loaded from: classes.dex */
public final class cah implements caq<Uri, File> {
    private final Context a;

    public cah(Context context) {
        this.a = context;
    }

    @Override // defpackage.caq
    public final cap<Uri, File> a(caz cazVar) {
        return new caj(this.a);
    }

    @Override // defpackage.caq
    public final void b() {
    }
}
