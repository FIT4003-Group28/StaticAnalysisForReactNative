package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aham  reason: default package */
/* loaded from: classes.dex */
public final class aham {
    public final Context a;
    public final aafo b;
    public final AlertDialog c;
    public final TextView d;
    public final TextView e;
    public acti f;
    public apoj g;
    public apoj h;
    private final View i;

    public aham(Context context, AlertDialog.Builder builder, aafo aafoVar) {
        this.a = context;
        this.b = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.upsell_dialog, (ViewGroup) null);
        this.i = inflate;
        this.d = (TextView) inflate.findViewById(R.id.dialog_title);
        this.e = (TextView) inflate.findViewById(R.id.dialog_message);
        this.c = builder.setView(inflate).create();
    }
}
