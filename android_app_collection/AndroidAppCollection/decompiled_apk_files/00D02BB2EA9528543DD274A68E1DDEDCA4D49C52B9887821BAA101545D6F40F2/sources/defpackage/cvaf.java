package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cvaf  reason: default package */
/* loaded from: classes5.dex */
public final class cvaf extends RelativeLayout implements cvab {
    public cuvg a;
    LinearLayout b;
    boolean c;
    View d;
    TextView e;
    TextView f;
    String g;
    int h;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    public dbsg<cvad> o;

    public cvaf(Context context) {
        this(context, null);
    }

    public final void a(View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(21);
        layoutParams.addRule(11);
        view.setLayoutParams(layoutParams);
        view.setId(R.id.preview_view);
        View view2 = this.d;
        if (view2 != null) {
            removeView(view2);
        }
        this.d = view;
        addView(view, 2, layoutParams);
    }

    @Override // defpackage.cuww
    public final void b() {
        this.c = true;
        this.g = null;
        this.o = dbpy.a;
        this.a.b();
        this.e.setText((CharSequence) null);
        this.f.setText((CharSequence) null);
        View view = this.d;
        if (view != null) {
            removeView(view);
            this.d = null;
        }
    }

    @Override // defpackage.cvab
    public void setBoundPreviewView(View view) {
        this.c = false;
        a(view);
    }

    @Override // defpackage.cvab
    public void setDescription(String str) {
        this.g = str;
        this.f.setText(str);
    }

    @Override // defpackage.cuvv
    public void setPresenter(final cvaa cvaaVar) {
        setOnClickListener(new View.OnClickListener(cvaaVar) { // from class: cvae
            private final cvaa a;

            {
                this.a = cvaaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
    }

    public void setStyleProvider(cvad cvadVar) {
        this.o = dbsg.i(cvadVar);
    }

    public cvaf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.conversationCellStyle);
    }

    public cvaf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        this.o = dbpy.a;
        inflate(getContext(), R.layout.conversation_cell_layout, this);
        setPadding(getContext().getResources().getDimensionPixelSize(R.dimen.conversation_cell_padding), getContext().getResources().getDimensionPixelSize(R.dimen.conversation_cell_padding), getContext().getResources().getDimensionPixelSize(R.dimen.conversation_cell_padding), getContext().getResources().getDimensionPixelSize(R.dimen.conversation_cell_padding));
        cuvg cuvgVar = (cuvg) findViewById(R.id.conversation_avatar);
        this.a = cuvgVar;
        cuvgVar.setDarkModeEnabled(dxzy.e());
        this.b = (LinearLayout) findViewById(R.id.conversation_container);
        this.e = (TextView) findViewById(R.id.conversation_title);
        this.f = (TextView) findViewById(R.id.conversation_description);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvai.a, i, R.style.LighterConversationCell);
        this.h = obtainStyledAttributes.getColor(0, getContext().getResources().getColor(R.color.conversation_cell_background_color));
        this.i = obtainStyledAttributes.getColor(1, getContext().getResources().getColor(R.color.conversation_cell_click_color));
        this.j = obtainStyledAttributes.getResourceId(4, R.style.TitleText);
        this.k = obtainStyledAttributes.getResourceId(6, R.style.UnreadTitleText);
        this.l = obtainStyledAttributes.getResourceId(2, R.style.DescriptionText);
        this.m = obtainStyledAttributes.getResourceId(5, R.style.UnreadDescriptionText);
        this.n = obtainStyledAttributes.getResourceId(3, R.style.PreviewText);
        this.a.d(false);
        obtainStyledAttributes.recycle();
    }
}
