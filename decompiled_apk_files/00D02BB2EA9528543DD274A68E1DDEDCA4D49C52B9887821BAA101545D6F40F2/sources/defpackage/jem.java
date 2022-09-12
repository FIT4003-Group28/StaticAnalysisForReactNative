package defpackage;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: jem  reason: default package */
/* loaded from: classes7.dex */
public final class jem extends DatePickerDialog {
    public jem(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        super(Build.MANUFACTURER.equalsIgnoreCase("samsung") ? new jel(context) : context, onDateSetListener, i, i2, i3);
    }
}
