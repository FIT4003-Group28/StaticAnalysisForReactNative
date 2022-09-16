package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abmd  reason: default package */
/* loaded from: classes.dex */
public abstract class abmd implements ajru {
    protected final View a;
    private final TextView c = g();
    private final TextView d = f();
    protected final ImageView b = e();

    public abmd(Context context) {
        this.a = View.inflate(context, d(), null);
        i(context);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    protected abstract int d();

    protected abstract ImageView e();

    protected abstract TextView f();

    protected abstract TextView g();

    protected abstract void h(avhn avhnVar);

    protected void i(Context context) {
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_paid_message_margin);
        zgd.u(this.a, new abmf(marginLayoutParams, 1), zgd.b(zgd.s(-1, -2), zgd.l(dimensionPixelOffset), zgd.k(dimensionPixelOffset)), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        asqz asqzVar = (asqz) obj;
        TextView textView = this.c;
        arag aragVar2 = null;
        if ((asqzVar.b & 16) != 0) {
            aragVar = asqzVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.d;
        if ((asqzVar.b & 32) != 0 && (aragVar2 = asqzVar.f) == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        if (this.b != null) {
            avhn avhnVar = asqzVar.g;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            h(avhnVar);
        }
    }

    @Override // defpackage.ajru
    public void qZ(ajsa ajsaVar) {
    }
}
