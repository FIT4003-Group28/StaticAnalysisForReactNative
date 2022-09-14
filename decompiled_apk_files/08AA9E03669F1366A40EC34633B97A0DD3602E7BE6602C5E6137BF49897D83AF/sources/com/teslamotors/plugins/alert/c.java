package com.teslamotors.plugins.alert;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.h;
import com.teslamotors.plugins.alert.AlertPromptModule;
/* compiled from: SupportAlertFragment.java */
/* loaded from: classes.dex */
public class c extends h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final AlertPromptModule.a f5137a;

    public c() {
        this.f5137a = null;
    }

    public c(AlertPromptModule.a aVar, Bundle bundle) {
        this.f5137a = aVar;
        setArguments(bundle);
    }

    @Override // android.support.v4.app.h
    public Dialog onCreateDialog(Bundle bundle) {
        return a.a(getActivity(), getArguments(), this);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f5137a != null) {
            this.f5137a.onClick(dialogInterface, i);
        }
    }

    @Override // android.support.v4.app.h, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f5137a != null) {
            this.f5137a.onDismiss(dialogInterface);
        }
    }
}
