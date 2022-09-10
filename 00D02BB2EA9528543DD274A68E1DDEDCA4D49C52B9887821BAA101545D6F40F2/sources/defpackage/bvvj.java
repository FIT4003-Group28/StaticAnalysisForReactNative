package defpackage;

import android.webkit.ValueCallback;
/* compiled from: PG */
/* renamed from: bvvj  reason: default package */
/* loaded from: classes4.dex */
final class bvvj implements ValueCallback<Boolean> {
    final /* synthetic */ deig a;

    public bvvj(deig deigVar) {
        this.a = deigVar;
    }

    @Override // android.webkit.ValueCallback
    public final /* bridge */ /* synthetic */ void onReceiveValue(Boolean bool) {
        bool.booleanValue();
        this.a.j(null);
    }
}
