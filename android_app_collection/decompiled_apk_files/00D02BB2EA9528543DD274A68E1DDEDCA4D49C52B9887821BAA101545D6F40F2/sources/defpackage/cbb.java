package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
/* compiled from: PG */
/* renamed from: cbb  reason: default package */
/* loaded from: classes.dex */
public final class cbb implements caq<Integer, ParcelFileDescriptor> {
    private final Resources a;

    public cbb(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.caq
    public final cap<Integer, ParcelFileDescriptor> a(caz cazVar) {
        return new cbe(this.a, cazVar.g(Uri.class, ParcelFileDescriptor.class));
    }

    @Override // defpackage.caq
    public final void b() {
    }
}
