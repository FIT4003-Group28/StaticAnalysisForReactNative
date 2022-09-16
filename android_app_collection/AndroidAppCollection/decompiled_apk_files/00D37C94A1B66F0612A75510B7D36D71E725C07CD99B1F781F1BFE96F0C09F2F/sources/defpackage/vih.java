package defpackage;

import android.app.Fragment;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j$.util.function.Consumer;
import java.util.Collections;
import java.util.function.Consumer;
/* compiled from: PG */
/* renamed from: vih  reason: default package */
/* loaded from: classes4.dex */
public class vih extends oa {
    private int Wr;
    protected final vht k = new vht();

    private final void ow() {
        this.Wr--;
    }

    private final void ox() {
        int i = this.Wr;
        this.Wr = i + 1;
        if (i == 0) {
            vht vhtVar = this.k;
            for (int i2 = 0; i2 < vhtVar.a.size(); i2++) {
                vif vifVar = (vif) vhtVar.a.get(i2);
                if (vifVar instanceof vhp) {
                    ((vhp) vifVar).a();
                }
            }
        }
    }

    @Override // defpackage.oa, defpackage.gb, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if ((vifVar instanceof vgv) && ((vgv) vifVar).a(keyEvent)) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final void finish() {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vgw) {
                ((vgw) vifVar).a();
            }
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vgx) {
                ((vgx) vifVar).a();
            }
        }
        super.finishAfterTransition();
    }

    @Override // android.app.Activity
    public final void onActivityReenter(int i, Intent intent) {
        vht vhtVar = this.k;
        for (int i2 = 0; i2 < vhtVar.a.size(); i2++) {
            vif vifVar = (vif) vhtVar.a.get(i2);
            if (vifVar instanceof vgy) {
                ((vgy) vifVar).a();
            }
        }
        super.onActivityReenter(i, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        vht vhtVar = this.k;
        for (int i3 = 0; i3 < vhtVar.a.size(); i3++) {
            vif vifVar = (vif) vhtVar.a.get(i3);
            if (vifVar instanceof vhu) {
                ((vhu) vifVar).a();
            }
        }
    }

    @Override // defpackage.dt
    public final void onAttachFragment(dp dpVar) {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vii) {
                ((vii) vifVar).a();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        vht vhtVar = this.k;
        vhr vhrVar = new vhr();
        vhtVar.b(vhrVar);
        vhtVar.j = vhrVar;
        super.onAttachedToWindow();
    }

    @Override // defpackage.abp, android.app.Activity
    public void onBackPressed() {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if ((vifVar instanceof vha) && ((vha) vifVar).a()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vhv) {
                ((vhv) vifVar).a();
            }
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if ((vifVar instanceof vhw) && ((vhw) vifVar).a()) {
                return true;
            }
        }
        return super.onContextItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public void onCreate(Bundle bundle) {
        vht vhtVar = this.k;
        vhq vhqVar = new vhq(bundle, 2);
        vhtVar.b(vhqVar);
        vhtVar.c = vhqVar;
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vhx) {
                ((vhx) vifVar).a();
            }
        }
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        vht vhtVar = this.k;
        boolean z = false;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vhy) {
                z |= ((vhy) vifVar).a();
            }
        }
        return z || super.onCreateOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public void onDestroy() {
        vht vhtVar = this.k;
        vhs vhsVar = vhtVar.h;
        if (vhsVar != null) {
            vhtVar.a(vhsVar);
            vhtVar.h = null;
        }
        vhs vhsVar2 = vhtVar.g;
        if (vhsVar2 != null) {
            vhtVar.a(vhsVar2);
            vhtVar.g = null;
        }
        vhs vhsVar3 = vhtVar.f;
        if (vhsVar3 != null) {
            vhtVar.a(vhsVar3);
            vhtVar.f = null;
        }
        vhs vhsVar4 = vhtVar.c;
        if (vhsVar4 != null) {
            vhtVar.a(vhsVar4);
            vhtVar.c = null;
        }
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            vifVar.getClass();
            if (vifVar instanceof vvo) {
                ((vvo) vifVar).b();
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        vht vhtVar = this.k;
        vhs vhsVar = vhtVar.j;
        if (vhsVar != null) {
            vhtVar.a(vhsVar);
            vhtVar.j = null;
        }
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            vifVar.getClass();
            if (vifVar instanceof vhb) {
                ((vhb) vifVar).a();
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public final /* synthetic */ void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        j$.util.function.Consumer convert = Consumer.VivifiedWrapper.convert(consumer);
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vhc) {
                ((vhc) vifVar).a();
                return;
            }
        }
        convert.accept(Collections.emptyList());
    }

    @Override // defpackage.oa, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        vht vhtVar = this.k;
        for (int i2 = 0; i2 < vhtVar.a.size(); i2++) {
            vif vifVar = (vif) vhtVar.a.get(i2);
            if ((vifVar instanceof vhd) && ((vhd) vifVar).a()) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        vht vhtVar = this.k;
        for (int i2 = 0; i2 < vhtVar.a.size(); i2++) {
            vif vifVar = (vif) vhtVar.a.get(i2);
            if ((vifVar instanceof vhe) && ((vhe) vifVar).a()) {
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.dt, android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        for (vif vifVar : this.k.a) {
            if (vifVar instanceof vhz) {
                ((vhz) vifVar).a();
            }
        }
        super.onLowMemory();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vhf) {
                ((vhf) vifVar).a();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if ((vifVar instanceof via) && ((via) vifVar).a()) {
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public void onPause() {
        vht vhtVar = this.k;
        vhs vhsVar = vhtVar.i;
        if (vhsVar != null) {
            vhtVar.a(vhsVar);
            vhtVar.i = null;
        }
        vhs vhsVar2 = vhtVar.e;
        if (vhsVar2 != null) {
            vhtVar.a(vhsVar2);
            vhtVar.e = null;
        }
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            vifVar.getClass();
            if (vifVar instanceof vvo) {
                ((vvo) vifVar).c();
            }
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final /* synthetic */ void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        Consumer.VivifiedWrapper.convert(consumer);
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vhg) {
                ((vhg) vifVar).a();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        vht vhtVar = this.k;
        vhq vhqVar = new vhq(bundle, 1);
        vhtVar.b(vhqVar);
        vhtVar.g = vhqVar;
        super.onPostCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public void onPostResume() {
        vht vhtVar = this.k;
        vhr vhrVar = new vhr(1);
        vhtVar.b(vhrVar);
        vhtVar.i = vhrVar;
        super.onPostResume();
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        vht vhtVar = this.k;
        boolean z = false;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vib) {
                z |= ((vib) vifVar).a();
            }
        }
        return z || super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vhj) {
                ((vhj) vifVar).a();
            }
        }
        super.onProvideAssistContent(assistContent);
    }

    @Override // android.app.Activity
    public final void onProvideAssistData(Bundle bundle) {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vhk) {
                ((vhk) vifVar).a();
            }
        }
        super.onProvideAssistData(bundle);
    }

    @Override // defpackage.dt, defpackage.abp, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        vht vhtVar = this.k;
        for (int i2 = 0; i2 < vhtVar.a.size(); i2++) {
            vif vifVar = (vif) vhtVar.a.get(i2);
            if (vifVar instanceof vic) {
                ((vic) vifVar).a();
            }
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        vht vhtVar = this.k;
        vhq vhqVar = new vhq(bundle);
        vhtVar.b(vhqVar);
        vhtVar.h = vhqVar;
        super.onRestoreInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public void onResume() {
        uut.r(getSupportFragmentManager());
        vht vhtVar = this.k;
        vhr vhrVar = new vhr(3);
        vhtVar.b(vhrVar);
        vhtVar.e = vhrVar;
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abp, defpackage.gb, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        vht vhtVar = this.k;
        vhq vhqVar = new vhq(bundle, 3);
        vhtVar.b(vhqVar);
        vhtVar.f = vhqVar;
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public void onStart() {
        uut.r(getSupportFragmentManager());
        vht vhtVar = this.k;
        vhr vhrVar = new vhr(2);
        vhtVar.b(vhrVar);
        vhtVar.d = vhrVar;
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public void onStop() {
        vht vhtVar = this.k;
        vhs vhsVar = vhtVar.d;
        if (vhsVar != null) {
            vhtVar.a(vhsVar);
            vhtVar.d = null;
        }
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            vifVar.getClass();
            if (vifVar instanceof vie) {
                ((vie) vifVar).a();
            }
        }
        super.onStop();
    }

    @Override // defpackage.oa, defpackage.ob
    public final void onSupportActionModeFinished(re reVar) {
        vht vhtVar = this.k;
        if (reVar != null) {
            for (int i = 0; i < vhtVar.a.size(); i++) {
                vif vifVar = (vif) vhtVar.a.get(i);
                if (vifVar instanceof vij) {
                    ((vij) vifVar).a();
                }
            }
        }
    }

    @Override // defpackage.oa, defpackage.ob
    public final void onSupportActionModeStarted(re reVar) {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vik) {
                ((vik) vifVar).a();
            }
        }
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vhm) {
                ((vhm) vifVar).a();
            }
        }
        super.onUserInteraction();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vhn) {
                ((vhn) vifVar).a();
            }
        }
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        vht vhtVar = this.k;
        for (int i = 0; i < vhtVar.a.size(); i++) {
            vif vifVar = (vif) vhtVar.a.get(i);
            if (vifVar instanceof vho) {
                ((vho) vifVar).a();
            }
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        ox();
        super.startActivity(intent);
        ow();
    }

    @Override // defpackage.abp, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        ox();
        super.startActivityForResult(intent, i);
        ow();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        ox();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        ow();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        ox();
        super.startActivity(intent, bundle);
        ow();
    }

    @Override // defpackage.abp, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        ox();
        super.startActivityForResult(intent, i, bundle);
        ow();
    }

    @Override // defpackage.dt
    public final void startActivityFromFragment(dp dpVar, Intent intent, int i) {
        ox();
        super.startActivityFromFragment(dpVar, intent, i);
        ow();
    }
}
