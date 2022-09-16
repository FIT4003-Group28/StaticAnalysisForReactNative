package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: mms  reason: default package */
/* loaded from: classes3.dex */
public final class mms extends ajsl {
    private final Context a;
    private final int b;
    private final View c;
    private final TextView d;
    private final gga e;

    public mms(Context context, ggb ggbVar) {
        this.a = context;
        View inflate = View.inflate(context, R.layout.playlist_notification, null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.notification_text);
        this.e = ggbVar.a((TextView) inflate.findViewById(R.id.action_button));
        this.b = zew.i(context.getResources().getDisplayMetrics(), 15);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        audb audbVar = (audb) obj;
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            marginLayoutParams.topMargin = this.b;
            this.c.setLayoutParams(marginLayoutParams);
        }
        TextView textView = this.d;
        apoj apojVar = null;
        if ((audbVar.b & 2) != 0) {
            aragVar = audbVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        Iterator it = audbVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            auda audaVar = (auda) it.next();
            if ((audaVar.b & 1) != 0) {
                apoj apojVar2 = audaVar.c;
                if (apojVar2 == null) {
                    apojVar2 = apoj.a;
                }
                apojVar = apojVar2;
                this.c.setBackgroundColor(zhn.d(this.a, R.attr.ytThemedBlue));
                this.d.setTextColor(this.a.getResources().getColor(17170443));
            }
        }
        this.e.b(apojVar, ajrsVar.a);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        audb audbVar = (audb) obj;
        return null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
