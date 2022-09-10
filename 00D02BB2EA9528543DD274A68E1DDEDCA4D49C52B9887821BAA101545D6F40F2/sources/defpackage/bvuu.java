package defpackage;

import com.google.android.apps.gmm.shared.webview.NativeApiImpl;
/* compiled from: PG */
/* renamed from: bvuu  reason: default package */
/* loaded from: classes4.dex */
final class bvuu implements bwcb {
    final /* synthetic */ bvwv a;
    final /* synthetic */ NativeApiImpl b;

    public bvuu(bvwv bvwvVar, NativeApiImpl nativeApiImpl) {
        this.a = bvwvVar;
        this.b = nativeApiImpl;
    }

    @Override // defpackage.bwcb
    public final void a(@dzsi Object obj) {
        this.a.j().a(obj);
        NativeApiImpl nativeApiImpl = this.b;
        if (nativeApiImpl != null) {
            nativeApiImpl.a(obj);
        }
    }
}
