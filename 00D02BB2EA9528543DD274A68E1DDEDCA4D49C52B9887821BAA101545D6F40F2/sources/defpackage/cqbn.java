package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.android.material.button.MaterialButton;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqbn  reason: default package */
/* loaded from: classes5.dex */
public final class cqbn extends LinearLayout {
    public cqbm a;
    private final View b;
    private final View c;
    private final View d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final View h;
    private final TextView i;
    private final ViewGroup j;
    private final ViewGroup k;
    private final MaterialButton l;
    private final MaterialButton m;
    private final MaterialButton n;
    private final TextView o;
    private String p;
    private String q;
    private List<Spanned> r;

    public cqbn(Context context) {
        super(context);
        inflate(context, R.layout.single_setting_view_material, this);
        this.b = findViewById(R.id.consent_ui);
        this.c = findViewById(R.id.loading_ui);
        this.d = findViewById(R.id.loading_failed_ui);
        this.e = (ImageView) findViewById(R.id.account_avatar);
        this.f = (TextView) findViewById(R.id.account_display_name);
        this.g = (TextView) findViewById(R.id.account_name);
        this.h = findViewById(R.id.write_consent_progress_bar);
        this.i = (TextView) findViewById(R.id.title);
        this.j = (ViewGroup) findViewById(R.id.description_paragraphs_container);
        this.k = (ViewGroup) findViewById(R.id.footer_paragraph_container);
        this.l = (MaterialButton) findViewById(R.id.positive_button);
        this.m = (MaterialButton) findViewById(R.id.negative_button);
        this.n = (MaterialButton) findViewById(R.id.retry_loading_button);
        this.o = (TextView) findViewById(R.id.something_went_wrong_text);
        setUiState(cqbm.CONSENT_DATA_LOADING);
    }

    private final void c() {
        if (dbtw.a(this.p) || dbsd.a(this.q, this.p)) {
            this.f.setText(this.q);
            this.g.setVisibility(8);
            return;
        }
        this.f.setText(this.p);
        this.g.setText(this.q);
        this.g.setVisibility(0);
    }

    private final View.OnClickListener d(final View.OnClickListener onClickListener) {
        return new View.OnClickListener(this, onClickListener) { // from class: cqbi
            private final cqbn a;
            private final View.OnClickListener b;

            {
                this.a = this;
                this.b = onClickListener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cqbn cqbnVar = this.a;
                View.OnClickListener onClickListener2 = this.b;
                cqbm cqbmVar = cqbm.CONSENT_DATA_LOADING;
                int ordinal = cqbnVar.a.ordinal();
                if (ordinal == 2) {
                    onClickListener2.onClick(cqbnVar);
                } else if (ordinal != 3) {
                } else {
                    Toast.makeText(cqbnVar.getContext(), cqbnVar.getContext().getResources().getString(R.string.please_wait_message), 0).show();
                }
            }
        };
    }

    private final TextView e(Spanned spanned) {
        TextView textView = (TextView) inflate(getContext(), R.layout.single_setting_view_material_description_paragraph, null);
        textView.setLinksClickable(false);
        textView.setText(spanned);
        return textView;
    }

    public final void a(boolean z) {
        findViewById(R.id.scroll_handle).setVisibility(true != z ? 8 : 0);
    }

    public final void b() {
        gz b = ((ff) getContext()).g().b();
        List<Spanned> list = this.r;
        cqbc cqbcVar = new cqbc();
        Bundle bundle = new Bundle();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                spannableStringBuilder.append((CharSequence) list.get(i));
                if (i < list.size() - 1) {
                    spannableStringBuilder.append((CharSequence) System.lineSeparator());
                }
            }
        }
        bundle.putCharSequence("AdditionalInfoParagraphs", spannableStringBuilder);
        cqbcVar.B(bundle);
        b.y(cqbcVar, "learn_more_dialog_fragment");
        b.g();
    }

    public void setAccountAvatar(Bitmap bitmap) {
        this.e.setImageBitmap(bitmap);
    }

    public void setAccountDisplayName(String str) {
        if (!dbsd.a(this.p, str)) {
            this.p = str;
            c();
        }
    }

    public void setAccountName(String str) {
        if (!dbsd.a(this.q, str)) {
            this.q = str;
            c();
        }
    }

    public void setAdditionalInfoParagraphs(List<Spanned> list) {
        this.r = list;
    }

    public void setDescriptionParagraphs(List<Spanned> list) {
        this.j.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            Spanned spanned = list.get(i);
            if (i == list.size() - 1) {
                String string = getContext().getResources().getString(R.string.end_of_sentence);
                if (!spanned.toString().trim().endsWith(string)) {
                    spanned = new SpannableStringBuilder(spanned).append((CharSequence) string);
                }
                String replaceAll = getContext().getResources().getString(R.string.learn_more_link_text).replaceAll("\\s", "\\ ");
                SpannableStringBuilder append = new SpannableStringBuilder(spanned).append((CharSequence) " ").append((CharSequence) replaceAll);
                append.setSpan(new cqbl(this), append.length() - replaceAll.length(), append.length(), 17);
                TextView e = e(append);
                e.setMovementMethod(LinkMovementMethod.getInstance());
                e.setAccessibilityDelegate(new cqbk(this));
                this.j.addView(e);
            } else {
                this.j.addView(e(spanned));
            }
        }
    }

    public void setErrorMessage(String str) {
        this.o.setText(str);
    }

    public void setFooterParagraphs(List<Spanned> list) {
        this.k.removeAllViews();
        for (Spanned spanned : list) {
            this.k.addView(e(spanned));
        }
    }

    public void setNegativeButtonCallback(View.OnClickListener onClickListener) {
        this.m.setOnClickListener(d(onClickListener));
    }

    public void setNegativeButtonCaption(String str) {
        this.m.setText(str);
    }

    public void setPositiveButtonCallback(View.OnClickListener onClickListener) {
        this.l.setOnClickListener(d(onClickListener));
    }

    public void setPositiveButtonCaption(String str) {
        this.l.setText(str);
    }

    public void setRetryLoadingButtonCallback(final View.OnClickListener onClickListener) {
        this.n.setOnClickListener(new View.OnClickListener(this, onClickListener) { // from class: cqbh
            private final cqbn a;
            private final View.OnClickListener b;

            {
                this.a = this;
                this.b = onClickListener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.b.onClick(this.a);
            }
        });
    }

    public void setTitle(Spanned spanned) {
        this.i.setText(spanned);
    }

    public void setUiState(cqbm cqbmVar) {
        this.a = cqbmVar;
        cqbm cqbmVar2 = cqbm.CONSENT_DATA_LOADING;
        int ordinal = cqbmVar.ordinal();
        if (ordinal == 0) {
            this.b.setVisibility(8);
            this.c.setVisibility(0);
            this.d.setVisibility(8);
        } else if (ordinal == 1) {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(0);
        } else if (ordinal == 2) {
            this.b.setVisibility(0);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.h.setVisibility(8);
        } else if (ordinal != 3) {
        } else {
            this.b.setVisibility(0);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.h.setVisibility(0);
        }
    }
}
