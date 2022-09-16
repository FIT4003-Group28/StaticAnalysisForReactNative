package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mje  reason: default package */
/* loaded from: classes3.dex */
public final class mje implements ajru {
    public apzg a;
    private final Context b;
    private final TextView c;
    private final TextView d;
    private final ImageView e;
    private final ajrx f;
    private final akem g;
    private final View.OnClickListener h;
    private final frf i;

    public mje(Context context, gem gemVar, final aafo aafoVar, akem akemVar) {
        context.getClass();
        this.b = context;
        this.f = gemVar;
        this.g = akemVar;
        aafoVar.getClass();
        View inflate = View.inflate(context, R.layout.expand_button_down, null);
        this.c = (TextView) inflate.findViewById(R.id.link_text_start);
        this.d = (TextView) inflate.findViewById(R.id.link_text_end);
        this.e = (ImageView) inflate.findViewById(R.id.link_icon);
        this.h = new View.OnClickListener() { // from class: mjd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mje mjeVar = mje.this;
                aafo aafoVar2 = aafoVar;
                apzg apzgVar = mjeVar.a;
                if (apzgVar != null) {
                    aafoVar2.c(apzgVar, null);
                }
            }
        };
        frf frfVar = new frf(inflate.getBackground(), zhn.d(context, R.attr.ytSeparator), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
        this.i = frfVar;
        inflate.setBackground(frfVar);
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.f).b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        CharSequence charSequence;
        int d;
        ajxs ajxsVar = (ajxs) obj;
        this.a = ajxsVar.d;
        ajrx ajrxVar = this.f;
        View.OnClickListener onClickListener = ajxsVar.c;
        if (onClickListener == null) {
            onClickListener = this.h;
        }
        ajrxVar.d(onClickListener);
        String string = this.b.getString(R.string.load_more_label);
        int i = ajxsVar.e;
        if (i == 0) {
            throw null;
        }
        if (i != 2) {
            charSequence = TextUtils.isEmpty(ajxsVar.a) ? string : ajxsVar.a;
            if (this.a != null) {
                d = zhn.d(this.b, R.attr.ytCallToAction);
            } else {
                d = zhn.d(this.b, R.attr.ytTextSecondary);
            }
        } else {
            charSequence = ajxsVar.b;
            d = zhn.d(this.b, R.attr.ytTextSecondary);
        }
        this.d.setTextColor(d);
        boolean z = false;
        if (ajxsVar.f == 3) {
            zag.m(this.c, charSequence);
            zag.o(this.d, false);
        } else {
            zag.m(this.d, charSequence);
            zag.o(this.c, false);
        }
        View a = a();
        if (true != TextUtils.isEmpty(charSequence)) {
            string = charSequence;
        }
        a.setContentDescription(string);
        ImageView imageView = this.e;
        int i2 = ajxsVar.e;
        if (i2 == 1) {
            z = true;
        }
        if (i2 != 0) {
            zag.o(imageView, !z);
            int i3 = ajxsVar.e;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 1) {
                this.e.setImageDrawable(akf.a(this.b, 2131233344));
            } else if (i4 == 2) {
                this.e.setImageDrawable(akf.a(this.b, 2131233351));
            }
            if (this.g.d()) {
                this.g.b(a(), this.g.a(a(), null));
            } else {
                this.f.e(ajrsVar);
            }
            int i5 = ajxsVar.f;
            Resources resources = this.b.getResources();
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    a().setMinimumHeight(resources.getDimensionPixelSize(R.dimen.expand_button_compact_height));
                    return;
                } else if (i6 != 2) {
                    return;
                }
            }
            a().setMinimumHeight(resources.getDimensionPixelSize(R.dimen.expand_button_default_height));
            return;
        }
        throw null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
