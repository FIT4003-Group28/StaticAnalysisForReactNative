package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.gmm.ugc.post.photo.MediaData;
import com.google.android.apps.gmm.ugc.post.photo.ResizingImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cdxj  reason: default package */
/* loaded from: classes4.dex */
final class cdxj extends cdxl {
    public static final /* synthetic */ int s = 0;
    private final ResizingImageView t;
    private final View u;
    private final cdwl v;
    private final TextView w;
    private final EditText x;
    private TextWatcher y;

    public cdxj(ViewGroup viewGroup, cebd cebdVar) {
        super(viewGroup, R.layout.photo_posts_media_carousel_media);
        ResizingImageView resizingImageView = (ResizingImageView) this.a.findViewById(R.id.image);
        this.t = resizingImageView;
        cdwl.h(resizingImageView, cebdVar).i(dtyf.F);
        View findViewById = this.a.findViewById(R.id.buttonDeselect);
        this.u = findViewById;
        this.v = cdwl.h(findViewById, cebdVar).i(dtyf.E);
        this.w = (TextView) this.a.findViewById(R.id.mediaIndexLabel);
        EditText editText = (EditText) this.a.findViewById(R.id.media_caption);
        this.x = editText;
        editText.setVisibility(0);
        cdwl.h(editText, cebdVar).i(dtyf.y);
    }

    @Override // defpackage.cdxl
    public final void C(cdxd cdxdVar, final cdwo cdwoVar, int i, Object obj) {
        cdxe c = cdxdVar.c();
        cdxf cdxfVar = obj instanceof cdxf ? (cdxf) obj : null;
        int i2 = 0;
        if (cdxfVar == null || cdxfVar.a) {
            Context context = this.a.getContext();
            TextView textView = this.w;
            Integer valueOf = Integer.valueOf(i);
            textView.setText(context.getString(R.string.photo_posts_media_index_label_text, Integer.valueOf(c.d()), valueOf));
            this.t.setContentDescription(context.getString(R.string.photo_posts_media_description, Integer.valueOf(c.d()), valueOf));
            this.u.setContentDescription(context.getString(R.string.photo_posts_media_deselect_description, Integer.valueOf(c.d()), valueOf));
            this.x.setHint(context.getString(R.string.photo_caption_hint, Integer.valueOf(c.d()), valueOf));
        }
        if (cdxfVar == null || cdxfVar.b) {
            final Uri parse = Uri.parse(c.c());
            MediaData a = c.a();
            boolean a2 = a.b().a();
            int h = a.h();
            if (h == 0) {
                throw null;
            }
            boolean z = h != 1 || a2;
            this.t.o(new jic(c.c(), jfv.a(c.c()), R.drawable.generic_image_placeholder));
            this.t.setAlpha(true != z ? 0.4f : 1.0f);
            this.u.setVisibility(true != z ? 8 : 0);
            this.v.j(new Runnable(cdwoVar, parse) { // from class: cdxh
                private final cdwo a;
                private final Uri b;

                {
                    this.a = cdwoVar;
                    this.b = parse;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cdwo cdwoVar2 = this.a;
                    Uri uri = this.b;
                    int i3 = cdxj.s;
                    cdwoVar2.a(cdwq.e(uri));
                }
            });
            String c2 = c.a().c().c("");
            this.x.setEnabled(z);
            TextWatcher textWatcher = this.y;
            if (textWatcher != null) {
                this.x.removeTextChangedListener(textWatcher);
            }
            if (!c2.contentEquals(this.x.getText())) {
                this.x.setText(c2);
            }
            boolean z2 = !z && c2.isEmpty();
            EditText editText = this.x;
            if (true == z2) {
                i2 = 4;
            }
            editText.setVisibility(i2);
            cdxi cdxiVar = new cdxi(cdwoVar, parse);
            this.y = cdxiVar;
            this.x.addTextChangedListener(cdxiVar);
        }
    }
}
