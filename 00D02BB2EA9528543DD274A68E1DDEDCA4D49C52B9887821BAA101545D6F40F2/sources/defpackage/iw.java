package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: iw  reason: default package */
/* loaded from: classes.dex */
public class iw extends Activity implements m, nj {
    private final o IV;

    public iw() {
        new aim();
        this.IV = new o(this);
    }

    public k Nh() {
        return this.IV;
    }

    @Override // defpackage.nj
    public final boolean Or(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !od.aq(decorView, keyEvent)) {
            return nk.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !od.aq(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        apb.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        o oVar = this.IV;
        j jVar = j.CREATED;
        o.g("markState");
        oVar.d(jVar);
        super.onSaveInstanceState(bundle);
    }
}
