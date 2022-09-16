package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: akli  reason: default package */
/* loaded from: classes.dex */
public final class akli implements akny {
    public final ajmy a;
    public final List b;
    private final aklh c;

    public akli(Context context, ajxz ajxzVar, ajmy ajmyVar, View view, View view2) {
        context.getClass();
        ajxzVar.getClass();
        ajmyVar.getClass();
        this.a = ajmyVar;
        TextView textView = (TextView) view.findViewById(R.id.select_message);
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        view.findViewById(R.id.select_message_shadow);
        this.c = new aklh(this, view2);
        this.b = new ArrayList();
    }

    @Override // defpackage.akny
    public final void a(aknz aknzVar) {
        String str = aknzVar.e;
        if (!TextUtils.equals(this.c.a.getText(), str)) {
            this.c.a.setText(str);
        }
    }
}
