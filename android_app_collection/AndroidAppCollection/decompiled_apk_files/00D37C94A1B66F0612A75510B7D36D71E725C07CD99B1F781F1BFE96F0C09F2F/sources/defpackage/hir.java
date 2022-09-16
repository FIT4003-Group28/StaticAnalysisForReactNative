package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hir  reason: default package */
/* loaded from: classes3.dex */
public final class hir extends ajsl {
    public View a;
    public final dt b;
    public final hip c;
    private final Context d;

    public hir(Context context, dt dtVar, hip hipVar) {
        this.d = context;
        this.b = dtVar;
        this.c = hipVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        Drawable drawable;
        final aulh aulhVar = (aulh) obj;
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.pivot_header, (ViewGroup) null);
        this.a = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.pivot_header_title_text);
        arag aragVar = aulhVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        ImageView imageView = (ImageView) this.a.findViewById(R.id.pivot_back);
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            drawable.setAutoMirrored(true);
        }
        if ((aulhVar.b & 2) == 0) {
            f().setVisibility(8);
            return;
        }
        View f = f();
        f.setVisibility(0);
        f.setOnClickListener(new View.OnClickListener() { // from class: hiq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hir hirVar = hir.this;
                aulh aulhVar2 = aulhVar;
                hip hipVar = hirVar.c;
                dt dtVar = hirVar.b;
                ates atesVar = aulhVar2.d;
                if (atesVar == null) {
                    atesVar = ates.a;
                }
                atep atepVar = atesVar.c;
                if (atepVar == null) {
                    atepVar = atep.a;
                }
                hipVar.a(dtVar, atepVar);
            }
        });
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aulh) obj).e.I();
    }

    public final View f() {
        return this.a.findViewById(R.id.pivot_more);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
