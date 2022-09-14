package com.facebook.react.modules.datepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.h;
/* compiled from: SupportDatePickerDialogFragment.java */
@SuppressLint({"ValidFragment"})
/* loaded from: classes.dex */
public class d extends h {

    /* renamed from: a  reason: collision with root package name */
    private DatePickerDialog.OnDateSetListener f3543a;

    /* renamed from: b  reason: collision with root package name */
    private DialogInterface.OnDismissListener f3544b;

    @Override // android.support.v4.app.h
    public Dialog onCreateDialog(Bundle bundle) {
        return a.a(getArguments(), getActivity(), this.f3543a);
    }

    @Override // android.support.v4.app.h, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f3544b != null) {
            this.f3544b.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f3543a = onDateSetListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DialogInterface.OnDismissListener onDismissListener) {
        this.f3544b = onDismissListener;
    }
}
