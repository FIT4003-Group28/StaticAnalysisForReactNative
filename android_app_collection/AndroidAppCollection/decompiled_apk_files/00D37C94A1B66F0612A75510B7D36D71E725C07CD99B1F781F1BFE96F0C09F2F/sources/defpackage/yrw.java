package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: yrw  reason: default package */
/* loaded from: classes4.dex */
final class yrw extends CronetEngine.Builder.LibraryLoader {
    final /* synthetic */ Context a;

    public yrw(Context context) {
        this.a = context;
    }

    @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
    public final void loadLibrary(String str) {
        zgd.a(this.a, str);
    }
}
