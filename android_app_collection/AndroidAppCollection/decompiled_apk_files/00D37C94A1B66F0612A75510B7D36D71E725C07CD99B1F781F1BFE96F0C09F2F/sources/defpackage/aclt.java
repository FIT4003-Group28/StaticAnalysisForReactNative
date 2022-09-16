package defpackage;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: aclt  reason: default package */
/* loaded from: classes.dex */
public final class aclt extends dh {
    public TimePickerDialog.OnTimeSetListener ae;
    public Calendar af;

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        return new TimePickerDialog(mJ(), this.ae, this.af.get(11), this.af.get(12), DateFormat.is24HourFormat(mJ()));
    }
}
