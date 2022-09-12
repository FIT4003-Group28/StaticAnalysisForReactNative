package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
/* compiled from: PG */
/* renamed from: cbh  reason: default package */
/* loaded from: classes.dex */
public final class cbh implements caq<String, ParcelFileDescriptor> {
    @Override // defpackage.caq
    public final cap<String, ParcelFileDescriptor> a(caz cazVar) {
        return new cbj(cazVar.g(Uri.class, ParcelFileDescriptor.class));
    }

    @Override // defpackage.caq
    public final void b() {
    }
}
