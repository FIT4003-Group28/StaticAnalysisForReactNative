package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gea  reason: default package */
/* loaded from: classes3.dex */
public final class gea {
    public final Activity a;
    public final abaz b;
    public final yzj c;
    public final yni d;
    public final aafo e;
    public final aawn f;
    public final aadd g;

    public gea(Activity activity, abaz abazVar, yzj yzjVar, yni yniVar, aafo aafoVar, aawn aawnVar, aadd aaddVar) {
        this.a = activity;
        abazVar.getClass();
        this.b = abazVar;
        yzjVar.getClass();
        this.c = yzjVar;
        yniVar.getClass();
        this.d = yniVar;
        aafoVar.getClass();
        this.e = aafoVar;
        aawnVar.getClass();
        this.f = aawnVar;
        this.g = aaddVar;
    }

    public final AlertDialog a(final String str) {
        return new AlertDialog.Builder(this.a).setMessage(this.a.getString(R.string.delete_generic_playlist_confirmation)).setPositiveButton(R.string.delete_playlist_positive_button_text, new DialogInterface.OnClickListener() { // from class: gdu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                gea geaVar = gea.this;
                String str2 = str;
                abaz abazVar = geaVar.b;
                abau abauVar = new abau(abazVar.e, abazVar.a.c());
                abauVar.a = abau.g(str2);
                abauVar.i();
                abaz abazVar2 = geaVar.b;
                abazVar2.b.e(abauVar, new gdy(geaVar, str2));
            }
        }).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }

    public final void b(Button button, boolean z) {
        button.setEnabled(z);
        if (z) {
            button.setTextColor(zhn.j(this.a, R.attr.ytCallToAction).orElse(0));
        } else {
            button.setTextColor(zhn.j(this.a, R.attr.ytIconDisabled).orElse(0));
        }
    }
}
