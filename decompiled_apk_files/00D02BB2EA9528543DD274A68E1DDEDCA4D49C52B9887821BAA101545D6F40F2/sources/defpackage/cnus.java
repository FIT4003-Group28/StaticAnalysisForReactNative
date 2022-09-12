package defpackage;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: cnus  reason: default package */
/* loaded from: classes.dex */
public abstract class cnus implements DialogInterface.OnClickListener {
    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException unused) {
        } finally {
            dialogInterface.dismiss();
        }
    }
}
