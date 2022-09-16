package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;
/* compiled from: PG */
/* renamed from: bagi  reason: default package */
/* loaded from: classes2.dex */
public final class bagi extends bagh {
    private bags o;

    public bagi(Context context) {
        super(context);
    }

    @Override // defpackage.bael
    public final bags b() {
        return this.o;
    }

    @Override // defpackage.bael
    public final void f(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.o = new bags(libraryLoader);
    }

    @Override // defpackage.bagh, defpackage.bael, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        f(libraryLoader);
        return this;
    }
}
