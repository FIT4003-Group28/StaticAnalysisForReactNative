package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: amhu  reason: default package */
/* loaded from: classes.dex */
public final class amhu implements apy, ak, bll, i {
    final /* synthetic */ ampq a;

    public amhu(ampq ampqVar) {
        this.a = ampqVar;
    }

    public final Context a() {
        return (Context) this.a.c();
    }

    public final eo b() {
        return ((dt) this.a.c()).getSupportFragmentManager();
    }

    @Override // defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return ((dt) this.a.c()).getDefaultViewModelProviderFactory();
    }

    @Override // defpackage.apy
    public final apu getLifecycle() {
        return ((dt) this.a.c()).getLifecycle();
    }

    @Override // defpackage.bll
    public final blj getSavedStateRegistry() {
        return ((dt) this.a.c()).getSavedStateRegistry();
    }

    @Override // defpackage.ak
    public final aj getViewModelStore() {
        return ((dt) this.a.c()).getViewModelStore();
    }
}
