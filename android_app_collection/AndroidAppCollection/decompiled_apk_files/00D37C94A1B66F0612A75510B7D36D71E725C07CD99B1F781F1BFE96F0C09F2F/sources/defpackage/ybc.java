package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ybc  reason: default package */
/* loaded from: classes4.dex */
public final class ybc {
    public final aafo a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final SeekBar f;
    public final akbm g;
    public final akbm h;
    public final Dialog i;
    public avrd j;
    public int k = 0;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;

    public ybc(Context context, akbn akbnVar, aafo aafoVar) {
        aafoVar.getClass();
        this.a = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ypc_pause_membership_dialog, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.subtitle);
        this.e = (TextView) inflate.findViewById(R.id.description);
        this.l = (TextView) inflate.findViewById(R.id.pause_period);
        this.m = (TextView) inflate.findViewById(R.id.pause_end);
        this.f = (SeekBar) inflate.findViewById(R.id.pause_period_slider);
        TextView textView = (TextView) inflate.findViewById(R.id.primary_button);
        this.n = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.cancel);
        this.o = textView2;
        this.g = akbnVar.a(textView);
        this.h = akbnVar.a(textView2);
        Dialog dialog = new Dialog(context);
        this.i = dialog;
        dialog.setContentView(inflate);
    }

    public static Spanned a(Spanned[] spannedArr, int i) {
        if (spannedArr.length > i) {
            return spannedArr[i];
        }
        return null;
    }

    public final void b() {
        avrd avrdVar = this.j;
        if (avrdVar == null) {
            return;
        }
        TextView textView = this.l;
        arag aragVar = ((avrc) avrdVar.d.get(this.k)).b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.m;
        avrd avrdVar2 = this.j;
        arag aragVar2 = ((avrc) avrdVar2.d.get(this.k)).c;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
        SeekBar seekBar = this.f;
        avrd avrdVar3 = this.j;
        aovr aovrVar = ((avrc) avrdVar3.d.get(this.k)).d;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        seekBar.setContentDescription(aovrVar.c);
    }
}
