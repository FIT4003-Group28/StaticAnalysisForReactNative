package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zmu  reason: default package */
/* loaded from: classes4.dex */
public class zmu implements View.OnClickListener {
    public final View a;
    private final Context b;
    private final zmb c;
    private final acti d;
    private final asjj e;

    public zmu(Context context, zmb zmbVar, View view, acti actiVar, asjj asjjVar) {
        context.getClass();
        this.b = context;
        zmbVar.getClass();
        this.c = zmbVar;
        view.getClass();
        this.a = view;
        view.setOnClickListener(this);
        d();
        actiVar.getClass();
        this.d = actiVar;
        this.e = asjjVar;
    }

    protected Drawable a() {
        return ((ImageView) this.a).getDrawable();
    }

    protected View b() {
        return this.a;
    }

    protected actj c() {
        return actj.UPLOAD_VIDEO_CAMERA_SWITCH_BUTTON;
    }

    protected void d() {
        if (this.c.g() == 0) {
            this.a.setContentDescription(this.b.getString(R.string.upload_edit_camera_switch_to_front_button));
        } else {
            this.a.setContentDescription(this.b.getString(R.string.upload_edit_camera_switch_to_back_button));
        }
    }

    public final void e() {
        if (!this.c.I()) {
            return;
        }
        Drawable a = a();
        if (a instanceof Animatable) {
            ((Animatable) a).start();
        } else {
            b().animate().rotationBy(-180.0f).start();
        }
        zmb zmbVar = this.c;
        zmbVar.C(zmbVar.g() ^ 1);
        d();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.a) {
            this.d.H(3, new acte(c()), this.e);
            e();
        }
    }
}
