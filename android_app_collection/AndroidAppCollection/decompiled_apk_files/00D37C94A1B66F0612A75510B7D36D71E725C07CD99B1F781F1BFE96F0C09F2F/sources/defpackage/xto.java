package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xto  reason: default package */
/* loaded from: classes4.dex */
public final class xto implements ajru {
    private final View a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final ProgressBar e;
    private final Resources f;
    private final Resources.Theme g;
    private final int h;

    public xto(Context context) {
        View inflate = View.inflate(context, R.layout.comment_poll_choice, null);
        this.a = inflate;
        this.b = inflate.findViewById(R.id.comment_poll_choice_icon);
        this.c = (TextView) inflate.findViewById(R.id.comment_poll_choice_text);
        this.d = (TextView) inflate.findViewById(R.id.comment_poll_choice_vote_percent);
        this.e = (ProgressBar) inflate.findViewById(R.id.comment_poll_choice_vote_ratio);
        this.f = context.getResources();
        this.g = context.getTheme();
        this.h = inflate.getPaddingBottom();
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        aufc aufcVar = (aufc) obj;
        this.b.setSelected(aufcVar.d);
        boolean j = ajrsVar.j("has_voted", false);
        boolean j2 = ajrsVar.j("is_last_item", false);
        View view = this.a;
        lj.Y(view, lj.i(view), this.a.getPaddingTop(), lj.h(this.a), j2 ? 0 : this.h);
        int i = true != j ? 8 : 0;
        int i2 = aufcVar.b;
        if (((i2 & 128) == 0 || (i2 & 256) == 0) && (i2 & 8) == 0 && (i2 & 64) == 0) {
            this.d.setVisibility(0);
            this.e.setVisibility(0);
            this.b.setVisibility(8);
        } else {
            this.d.setVisibility(i);
            this.e.setVisibility(i);
            this.b.setVisibility(0);
        }
        TextView textView = this.c;
        arag aragVar2 = null;
        if ((1 & aufcVar.b) != 0) {
            aragVar = aufcVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.d;
        if ((aufcVar.b & 32) != 0 && (aragVar2 = aufcVar.g) == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
        this.e.setProgress((int) (aufcVar.f * 100.0d));
        if (Build.VERSION.SDK_INT >= 23) {
            if (aufcVar.d) {
                this.d.setTextColor(this.f.getColor(R.color.yt_dark_blue, this.g));
                this.e.setProgressTintList(this.f.getColorStateList(R.color.yt_dark_blue, this.g));
                return;
            }
            this.e.setProgressTintList(this.f.getColorStateList(R.color.comment_poll_progress_unselected_color, this.g));
            this.d.setTextColor(this.f.getColor(R.color.comment_poll_choice_unselected_color, this.g));
        } else if (aufcVar.d) {
            this.d.setTextColor(this.f.getColor(R.color.yt_dark_blue));
            this.e.setProgressTintList(this.f.getColorStateList(R.color.yt_dark_blue));
        } else {
            this.d.setTextColor(this.f.getColor(R.color.comment_poll_choice_unselected_color));
            this.e.setProgressTintList(this.f.getColorStateList(R.color.comment_poll_progress_unselected_color));
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
