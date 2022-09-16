package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahrh  reason: default package */
/* loaded from: classes.dex */
public final class ahrh {
    public final aafo a;
    private final Context b;
    private final ajmy c;
    private final ViewGroup d;

    public ahrh(Context context, ajmy ajmyVar, ViewGroup viewGroup, aafo aafoVar) {
        this.b = context;
        this.c = ajmyVar;
        this.d = viewGroup;
        this.a = aafoVar;
    }

    public final float a(int i) {
        return this.b.getResources().getDimension(i);
    }

    public final View b(int i) {
        return LayoutInflater.from(this.b).inflate(i, this.d, false);
    }

    public final void c(View view, avhn avhnVar, arag aragVar, arag aragVar2, final apzg apzgVar) {
        ajmt b = this.c.c().b();
        b.c(false);
        ajmu a = b.a();
        this.c.k((ImageView) view.findViewById(R.id.thumbnail), avhnVar, a);
        ((TextView) view.findViewById(R.id.title)).setText(ajgl.b(aragVar));
        ((TextView) view.findViewById(R.id.metadata)).setText(ajgl.b(aragVar2));
        view.setOnClickListener(new View.OnClickListener() { // from class: ahrg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ahrh ahrhVar = ahrh.this;
                ahrhVar.a.c(apzgVar, null);
            }
        });
    }
}
