package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fa  reason: default package */
/* loaded from: classes3.dex */
public final class fa implements i, bll, ak {
    public l a = null;
    public blk b = null;
    private final dp c;
    private final aj d;
    private ae e;

    public fa(dp dpVar, aj ajVar) {
        this.c = dpVar;
        this.d = ajVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aps apsVar) {
        this.a.d(apsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.a == null) {
            this.a = new l(this);
            this.b = blk.a(this);
        }
    }

    @Override // defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        Application application;
        ae defaultViewModelProviderFactory = this.c.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.c.aa)) {
            this.e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.e == null) {
            Context applicationContext = this.c.rg().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (!(applicationContext instanceof Application)) {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = (Application) applicationContext;
                    break;
                }
            }
            this.e = new z(application, this, this.c.m);
        }
        return this.e;
    }

    @Override // defpackage.apy
    public final apu getLifecycle() {
        b();
        return this.a;
    }

    @Override // defpackage.bll
    public final blj getSavedStateRegistry() {
        b();
        return this.b.a;
    }

    @Override // defpackage.ak
    public final aj getViewModelStore() {
        b();
        return this.d;
    }
}
