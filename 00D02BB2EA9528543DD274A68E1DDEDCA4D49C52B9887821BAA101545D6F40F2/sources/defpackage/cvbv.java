package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cvbv  reason: default package */
/* loaded from: classes5.dex */
public final class cvbv extends cvbz implements cvbs {
    private boolean f;
    private CharSequence g;

    public cvbv(Context context) {
        this(context, null);
    }

    private final void a() {
        if (this.f) {
            this.a.setText(R.string.delete_conversation_title_with_cloud);
            this.b.setText(R.string.delete_conversation_description_with_cloud);
            this.a.setGravity(0);
            return;
        }
        this.a.setText(R.string.delete_conversation_title);
        this.b.setText(this.g);
    }

    private final String d() {
        return getContext().getString(R.string.delete_conversation_description);
    }

    @Override // defpackage.cvbz
    protected final void b() {
        this.b.setId(R.id.delete_conversation_description);
        this.b.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.dialog_description_top_margin));
        this.b.setMovementMethod(LinkMovementMethod.getInstance());
        c(this.b.getId());
    }

    @Override // defpackage.cvbs
    public void setCustomLocalDeleteDescription(dbsg<CharSequence> dbsgVar) {
        this.g = dbsgVar.c(d());
        a();
    }

    @Override // defpackage.cvbs
    public void setIsSendingDeleteConversationEventEnabled(boolean z) {
        this.f = z;
        a();
    }

    @Override // defpackage.cuvv
    public void setPresenter(final cvbr cvbrVar) {
        this.d.setOnClickListener(new View.OnClickListener(cvbrVar) { // from class: cvbt
            private final cvbr a;

            {
                this.a = cvbrVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
        this.e.setOnClickListener(new View.OnClickListener(cvbrVar) { // from class: cvbu
            private final cvbr a;

            {
                this.a = cvbrVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b();
            }
        });
    }

    public cvbv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.deleteConversationDialogStyle);
    }

    public cvbv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvby.a, i, R.style.LighterDeleteConversationDialog);
        this.e.setText(17039360);
        this.d.setText(R.string.delete);
        int color = obtainStyledAttributes.getColor(0, akm.c(getContext(), R.color.google_blue600));
        ColorStateList valueOf = ColorStateList.valueOf(cuwg.d(color));
        this.e.setTextColor(color);
        this.e.setRippleColor(valueOf);
        this.d.setTextColor(color);
        this.d.setRippleColor(valueOf);
        obtainStyledAttributes.recycle();
    }
}
