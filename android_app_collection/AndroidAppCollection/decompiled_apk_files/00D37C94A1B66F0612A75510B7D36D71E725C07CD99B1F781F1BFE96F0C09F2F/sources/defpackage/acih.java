package defpackage;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: acih  reason: default package */
/* loaded from: classes.dex */
public final class acih extends dh {
    public DatePickerDialog.OnDateSetListener ae;
    public Calendar af;

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        return new DatePickerDialog(mJ(), this.ae, this.af.get(1), this.af.get(2), this.af.get(5));
    }
}
