package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mih  reason: default package */
/* loaded from: classes3.dex */
public final class mih extends ajsl {
    public final aafo a;
    public apul b;
    private final View c;
    private final TextView d;
    private final ImageView e;

    public mih(Context context, aafo aafoVar) {
        aafoVar.getClass();
        this.a = aafoVar;
        View inflate = View.inflate(context, R.layout.content_view_privacy_link, null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.privacy_text);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.privacy_link_button);
        this.e = imageView;
        imageView.setOnClickListener(new mig(this));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        CharSequence charSequence;
        arag aragVar;
        apul apulVar = (apul) obj;
        this.b = apulVar;
        int i = apulVar.b & 1;
        if (i != 0) {
            if (i != 0) {
                aragVar = apulVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            charSequence = ajgl.b(aragVar);
        } else {
            charSequence = "";
        }
        this.d.setText(charSequence);
        this.e.setContentDescription(charSequence);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        apul apulVar = (apul) obj;
        return null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
