package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.apps.maps.R;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: boks  reason: default package */
/* loaded from: classes3.dex */
public final class boks {
    public static AlertDialog a(dlfh dlfhVar, Context context, cqkj cqkjVar, @dzsi DialogInterface.OnDismissListener onDismissListener) {
        bvrj.UI_THREAD.c();
        boku bokuVar = new boku(context, dlfhVar, null);
        String e = bokuVar.e();
        if (dbsj.d(e)) {
            e = bqq.c(context, R.string.EDIT_PUBLISHED_NOTIFICATION_TITLE, "num_edits", 1);
        }
        cqkf c = cqkjVar.c(new bolw(), null);
        c.e(bokuVar);
        AlertDialog create = new AlertDialog.Builder(context).setTitle(e).setMessage(context.getString(R.string.EDIT_APPROVED_ON, bvtb.m(context, dlfhVar.d / 1000, TimeZone.getDefault(), 65561))).setPositiveButton(R.string.EDIT_PUBLISHED_GOT_IT, new bokr()).setView(c.c()).create();
        create.setOnDismissListener(new bokq(onDismissListener, c));
        return create;
    }
}
