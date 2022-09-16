package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ds  reason: default package */
/* loaded from: classes3.dex */
public final class ds extends dz implements ak, abt, ace, bll, eq {
    final /* synthetic */ dt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(dt dtVar) {
        super(dtVar, dtVar, new Handler());
        this.a = dtVar;
    }

    @Override // defpackage.dz, defpackage.dw
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.dz, defpackage.dw
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.dz
    public final void c() {
        this.a.supportInvalidateOptionsMenu();
    }

    @Override // defpackage.eq
    public final void d(dp dpVar) {
        this.a.onAttachFragment(dpVar);
    }

    @Override // defpackage.apy
    public final apu getLifecycle() {
        return this.a.mFragmentLifecycleRegistry;
    }

    @Override // defpackage.bll
    public final blj getSavedStateRegistry() {
        return this.a.getSavedStateRegistry();
    }

    @Override // defpackage.ak
    public final aj getViewModelStore() {
        return this.a.getViewModelStore();
    }
}
