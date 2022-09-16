package defpackage;

import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: bags  reason: default package */
/* loaded from: classes2.dex */
public final class bags extends CronetEngine.Builder.LibraryLoader {
    private final CronetEngine.Builder.LibraryLoader a;

    public bags(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.a = libraryLoader;
    }

    @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
    public final void loadLibrary(String str) {
        this.a.loadLibrary(str);
    }
}
