package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: gb  reason: default package */
/* loaded from: classes3.dex */
public class gb extends Activity implements apy, ka {
    private agd mExtraDataMap = new agd();
    private l mLifecycleRegistry = new l(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !lj.ae(decorView, keyEvent)) {
            return kb.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !lj.ae(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public ga getExtraData(Class cls) {
        return (ga) this.mExtraDataMap.get(cls);
    }

    public apu getLifecycle() {
        return this.mLifecycleRegistry;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aqf.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        l lVar = this.mLifecycleRegistry;
        apt aptVar = apt.CREATED;
        l.g("markState");
        lVar.f(aptVar);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(ga gaVar) {
        this.mExtraDataMap.put(gaVar.getClass(), gaVar);
    }

    @Override // defpackage.ka
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
