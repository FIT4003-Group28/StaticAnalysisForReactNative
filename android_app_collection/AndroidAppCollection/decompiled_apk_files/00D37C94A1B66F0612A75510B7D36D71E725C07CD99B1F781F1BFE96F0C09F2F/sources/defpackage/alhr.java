package defpackage;

import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: alhr  reason: default package */
/* loaded from: classes.dex */
final class alhr extends CronetEngine.Builder.LibraryLoader {
    final /* synthetic */ alhs a;

    public alhr(alhs alhsVar) {
        this.a = alhsVar;
    }

    @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
    public final void loadLibrary(String str) {
        zgd.a(this.a.a, str);
    }
}
