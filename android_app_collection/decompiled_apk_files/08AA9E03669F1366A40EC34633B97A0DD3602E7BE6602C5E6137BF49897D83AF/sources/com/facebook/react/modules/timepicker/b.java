package com.facebook.react.modules.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.h;
/* compiled from: SupportTimePickerDialogFragment.java */
/* loaded from: classes.dex */
public class b extends h {

    /* renamed from: a  reason: collision with root package name */
    private TimePickerDialog.OnTimeSetListener f3692a;

    /* renamed from: b  reason: collision with root package name */
    private DialogInterface.OnDismissListener f3693b;

    @Override // android.support.v4.app.h
    public Dialog onCreateDialog(Bundle bundle) {
        return c.a(getArguments(), getActivity(), this.f3692a);
    }

    @Override // android.support.v4.app.h, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f3693b != null) {
            this.f3693b.onDismiss(dialogInterface);
        }
    }

    public void a(DialogInterface.OnDismissListener onDismissListener) {
        this.f3693b = onDismissListener;
    }

    public void a(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.f3692a = onTimeSetListener;
    }
}
