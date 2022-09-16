package defpackage;

import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: adxb  reason: default package */
/* loaded from: classes.dex */
final class adxb extends CronetEngine.Builder.LibraryLoader {
    final /* synthetic */ adxc a;

    public adxb(adxc adxcVar) {
        this.a = adxcVar;
    }

    @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
    public final void loadLibrary(String str) {
        zgd.a(this.a.a, str);
    }
}
