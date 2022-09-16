package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akbq  reason: default package */
/* loaded from: classes.dex */
final class akbq extends yo {
    public static final /* synthetic */ int w = 0;
    public final ImageView t;
    public final akbp u;
    public final ajvj v;

    public akbq(akbp akbpVar, View view, ajvj ajvjVar) {
        super(view);
        this.u = akbpVar;
        this.v = ajvjVar;
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843534, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
        view.setOnClickListener(akbpVar);
        this.t = (ImageView) view.findViewById(R.id.emoji);
    }
}
