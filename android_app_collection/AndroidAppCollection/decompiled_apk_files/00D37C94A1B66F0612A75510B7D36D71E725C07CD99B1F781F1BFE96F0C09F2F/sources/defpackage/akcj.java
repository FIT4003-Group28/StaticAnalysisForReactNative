package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akcj  reason: default package */
/* loaded from: classes.dex */
final class akcj extends yo {
    public static final /* synthetic */ int v = 0;
    public final ImageView t;
    public final ajvj u;

    public akcj(akci akciVar, View view, ajvj ajvjVar) {
        super(view);
        this.u = ajvjVar;
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843534, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
        view.setOnClickListener(akciVar);
        this.t = (ImageView) view.findViewById(R.id.emoji);
    }
}
