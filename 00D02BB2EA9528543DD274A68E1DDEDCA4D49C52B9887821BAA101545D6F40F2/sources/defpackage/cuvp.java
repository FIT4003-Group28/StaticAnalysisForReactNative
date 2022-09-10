package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cuvp  reason: default package */
/* loaded from: classes5.dex */
public final class cuvp extends cvbz implements cuvl {
    private CheckBox f;

    public cuvp(Context context) {
        this(context, null);
    }

    @Override // defpackage.cuvl
    public final void a(String str) {
        this.a.setText(getContext().getResources().getString(R.string.block_user_format, str));
    }

    @Override // defpackage.cvbz
    protected final void b() {
        this.b.setId(R.id.block_description);
        this.b.setText(R.string.block_description);
        CheckBox checkBox = new CheckBox(getContext());
        this.f = checkBox;
        checkBox.setId(R.id.report_spam);
        this.f.setText(R.string.report_as_spam);
        this.f.setHeight(getResources().getDimensionPixelSize(R.dimen.report_spam_height));
        qf.a(this.f, R.style.DialogBody);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.b.getId());
        this.f.setLayoutParams(layoutParams);
        this.c.addView(this.f, layoutParams);
        c(this.f.getId());
    }

    @Override // defpackage.cuvv
    public void setPresenter(final cuvk cuvkVar) {
        this.d.setOnClickListener(new View.OnClickListener(cuvkVar) { // from class: cuvm
            private final cuvk a;

            {
                this.a = cuvkVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b();
            }
        });
        this.e.setOnClickListener(new View.OnClickListener(cuvkVar) { // from class: cuvn
            private final cuvk a;

            {
                this.a = cuvkVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d();
            }
        });
        this.f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(cuvkVar) { // from class: cuvo
            private final cuvk a;

            {
                this.a = cuvkVar;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.c(z);
            }
        });
    }

    public cuvp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.blockDialogStyle);
    }

    public cuvp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cuvt.a, i, R.style.LighterBlockDialog);
        this.e.setText(17039360);
        this.d.setText(R.string.block);
        int color = obtainStyledAttributes.getColor(0, akm.c(getContext(), R.color.google_blue600));
        ColorStateList valueOf = ColorStateList.valueOf(cuwg.d(color));
        this.e.setTextColor(color);
        this.e.setRippleColor(valueOf);
        this.d.setTextColor(color);
        this.d.setRippleColor(valueOf);
        this.f.setButtonTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{color, akm.c(getContext(), R.color.material_grey_600)}));
        obtainStyledAttributes.recycle();
    }
}
