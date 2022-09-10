package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cumj  reason: default package */
/* loaded from: classes5.dex */
public final class cumj extends cuue {
    public final cumg s;
    private final Context t;
    private final cume u;

    public cumj(Context context, cukr cukrVar, cumg cumgVar) {
        super(new cume(context));
        this.t = context;
        this.s = cumgVar;
        cume cumeVar = (cume) this.a;
        this.u = cumeVar;
        cumeVar.setUriLoader(cukrVar);
    }

    @Override // defpackage.cuue
    public final void C(final cumf cumfVar) {
        try {
            this.u.setImagePreview(cumfVar.a);
            this.u.setOnCloseButtonClickListener(new View.OnClickListener(this, cumfVar) { // from class: cumi
                private final cumj a;
                private final cumf b;

                {
                    this.a = this;
                    this.b = cumfVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cumj cumjVar = this.a;
                    cumf cumfVar2 = this.b;
                    cumg cumgVar = cumjVar.s;
                    String str = cumfVar2.b;
                    cumh cumhVar = cumgVar.a;
                    cumhVar.d.c(cumhVar.b, str);
                }
            });
            Pair<Integer, Integer> a = cumfVar.a();
            if (((Integer) a.second).intValue() <= 1) {
                this.u.setImagePreviewContentDescription(this.t.getString(R.string.content_description_photo_preview));
                this.u.setCloseButtonContentDescription(this.t.getString(R.string.content_description_photo_preview_close_button));
                return;
            }
            this.u.setImagePreviewContentDescription(this.t.getString(R.string.content_description_photo_preview_multiple, Integer.valueOf(((Integer) a.first).intValue() + 1), a.second));
            this.u.setCloseButtonContentDescription(this.t.getString(R.string.content_description_photo_preview_close_button_multiple, Integer.valueOf(((Integer) a.first).intValue() + 1), a.second));
        } catch (ClassCastException unused) {
            cstl.a("PhotosAttachmentViewHolder");
        }
    }
}
