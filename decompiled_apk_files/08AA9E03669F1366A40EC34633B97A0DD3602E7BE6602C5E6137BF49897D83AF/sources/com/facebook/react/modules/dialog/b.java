package com.facebook.react.modules.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.h;
import com.facebook.react.modules.dialog.DialogModule;
/* compiled from: SupportAlertFragment.java */
/* loaded from: classes.dex */
public class b extends h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final DialogModule.a f3565a;

    public b() {
        this.f3565a = null;
    }

    public b(DialogModule.a aVar, Bundle bundle) {
        this.f3565a = aVar;
        setArguments(bundle);
    }

    @Override // android.support.v4.app.h
    public Dialog onCreateDialog(Bundle bundle) {
        return a.a(getActivity(), getArguments(), this);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f3565a != null) {
            this.f3565a.onClick(dialogInterface, i);
        }
    }

    @Override // android.support.v4.app.h, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f3565a != null) {
            this.f3565a.onDismiss(dialogInterface);
        }
    }
}
