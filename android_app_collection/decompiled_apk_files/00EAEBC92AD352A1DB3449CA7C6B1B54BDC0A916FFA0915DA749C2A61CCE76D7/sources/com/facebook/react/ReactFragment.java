package com.facebook.react;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
/* loaded from: classes.dex */
public class ReactFragment extends Fragment implements com.facebook.react.modules.core.e {
    private q X;
    private com.facebook.react.modules.core.f Y;

    @Override // androidx.fragment.app.Fragment
    public void Q() {
        super.Q();
        this.X.e();
    }

    @Override // androidx.fragment.app.Fragment
    public void U() {
        super.U();
        this.X.f();
    }

    @Override // androidx.fragment.app.Fragment
    public void V() {
        super.V();
        this.X.g();
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.X.c();
        return this.X.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.X.a(i, i2, intent, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void a(int i, String[] strArr, int[] iArr) {
        super.a(i, strArr, iArr);
        com.facebook.react.modules.core.f fVar = this.Y;
        if (fVar == null || !fVar.onRequestPermissionsResult(i, strArr, iArr)) {
            return;
        }
        this.Y = null;
    }

    @Override // com.facebook.react.modules.core.e
    @TargetApi(23)
    public void a(String[] strArr, int i, com.facebook.react.modules.core.f fVar) {
        this.Y = fVar;
        a(strArr, i);
    }

    @Override // androidx.fragment.app.Fragment
    public void c(Bundle bundle) {
        Bundle bundle2;
        super.c(bundle);
        String str = null;
        if (l() != null) {
            str = l().getString("arg_component_name");
            bundle2 = l().getBundle("arg_launch_options");
        } else {
            bundle2 = null;
        }
        if (str != null) {
            this.X = new q(g(), m0(), str, bundle2);
            return;
        }
        throw new IllegalStateException("Cannot loadApp if component name is null");
    }

    protected u m0() {
        return ((p) g().getApplication()).a();
    }
}
