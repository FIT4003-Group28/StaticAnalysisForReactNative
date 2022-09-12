package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ImmLeaksCleaner;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: agi  reason: default package */
/* loaded from: classes.dex */
public class agi extends iw implements m, ax, h, avr, agm, agv {
    private aw a;
    private aq b;
    public final agn f = new agn();
    public final o g;
    final avq h;
    public final agl i;
    public final agu j;

    public agi() {
        o oVar = new o(this);
        this.g = oVar;
        this.h = avq.c(this);
        this.i = new agl(new agd(this));
        new AtomicInteger();
        this.j = new agg(this);
        if (oVar != null) {
            oVar.a(new l() { // from class: androidx.activity.ComponentActivity$3
                @Override // defpackage.l
                public final void MV(m mVar, i iVar) {
                    if (iVar == i.ON_STOP) {
                        Window window = agi.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView == null) {
                            return;
                        }
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            });
            oVar.a(new l() { // from class: androidx.activity.ComponentActivity$4
                @Override // defpackage.l
                public final void MV(m mVar, i iVar) {
                    if (iVar == i.ON_DESTROY) {
                        agi.this.f.b = null;
                        if (agi.this.isChangingConfigurations()) {
                            return;
                        }
                        agi.this.NA().c();
                    }
                }
            });
            oVar.a(new l() { // from class: androidx.activity.ComponentActivity$5
                @Override // defpackage.l
                public final void MV(m mVar, i iVar) {
                    agi.this.m();
                    agi.this.g.b(this);
                }
            });
            if (Build.VERSION.SDK_INT > 23) {
                return;
            }
            oVar.a(new ImmLeaksCleaner(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void e() {
        ay.a(getWindow().getDecorView(), this);
        az.a(getWindow().getDecorView(), this);
        avs.a(getWindow().getDecorView(), this);
    }

    @Override // defpackage.h
    public final aq MX() {
        if (getApplication() != null) {
            if (this.b == null) {
                this.b = new af(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.b;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // defpackage.ax
    public final aw NA() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m();
        return this.a;
    }

    @Override // defpackage.iw, defpackage.m
    public final k Nh() {
        return this.g;
    }

    @Override // defpackage.agm
    public final agl Oj() {
        return this.i;
    }

    @Override // defpackage.agv
    public final agu Oq() {
        return this.j;
    }

    @Override // defpackage.avr
    public final avp Qg() {
        return this.h.a;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        super.addContentView(view, layoutParams);
    }

    public final void m() {
        if (this.a == null) {
            agh aghVar = (agh) getLastNonConfigurationInstance();
            if (aghVar != null) {
                this.a = aghVar.a;
            }
            if (this.a != null) {
                return;
            }
            this.a = new aw();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.j.c(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.i.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iw, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.h.a(bundle);
        agn agnVar = this.f;
        agnVar.b = this;
        for (ra raVar : agnVar.a) {
            raVar.a();
        }
        super.onCreate(bundle);
        agu aguVar = this.j;
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    aguVar.d(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
                aguVar.b = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                aguVar.h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
        apb.a(this);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.j.c(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        agh aghVar;
        aw awVar = this.a;
        if (awVar == null && (aghVar = (agh) getLastNonConfigurationInstance()) != null) {
            awVar = aghVar.a;
        }
        if (awVar == null) {
            return null;
        }
        agh aghVar2 = new agh();
        aghVar2.a = awVar;
        return aghVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.iw, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        o oVar = this.g;
        if (oVar instanceof o) {
            oVar.d(j.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.h.b(bundle);
        agu aguVar = this.j;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(aguVar.c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(aguVar.c.values()));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", aguVar.h);
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", aguVar.b);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        e();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        super.setContentView(view, layoutParams);
    }
}
