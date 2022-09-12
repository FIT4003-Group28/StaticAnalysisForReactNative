package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: cba  reason: default package */
/* loaded from: classes.dex */
public final class cba implements caq<Integer, AssetFileDescriptor> {
    private final Resources a;

    public cba(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.caq
    public final cap<Integer, AssetFileDescriptor> a(caz cazVar) {
        return new cbe(this.a, cazVar.g(Uri.class, AssetFileDescriptor.class));
    }

    @Override // defpackage.caq
    public final void b() {
    }
}
